# DFKey
Provides an encapsulation for keys to be used with Mifare DESFire cards

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public DFKey(byte[] keyData, CipAlg alg)|Creates an instance of class <code>DFKey</code> @param keyData the data bytes that form the key @param alg an instance of class <code>CipAlg</code> representing the current cryptographic algorithm to use|
|public DFKey(byte[] keyData, CipAlg alg, int keyVersion)|Creates an instance of class <code>DFKey</code> @param keyData the data bytes that form the key @param alg an instance of class <code>CipAlg</code> representing the current cryptographic algorithm to use @param keyVersion an int representing the current key version|
|private void setKeyVersion(byte[] keyData, int keyVersion)|Edits the bytes of a key to introduce its version @param keyData @param keyVersion|
|public byte[] getKeyData()|@return a byte array containing the current key data|
|public int getKeyVersion()|@return an int corresponding to the current version of the key|
|public CipAlg getAlg()|@return an instance of class <code>CipAlg</code> representing the current criptographic algorithm used in the key
