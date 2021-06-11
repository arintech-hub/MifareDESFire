/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package DESFire_Lesson;

import DESFireLib.middleware.*;
import DESFireLib.library.*;
import DESFireLib.library.param.*;
import DESFireLib.library.param.fileset.*;
import DESFireLib.library.security.*;
import DESFireLib.utils.ba.*;
import DESFireLib.utils.security.*;

/**
 * @author Tere Varano 
 * @version 2.0
 * @since 2021/06/10
 */

// A collection of methods to create a change the keys of a dummy Jalisco card 
public class WriteFiles {
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
                    byte[] keyData;
                    System.out.println(df.getSession());						
					
                    try{
			System.out.println("Get Version:");
			dfres = df.getVersion();
                        System.out.println(dfres.getUID());
			System.out.println("");
			                       
			KeySettings ks = new KeySettings();
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
                                                
                        // Data type file
                        DFKey newKey1;                        
                        byte[] Key1 = {(byte)0x01, (byte)0x01, (byte)0x01,(byte)0x01, 
                                  (byte)0x01, (byte)0x01, (byte)0x01,(byte)0x01, 
                                  (byte)0x01, (byte)0x01, (byte)0x01,(byte)0x01, 
                                  (byte)0x01, (byte)0x01, (byte)0x01,(byte)0x01};                    
                        newKey1 = new DFKey(Key1, alg, 0);
                        System.out.println(df.authenticateAES(1, newKey1));
			System.out.println(df.getSession());
			System.out.println("");
                                               
                        AccessRights arEmision = new AccessRights();
                        arEmision.setReadAccess(AccessRights.FREE);
			arEmision.setWriteAccess(AccessRights.DENY);
                        arEmision.setReadWriteAccess(1);
                        arEmision.setChangeAccessRights(0);
                                                
                        FID fidEmision = new FID(1);
                        Size size = new Size(48);
                        Size offset = new Size(0);
                                                            
                        DataFileSettings DFS = new DataFileSettings(FileType.STANDARD_DATA, ComSet.MAC, arEmision, size);
                        
                        byte[] DataEmision = {(byte)0x01, (byte)0x02, (byte)0x03, (byte)0x04};
                        Data data = new Data(DataEmision);
                        
			System.out.println("Write Data: ");
			System.out.println(df.writeData(fidEmision, offset, data, DFS));
			System.out.println(df.getSession());
			System.out.println("");
			System.out.println("Commit Transaction: ");
			System.out.println(df.commitTransaction());
			System.out.println(df.getSession());
			System.out.println("");
                        System.out.println("Read Data: ");
			System.out.println(df.readData(fidEmision, offset, size, DFS));
			System.out.println(df.getSession());
			System.out.println("");
                                                
                        
                        // Value type file                    
                        DFKey newKey3;  
                        byte[] Key3 = {(byte)0x03, (byte)0x03, (byte)0x03,(byte)0x03, 
                                  (byte)0x03, (byte)0x03, (byte)0x03,(byte)0x03, 
                                  (byte)0x03, (byte)0x03, (byte)0x03,(byte)0x03, 
                                  (byte)0x03, (byte)0x03, (byte)0x03,(byte)0x03};  
                                              
                        newKey3 = new DFKey(Key3, alg, 0);
                        System.out.println(df.authenticateAES(3, newKey3));
			System.out.println(df.getSession());
			System.out.println("");
                                               
                        AccessRights arValMon = new AccessRights();
                        arValMon.setReadAccess(AccessRights.FREE);
			arValMon.setWriteAccess(2);
                        arValMon.setReadWriteAccess(3);
                        arValMon.setChangeAccessRights(0);
                                                
                        FID fidValMon = new FID(9);
                        Value lowLimit = new Value(0);
			Value upLimit = new Value(1000000);
                        Value limitedCreditValue = new Value(0);
			boolean getFreeValue = true;
                        
                        Value credit = new Value(10);
                        Value debit = new Value(5);
                        
                        ValueFileSettings fileSet = new ValueFileSettings(ComSet.MAC, arValMon, lowLimit,
                                upLimit, limitedCreditValue, getFreeValue);
                        
                        System.out.println("Get Value: ");
			System.out.println(df.getValue(fidValMon, fileSet));
			System.out.println(df.getSession());
			System.out.println("");
					
                        System.out.println("Credit: ");
			System.out.println(df.credit(fidValMon, credit, fileSet));
			System.out.println(df.getSession());
			System.out.println("");
                        System.out.println("Commit Transaction: ");
			System.out.println(df.commitTransaction());
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Debit: ");
			System.out.println(df.debit(fidValMon, debit, fileSet));
			System.out.println(df.getSession());
			System.out.println("");
                        System.out.println("Commit Transaction: ");
			System.out.println(df.commitTransaction());
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Get Value: ");
			System.out.println(df.getValue(fidValMon, fileSet));
			System.out.println(df.getSession());
			System.out.println("");
					
                        
                        // Record type file
			DFKey newKey2;   
                        byte[] Key2 = {(byte)0x02, (byte)0x02, (byte)0x02,(byte)0x02, 
                                  (byte)0x02, (byte)0x02, (byte)0x02,(byte)0x02, 
                                  (byte)0x02, (byte)0x02, (byte)0x02,(byte)0x02, 
                                  (byte)0x02, (byte)0x02, (byte)0x02,(byte)0x02};  	
                        
                        newKey2 = new DFKey(Key2, alg, 0);
                        System.out.println(df.authenticateAES(2, newKey2));
			System.out.println(df.getSession());
			System.out.println("");
                                               
                        AccessRights arEventos = new AccessRights();
                        arEventos.setReadAccess(AccessRights.FREE);
			arEventos.setWriteAccess(2);
                        arEventos.setReadWriteAccess(3);
                        arEventos.setChangeAccessRights(0);
                        
                        FID fidEventos = new FID(6);
                        Size sizeEventos = new Size(64);
                        Size offsetEventos = new Size(0);
                        Size sizeRec = new Size(4);
                                
                        RecordFileSettings DFSR = new RecordFileSettings(FileType.CYCLIC_RECORD, ComSet.MAC, 
                                arEventos, sizeEventos, 10, 1);
                        
                        byte[] DataEventos = {(byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF};
                        Data dataEventos = new Data(DataEventos);
                        
                        System.out.println("Write Record: ");
			System.out.println(df.writeRecord(fidEventos, offsetEventos, dataEventos, DFSR));
			System.out.println(df.getSession());
			System.out.println("");
			System.out.println("Commit Transaction: ");
			System.out.println(df.commitTransaction());
			System.out.println(df.getSession());
			System.out.println("");
                        
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
