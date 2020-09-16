# FileType
Provides singleton objects representing the different file types available in Mifare DESFire cards.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public enum FileType()|Enumerates the different types of files of a Mifare DESFire card|
|public byte[] toBA()|@return the byte array representation of the current file type|
|public int toInt()|@return the int representation of the current file type|
|public static FileType toFileType(byte[] fileType)|Obtains the <code>FileType</code> object corresponding to the given byte array representation of a file type @param fileType a byte array representing a file type @return the <code>FileType</code> object corresponding to <code>fileType</code>|
|public static FileType toFileType(int fileType)|Obtains the <code>FileType</code> object corresponding to the given integer representation of a file type @param fileType an int representing a file type @return the <code>FileType</code> object corresponding to <code>fileType</code>|
