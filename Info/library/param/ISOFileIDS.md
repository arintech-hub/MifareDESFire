# ISOFileIDS
Provides an encapsulation of the structure retrieved from an execution of the <code>getFileIDs</code> command.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public ISOFileIDS(byte[] fids)|Creates an instance of class <code>ISOFileIDS</code> @param fids a byte array containing the list of file identifiers|
|public ISOFileID[] getISOFileIDs()| @return an array of instances of class <code>ISOFileIDs</code> containing the list of ISO file identifiers present on the card|
|public ISOFileID getISOFileID(int i)|@param i an index @return an instance of class <code>ISOFileIDs</code> representing the ISO file identifier at position <code>i</code> in the retrieved list| 
