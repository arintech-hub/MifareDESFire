#RecordsRes
Provides an encapsulation of the structure retrieved from an execution of the <code>readRecords</code> command.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public RecordsRes(byte[] records, Size recSize, boolean checked|Creates an instance of class RecordsRes @param records a byte array containing the records to be stored @param recSize an instance of class <code>Size</code> representing the length of each record @param checked a boolean indicating whether the records have successfully passed an integrity check or not| 
|public Data[] getRecords()|@return an array of instances of class <code>Data</code> representing the list of retrieved records|
|public boolean isChecked()|@return <code>true</code> if the current record list has successfully passed an integrity check|
    
