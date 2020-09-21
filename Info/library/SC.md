# SC
Encapsulates the different Status Codes that can be returned by a Mifare DESFire card.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public enum SC()|Enumerates the different Status Codes that can be returned by a Mifare DESFire card|
|public abstract byte[] toBA()|@return the byte array representation of the Status Code|
|public boolean isOk()|Indicates whether the Status Code corresponds to an <code>OPERATION_OK</code> @return <code>true</code> if the Status Code is <code>OPERATION_OK</code>; <code>false</code>otherwise|
|public static boolean isOk(byte[] res)|Indicates whether the Status Code of the received response corresponds to an <code>OPERATION_OK</code> @param res a byte array containing the response obtained from the card @return <code>true</code> if the Status Code is <code>OPERATION_OK</code>; <code>false</code>otherwise|
|public static boolean isAF(byte[] res)|Indicates whether the Status Code of the received response corresponds to an <code>ADDITIONAL_FRAME</code> @param res a byte array containing the response obtained from the card @return <code>true</code> if the Status Code is <code>ADDITIONAL_FRAME</code>; <code>false</code>otherwise|
|public static boolean isISO(byte[] res)|Indicates whether the Status Code of the received response corresponds to successful ISO select operation @param res a byte array containing the response obtained from the card @return <code>true</code> if the operation has been successful; <code>false</code>otherwise|
|public static SC toSC(byte[] sc)|Obtains the singleton object corresponding to the given Status Code @param sc a byte array containing the obtained Status Code from the card @return an instance of class <code>SC</code> representing the Status Code|
|private static SC toSC(int sc)|Obtains the singleton object corresponding to the given Status Code @param sc an int representing the obtained Status Code from the card @return an instance of class <code>SC</code> representing the Status Code|
