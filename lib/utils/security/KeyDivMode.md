# KeyDivMode
Provides methods for the computation of cryptographic operations.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public static byte[] encode(byte[] data, byte[] keyData, ChainMode chain, CipAlg alg)|Encodes <code>data</code> @param data a byte array @param keyData a byte array containing the value of the key to use for encoding @param chain an instance of class <code>ChainMode</code> indicating how the differenc cryptographic blocks should be chained @param alg an instance of class <code>CipAlg</code> indicating the cryptographic algorithm to use in the encoding @return the encoded version of <code>data</code>|
