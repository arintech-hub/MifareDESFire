# PaddingMode
Provides methods to compute and manage Message Authentication Codes.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public static byte[] cmac(byte[] M, byte[] keyData, byte[] iv, CipAlg  alg)|Computes the CMAC of the message <code>M</code> @param M a byte array @param keyData a byte array containing the data of the key  @param iv a byte array representing the CMAC initial vector @param alg an instance of class <code>CipAlg</code> representing the cryptographic algorithm to use @return a byte array representing the CMAC of the message <code>M</code>|
