# Data
Provides an encapsulation for the data to be written in or read from Standard Data and Backup Data files.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public Data(byte[] data)|Creates an instance of class <code>Data</code> @param data a byte array containing the data frame|
|public byte[] toBA()|@return the byte array representation of the data frame|
|public Size getLength()|@return an instance of class <code>Size</code> representing the length of the data|
|public void setData(byte[] data)|@param data a byte array representing the data frame to be set|
    
