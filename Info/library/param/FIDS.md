# FIDS
Provides an encapsulation of the structure retrieved from an execution of the <code>getFileIDs</code> command.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public FIDS(byte[] fids)|Creates an instance of class <code>FIDS</code> @param fids a byte array containing the list of file identifiers|
|public FID[] getFids()|@return an array of instances of class <code>FID</code> containing the list of file identifiers present on an application of the card|
|public FID getFid(int i)|@param i an index @return an instance of class <code>FID</code> representing the file identifier at position <code>i</code> in the retrieved list|
