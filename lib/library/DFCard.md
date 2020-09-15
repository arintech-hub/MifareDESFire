# DFCard
Provides an abstraction of a Mifare DESFire Card, allowing to send native commands and receive the card responses through its methods.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public DFCard(ComManager cm)|Constructs an instance of class DFCard @param cm a previously connected ComManager instance|
|public DFResponse authenticate(int keyNum, DFKey key)|Executes the interpreted version of the Authenticate command, as defined in the Mifare DESFire API. Response only includes the Status Code returned by the card. @param keyNum the key number within the selected card application with which we want to authenticate @param key an instance of class <code>DFKey</code> containing the data about the key identified by <code>keyNum</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse authenticate(int keyNum, byte[] keyData)|Executes the interpreted version of the Authenticate command, as defined in the Mifare DESFire API. Response only includes the Status Code returned by the card. @param keyNum the key number within the selected card application with which we want to authenticate @param keyData a byte array containing the key identified by <code>keyNum</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] Authenticate(byte[] keyNum, byte[] keyData)|Executes the raw version of the Authenticate command, as defined in the Mifare DESFire API. @param keyNum a byte array representing the key number within the selected card application with which we want to authenticate @param keyData a byte array containing the key identified by <code>keyNum</code> @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse authenticateISO(int keyNum, DFKey key)|Executes the interpreted version of the Authenticate ISO command, as defined in the Mifare DESFire EV1 API. Response only includes the Status Code returned by the card. @param keyNum the key number within the selected card application with which we want to authenticate @param key an instance of class <code>DFKey</code> containing the data about the key identified by <code>keyNum</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse authenticateISO(int keyNum, byte[] keyData)|Executes the interpreted version of the Authenticate ISO command, as defined in the Mifare DESFire EV1 API Response only includes the Status Code returned by the card @param keyNum the key number within the selected card application with which we want to authenticate @param keyData a byte array containing the key identified by <code>keyNum</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] AuthenticateISO(byte[] keyNum, byte[] keyData)|Executes the raw version of the Authenticate ISO command, as defined in the Mifare DESFire EV1 API. Response only includes the Status Code returned by the card @param keyNum a byte array representing the key number within the selected card application with which we want to authenticate @param keyData a byte array containing the key identified by <code>keyNum</code> @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse authenticateAES(int keyNum, DFKey key)|Executes the interpreted version of the Authenticate AES command, as defined in the Mifare DESFire EV1 API. Response only includes the Status Code returned by the card @param keyNum the key number within the selected card application with which we want to authenticate. Response only includes the Status Code returned by the card @param key an instance of class <code>DFKey</code> containing the data about the key identified by <code>keyNum</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse authenticateAES(int keyNum, byte[] keyData)|Executes the interpreted version of the Authenticate AES command, as defined in the Mifare DESFire EV1 API Response only includes the Status Code returned by the card @param keyNum the key number within the selected card application with which we want to authenticate. Response only includes the Status Code returned by the card @param keyData a byte array containing the key identified by <code>keyNum</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] AuthenticateAES(byte[] keyNum, byte[] keyData)|Executes the raw version of the Authenticate ISO command, as defined in the Mifare DESFire EV1 API Response only includes the Status Code returned by the card @param keyNum a byte array representing the key number within the selected card application with which we want to authenticate @param keyData a byte array containing the key identified by <code>keyNum</code> @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse changeKeySettings(KeySettings ks)|Executes the interpreted version of the Change Key Settings command, as defined in the Mifare DESFire API Response only includes the Status Code returned by the card @param ks an instance of class <code>KeySettings</code> representing the new key settings of the currently selected card application @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] ChangeKeySettings(byte[] cipKeySettings)|Executes the raw version of the Change Key Settings command, as defined in the Mifare DESFire API @param cipKeySettings a byte array containing the new key settings of the currently selected card application, transformed for security as required @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse setConfiguration(ConfigOption opt)|Executes the interpreted version of the Set Configuration command, as defined in the Mifare DESFire EV1 API Response only includes the Status Code returned by the card @param opt an instance of class <code>ConfigOption</code> including the configuration option to be set in the card and the corresponding data @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] SetConfiguration(byte[] opt, byte[] encData)|Executes the raw version of the Set Configuration command, as defined in the Mifare DESFire EV1 API @param opt a byte array representing the configuration option to be set in the card @param encData a byte array representing the data to be set in the card, transformed for security as required @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse changeKey(int keyNum, DFKey newKey, DFKey oldKey)|Executes the interpreted version of the Change Key command, as defined in the Mifare DESFire API Response only includes the Status Code returned by the card @param keyNum the key number within the selected card application that we want to modify @param newKey an instance of class <code>DFKey</code> containing the new data about the key identified by <code>keyNum</code> @param oldKey an instance of class <code>DFKey</code> containing the old data about the key identified by <code>keyNum</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] ChangeKey(byte[] keyNum, byte[] encKeyData)|Executes the raw version of the Change Key command, as defined in the Mifare DESFire API @param keyNum a byte array representing the key number within the selected card application with which we want to authenticate @param encKeyData a byte array containing the new key, transformed for security as required @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse getKeyVersion(int keyNum)|Executes the interpreted version of the Get Key Version command, as defined in the Mifare DESFire API Response includes an object of class <code>KeyVersion</code>, which can be retrieved with its method <code>getKeyVersion()</code> @param keyNum the key number within the selected card application of which we want to retrieve its current version @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] GetKeyVersion(byte[] keyNum)|Executes the raw version of the Get Key Version command, as defined in the Mifare DESFire API @param keyNum a byte array representing the key number within the selected card application of which we want to retrieve its current version @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse createApplication(AID aid, KeySettings ks, int numOfKeys)|Executes the interpreted version of the Create Application command, as defined in the Mifare DESFire API. Response only includes the Status Code returned by the card @param aid an instance of class <code>AID</code> representing the application identifier of the new application to be created in the card @param ks an instance of class <code>KeySettings</code> representing the desired key settings of the new application to be created @param numOfKeys the number of keys of the new application to be created @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse createApplication(AID aid, KeySettings ks, int numOfKeys, boolean ISOFidAllow, CipAlg alg)|Executes the interpreted version of the Create Application command, as defined in the Mifare DESFire EV1 API Response only includes the Status Code returned by the card @param aid an instance of class <code>AID</code> representing the* application identifier of the new application to be created in the card @param ks an instance of class <code>KeySettings</code> representing the desired key settings of the new application to be created @param numOfKeys the number of keys of the new application to be created @param ISOFidAllow a boolean indicating whether ISO file identifiers are allowed or not in the new application @param alg an instance of class <code>CipAlg</code> representing the criptographic algorithm to be used in the security of the new application @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse createApplication(AID aid, KeySettings ks, int numOfKeys, boolean ISOFidAllow, CipAlg alg, ISOFileID isoFid, DFName name)|Executes the interpreted version of the Create Application command, as defined in the Mifare DESFire EV1 API Response only includes the Status Code returned by the card @param aid an instance of class <code>AID</code> representing the application identifier of the new application to be created in the card @param ks an instance of class <code>KeySettings</code> representing the desired key settings of the new application to be created @param numOfKeys the number of keys of the new application to be created @param ISOFidAllow a boolean indicating whether ISO file identifiers are allowed or not in the new application @param alg an instance of class <code>CipAlg</code> representing the criptographic algorithm to be used in the security of the new application @param isoFid an instance of class <code>ISOFileID</code> representing the ISO file identifier of the new application to be created in the card @param name an instance of class <code>DFName</code> representing the DF name of the new application to be created in the card @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] CreateApplication(byte[] aid, byte[] keySettings, byte[] numOfKeys)|Executes the raw version of the Create Application command, as defined in the Mifare DESFire API @param aid a byte array representing the application identifier of the new application to be created in the card @param keySettings a byte array representing the desired key settings of the new application to be created @param numOfKeys a byte array representing the number of keys of the new application to be created @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] CreateApplication(byte[] aid, byte[] ks, byte[] ks2, byte[] fid, byte[] name)|Executes the raw version of the Create Application command, as defined in the Mifare DESFire EV1 API @param aid a byte array representing the application identifier of the new application to be created in the card @param ks a byte array representing the desired key settings of the new application to be created @param ks2 a byte array representing the number of keys of the new application to be created, as well as whether ISO file identifiers are allowed or not in the new application and the criptographic algorithm to be used @param fid a byte array representing the ISO file identifier of the new application to be created in the card @param name a byte array representing the DF name of the new application to be created in the card @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse deleteApplication(AID aid)|Executes the interpreted version of the Delete Application command, as defined in the Mifare DESFire API Response only includes the Status Code returned by the card @param aid an instance of class <code>AID</code> representing the application identifier of the new application to be created in the card * @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] DeleteApplication(byte[] aid)|Executes the raw version of the Delete Application command, as defined in the Mifare DESFire API @param aid a byte array representing the application identifier of the new application to be created in the card @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse getApplicationIDs()|Executes the interpreted version of the Get Application IDs command, as defined in the Mifare DESFire API Response includes an object of class <code>AIDS</code>, which can be retrieved with its method <code>getAIDs()</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] GetApplicationIDs()|Executes the raw version of the Get Application IDs command, as defined in the Mifare DESFire API @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse freeMemory()|Executes the interpreted version of the Free Memory command, as defined in the Mifare DESFire EV1 API Response includes an object of class <code>Size</code>, which can be retrieved with its method <code>getFreeMemory()</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] FreeMemory()|Executes the raw version of the Free Memory command, as defined in the Mifare DESFire EV1 API @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse getDFNames()|Executes the interpreted version of the Free Memory command, as defined in the Mifare DESFire EV1 API Response includes an object of class <code>DFNamesRes</code>, which can be retrieved with its method <code>getDFNames()</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[][] GetDFNames()|Executes the raw version of the Free Memory command, as defined in the Mifare DESFire EV1 API @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse getKeySettings()|Executes the interpreted version of the Get Key Settings command, as defined in the Mifare DESFire API Response includes an object of class <code>KeySettingsRes</code>, which contains an instance of <code>KeySettings</code> that can be retrieved with its method <code>getKeySettings()</code>, and the number of keys that can be obtained with its method <code>getNumOfKeys()</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] GetKeySettings()|Executes the raw version of the Get Key Settings command, as defined in the Mifare DESFire API @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse selectApplication(AID aid)|Executes the interpreted version of the Select Application command, as defined in the Mifare DESFire API Response only includes the Status Code returned by the card @param aid an instance of class <code>AID</code> representing the application identifier of the application to be selected @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
| public byte[] SelectApplication(byte[] aid)|Executes the raw version of the Select Application command, as defined in the Mifare DESFire API @param aid a byte array representing the application identifier of the application to be created in the card @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse formatPICC()|Executes the interpreted version of the Format PICC command, as defined in the Mifare DESFire API Response only includes the Status Code returned by the card @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse getVersion()|Executes the interpreted version of the Get Version command, as defined in the Mifare DESFire API Response includes an object of class <code>PICCVersion</code>, which can be retrieved with its method <code>getPICCVersion()</code> The card UID can be retrieved directly with the method <code>getUID()</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] GetVersion()|Executes the raw version of the Get Version command, as defined in the Mifare DESFire API @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|
|public DFResponse getCardUID()|Executes the interpreted version of the Get Card UID command, as defined in the Mifare DESFire EV1 API Response includes an object of class <code>UIDRes</code>, which can be retrieved with its method <code>getUIDRes()</code> The card UID can be retrieved directly with the method <code>getUID()</code> @return an instance of class <code>DFResponse</code> containing the response obtained from the Mifare DESFire card to the transmitted command|
|public byte[] GetCardUID()|Executes the raw version of the Get Card UID command, as defined in the Mifare DESFire EV1 API @return a byte array representing the response obtained from the Mifare DESFire card to the transmitted command|

    /* ***
     * Application Level Commands
     * ***/
	
    //Get File IDs
	
    /* Executes the interpreted version of the Get File IDs command, as defined in 
     * the Mifare DESFire API. Response includes an object of class <code>FIDS</code>, 
     * which can be retrieved with its method <code>getFIDs()</code>. @return an 
     * instance of class <code>DFResponse</code> containing the response obtained 
     * from the Mifare DESFire card to the transmitted command */
    public DFResponse getFileIDs(){	
	byte[] res = GetFileIDs();
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.updateCmacIV(ComCode.GET_FILE_IDS, getSession());
	DFCrypto.checkCMAC(res, getSession());
	byte[] fids = DFCrypto.getData(res, getSession());
	return new DFResponse(SC.OPERATION_OK, new FIDS(fids));
    }
	
    /* Executes the raw version of the Get File IDs command, as defined in the Mifare 
     * DESFire API. @return a byte array representing the response obtained from the 
     * Mifare DESFire card to the transmitted command */
    public byte[] GetFileIDs(){
	byte[] com = ComCode.GET_FILE_IDS.toBA();
	return send(com);
    }

    //Get ISO File IDs
	
    /* Executes the interpreted version of the Get ISO File IDs command, as defined
     * in the Mifare DESFire EV1 API. Response includes an object of class 
     * <code>ISOFileIDs</code>, which can be retrieved with its method <code>getISOFileIDs()</code>.
     * @return an instance of class <code>DFResponse</code> containing the response 
     * obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse getISOFileIDs(){	
	byte[] res = GetISOFileIDs();
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.updateCmacIV(ComCode.GET_ISO_FILE_IDS, getSession());
	DFCrypto.checkCMAC(res, getSession());
	byte[] fids = DFCrypto.getData(res, getSession());
	return new DFResponse(SC.OPERATION_OK, new ISOFileIDS(fids));
    }

    /* Executes the raw version of the Get ISO File IDs command, as defined in the 
     * Mifare DESFire EV1 API. @return a byte array representing the response obtained
     * from the Mifare DESFire card to the transmitted command */
    public byte[] GetISOFileIDs(){
	byte[] rres;
	byte[] res = new byte[0];
	byte[] com = ComCode.GET_ISO_FILE_IDS.toBA();
	do{
            rres = send(com);
            if(rres.length > 1)
		res = BAUtils.concatenateBAs(
			res, BAUtils.extractSubBA(rres, 1, rres.length-1));
            com = SC.ADDITIONAL_FRAME.toBA();
	}while(SC.isAF(rres));
	byte[] sc = BAUtils.extractSubBA(rres, 0, 1);
	if(SC.isOk(rres)) return BAUtils.concatenateBAs(sc, res);
	else return sc;
    }	
	
    //Get File Settings
	
    /* Executes the interpreted version of the Get File Settings command, as defined
     * in the Mifare DESFire API. Response includes an object of class <code>FileSettings</code>, 
     * which can be retrieved with its method <code>getFileSettings()</code>. Depending 
     * on the type of file, this object can be casted to <code>DataFileSettings</code>,
     * <code>ValueFileSettings</code>, or <code>RecordFileSettings</code>. 
     * @param fid an instance of class <code>FID</code> representing the file identifier
     * @return an instance of class <code>DFResponse</code> containing the response 
     * obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse getFileSettings(FID fid){
	if(fid == null) throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] res = GetFileSettings(fidBA);
	if(!SC.isOk(res)){
            getSession().resetAuth();
            return new DFResponse(res);
	}	
	DFCrypto.updateCmacIV(
                ComCode.GET_FILE_SETTINGS, fidBA, getSession());
	DFCrypto.checkCMAC(res, getSession());
	byte[] fileSetBA = DFCrypto.getData(res, getSession());
	System.out.println(BAUtils.toString(fileSetBA));
	FileType ft = FileType.toFileType(
		BAUtils.extractSubBA(fileSetBA, 0, 1));
	FileSettings fs;
	if((ft == FileType.STANDARD_DATA) || (ft == FileType.BACKUP_DATA))
            fs = new DataFileSettings(fileSetBA);
	else if(ft == FileType.VALUE)
            fs = new ValueFileSettings(fileSetBA);
	else
            fs = new RecordFileSettings(fileSetBA);
	return new DFResponse(SC.OPERATION_OK, fs);	
    }
	
    /* Executes the raw version of the Get File Settings command, as defined in the 
     * Mifare DESFire API. @param fid a byte array representing the file identifier
     * @return a byte array representing the response obtained from the Mifare 
     * DESFire card to the transmitted command */
    public byte[] GetFileSettings(byte[] fid){
	if(fid == null) throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
	ComCode.GET_FILE_SETTINGS.toBA(), fid);
	return send(com);
    }
	
    //Change File Settings
	
    /* Executes the interpreted version of the Change File Settings command,
     * as defined in the Mifare DESFire API. Response only includes the Status Code 
     * returned by the card. @param fid an instance of class <code>FID</code> 
     * representing the file identifier @param comSet an instance of class <code>ComSet</code> 
     * representing the new communication settings to be set @param newAR an instance 
     * of class <code>AccessRights</code> representing the new access rights to be set
     * @param oldAR an instance of class <code>AccessRights</code> representing
     * the current access rights of the file @return an instance of class 
     * <code>DFResponse</code> containing the response obtained from the Mifare 
     * DESFire card to the transmitted command */
    public DFResponse changeFileSettings(FID fid, ComSet comSet, 
            AccessRights newAR, AccessRights oldAR){
	if((fid == null) || (comSet == null) || 
		(newAR == null) || (oldAR == null)) 
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] comSetBA = comSet.toBA();
	byte[] arBA = newAR.toBA();
	byte[] res;
	if(oldAR.getChangeAccessRights() == AccessRights.FREE){
            res = ChangeFileSettings(fidBA, comSetBA, arBA);
	}
	else{
            if(getSession().getAuthType() == AuthType.NO_AUTH) 
		return new DFResponse(SC.AUTHENTICATION_ERROR);
            byte[] fsBA = BAUtils.concatenateBAs(comSetBA, arBA);
            byte[] crc = DFCrypto.CRC(ComCode.CHANGE_FILE_SETTINGS, 
                    fidBA, fsBA, getSession().getAuthType());
            byte[] cipFileSettings = DFCrypto.encode(
                    BAUtils.concatenateBAs(fsBA, crc), getSession());
            res = ChangeFileSettings(fidBA, cipFileSettings);		
	}	
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.checkCMAC(res, session);
	return new DFResponse(BAUtils.extractSubBA(res, 0, 1));	
    }	
	
    /* Executes the raw version of the Change File Settings command, as defined in 
     * the Mifare DESFire API. This version of the command will only succeed if the
     * current access rights allow its change freely. @param fid a byte array 
     * representing the file identifier @param comSet a byte array representing
     * the new communication settings to be set @param ar a byte array representing 
     * the new access rights to be set @return a byte array representing the response 
     * obtained from the Mifare DESFire card to the transmitted command */
    public byte[] ChangeFileSettings(byte[] fid, byte[] comSet, 
            byte[] ar){
	if((fid == null) || (comSet == null) || 
		(ar == null)) 
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
		ComCode.CHANGE_FILE_SETTINGS.toBA(), 
			fid, comSet, ar);
	return send(com);
    }
	
    /* Executes the raw version of the Change File Settings command, as defined in 
     * the Mifare DESFire API. This version of the command is needed if the current 
     * access rights require a previous authentication to be changed. @param fid 
     * an instance of class <code>FID</code> representing the file identifier
     * @param encFileSettings a byte array containing the new file settings, transformed 
     * for security as required @return a byte array representing the response obtained
     * from the Mifare DESFire card to the transmitted command */
    public byte[] ChangeFileSettings(byte[] fid, byte[] encFileSettings){		
	if((fid == null) || (encFileSettings == null)) 
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
		ComCode.CHANGE_FILE_SETTINGS.toBA(), 
			fid, encFileSettings);
	return send(com);
    }

    //Create Standard Data File
	
    /* Executes the interpreted version of the Create Standard Data File command, 
     * as defined in the Mifare DESFire API. Response only includes the Status Code 
     * returned by the card. @param fid an instance of class <code>FID</code> 
     * representing the file identifier of the new file @param comSet an instance 
     * of class <code>ComSet</code> representing the communication settings to be 
     * set in the new file @param ar an instance of class <code>AccessRights</code> 
     * representing the new access rights to be set in the new file @param fileSize 
     * an instance of class <code>Size</code> representing the size of the new file 
     * to be created @return an instance of class <code>DFResponse</code> containing 
     * the response obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse createStdDataFile(FID fid, ComSet comSet, 
            AccessRights ar, Size fileSize){
	if((fid == null) || (comSet == null) || 
		(ar == null) || (fileSize == null))
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] comSetBA = comSet.toBA();
	byte[] arBA = ar.toBA();
	byte[] sizeBA = fileSize.toBA();
	byte[] res = CreateStdDataFile(fidBA, comSetBA, arBA, sizeBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	byte[] data = BAUtils.concatenateBAs(fidBA, comSetBA, arBA, sizeBA);
	DFCrypto.updateCmacIV(ComCode.CREATE_STD_DATA_FILE, data, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);
    }
	
    /* Executes the interpreted version of the Create Standard Data File command, 
     * as defined in the Mifare DESFire API. Response only includes the Status Code 
     * returned by the card. @param fid an instance of class <code>FID</code> 
     * representing the file identifier of the new file @param isoFid an instance 
     * of class <code>ISOFileID</code> representing the ISO file identifier of the 
     * new file @param comSet an instance of class <code>ComSet</code> representing
     * the communication settings to be set in the new file @param ar an instance 
     * of class <code>AccessRights</code> representing the new access rights to be 
     * set in the new file @param fileSize an instance of class <code>Size</code>
     * representing the size of the new file to be created @return an instance of 
     * class <code>DFResponse</code> containing the response obtained from the Mifare 
     * DESFire card to the transmitted command */
    public DFResponse createStdDataFile(FID fid, ISOFileID isoFid, 
            ComSet comSet, AccessRights ar, Size fileSize){
	if((fid == null) || (isoFid == null) || (comSet == null) || 
		(ar == null) || (fileSize == null))
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] isoFidBA = isoFid.toBA();
	byte[] comSetBA = comSet.toBA();
	byte[] arBA = ar.toBA();
	byte[] sizeBA = fileSize.toBA();
	byte[] res = CreateStdDataFile(fidBA, isoFidBA,comSetBA, arBA, sizeBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	byte[] data = BAUtils.concatenateBAs(fidBA, isoFidBA,comSetBA, arBA, sizeBA);
	DFCrypto.updateCmacIV(ComCode.CREATE_STD_DATA_FILE,data, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);	
    }	
	
    /* Executes the raw version of the Create Standard Data File command, as defined 
     * in the Mifare DESFire API. Response only includes the Status Code returned by
     * the card. @param fid a byte array representing the file identifier of the new file
     * @param comSet a byte array representing the communication settings to be 
     * set in the new file @param ar a byte array representing the new access rights 
     * to be set in the new file @param fileSize in instance of class <code>Size</code> 
     * representing the size of the new file to be created @return a byte array 
     * representing the response obtained from the Mifare DESFire card to the 
     * transmitted command */
    public byte[] CreateStdDataFile(byte[] fid, byte[] comSet, 
            byte[] ar, byte[] fileSize){
	if((fid == null) || (comSet == null) || 
		(ar == null) || (fileSize == null))
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
		ComCode.CREATE_STD_DATA_FILE.toBA(),fid, comSet, ar, fileSize);
		
	return send(com);
}

    /* Executes the raw version of the Create Standard Data File command, as defined 
     * in the Mifare DESFire API. Response only includes the Status Code returned by 
     * the card. @param fid a byte array representing the file identifier of the new file
     * @param isoFid a byte array representing the ISO file identifier of the new file
     * @param comSet a byte array representing the communication settings to be set 
     * in the new file @param ar a byte array representing the new access rights to 
     * be set in the new file @param fileSize a byte array representing the size of
     * the new file to be created @return a byte array representing the response 
     * obtained from the Mifare DESFire card to the transmitted command */
    public byte[] CreateStdDataFile(byte[] fid, byte[] isoFid, 
            byte[] comSet, byte[] ar, byte[] fileSize){
	if((fid == null) || (isoFid == null) || (comSet == null) ||
                (ar == null) || (fileSize == null))
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
		ComCode.CREATE_STD_DATA_FILE.toBA(),fid, isoFid, comSet, ar, fileSize);
	return send(com);
    }
	
    //Create Backup Data File

    /* Executes the interpreted version of the Create Backup Data File command, 
    * as defined in the Mifare DESFire API. Response only includes the Status Code 
     * returned by the card. @param fid an instance of class <code>FID</code> 
     * representing the file identifier of the new file @param comSet an instance 
     * of class <code>ComSet</code> representing the communication settings to be 
     * set in the new file @param ar an instance of class <code>AccessRights</code> 
     * representing the new access rights to be set in the new file @param fileSize 
     * an instance of class <code>Size</code> representing the size of the new file 
     * to be created @return an instance of class <code>DFResponse</code> containing 
     * the response obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse createBackupDataFile(FID fid, ComSet comSet,
            AccessRights ar, Size fileSize){
	if((fid == null) || (comSet == null) || (ar == null) ||
		(fileSize == null))
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] comSetBA = comSet.toBA();
	byte[] arBA = ar.toBA();
	byte[] sizeBA = fileSize.toBA();
	byte[] res = CreateBackupDataFile(fidBA, comSetBA, arBA, sizeBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	byte[] data = BAUtils.concatenateBAs(fidBA, comSetBA, arBA, sizeBA);
	DFCrypto.updateCmacIV(ComCode.CREATE_BACKUP_DATA_FILE,data, getSession());
	DFCrypto.checkCMAC(res, getSession());
        return new DFResponse(SC.OPERATION_OK);
    }
	
    /* Executes the interpreted version of the Create Backup Data File command, 
     * as defined in the Mifare DESFire API. Response only includes the Status Code 
     * returned by the card. @param fid an instance of class <code>FID</code> 
     * representing the file identifier of the new file @param isoFid an instance 
     * of class <code>ISOFileID</code> representing the ISO file identifier of the
     * new file @param comSet an instance of class <code>ComSet</code> representing
     * the communication settings to be set in the new file @param ar an instance 
     * of class <code>AccessRights</code> representing the new access rights to be 
     * set in the new file @param fileSize an instance of class <code>Size</code> 
     * representing the size of the new file to be created @return an instance of 
     * class <code>DFResponse</code> containing the response obtained from the Mifare 
     * DESFire card to the transmitted command */
    public DFResponse createBackupDataFile(FID fid, ISOFileID isoFid,
            ComSet comSet, AccessRights ar, Size fileSize){
	if((fid == null) || (isoFid == null) || (comSet == null) ||
		(ar == null) || (fileSize == null))
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] isoFidBA = isoFid.toBA();
	byte[] comSetBA = comSet.toBA();
	byte[] arBA = ar.toBA();
	byte[] sizeBA = fileSize.toBA();
	byte[] res = CreateBackupDataFile(fidBA, isoFidBA, comSetBA,arBA, sizeBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	byte[] data = BAUtils.concatenateBAs(fidBA, isoFidBA, comSetBA,arBA, sizeBA);
	DFCrypto.updateCmacIV(ComCode.CREATE_BACKUP_DATA_FILE,data, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);	
    }
		
    /* Executes the raw version of the Create Backup Data File command, as defined 
     * in the Mifare DESFire API. @param fid a byte array representing the file 
     * identifier of the new file @param comSet a byte array representing the 
     * communication settings to be set in the new file @param ar a byte array representing
     * the new access rights to be set in the new file @param fileSize a byte array 
     * representing the size of the new file to be created @return a byte array 
     * representing the response obtained from the Mifare DESFire card to the 
     * transmitted command */
    public byte[] CreateBackupDataFile(byte[] fid, byte[] comSet,
            byte[] ar, byte[] fileSize){
	if((fid == null) || (comSet == null) || (ar == null) ||
		(fileSize == null))
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
                ComCode.CREATE_BACKUP_DATA_FILE.toBA(),fid, comSet, ar, fileSize);
	return send(com);
    }
	
    /* Executes the raw version of the Create Backup Data File command, as defined
     * in the Mifare DESFire API. @param fid a byte array representing the file 
     * identifier of the new file @param isoFid a byte array representing the ISO file 
     * identifier of the new file @param comSet a byte array representing the 
     * communication settings to be set in the new file @param ar a byte array 
     * representing the new access rights to be set in the new file @param fileSize 
     * a byte array representing the size of the new file to be created @return a 
     * byte array representing the response obtained from the Mifare DESFire card 
     * to the transmitted command */
    public byte[] CreateBackupDataFile(byte[] fid, byte[] isoFid,
            byte[] comSet, byte[] ar, byte[] fileSize){
	if((fid == null) || (isoFid == null) || (comSet == null) ||
		(ar == null) || (fileSize == null))
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
		ComCode.CREATE_BACKUP_DATA_FILE.toBA(),fid, isoFid, comSet, ar, fileSize);
	return send(com);
    }
	
    //Create Value File
	
    /* Executes the interpreted version of the Create Value File command, as defined 
     * in the Mifare DESFire API. Response only includes the Status Code returned 
     * by the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the new file @param comSet an instance of class 
     * <code>ComSet</code> representing the communication settings to be set in the 
     * new file @param ar an instance of class <code>AccessRights</code> representing
     * the new access rights to be set in the new file @param lowerLimit an instance 
     * of class <code>Value</code> representing the boundary which must not be passed 
     * by a Debit calculation on the current value. It may be negative, and is usually 
     * set to 0 @param upperLimit an instance of class <code>Value</code> representing
     * the boundary which must not be passed by a Credit calculation on the current value.  
     * It has to be higher or equal to the lower limit @param value an instance of 
     * class <code>Value</code> representing the initial value to be set in the file
     * @param limCredEn a boolean indicating whether Limited Credit operations are
     * allowed in this file or not @return an instance of class <code>DFResponse</code> 
     * containing the response obtained from the Mifare DESFire card to the transmitted 
     * command */
    public DFResponse createValueFile(FID fid, ComSet comSet,
            AccessRights ar, Value lowerLimit, Value upperLimit,
                    Value value, boolean limCredEn){
	if((fid == null) || (comSet == null) || (ar == null) ||
		(lowerLimit == null) || (upperLimit == null) ||
			(value == null)) 
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] comSetBA = comSet.toBA();
	byte[] arBA = ar.toBA();
	byte[] lowBA = lowerLimit.toBA();
	byte[] upBA = upperLimit.toBA();
	byte[] valueBA = value.toBA();
	byte[] limBA = BAUtils.toBA(limCredEn);
	byte[] res = CreateValueFile(fidBA, comSetBA, arBA,lowBA, upBA, valueBA, limBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	byte[] data = BAUtils.concatenateBAs(fidBA, comSetBA, arBA,
		lowBA, upBA, valueBA, limBA);
	DFCrypto.updateCmacIV(ComCode.CREATE_VALUE_FILE,data, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);
    }
	
    /* Executes the interpreted version of the Create Value File command, as defined
     * in the Mifare DESFire EV1 API. Response only includes the Status Code returned 
     * by the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the new file @param comSet an instance of class 
     * <code>ComSet</code> representing the communication settings to be set in the 
     * new file @param ar an instance of class <code>AccessRights</code> representing
     * the new access rights to be set in the new file @param lowerLimit an instance
     * of class <code>Value</code> representing the boundary which must not be passed
     * by a Debit calculation on the current value. It may be negative, and is usually
     * set to 0 @param upperLimit an instance of class <code>Value</code> representing 
     * the boundary which must not be passed by a Credit calculation on the current
     * value. It has to be higher or equal to the lower limit @param value an instance
     * of class <code>Value</code> representing the initial value to be set in the file
     * @param limCredEn a boolean indicating whether Limited Credit operations
     * are allowed in this file or not @param freeGetVal a boolean indicating whether
     * free read access to the current value is permited or not @return an instance 
     * of class <code>DFResponse</code> containing the response obtained from the 
     * Mifare DESFire card to the transmitted command */
    public DFResponse createValueFile(FID fid, ComSet comSet,
            AccessRights ar, Value lowerLimit, Value upperLimit,
                    Value value, boolean limCredEn, boolean freeGetVal){
	if((fid == null) || (comSet == null) || (ar == null) ||
		(lowerLimit == null) || (upperLimit == null) ||
			(value == null)) 
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] comSetBA = comSet.toBA();
	byte[] arBA = ar.toBA();
	byte[] lowBA = lowerLimit.toBA();
	byte[] upBA = upperLimit.toBA();
	byte[] valueBA = value.toBA();
	byte[] limBA = BAUtils.toBA(limCredEn);
	if(freeGetVal) limBA = BAUtils.xor(limBA, BAUtils.toBA("02"));
	byte[] res = CreateValueFile(fidBA, comSetBA, arBA,lowBA, upBA, valueBA, limBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	byte[] data = BAUtils.concatenateBAs(fidBA, comSetBA,
		arBA, lowBA, upBA, valueBA, limBA);
	DFCrypto.updateCmacIV(ComCode.CREATE_VALUE_FILE,data, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);
    }
		
    /* Executes the raw version of the Create Value File command, as defined in 
     * the Mifare DESFire EV1 API. @param fid a byte array representing the file 
     * identifier of the new file @param comSet a byte array representing the 
     * communication settings to be set in the new file @param ar a byte array 
     * representing the new access rights to be set in the new file @param lowerLimit
     * a byte array representing the lower possible value in the file @param upperLimit
     * a byte array representing the upper possible value in the file @param value a
     * byte array representing the initial value in the file @param limCredEnFreeGetVal
     * a byte array representing both whether Limited Credit operations are allowed
     * or not and whether free read access to the current value is permited or not
     * @return a byte array representing the response obtained from the Mifare 
     * DESFire card to the transmitted command */
    public byte[] CreateValueFile(byte[] fid, byte[] comSet,
            byte[] ar, byte[] lowerLimit, byte[] upperLimit,
                    byte[] value, byte[] limCredEnFreeGetVal){
	if((fid == null)|| (comSet == null) || (ar == null) ||
		(lowerLimit == null) || (upperLimit == null) ||
			(value == null)
				|| (limCredEnFreeGetVal == null))
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
		ComCode.CREATE_VALUE_FILE.toBA(),
			fid, comSet, ar, lowerLimit,
				upperLimit, value,
                                        limCredEnFreeGetVal);
		
	return send(com);	
    }
	
    //Create Linear Record File
	
    /* Executes the interpreted version of the Create Linear Record File command, 
     * as defined in the Mifare DESFire API. Response only includes the Status Code 
     * returned by the card. @param fid an instance of class <code>FID</code> 
     * representing the file identifier of the new file @param comSet an instance 
     * of class <code>ComSet</code> representing the communication settings to be 
     * set in the new file @param ar an instance of class <code>AccessRights</code> 
     * representing the new access rights to be set in the new file @param recSize 
     * an instance of class <code>Size</code> representing the size of each record 
     * in the file @param maxNumOfRecords an integer representing the maximum number
     * of records that can be created within the file @return an instance of class
     * <code>DFResponse</code> containing the response obtained from the Mifare 
     * DESFire card to the transmitted command */
    public DFResponse createLinearRecordFile(FID fid, ComSet comSet,
            AccessRights ar, Size recSize, int maxNumOfRecords){
	if((fid == null) || (comSet == null) || (ar == null) ||
		(recSize == null))
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] comSetBA = comSet.toBA();
	byte[] arBA = ar.toBA();
	byte[] recSizeBA = recSize.toBA();
	byte[] maxBA = BAUtils.toBA(maxNumOfRecords, 3);
	byte[] res = CreateLinearRecordFile(fidBA, comSetBA, arBA,
		recSizeBA, maxBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	byte[] data = BAUtils.concatenateBAs(fidBA, comSetBA, arBA,
		recSizeBA, maxBA);
	DFCrypto.updateCmacIV(ComCode.CREATE_LINEAR_RECORD_FILE,data, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);	
    }
	
    /* Executes the interpreted version of the Create Linear Record File command, 
     * as defined in the Mifare DESFire EV1 API. Response only includes the Status 
     * Code returned by the card. @param fid an instance of class <code>FID</code> 
     * representing the file identifier of the new file @param isoFid an instance 
     * of class <code>ISOFileID</code> representing the ISO file identifier of the 
     * new file @param comSet an instance of class <code>ComSet</code> representing
     * the communication settings to be set in the new file @param ar an instance 
     * of class <code>AccessRights</code> representing the new access rights to be
     * set in the new file @param recSize an instance of class <code>Size</code> 
     * representing the size of each record in the file @param maxNumOfRecords an 
     * integer representing the maximum number of records that can be created within 
     * the file @return an instance of class <code>DFResponse</code> containing 
     * the response obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse createLinearRecordFile(FID fid, ISOFileID isoFid,
            ComSet comSet, AccessRights ar, Size recSize,
                    int maxNumOfRecords){
	if((fid == null) || (isoFid == null) || (comSet == null) ||
		(ar == null) || (recSize == null))
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] isoFidBA = isoFid.toBA();
	byte[] comSetBA = comSet.toBA();
	byte[] arBA = ar.toBA();
	byte[] recSizeBA = recSize.toBA();
	byte[] maxBA = BAUtils.toBA(maxNumOfRecords, 3);
	byte[] res = CreateLinearRecordFile(fidBA, isoFidBA, comSetBA,
		arBA, recSizeBA, maxBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	byte[] data = BAUtils.concatenateBAs(fidBA, isoFidBA, comSetBA,
		arBA, recSizeBA, maxBA);
	DFCrypto.updateCmacIV(ComCode.CREATE_LINEAR_RECORD_FILE,
		data, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);	
    }	
	
    /* Executes the raw version of the Create Linear Record File command, as defined 
     * in the Mifare DESFire API. @param fid a byte array representing the file 
     * identifier of the new file @param comSet a byte array representing the communication 
     * settings to be set in the new file @param ar a byte array representing
     * the new access rights to be set in the new file @param recSize a byte array 
     * representing the size of each record in the file @param maxNumOfRecords a 
     * byte array representing the maximum number of records that can be created 
     * within the file @return a byte array representing the response obtained
     * from the Mifare DESFire card to the transmitted command */
    public byte[] CreateLinearRecordFile(byte[] fid, byte[] comSet,
            byte[] ar, byte[] recSize, byte[] maxNumOfRecords){		
	if((fid == null)|| (comSet == null) || (ar == null) ||
		(recSize == null) || (maxNumOfRecords == null))
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
		ComCode.CREATE_LINEAR_RECORD_FILE.toBA(),
                        fid, comSet, ar, recSize, maxNumOfRecords);
	return send(com);
    }
	
    /* Executes the raw version of the Create Linear Record File command, as defined 
     * in the Mifare DESFire EV1 API. @param fid a byte array representing the file 
     * identifier of the new file @param isoFid a byte array representing the ISO file
     * identifier of the new file @param comSet an instance of class <code>ComSet</code>
     * representing the communication settings to be set in the new file @param ar an 
     * instance of class <code>AccessRights</code> representing the new access rights 
     * to be set in the new file @param recSize an instance of class <code>Size</code> 
     * representing the size of each record in the file @param maxNumOfRecords an 
     * integer representing the maximum number of records that can be created within
     * the file @return a byte array representing the response obtained from the Mifare
     * DESFire card to the transmitted command */
    public byte[] CreateLinearRecordFile(byte[] fid, byte[] isoFid,
            byte[] comSet, byte[] ar, byte[] recSize,
                    byte[] maxNumOfRecords){		
	if((fid == null)|| (isoFid == null) || (comSet == null) ||
		(ar == null) || (recSize == null) ||
			(maxNumOfRecords == null))
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
		ComCode.CREATE_LINEAR_RECORD_FILE.toBA(),
			fid, isoFid, comSet, ar, recSize,
				maxNumOfRecords);
	return send(com);
    }
	
    //Create Cyclic Record File
	
    /* Executes the interpreted version of the Create Cyclic Record File command, 
     * as defined in the Mifare DESFire API. Response only includes the Status Code 
     * returned by the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the new file @param comSet an instance of class 
     * <code>ComSet</code> representing the communication settings to be set in 
     * the new file @param ar an instance of class <code>AccessRights</code> representing
     * the new access rights to be set in the new file @param recSize an instance
     * of class <code>Size</code> representing the size of each record in the file
     * @param maxNumOfRecords an integer representing the maximum number of records
     * that can be kept within the file at one time @return an instance of class 
     * <code>DFResponse</code> containing the response obtained from the Mifare 
     * DESFire card to the transmitted command */
    public DFResponse createCyclicRecordFile(FID fid, ComSet comSet,
            AccessRights ar, Size recSize, int maxNumOfRecords){
	if((fid == null) || (comSet == null) || (ar == null) ||
		(recSize == null))
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] comSetBA = comSet.toBA();
	byte[] arBA = ar.toBA();
	byte[] recSizeBA = recSize.toBA();
	byte[] maxBA = BAUtils.toBA(maxNumOfRecords, 3);
	byte[] res = CreateCyclicRecordFile(fidBA, comSetBA, arBA,
		recSizeBA, maxBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	byte[] data = BAUtils.concatenateBAs(fidBA, comSetBA, arBA,
		recSizeBA, maxBA);
	DFCrypto.updateCmacIV(
		ComCode.CREATE_CYCLIC_RECORD_FILE,
			data, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);	
    }

    /* Executes the interpreted version of the Create Cyclic Record File command, 
     * as defined in the Mifare DESFire EV1 API. Response only includes the Status 
     * Code returned by the card. @param fid an instance of class <code>FID</code> 
     * representing the file identifier of the new file @param isoFid an instance 
     * of class <code>ISOFileID</code> representing the ISO file identifier of the 
     * new file @param comSet an instance of class <code>ComSet</code> representing
     * the communication settings to be set in the new file @param ar an instance 
     * of class <code>AccessRights</code> representing the new access rights to be 
     * set in the new file @param recSize an instance of class <code>Size</code> 
     * representing the size of each record in the file @param maxNumOfRecords an 
     * integer representing the maximum number of records that can be kept within
     * the file at one time @return an instance of class <code>DFResponse</code> 
     * containing the response obtained from the Mifare DESFire card to the 
     * transmitted command */
    public DFResponse createCyclicRecordFile(
            FID fid, ISOFileID isoFid, 
                    ComSet comSet, AccessRights ar, Size recSize, 
                            int maxNumOfRecords){
	if((fid == null) || (isoFid == null) || 
		(comSet == null) || (ar == null) || 
			(recSize == null))
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] isoFidBA = isoFid.toBA();
	byte[] comSetBA = comSet.toBA();
	byte[] arBA = ar.toBA();
	byte[] recSizeBA = recSize.toBA();
	byte[] maxBA = BAUtils.toBA(maxNumOfRecords, 3);
	byte[] res = CreateCyclicRecordFile(fidBA, isoFidBA, 
		comSetBA, arBA, recSizeBA, maxBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	byte[] data = BAUtils.concatenateBAs(fidBA, isoFidBA, 
		comSetBA, arBA, recSizeBA, maxBA);
	DFCrypto.updateCmacIV(ComCode.CREATE_CYCLIC_RECORD_FILE, 
		data, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);	
    }
	
    /* Executes the raw version of the Create Cyclic Record File command, as defined
     * in the Mifare DESFire API. @param fid a byte array representing the file 
     * identifier of the new file @param comSet a byte array representing the 
     * communication settings to be set in the new file @param ar a byte array 
     * representing the new access rights to be set in the new file @param recSize 
     * a byte array representing the size of each record in the file @param maxNumOfRecords 
     * a byte array representing the maximum number of records that can be kept 
     * within the file at one time @return a byte array representing the response 
     * obtained from the Mifare DESFire card to the transmitted command */
    public byte[] CreateCyclicRecordFile(byte[] fid, byte[] comSet, 
            byte[] ar, byte[] recSize, byte[] maxNumOfRecords){
	if((fid == null)|| (comSet == null) || 
		(ar == null) || (recSize == null) || 
			(maxNumOfRecords == null))
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
		ComCode.CREATE_CYCLIC_RECORD_FILE.toBA(), 
			fid, comSet, ar, recSize, maxNumOfRecords);
	return send(com);
    }
	
    /* Executes the raw version of the Create Cyclic Record File command, as defined 
     * in the Mifare DESFire API. @param fid a byte array representing the file 
     * identifier of the new file @param isoFid a byte array representing the ISO file
     * identifier of the new file @param comSet a byte array representing the communication 
     * settings to be set in the new file @param ar a byte array representing the new 
     * access rights to be set in the new file @param recSize a byte array representing
     * the size of each record in the file @param maxNumOfRecords a byte array 
     * representing the maximum number of records that can be kept within the file 
     * at one time @return a byte array representing the response obtained
     * from the Mifare DESFire card to the transmitted command */
    public byte[] CreateCyclicRecordFile(
            byte[] fid, byte[] isoFid, byte[] comSet, 
                    byte[] ar, byte[] recSize, byte[] maxNumOfRecords){		
	if((fid == null)|| (isoFid == null) || 
		(comSet == null) || (ar == null) || 
			(recSize == null) || (maxNumOfRecords == null))
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
		ComCode.CREATE_CYCLIC_RECORD_FILE.toBA(), 
			fid, isoFid, comSet, ar, recSize, maxNumOfRecords);
	return send(com);
    }
	
    //Delete File
	
    /* Executes the interpreted version of the Delete File command, as defined in 
     * the Mifare DESFire API. Response only includes the Status Code returned by
     * the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the file to be deleted @return an instance of class 
     * <code>DFResponse</code> containing the response obtained from the Mifare 
     * DESFire card to the transmitted command */
    public DFResponse deleteFile(FID fid){
	if(fid == null) throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] res = DeleteFile(fidBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.updateCmacIV(ComCode.DELETE_FILE, fidBA, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);
    }
	
    /* Executes the raw version of the Delete File command, as defined in the Mifare 
     * DESFire API. @param fid a byte array representing the file identifier of the 
     * file to be deleted @return a byte array representing the response obtained
     * from the Mifare DESFire card to the transmitted command */
    public byte[] DeleteFile(byte[] fid){
	if(fid == null) throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(ComCode.DELETE_FILE.toBA(), fid);
	return send(com);
    }

    /* ***
     * Data Manipulation Commands
     * ***/
	
    //Write Data
	
    /* Executes the interpreted version of the Write Data command, as defined in 
     * the Mifare DESFire API. Response only includes the Status Code returned by 
     * the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the file to be written in  @param offset an instance 
     * of class <code>Size</code> representing the initial position where the data
     * should be written within the file @param data an instance of class <code>Data</code> 
     * containing the data bytes to be written @param fileSet an instance of class
     * <code>DataFileSettings</code> representing the current File Settings of the 
     * file to be written in, as obtained by the Get File Settings command
     * @return an instance of class <code>DFResponse</code> containing the response
     * obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse writeData(FID fid, Size offset, Data data, 
            DataFileSettings fileSet){
	if((fid == null) || (offset == null) || 
		(data == null) || (fileSet == null)) 
            throw new NullPointerException();
	return writeData(fid, offset, data, fileSet.getComSet(), 
		fileSet.getAccessRights());
    }
	
    /* Executes the interpreted version of the Write Data command, as defined in 
     * the Mifare DESFire API. Response only includes the Status Code returned by 
     * the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the file to be written in @param offset an instance 
     * of class <code>Size</code> representing the initial position where the data
     * should be written within the file @param data an instance of class <code>Data</code> 
     * containing the data bytes to be written @param comSet an instance of
     * <code>ComSet</code> representing the current Communication Settings of the file
     * @param ar an instance of <code>AccessRights</code> representing the current 
     * Access Rights of the file @return an instance of class <code>DFResponse</code> 
     * containing the response obtained from the Mifare DESFire card to the
     * transmitted command */
    public DFResponse writeData(FID fid, Size offset, Data data, 
            ComSet comSet, AccessRights ar){
	if((fid == null) || (offset == null) || 
		(data == null) || (comSet == null) || 
			(ar == null)) 
            throw new NullPointerException();
	byte[] sendData = DFCrypto.prepareSendData(fid, offset, 
		data, comSet, ar, ComCode.WRITE_DATA, getSession());
	byte[] fidBA = fid.toBA();
	byte[] offsetBA = offset.toBA();
	byte[] lengthBA = data.getLength().toBA();
	byte[] res = WriteData(fidBA, offsetBA, lengthBA, sendData);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.checkCMAC(res, session);
	return new DFResponse(BAUtils.extractSubBA(res, 0, 1));
    }
	
    /* Executes the raw version of the Write Data command, as defined in the Mifare 
     * DESFire API. @param fid a byte array representing the file identifier of the 
     * file to be written in @param offset a byte array representing the initial
     * position where the data should be written within the file @param length a 
     * byte array representing the number of data bytes to be written @param data 
     * a byte array containing the data bytes to be written, transformed for security
     * as required @return a byte array representing the response obtained
     * from the Mifare DESFire card to the transmitted command */
    public byte[] WriteData(byte[] fid, byte[] offset, byte[] length, 
            byte[] data){
	if((fid == null) || (offset == null) || 
		(length == null) || (data == null))
            throw new NullPointerException();
	byte[][] dataFrames = getDataFrames(data);
	byte[] com = BAUtils.concatenateBAs(ComCode.WRITE_DATA.toBA(), 
		fid, offset, length, dataFrames[0]);
	byte[] res = send(com);
	if((!SC.isOk(res))&&(!SC.isAF(res))) 
            return BAUtils.extractSubBA(res, 0, 1);
	int i = 1;
	while((i < dataFrames.length)&&(!SC.isOk(res))){
            com = BAUtils.concatenateBAs(SC.ADDITIONAL_FRAME.toBA(),dataFrames[i]);			
            res = send(com);			
            if((!SC.isOk(res))&&(!SC.isAF(res))) 
		return BAUtils.extractSubBA(res, 0, 1);			
            i++;
	}
	return res;
    }
	
    //Read Data
	
    /* Executes the interpreted version of the Read Data command, as defined in 
     * the Mifare DESFire API. Response includes an object of class <code>DataRes</code>,
     * which can be retrieved with its method <code>getDataRes()</code> @param fid 
     * an instance of class <code>FID</code> representing the file identifier of 
     * the file to be read from @param offset an instance of class <code>Size</code> 
     * representing the initial position where the data should be read from the file
     * @param length an instance of class <code>Size</code> representing the number 
     * of data bytes to be read @param fileSet an instance of class <code>DataFileSettings</code>
     * representing the current File Settings of the file to be read from, as obtained
     * by the Get File Settings command @return an instance of class <code>DFResponse</code> 
     * containing the response obtained from the Mifare DESFire card to the 
     * transmitted command */
    public DFResponse readData(FID fid, Size offset, Size length, 
            DataFileSettings fileSet){
	if((fid == null) || (offset == null) || 
		(length == null) || (fileSet == null)) 
            throw new NullPointerException();
	return readData(fid, offset, length, fileSet.getComSet(), 
		fileSet.getAccessRights());
    }	
		
    /* Executes the interpreted version of the Read Data command, as defined in 
     * the Mifare DESFire API. Response includes an object of class <code>DataRes</code>,
     * which can be retrieved with its method <code>getDataRes()</code>. @param fid
     * an instance of class <code>FID</code> representing the file identifier of 
     * the file to be read from @param offset an instance of class <code>Size</code>
     * representing the initial position where the data should be read from the file
     * @param length an instance of class <code>Size</code> representing the number 
     * of data bytes to be read @param comSet an instance of <code>ComSet</code>
     * representing the current Communication Settings of the file @param ar an
     * instance of <code>AccessRights</code> representing the current Access Rights
     * of the file @return an instance of class <code>DFResponse</code> containing 
     * the response obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse readData(FID fid, Size offset, Size length, 
            ComSet comSet, AccessRights ar){
	if((fid == null) || (offset == null) || 
		(length == null) || (comSet == null) || 
			(ar == null)) 
            throw new NullPointerException();	
	byte[] fidBA = fid.toBA();
	byte[] offsetBA = offset.toBA();
	byte[] lengthBA = length.toBA();
	byte[] res = ReadData(fidBA, offsetBA, lengthBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.updateCmacIV(ComCode.READ_DATA, 
		BAUtils.concatenateBAs(fidBA, offsetBA, lengthBA), 
			getSession());
	DataRes dataRes = DFCrypto.getDataRes(res, length, comSet,
		ar, getSession());
	return new DFResponse(SC.OPERATION_OK, dataRes);
    }	
	
    /* Executes the raw version of the Read Data command, as defined in the Mifare 
     * DESFire API. @param fid a byte array representing the file identifier of 
     * the file to be read from @param offset a byte array representing the initial 
     * position where the data should be read from the file @param length a byte 
     * array representing the number of data bytes to be read @return a byte array
     * representing the response obtained from the Mifare DESFire card to the
     * transmitted command */
    public byte[] ReadData(byte[] fid, byte[] offset, byte[] length){
        if((fid == null) || (offset == null) || (length == null))
            throw new NullPointerException();
	byte[] rres;
	byte[] res = new byte[0];
	byte[] com = BAUtils.concatenateBAs(ComCode.READ_DATA.toBA(), 
		fid, offset, length);
	do{
            rres = send(com);
            if(rres.length > 1)
            res = BAUtils.concatenateBAs(res, 
                    BAUtils.extractSubBA(rres, 1, rres.length-1));
            com = SC.ADDITIONAL_FRAME.toBA();
	}while(SC.isAF(rres));
	byte[] sc = BAUtils.extractSubBA(rres, 0, 1);
	if(SC.isOk(rres)) return BAUtils.concatenateBAs(sc, res);
	else return sc;
    }
	
    //Get Value
	
    /* Executes the interpreted version of the Get Value command, as defined in 
     * the Mifare DESFire API. Response includes an object of class <code>ValueRes</code>,
     * which can be retrieved with its method <code>getValueRes()</code> @param fid 
     * an instance of class <code>FID</code> representing the file identifier of the 
     * file to be read from @param fileSet an instance of class <code>ValueFileSettings</code>
     * representing the current File Settings of the file to be read from, as obtained
     * by the Get File Settings command @return an instance of class <code>DFResponse</code>
     * containing the response obtained from the Mifare DESFire card to the 
     * transmitted command */
    public DFResponse getValue(FID fid, ValueFileSettings fileSet){
	if((fid == null) || (fileSet == null)) 
            throw new NullPointerException();
	return getValue(fid, fileSet.getComSet(), 
		fileSet.getAccessRights(), 
                        fileSet.getFreeValueEnabled());
    }	
		
    /* Executes the interpreted version of the Get Value command, as defined in the 
     * Mifare DESFire EV1 API. Response includes an object of class <code>ValueRes</code>,
     * which can be retrieved with its method <code>getValueRes()</code>
     * @param fid an instance of class <code>FID</code> representing the file identifier
     * of the file to be read from @param comSet an instance of <code>ComSet</code>
     * representing the current Communication Settings of the file @param ar an instance 
     * of <code>AccessRights</code> representing the current Access Rights of the file
     * @param freeGetValue a boolean indicating whether free read access to the
     * current value is permited or not @return an instance of class <code>DFResponse</code> 
     * containing the response obtained from the Mifare DESFire card to the transmitted
     * command */
    public DFResponse getValue(FID fid, ComSet comSet, AccessRights ar, 
            boolean freeGetValue){
	if((fid == null) || (comSet == null) || (ar == null)) 
            throw new NullPointerException();	
	byte[] fidBA = fid.toBA();
	byte[] res = GetValue(fidBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.updateCmacIV(ComCode.GET_VALUE, fidBA, getSession());
	ValueRes valueRes = DFCrypto.getValueRes(res, comSet, ar, 
		freeGetValue, getSession());
	return new DFResponse(SC.OPERATION_OK, valueRes);
    }	
		
    /* Executes the raw version of the Get Value command, as defined in the Mifare
     * DESFire API. @param fid a byte array representing the file identifier of 
     * the file to be read from @return a byte array representing the response obtained
     * from the Mifare DESFire card to the transmitted command */
    public byte[] GetValue(byte[] fid){
	if(fid == null) 
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(ComCode.GET_VALUE.toBA(), fid);
	return send(com);
    }
	
    //Credit
	
    /* Executes the interpreted version of the Credit command, as defined in the 
     * Mifare DESFire API. Response only includes the Status Code returned by the 
     * card. @param fid an instance of class <code>FID</code> representing the file
     * identifier of the file to be edited @param value an instance of class <code>Value</code>
     * representing the amount to increase @param fileSet an instance of class
     * <code>ValueFileSettings</code> representing the current File Settings of 
     * the file, as obtained by the Get File Settings command @return an instance 
     * of class <code>DFResponse</code> containing the response obtained from the 
     * Mifare DESFire card to the transmitted command */
    public DFResponse credit(FID fid, Value value, ValueFileSettings fileSet){
	if((fid == null) || (value == null) ||(fileSet == null)) 
            throw new NullPointerException();
	return credit(fid, value, fileSet.getComSet(),fileSet.getAccessRights());
    }
	
    /* Executes the interpreted version of the Credit command, as defined in the 
     * Mifare DESFire API. Response only includes the Status Code returned by the 
     * card. @param fid an instance of class <code>FID</code> representing the file
     * identifier of the file to be edited @param value an instance of class 
     * <code>Value</code> representing the amount to increase @param comSet an 
     * instance of <code>ComSet</code> representing the current Communication Settings
     * of the file @param ar an instance of <code>AccessRights</code> representing
     * the current Access Rights of the file @return an instance of class 
     * <code>DFResponse</code> containing the response obtained from the Mifare 
     * DESFire card to the transmitted command */
    public DFResponse credit(FID fid, Value value, ComSet comSet, AccessRights ar){
	if((fid == null) || (value == null) || (comSet == null) || (ar == null)) 
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] valueData = DFCrypto.prepareSendValueData(fid, value, 
		comSet, ar, ComCode.CREDIT, getSession());
	byte[] res = Credit(fidBA, valueData);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.checkCMAC(res, session);
	return new DFResponse(BAUtils.extractSubBA(res, 0, 1));
    }
	
    /* Executes the raw version of the Credit command, as defined in the Mifare 
     * DESFire API. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the file to be edited @param data a byte array 
     * representing the amount to increase, transformed for security as required
     * @return a byte array representing the response obtained from the Mifare 
     * DESFire card to the transmitted command  */
    public byte[] Credit(byte[] fid, byte[] data){
	if((fid == null) || (data == null)) 
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(ComCode.CREDIT.toBA(), fid, data);
	return send(com);
    }
	
    //Debit
	
    /* Executes the interpreted version of the Debit command, as defined in the 
     * Mifare DESFire API. Response only includes the Status Code returned by the 
     * card. @param fid an instance of class <code>FID</code> representing the file
     * identifier of the file to be edited @param value an instance of class
     * <code>Value</code> representing the amount to decrease @param fileSet an 
     * instance of class <code>ValueFileSettings</code> representing the current 
     * File Settings of the file, as obtained by the Get File Settings command
     * @return an instance of class <code>DFResponse</code> containing the response
     * obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse debit(FID fid, Value value, ValueFileSettings fileSet){
	if((fid == null) || (value == null) || (fileSet == null)) 
            throw new NullPointerException();
	return debit(fid, value, fileSet.getComSet(), fileSet.getAccessRights());
    }
	
    /* Executes the interpreted version of the Debit command, as defined in the 
     * Mifare DESFire API. Response only includes the Status Code returned by the 
     * card. @param fid an instance of class <code>FID</code> representing the file 
     * identifier of the file to be edited @param value an instance of class 
     * <code>Value</code> representing the amount to decrease @param comSet an 
     * instance of <code>ComSet</code> representing the current Communication 
     * Settings of the file @param ar an instance of <code>AccessRights</code>
     * representing the current Access Rights of the file @return an instance of 
     * class <code>DFResponse</code> containing the response obtained from the 
     * Mifare DESFire card to the transmitted command */
    public DFResponse debit(FID fid, Value value, ComSet comSet, AccessRights ar){
	if((fid == null) || (value == null) || (comSet == null) || (ar == null)) 
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] valueData = DFCrypto.prepareSendValueData(fid, value, 
		comSet, ar, ComCode.DEBIT, getSession());
	byte[] res = Debit(fidBA, valueData);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.checkCMAC(res, session);
	return new DFResponse(BAUtils.extractSubBA(res, 0, 1));
    }
	
    /* Executes the raw version of the Debit command, as defined in the Mifare DESFire 
     * API. @param fid an instance of class <code>FID</code> representing the file
     * identifier of the file to be edited @param data a byte array representing the
     * amount to decrease, transformed for security as required @return a byte array 
     * representing the response obtained from the Mifare DESFire card to the
     * transmitted command */
    public byte[] Debit(byte[] fid, byte[] data){
	if((fid == null) || (data == null)) 
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(ComCode.DEBIT.toBA(), fid, data);
	return send(com);
    }
	
    //Limited Credit
	
    /* Executes the interpreted version of the Limited Credit command, as defined 
     * in the Mifare DESFire API. Response only includes the Status Code returned 
     * by the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the file to be edited @param value an instance of
     * class <code>Value</code> representing the amount to increase @param fileSet 
     * an instance of class <code>ValueFileSettings</code> representing the current
     * File Settings of the file, as obtained by the Get File Settings command
     * @return an instance of class <code>DFResponse</code> containing the response 
     * obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse limitedCredit(FID fid, Value value, ValueFileSettings fileSet){
	if((fid == null) || (value == null) || (fileSet == null)) 
            throw new NullPointerException();
	return debit(fid, value, fileSet.getComSet(), fileSet.getAccessRights());
    }
	
    /* Executes the interpreted version of the Limited Credit command, as defined 
     * in the Mifare DESFire API. Response only includes the Status Code returned 
     * by the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the file to be edited @param value an instance of 
     * class <code>Value</code> representing the amount to increase @param comSet
     * an instance of <code>ComSet</code> representing the current Communication
     * Settings of the file @param ar an instance of <code>AccessRights</code>
     * representing the current Access Rights of the file @return an instance of 
     * class <code>DFResponse</code> containing the response obtained from the 
     * Mifare DESFire card to the transmitted command */
    public DFResponse limitedCredit(FID fid, Value value,ComSet comSet, AccessRights ar){
	if((fid == null) || (value == null) || 	(comSet == null) || (ar == null)) 
            throw new NullPointerException();
	byte[] fidBA = fid.toBA();
	byte[] valueData = DFCrypto.prepareSendValueData(fid, 
		value, comSet, ar, ComCode.LIMITED_CREDIT, getSession());
	byte[] res = LimitedCredit(fidBA, valueData);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.checkCMAC(res, session);
	return new DFResponse(BAUtils.extractSubBA(res, 0, 1));
    }
	
    /* Executes the raw version of the Limited Credit command, as defined in the 
     * Mifare DESFire API. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the file to be edited @param data a byte array representing
     * the amount to increase, transformed for security as required @return a byte 
     * array representing the response obtained from the Mifare DESFire card to
     * the transmitted command */
    public byte[] LimitedCredit(byte[] fid, byte[] data){
	if((fid == null) || (data == null))
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(ComCode.LIMITED_CREDIT.toBA(),fid, data);
	return send(com);
    }
	
    //Write Record

    /* Executes the interpreted version of the Write Record command, as defined 
     * in the Mifare DESFire API. Response only includes the Status Code returned
     * by the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the file to be written in @param offset an instance 
     * of class <code>Size</code> representing the initial position where the data
     * should be written within the new record @param data an instance of class 
     * <code>Data</code> containing the data bytes to be written @param fileSet an
     * instance of class <code>RecordFileSettings</code> representing the current 
     * File Settings of the file to be written in, as obtained by the Get File 
     * Settings command @return an instance of class <code>DFResponse</code> containing 
     * the response obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse writeRecord(FID fid, Size offset,Data data, RecordFileSettings fileSet){
	if((fid == null) || (offset == null) || (data == null) || (fileSet == null)) 
            throw new NullPointerException();
	return writeRecord(fid, offset, data,fileSet.getComSet(), fileSet.getAccessRights());
    }
	
    /* Executes the interpreted version of the Write Record command, as defined in 
     * the Mifare DESFire API. Response only includes the Status Code returned by 
     * the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the file to be written in @param offset an instance
     * of class <code>Size</code> representing the initial position where the data 
     * should be written within the new record @param data an instance of class
     * <code>Data</code> containing the data bytes to be written @param comSet an 
     * instance of <code>ComSet</code> representing the current Communication Settings 
     * of the file @param ar an instance of <code>AccessRights</code> representing 
     * the current Access Rights of the file @return an instance of class 
     * <code>DFResponse</code> containing the response obtained from the Mifare
     * DESFire card to the transmitted command */
    public DFResponse writeRecord(FID fid, Size offset,Data data, ComSet comSet, AccessRights ar){
	if((fid == null) || (offset == null) || (data == null) || (comSet == null) || (ar == null)) 
            throw new NullPointerException();
	byte[] sendData = DFCrypto.prepareSendData(fid, offset, 
		data, comSet, ar, ComCode.WRITE_RECORD, getSession());
	byte[] fidBA = fid.toBA();
	byte[] offsetBA = offset.toBA();
	byte[] lengthBA = data.getLength().toBA();
	byte[] res = WriteRecord(fidBA, offsetBA, lengthBA, sendData);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.checkCMAC(res, session);
	return new DFResponse(BAUtils.extractSubBA(res, 0, 1));
    }
	
    /* Executes the raw version of the Write Record command, as defined in the 
     * Mifare DESFire API. @param fid a byte array representing the file identifier 
     * of the file to be written in @param offset a byte array representing the 
     * initial position where the data should be written within the new record
     * @param length a byte array representing the number of data bytes to be written 
     * @param data a byte array containing the data bytes to be written, transformed 
     * for security as required @return a byte array representing the response obtained
     * from the Mifare DESFire card to the transmitted command */
    public byte[] WriteRecord(byte[] fid, byte[] offset,byte[] length, byte[] data){
	if((fid == null) || (offset == null) || (length == null) || (data == null))
            throw new NullPointerException();
	byte[][] dataFrames = getDataFrames(data);
	byte[] com = BAUtils.concatenateBAs(ComCode.WRITE_RECORD.toBA(), 
		fid, offset, length, dataFrames[0]);
	byte[] res = send(com);
	if((!SC.isOk(res))&&(!SC.isAF(res))) 
            return BAUtils.extractSubBA(res, 0, 1);
	int i = 1;
	while((i < dataFrames.length)&&(!SC.isOk(res))){
            com = BAUtils.concatenateBAs(SC.ADDITIONAL_FRAME.toBA(),dataFrames[i]);			
            res = send(com);			
            if((!SC.isOk(res))&&(!SC.isAF(res))) 
            	return BAUtils.extractSubBA(res, 0, 1);			
            i++;
	}
	return res;
    }
	
    //Read Records
	
    /* Executes the interpreted version of the Read Records command, as defined in 
     * the Mifare DESFire API. Response only includes the Status Code returned by 
     * the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the file to be read from @param offset an instance 
     * of class <code>Size</code> representing the initial record where the data 
     * should be read @param length an instance of class <code>Data</code> containing 
     * the number of records to be read @param fileSet an instance of class 
     * <code>RecordFileSettings</code> representing the current File Settings of 
     * the file to be read from, as obtained by the Get File Settings command
     * @return an instance of class <code>DFResponse</code> containing the response
     * obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse readRecords(FID fid, Size offset, Size length, 
            RecordFileSettings fileSet){
	if((fid == null) || (offset == null) || (length == null) || (fileSet == null)) 
            throw new NullPointerException();
	return readRecords(fid, offset, length, fileSet.getRecordSize(), 
		fileSet.getCurrentNumberOfRecords(), fileSet.getComSet(), 
			fileSet.getAccessRights());
    }	
		
    /* Executes the interpreted version of the Read Records command, as defined 
     * in the Mifare DESFire API. Response only includes the Status Code returned 
     * by the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the file to be read from @param offset an instance 
     * of class <code>Size</code> representing the initial record where the data
     * should be read @param length an instance of class <code>Data</code> containing 
     * the number of records to be read @param recSize an instance of class
     * <code>Size</code> representing the size of the records stored in the file
     * @param currNumOfRecords an integer indicating the current number of records
     * stored in the file @param comSet an instance of <code>ComSet</code>
     * representing the current Communication Settings of the file @param ar an 
     * instance of <code>AccessRights</code> representing the current Access Rights
     * of the file @return an instance of class <code>DFResponse</code> containing 
     * the response obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse readRecords(FID fid, Size offset, Size length, 
            Size recSize, int currNumOfRecords, ComSet comSet, AccessRights ar){
	if((fid == null) || (offset == null) || 
		(length == null) || (recSize == null) || 
			(comSet == null) || (ar == null)) 
            throw new NullPointerException();	
	byte[] fidBA = fid.toBA();
	byte[] offsetBA = offset.toBA();
	byte[] lengthBA = length.toBA();
	byte[] res = ReadRecords(fidBA, offsetBA, lengthBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.updateCmacIV(ComCode.READ_RECORDS, 
		BAUtils.concatenateBAs(fidBA, offsetBA, lengthBA), 
			getSession());
	RecordsRes recordsRes = DFCrypto.getRecordsRes(
		res, length, recSize, comSet, ar, getSession());
	return new DFResponse(SC.OPERATION_OK, recordsRes);
    }	
	
    /* Executes the raw version of the Read Records command, as defined in the Mifare 
     * DESFire API. @param fid a byte array representing the file identifier of the 
     * file to be read from @param offset a byte array representing the initial 
     * record where the data should be read @param length a byte array containing 
     * the number of records to be read @return a byte array representing the response
     * obtained from the Mifare DESFire card to the transmitted command */
    public byte[] ReadRecords(byte[] fid, byte[] offset, byte[] length){
	if((fid == null) || (offset == null) || (length == null))
            throw new NullPointerException();
	byte[] rres;
	byte[] res = new byte[0];
	byte[] com = BAUtils.concatenateBAs(ComCode.READ_RECORDS.toBA(), 
		fid, offset, length);
	do{
            rres = send(com);
            if(rres.length > 1)
            res = BAUtils.concatenateBAs(res,BAUtils.extractSubBA(rres, 1, rres.length-1));
            com = SC.ADDITIONAL_FRAME.toBA();
	}while(SC.isAF(rres));
	byte[] sc = BAUtils.extractSubBA(rres, 0, 1);
	if(SC.isOk(rres)) return BAUtils.concatenateBAs(sc, res);
	else return sc;
    }
	
    //Clear Record File
	
    /* Executes the interpreted version of the Clear Record File command, as defined 
     * in the Mifare DESFire API. Response only includes the Status Code returned by 
     * the card. @param fid an instance of class <code>FID</code> representing
     * the file identifier of the file to be cleared @return an instance of class 
     * <code>DFResponse</code> containing the response obtained from the Mifare
     * DESFire card to the transmitted command */
    public DFResponse clearRecordFile(FID fid){
	if(fid == null) throw new NullPointerException();
    	byte[] fidBA = fid.toBA();
	byte[] res = ClearRecordFile(fidBA);
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.updateCmacIV(ComCode.CLEAR_RECORD_FILE, fidBA, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);
    }
	
    /* Executes the raw version of the Clear Record File command, as defined in 
     * the Mifare DESFire API. @param fid a byte array representing the file identifier
     * of the file to be written in @return a byte array representing the response
     * obtained from the Mifare DESFire card to the transmitted command */
    public byte[] ClearRecordFile(byte[] fid){
	if(fid == null) throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(
		ComCode.CLEAR_RECORD_FILE.toBA(), fid);
	return send(com);
    }
	
    //Commit Transaction
	
    /* Executes the interpreted version of the Commit Transaction command, as defined 
     * in the Mifare DESFire API. Response only includes the Status Code returned by
     * the card. @return an instance of class <code>DFResponse</code> containing 
     * the response obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse commitTransaction(){
	byte[] res = CommitTransaction();
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.updateCmacIV(ComCode.COMMIT_TRANSACTION, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);	
    }
	
    /* Executes the raw version of the Commit Transaction command, as defined in 
     * the Mifare DESFire API. @return a byte array representing the response obtained
     * from the Mifare DESFire card to the transmitted command */
    public byte[] CommitTransaction(){
	byte[] com = ComCode.COMMIT_TRANSACTION.toBA();
	return send(com);
    }
	
    //Abort Transaction
	
    /* Executes the interpreted version of the Abort Transaction command, as defined 
     * in the Mifare DESFire API. Response only includes the Status Code returned by
     * the card. @return an instance of class <code>DFResponse</code> containing 
     * the response obtained from the Mifare DESFire card to the transmitted command */
    public DFResponse abortTransaction(){
	byte[] res = AbortTransaction();
	if(!SC.isOk(res)){
            session.resetAuth();
            return new DFResponse(res);
	}
	DFCrypto.updateCmacIV(ComCode.ABORT_TRANSACTION, getSession());
	DFCrypto.checkCMAC(res, getSession());
	return new DFResponse(SC.OPERATION_OK);
    }
	
    /* Executes the raw version of the Abort Transaction command, as defined in
     * the Mifare DESFire API. @return a byte array representing the response obtained
     * from the Mifare DESFire card to the transmitted command */
    public byte[] AbortTransaction(){
	byte[] com = ComCode.ABORT_TRANSACTION.toBA();
	return send(com);
    }
	
    /* Performs a ISO Select command, needed for determining if Mifare DESFire API 
     * commands should be sent in wrapped or native format @return an instance of
     * class <code>DFResponse</code> containing the response obtained from the 
     * Mifare DESFire card to the transmitted command */
    public DFResponse isoSelect(){
	byte[] res = ISOSelect();
	if(BAUtils.compareBAs(BAUtils.extractSubBA(res, 0, 1), BAUtils.toBA("90"))) 
            wrap = true;
	return new DFResponse(SC.OPERATION_OK);
    }
	
    /* Performs a ISO Select command, needed for determining if Mifare DESFire API
     * commands should be sent in wrapped or native format @return a byte array
     * representing the response obtained from the Mifare DESFire card to the 
     * transmitted command */
    public byte[] ISOSelect(){
	byte[] com = BAUtils.toBA("00A40000");
	return send(com);
    }
	
    /* ***
     * Auxiliary Methods
     * ***/
    private byte[][] getDataFrames(byte[] data){
	if(data == null) throw new NullPointerException();
	int numOfFrames = getNumOfFrames(data);
	int maxFrameSize, frameSize;
	int pos = 0;
	int first = (wrap)? 42 : 52;
	int others = (wrap)? 49 : 59;
	byte[][] dataFrames = new byte[numOfFrames][];
	for(int i = 0; i < numOfFrames; i++){
            if(i == 0) maxFrameSize = first;
            else maxFrameSize = others;
            frameSize = Math.min(data.length - pos, maxFrameSize);
            dataFrames[i] = BAUtils.extractSubBA(data, pos, frameSize);
            pos = pos + frameSize;
	}		
	return dataFrames;
    }
	
    private int getNumOfFrames(byte[] data){
	if(data == null) throw new NullPointerException();
	int first = (wrap)? 42 : 52;
	int others = (wrap)? 49 : 59;
	int num = 0;
	int len = data.length;
	if(len > 0){
            num++;
            len -= first;
            while(len > 0){
		num++;
		len -= others;
            }
	}
	return num;
    }
	
    private byte[] send(byte[] command){
	if(command == null) 
            throw new NullPointerException();
	if(wrap) return sendWrap(command);
	return this.cm.send(command);
    }
	
    private byte[] send(byte[]...bas){
	if(bas == null) 
            throw new NullPointerException();
	byte[] com = BAUtils.concatenateBAs(bas);
	return send(com);
    }
	
    private byte[] sendWrap(byte[] command){
	if(command == null) throw new NullPointerException();
	if(command.length < 1) throw new IllegalArgumentException();
	byte[] wrappedCom = wrapCom(command);
	byte[] wrappedRes = this.cm.send(wrappedCom);
	return unwrapRes(wrappedRes);
    }
	
    private byte[] wrapCom(byte[] command){
	byte[] comCode = BAUtils.extractSubBA(command, 0, 1);
	byte[] CLA = BAUtils.toBA("90");
	byte[] zero = new byte[1];
	byte[] com = BAUtils.concatenateBAs(CLA, comCode, zero, zero);
	int dataLen = command.length - 1;
	byte[] len = BAUtils.toBA(dataLen, 1);
	com = BAUtils.concatenateBAs(com, len);
	if(dataLen > 0){
            byte[] data = BAUtils.extractSubBA(command, 1, dataLen);
            com = BAUtils.concatenateBAs(com, data);
	}
	else return com;
	com = BAUtils.concatenateBAs(com, zero);
	return com;	
    }

    private byte[] unwrapRes(byte[] res){
	byte[] sc = BAUtils.extractSubBA(res, res.length - 1, 1);
	if(res.length > 2){
            byte[] data = BAUtils.extractSubBA(res, 0, res.length - 2);
            return BAUtils.concatenateBAs(sc, data);
	}
	return sc;
    }
	
    // Re-starts the current communication session
    public void resetSession(){
	this.session.resetAuth();
    }
	
    /* Configures the current communication session @param auth an instance of 
     * <code>AuthType</code> indicating the current type of authentication
     * @param authKeyNum an integer indicating the number of the key currently 
     * authenticated @param sessionKey a byte array containing the current session
     * key @param PICCAuth a boolen indicating whether the card is currently 
     * successfully authenticated or not */
    public void setSession(AuthType auth, int authKeyNum, 
            byte[] sessionKey, boolean PICCAuth){
	if((auth == null) || (sessionKey == null))
            throw new NullPointerException();
	this.session.setAuth(auth, authKeyNum, sessionKey, PICCAuth);
    }
	
    // @return the current session
    public DFSession getSession(){ return this.session; }
	
    // @param ct the current card type
    public void setCardType(CardType ct){
	if(ct == null) throw new NullPointerException();
	this.ct = ct;
    }
	
    // @param version the version of the card
    public void setCardType(PICCVersion version){
	int major = version.getHardwareInfo().getMajorVersionNumber();
	if(major == 0) setCardType(CardType.MIFARE_DESFIRE);
	else setCardType(CardType.MIFARE_DESFIRE_EV1);
    }
	
    // @return the current card type
    public CardType getCardType(){
	return this.ct;
    }

    private boolean wrap;	
    private DFSession session;
    private CardType ct;
    private ComManager cm;
	
}
