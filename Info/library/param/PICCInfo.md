# PICCInfo
Provides an encapsulation of the hardware and software information structures stored in <code>PICCVersion</code> objects.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public PICCInfo(byte[] info)|Creates an instance of class <code>PICCInfo</code> @param info a byte array containing the hardware or software version information of a card|
|public int getVendorID()|@return an int indicating the vendor identifier|
|public int getType()|@return an int indicating the hardware or software type|
|public int getSubtype()|@return an int indicating the hardware or software subtype|
|public int getMajorVersionNumber()|@return an int indicating the hardware or software major version number|
|public int getMinorVersionNumber()|@return an int indicating the hardware or software minor version number|
|public Size getStorageSize()|@return an instance of class <code>Size</code> representing card's storage size|
|public int getCommunicationProtocolType()|@return an int indicating the available communication protocol type|
    
