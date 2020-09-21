# CRC
A collection of methods designed for for the computation of CRCs.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public static byte[] CRC32(byte[] data)|Computes the 32-bit CRC of <code>data</code> @param data a byte array @return the 32-bit CRC of <code>data</code>|
|public static byte[] CRC16(byte[] data) & private static byte[] updateCRC16(byte data, byte[] crc)|Computes the 16-bit CRC of <code>data</code> @param data a byte array @return the 16-bit array of <code>data</code>|
