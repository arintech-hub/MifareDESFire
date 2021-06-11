/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package DESFire_Lesson;

import DESFireLib.middleware.*;
import DESFireLib.library.*;
import DESFireLib.library.param.*;
import DESFireLib.library.security.*;
import DESFireLib.utils.security.*;

/**
 * @author Tere Varano 
 * @version 2.0
 * @since 2021/06/10
 */

// A collection of methods to create a change the keys of a dummy Jalisco card 
public class ChangeKeys {
public static void main(String[] args){		
        // Start communication instance between card and reader
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
                    System.out.println("Trying to send commands:\n");
                    
                    // AUTHENTICATE
                    System.out.println(df.getSession());						
					
                    try{
			System.out.println("Get Version:");
			dfres = df.getVersion();
                        System.out.println(dfres.getUID());
			System.out.println("");
                        
			CipAlg alg = CipAlg.AES;
					
			// SELECT APPLICATION
			System.out.println("Select Application 1:");
			System.out.println(df.selectApplication(new AID(16456)));
			System.out.println(df.getSession());
			System.out.println("");
		
			System.out.println("Get Key Settings: ");
			System.out.println(df.getKeySettings());
			System.out.println(df.getSession());
			System.out.println("");
						
			DFKey key;
                        
                        key = new DFKey(new byte[16], alg, 0);
			System.out.println(df.authenticateAES(0, key));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        DFKey newKey1;
                        DFKey newKey2;
                        DFKey newKey3;
                        
                        byte[] Key1 = {(byte)0x01, (byte)0x01, (byte)0x01,(byte)0x01, 
                                  (byte)0x01, (byte)0x01, (byte)0x01,(byte)0x01, 
                                  (byte)0x01, (byte)0x01, (byte)0x01,(byte)0x01, 
                                  (byte)0x01, (byte)0x01, (byte)0x01,(byte)0x01};
                        
                        byte[] Key2 = {(byte)0x02, (byte)0x02, (byte)0x02,(byte)0x02, 
                                  (byte)0x02, (byte)0x02, (byte)0x02,(byte)0x02, 
                                  (byte)0x02, (byte)0x02, (byte)0x02,(byte)0x02, 
                                  (byte)0x02, (byte)0x02, (byte)0x02,(byte)0x02};
                        
                        byte[] Key3 = {(byte)0x03, (byte)0x03, (byte)0x03,(byte)0x03, 
                                  (byte)0x03, (byte)0x03, (byte)0x03,(byte)0x03, 
                                  (byte)0x03, (byte)0x03, (byte)0x03,(byte)0x03, 
                                  (byte)0x03, (byte)0x03, (byte)0x03,(byte)0x03};
                    
                        newKey1 = new DFKey(Key1, alg, 0);
                        newKey2 = new DFKey(Key2, alg, 0);
                        newKey3 = new DFKey(Key3, alg, 0);
                        
		        df.changeKey(1, newKey1, key);
                        df.changeKey(2, newKey2, key);
                        df.changeKey(3, newKey3, key);
                                                
                    }catch(Exception e){e.printStackTrace();}
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
	}
	catch(DFLException e){
            e.printStackTrace();
	}
    }
}
