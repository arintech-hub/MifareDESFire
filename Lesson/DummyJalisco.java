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

// A collection of methods to create a dummy Jalisco card 
public class DummyJalisco {
    
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
				
			/*	
			System.out.println("Authenticate:");
			keyData = new byte[16];
			System.out.println(df.authenticate(0, keyData));
			System.out.println(df.getSession());
			System.out.println("");						
			*/
												
			// CREATE APPLICATION
			KeySettings ks = new KeySettings();
			CipAlg alg = CipAlg.AES;
			System.out.println("Create Application:");
			System.out.println(df.createApplication(new AID(16456), ks, 14, false, alg));				
			System.out.println(df.getSession());
			System.out.println("");
					
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
                        
		
                        // FILES SETTINGS
                        FID fidEmision = new FID(1);
                        Size sizeEmision = new Size(48);
                        ComSet comSetEmision = ComSet.MAC;
			AccessRights arEmision = new AccessRights();
                        arEmision.setReadAccess(AccessRights.FREE);
			arEmision.setWriteAccess(AccessRights.DENY);
                        arEmision.setReadWriteAccess(1);
                        arEmision.setChangeAccessRights(0);
                        
                        FID fidEntorno = new FID(2);
                        Size sizeEntorno = new Size(24);
                        ComSet comSetEntorno = ComSet.MAC;
			AccessRights arEntorno = new AccessRights();
                        arEntorno.setReadAccess(AccessRights.FREE);
			arEntorno.setWriteAccess(AccessRights.DENY);
                        arEntorno.setReadWriteAccess(1);
                        arEntorno.setChangeAccessRights(0);
                        
                        FID fidUsuario = new FID(3);
                        Size sizeUsuario = new Size(96);
                        ComSet comSetUsuario = ComSet.MAC;
			AccessRights arUsuario = new AccessRights();
                        arUsuario.setReadAccess(AccessRights.FREE);
			arUsuario.setWriteAccess(AccessRights.DENY);
                        arUsuario.setReadWriteAccess(1);
                        arUsuario.setChangeAccessRights(0);
                        
                        FID fidEstado = new FID(4);
                        Size sizeEstado = new Size(23);
                        ComSet comSetEstado = ComSet.MAC;
			AccessRights arEstado = new AccessRights();
                        arEstado.setReadAccess(AccessRights.FREE);
			arEstado.setWriteAccess(AccessRights.DENY);
                        arEstado.setReadWriteAccess(1);
                        arEstado.setChangeAccessRights(0);
                                                
                        FID fidLista = new FID(5);
                        Size sizeLista = new Size(57);
                        ComSet comSetLista = ComSet.MAC;
			AccessRights arLista = new AccessRights();
                        arLista.setReadAccess(AccessRights.FREE);
			arLista.setWriteAccess(AccessRights.DENY);
                        arLista.setReadWriteAccess(2);
                        arLista.setChangeAccessRights(0);
                        
                        FID fidEventos = new FID(6);
                        Size sizeEventos = new Size(57);
                        int Records = 10;
                        ComSet comSetEventos = ComSet.MAC;
			AccessRights arEventos = new AccessRights();
                        arEventos.setReadAccess(AccessRights.FREE);
			arEventos.setWriteAccess(AccessRights.DENY);
                        arEventos.setReadWriteAccess(2);
                        arEventos.setChangeAccessRights(0);
                        
                        FID fidContMon = new FID(7);
                        Size sizeContMon = new Size(72);
                        ComSet comSetContMon = ComSet.MAC;
			AccessRights arContMon = new AccessRights();
                        arContMon.setReadAccess(AccessRights.FREE);
			arContMon.setWriteAccess(AccessRights.DENY);
                        arContMon.setReadWriteAccess(3);
                        arContMon.setChangeAccessRights(0);
                        
                        FID fidServMon = new FID(8);
                        Size sizeServMon = new Size(23);
                        ComSet comSetServMon = ComSet.MAC;
			AccessRights arServMon = new AccessRights();
                        arServMon.setReadAccess(AccessRights.FREE);
			arServMon.setWriteAccess(AccessRights.DENY);
                        arServMon.setReadWriteAccess(2);
                        arServMon.setChangeAccessRights(0);
                        
                        FID fidValMon = new FID(9);
                        Value lowLimit = new Value(0);
			Value upLimit = new Value(1000000);
			Value value = new Value(0);
			boolean getFreeValue = true;
                        ComSet comSetValMon = ComSet.MAC;
			AccessRights arValMon = new AccessRights();
                        arValMon.setReadAccess(AccessRights.FREE);
			arValMon.setWriteAccess(2);
                        arValMon.setReadWriteAccess(3);
                        arValMon.setChangeAccessRights(0);
                        
                        FID fidContCred = new FID(10);
                        Size sizeContCred = new Size(72);
                        ComSet comSetContCred = ComSet.MAC;
			AccessRights arContCred = new AccessRights();
                        arContCred.setReadAccess(AccessRights.FREE);
			arContCred.setWriteAccess(AccessRights.DENY);
                        arContCred.setReadWriteAccess(3);
                        arContCred.setChangeAccessRights(0);
                        
