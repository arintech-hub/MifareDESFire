# RecordFileSettings
Provides an encapsulation for the file settings of record files.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public RecordFileSettings()|Creates a default instance of class <code>RecordFileSettings</code>|
|public RecordFileSettings(FileType fileType)|Creates an instance of class <code>RecordFileSettings</code> @param fileType an instance of class <code>FileType</code> representing the type of the file|
|public RecordFileSettings(Size size, int max, int current)|Creates an instance of class <code>RecordFileSettings</code> @param size an instance of class <code>Size</code> representing the size of the file @param max an int representing the maximum number of records @param current an int representing the current number of records|
|public RecordFileSettings(FileType fileType, ComSet comSet, AccessRights accessRights, Size size, int max, int current)|Creates an instance of class <code>RecordFileSettings</code> @param fileType an instance of class <code>FileType</code> representing the type of the file @param comSet an instance of class <code>ComSet</code> representing the file's communication settings @param accessRights an instance of class <code>AccessRights</code> representing the file's access rights @param size fileSize an instance of class <code>Size</code> representing the size of the file @param max an int representing the maximum number of records @param current an int representing the current number of records|
|public RecordFileSettings(byte[] fileSet)|Creates an instance of class <code>RecordFileSettings</code> @param fileSet a byte array containing the file settings|
|public Size getRecordSize()|@return an instance of class <code>Size</code> representing the size of the records|
|public int getMaxNumberOfRecords()|@return an int representing the maximum number of records|
|public int getCurrentNumberOfRecords()|@return an int representing the current number of records|
|public void setRecordSize(byte[] size)|@param size a byte array representing the new size of the records|
|public void setRecordSize(Size size)|@param size an instance of class <code>Size</code> representing the new size of the records|
|public void setMaxNumberOfRecords(byte[] max)|@param max a byte array representing the maximum number of records|
|public void setMaxNumberOfRecords(int max)|@param max an int representing the maximum number of records|
|public void setCurrentNumberOfRecords(byte[] current)|@param current an byte array representing the current number of records|
|public void setCurrentNumberOfRecords(int current)|@param current an int representing the current number of records|
