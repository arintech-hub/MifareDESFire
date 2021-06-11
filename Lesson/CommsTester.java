/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package DESFire_Lesson;

import DESFireLib.library.*;
import DESFireLib.middleware.*;
import DESFireLib.utils.ba.*;

import java.util.Arrays;

/**
 * @author Tere Varano 
 * @version 2.0
 * @since 2021/06/10
 */

// A collection of methods to test a smartcard reader comms with DESFire 
public class CommsTester {
    public static void main(String[] args){		
	ComManager cm = new JSCIOComManager();		
        try{
            cm.scan();				
            String[] readers = cm.listReaders();
            System.out.println(Arrays.toString(readers));
            cm.select(readers[0]);
		
            if(cm.isCardPresent()){
                System.out.println("Card detected");
                cm.connect();					
                CardType ct = cm.getCardType();			
                if(ct == CardType.MIFARE_DESFIRE){
                    System.out.println("Card identified as Mifare DESFire");
                    System.out.println("****");
                    DFCard df = new DFCard(cm);						
                    System.out.println(BAUtils.toString(df.GetVersion()));
                    System.out.println("****");
                    System.out.println(df.getVersion());
                }
                else{
                    System.out.println("Card is not a DESFire");
		}
                cm.disconnect();									
            }
            else{
		System.out.println("No card present");
            }
            cm.deselect();
	}
        catch(DFLException e){	e.printStackTrace();} 
	
        try{
            cm.release();
	}
	catch(DFLException e){e.printStackTrace();}
    }	
}
