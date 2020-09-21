# ComSet
Provides singleton objects representing the different communication settings available in Mifare DESFire cards.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public enum ComSet()|Enumerates the objects representing the different communication settings available in Mifare DESFire cards|
|public byte[] toBA()|@return the byte array representation of the current communication setting|
|public int toInt()|@return the int representation of the current communication setting|
|public static ComSet toComSet(byte[] comSet)|Obtains the <code>ComSet</code> object corresponding to a given byte array representation @param comSet a byte array representing a communication setting @return the <code>ComSet</code> object corresponding to <code>comSet</code>|
|public static ComSet toComSet(int comSet)|Obtains the <code>ComSet</code> object corresponding to a given integer representation @param comSet an int representing a communication setting @return the <code>ComSet</code> object corresponding to <code>comSet</code>|
