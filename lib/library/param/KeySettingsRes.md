# KeySettingsRes
Provides an encapsulation of the structure retrieved from the execution of the <code>getKeySettings</code> command.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public KeySettingsRes(KeySettings keySettings, CipAlg alg, int maxNumOfKeys)|Creates an instance of class <code>KeySettingsRes</code> @param keySettings an instance of class <code>KeySettings</code> representing the current key settings @param maxNumOfKeys an int indicating the maximum number of keys allowed in the application|
|public KeySettingsRes(byte[] field)|Creates an instance of class <code>KeySettingsRes</code> @param field a byte array containing the card response to a <code>GetKeySettings</code> command|
|public KeySettings getKeySettings()|@return an instance of class <code>KeySettings</code> representing the current key settings|
|public int getMaxNumOfKeys()|@return an int indicating the maximum number of keys allowed in the application|
|public CipAlg getAlg()|@return an instance of class <code>CipAlg</code> representing the currently set criptographic algorithm for the application|
|public void setKeySettings(byte[] ks)|@param ks a byte array representing the new key settings|
|public void setKeySettings(KeySettings ks)|@param ks an instance of class <code>KeySettings</code> representing the new key settings|
|public void setMaxNumOfKeysAlg(byte[] maxNumOfKeysAlg)|@param maxNumOfKeysAlg an byte array containing the maximum number of keys allowed in the application|
|public void setMaxNumOfKeys(int maxNumOfKeys)|@param maxNumOfKeys an int indicating the maximum number of keys allowed in the application|
   
