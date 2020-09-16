# DataFileSettings
Provides an encapsulation for the file settings of data files.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public DataFileSettings()|Creates a default instance of class <code>DataFileSettings</code>|
|public DataFileSettings(FileType fileType)|Creates an instance of class <code>DataFileSettings</code> @param fileType an instance of class <code>FileType</code> representing the type of the file|
|public DataFileSettings(Size size)|Creates an instance of class <code>DataFileSettings</code> @param size an instance of class <code>Size</code> representing the size of the file|
|public DataFileSettings(FileType fileType, ComSet comSet, AccessRights accessRights, Size size)|Creates an instance of class <code>DataFileSettings</code> @param fileType an instance of class <code>FileType</code> representing the type of the file @param comSet an instance of class <code>ComSet</code> representing the file's communication settings @param accessRights an instance of class <code>AccessRights</code> representing the file's access rights @param size fileSize an instance of class <code>Size</code> representing the size of the file|
|public DataFileSettings(byte[] fileSet)|Creates an instance of class <code>DataFileSettings</code> @param fileSet a byte array containing the file settings|
|public Size getFileSize()|@return an instance of class <code>Size</code> representing the current size of the file|
|public void setFileSize(byte[] size)|@param size a byte array representing the current size of the file|
|public void setFileSize(Size size)|@param size an instance of class <code>Size</code> representing the new size of the file|
