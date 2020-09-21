# FileSettings
Provides an encapsulation for the generic file settings.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public FileSettings()|Creates a default instance of class <code>FileSettings</code>|
|public FileSettings(FileType fileType, ComSet comSet, AccessRights accessRights)|Creates an instance of class <code>FileSettings</code> @param fileType an instance of class <code>FileType</code> representing the type of the current file @param comSet an instance of class <code>ComSet</code> representing the file's communication settings @param accessRights an instance of class <code>AccessRights</code> representing the file's access rights|
|public FileSettings(byte[] fileSet)|Creates an instance of class <code>FileSettings</code> @param fileSet a byte array containing the file settings|
|public FileSettings(byte[] fileType, byte[] comSet, byte[] accessRights)|Creates an instance of class <code>FileSettings</code> @param fileType a byte array representing the type of the current file @param comSet a byte array representing the file's communication settings @param accessRights a byte array representing the file's access rights|
|public FileType getFileType()|@return an instance of class <code>FileType</code> representing the type of the current file|
|public ComSet getComSet()|@return an instance of class <code>ComSet</code> representing the file's communication settings|
|public AccessRights getAccessRights()|@return an instance of class <code>AccessRights</code> representing the file's access rights|
|public void setFileType(FileType fileType)|@param fileType an instance of class <code>FileType</code> representing the new type of the current file|
|public void setFileType(int fileType)|@param fileType a int representing the new type of the current file|
|public void setFileType(byte[] fileType)|@param fileType a byte array representing the new type of the current file|
|public void setComSet(ComSet comSet)|@param comSet an instance of class <code>ComSet</code> representing the file's new communication settings|
|public void setComSet(int comSet)|@param comSet an int representing the file's new communication settings|
|public void setComSet(byte[] comSet)|@param comSet a byte array representing the file's new communication settings|
|public void setAccessRights(AccessRights accessRights)|@param accessRights an instance of class <code>AccessRights</code> representing the file's new access rights|
|public void setAccessRights(byte[] accessRights)|@param accessRights a byte array representing the file's new access rights|
|public byte[] toBA()|@return the byte array representation of the current file settings|