                        FID fidServCred = new FID(11);
                        Size sizeServCred = new Size(23);
                        ComSet comSetServCred = ComSet.MAC;
			AccessRights arServCred = new AccessRights();
                        arServCred.setReadAccess(AccessRights.FREE);
			arServCred.setWriteAccess(AccessRights.DENY);
                        arServCred.setReadWriteAccess(2);
                        arServCred.setChangeAccessRights(0);
                        
                        FID fidValCred = new FID(12);
                        Value lowLimitCred = new Value(-80000);
			Value upLimitCred = new Value(0);
			Value valueCred = new Value(0);
			boolean getFreeValueCred = true;
                        ComSet comSetValCred = ComSet.MAC;
			AccessRights arValCred = new AccessRights();
                        arValCred.setReadAccess(AccessRights.FREE);
			arValCred.setWriteAccess(2);
                        arValCred.setReadWriteAccess(3);
                        arValCred.setChangeAccessRights(0);
                        
                        FID fidContBPD = new FID(13);
                        Size sizeContBPD = new Size(72);
                        ComSet comSetContBPD = ComSet.MAC;
			AccessRights arContBPD = new AccessRights();
                        arContBPD.setReadAccess(AccessRights.FREE);
			arContBPD.setWriteAccess(AccessRights.DENY);
                        arContBPD.setReadWriteAccess(3);
                        arContBPD.setChangeAccessRights(0);
                        
                        FID fidServBPD = new FID(14);
                        Size sizeServBPD = new Size(23);
                        ComSet comSetServBPD = ComSet.MAC;
			AccessRights arServBPD = new AccessRights();
                        arServBPD.setReadAccess(AccessRights.FREE);
			arServBPD.setWriteAccess(AccessRights.DENY);
                        arServBPD.setReadWriteAccess(2);
                        arServBPD.setChangeAccessRights(0);
                        
                        FID fidValBPD = new FID(15);
                        Value lowLimitBPD = new Value(0);
			Value upLimitBPD = new Value(1000000);
			Value valueBPD = new Value(0);
			boolean getFreeValueBPD = true;
                        ComSet comSetValBPD = ComSet.MAC;
			AccessRights arValBPD = new AccessRights();
                        arValBPD.setReadAccess(AccessRights.FREE);
			arValBPD.setWriteAccess(2);
                        arValBPD.setReadWriteAccess(3);
                        arValBPD.setChangeAccessRights(0);
                        
                        // FILES CREATION
			System.out.println("Create Standard Data File: ");
			System.out.println(df.createStdDataFile(fidEmision, comSetEmision, arEmision, sizeEmision));
			System.out.println(df.getSession());
			System.out.println("");
                        
			System.out.println("Create Standard Data File: ");
			System.out.println(df.createStdDataFile(fidEntorno, comSetEntorno, arEntorno, sizeEntorno));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Create Standard Data File: ");
			System.out.println(df.createStdDataFile(fidUsuario, comSetUsuario, arUsuario, sizeUsuario));
			System.out.println(df.getSession());
			System.out.println("");
						
                        System.out.println("Create Backup Data File: ");
			System.out.println(df.createBackupDataFile(fidEstado, comSetEstado, arEstado, sizeEstado));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Create Backup Data File: ");
			System.out.println(df.createBackupDataFile(fidLista, comSetLista, arLista, sizeLista));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Create Cyclic Record Data File: ");
			System.out.println(df.createCyclicRecordFile(fidEventos, comSetEventos, arEventos, sizeEventos, Records));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Create Standard Data File: ");
			System.out.println(df.createStdDataFile(fidContMon, comSetContMon, arContMon, sizeContMon));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Create Backup Data File: ");
			System.out.println(df.createBackupDataFile(fidServMon, comSetServMon, arServMon, sizeServMon));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Create Value File: ");
			System.out.println(df.createValueFile(fidValMon, comSetValMon, arValMon, lowLimit, upLimit, value, true, getFreeValue));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Create Standard Data File: ");
			System.out.println(df.createStdDataFile(fidContCred, comSetContCred, arContCred, sizeContCred));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Create Backup Data File: ");
			System.out.println(df.createBackupDataFile(fidServCred, comSetServCred, arServCred, sizeServCred));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Create Value File: ");
			System.out.println(df.createValueFile(fidValCred, comSetValCred, arValCred, lowLimitCred, upLimitCred, valueCred, true, getFreeValueCred));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Create Standard Data File: ");
			System.out.println(df.createStdDataFile(fidContBPD, comSetContBPD, arContBPD, sizeContBPD));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Create Backup Data File: ");
			System.out.println(df.createBackupDataFile(fidServBPD, comSetServBPD, arServBPD, sizeServBPD));
			System.out.println(df.getSession());
			System.out.println("");
                        
                        System.out.println("Create Value File: ");
			System.out.println(df.createValueFile(fidValBPD, comSetValBPD, arValBPD, lowLimitBPD, upLimitBPD, valueBPD, true, getFreeValueBPD));
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
