# DataRes
Provides an encapsulation of the structure retrieved from an execution of the <code>readData</code> command.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public DataRes(byte[] data, boolean checked)|Creates an instance of class <code>DataRes</code> @param data a byte array containing the retrieved data frame @param checked a boolean indicating whether the retrieved data frame has successfully passed an integrity check or not|
|public Data getData()|@return an instance of class <code>Data</code> representing the retrieved data frame|
|public boolean isChecked()|@return <code>true</code> if the data frame had successfully passed an integrity check; <code>false</code>otherwise|
    
