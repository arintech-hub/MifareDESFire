# KeyVersion
Provides an encapsulation for the key version number retrieved from the card via an execution of the <code>getKeyVersion</code> command.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public KeyVersion(int keyVersion|Creates an instance of class <code>KeyVersion</code> @param keyVersion an int indicating the current key version number|
|public KeyVersion(byte[] keyVersion)|Creates an instance of class <code>KeyVersion</code> @param keyVersion a byte array representing the current key version number|
|public void setKV(int keyVersion)|@param keyVersion an int indicating the new key version number|
|public int toInt()|@return the int representation of the current key version|
|public byte[] toBA()|@return the byte array representation of the current key version|
    
