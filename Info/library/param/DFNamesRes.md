# DFNamesRes
Provides an encapsulation of the structure retrieved from the execution of the <code>getDFNames</code> command.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public DFNamesRes(byte[][] dfNames)|Creates an instance of class <code>DFNamesRes</code> @param dfNames A bi-dimensional byte array containing the list of retrieved DF-Name strings|
|public void addDFName(byte[] dfName)|Adds a new DF-Name to the current <code>DFNamesRes</code> instance @param dfName a byte array representing a DF-Name string|
|public DFNameInfo[] getDFNames()|@return an array of instances of class <code>DFNameInfo</code>|
    
