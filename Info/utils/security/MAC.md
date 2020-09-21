# MAC
Provides methods to compute and manage Message Authentication Codes.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public static byte[] cmac(byte[] M, byte[] keyData, byte[] iv, CipAlg  alg)|Computes the CMAC of the message <code>M</code> @param M a byte array @param keyData a byte array containing the data of the key  @param iv a byte array representing the CMAC initial vector @param alg an instance of class <code>CipAlg</code> representing the cryptographic algorithm to use @return a byte array representing the CMAC of the message <code>M</code>|
|public static byte[] cmac(byte[] M, byte[] keyData, byte[] iv, CipAlg  alg, int padLength) & private static byte[] getSubK(byte[] L) & private static byte[] lShift(byte[] ba)|Computes the CMAC of the message <code>M</code> @param M a byte array @param keyData a byte array containing the data of the key @param iv a byte array representing the CMAC initial vector @param alg an instance of class <code>CipAlg</code> representing the cryptographic algorithm to use @param padLength the length of the padding needed @return a byte array representing the CMAC of the message <code>M</code>|
|public static byte[] mac(byte[] data, byte[] keyData, CipAlg alg)|Computes the MAC of the byte array <code>data</code> @param data a byte array @param keyData a byte array containing the data of the key @param alg an instance of class <code>CipAlg</code> representing the cryptographic algorithm to use @return a byte array representing the MAC of <code>data</code>|
