/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package DESFire_Lesson;

import DESFireLib.middleware.*;
import DESFireLib.library.*;
import DESFireLib.library.param.*;

/**
 * @author Tere Varano 
 * @version 2.0
 * @since 2021/06/10
 */

// A collection of methods to format card
public class FormatCard {

    public static void main(String[] args){		
        ComManager cm = new JSCIOComManager();
        try{
            cm.scan();
            System.out.println("Context scan complete. Use method listReaders() to view connected readers");
            System.out.println("");
            String[] readers = cm.listReaders();
            System.out.println("Connected readers");
            for(int i = 0; i < readers.length; i++){
		System.out.println(i + ".- " + readers[i]);
            }
            System.out.println("");
            System.out.println("Selecting reader 0...");
            cm.select(readers[0]);
            System.out.println("Reader successfully selected");
            System.out.println("");
            if(cm.isCardPresent()){
                System.out.println("Card present in the reader. Trying to connect");
                System.out.println("");
                System.out.println("Connecting card...");
                cm.connect();
                System.out.println("Card successfully connected");
                System.out.println("");
                System.out.println("Card Type: ");
                CardType ct = cm.getCardType();
                System.out.println(ct);
                System.out.println("");
                if(ct == CardType.MIFARE_DESFIRE){
                    DFCard df = new DFCard(cm);
                    DFResponse dfres;
                    System.out.println("Trying to send commands:\n\n");
                    //AUTHENTICATE
                    byte[] keyData;
                    System.out.println(df.getSession());						
                    try{
                        System.out.println("Get Version:");
                        dfres = df.getVersion();
                        System.out.println(dfres.getUID());
                        System.out.println("");
                        System.out.println("Get Key Settings: ");
                        System.out.println(df.getKeySettings());
                        System.out.println(df.getSession());
                        System.out.println("");
                    }catch(Exception e){e.printStackTrace();}
		
                    //FORMAT PICC
                    System.out.println("Select Application 0:");
                    System.out.println(df.selectApplication(new AID(0)));
                    //System.out.println(df.getSession());
                    System.out.println("");
                    System.out.println("Authenticate:");
                    keyData = new byte[16];
                    System.out.println(df.authenticate(0, keyData));
                    //System.out.println(df.getSession());
                    System.out.println("");
                    System.out.println("Format PICC:");
                    System.out.println(df.formatPICC());
                    //System.out.println(df.getSession());
                    System.out.println("");
                }
                System.out.println("Disconnecting card...");
                cm.disconnect();
                System.out.println("Card successfully disconnected");
                System.out.println("");				
            }
            else{
                System.out.println("Empty reader");
                System.out.println("");
            }				
            System.out.println("Deselecting reader...");
            cm.deselect();
            System.out.println("Reader successfully deselected");
            System.out.println("");
	}catch(DFLException e){
            e.printStackTrace();
	}
	try{
            cm.release();
            System.out.println("Context successfully released");
            System.out.println("");
	}catch(DFLException e){
            e.printStackTrace();
	}
 }	
}
    
