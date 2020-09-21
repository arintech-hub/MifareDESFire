# PICCVersion
Provides an encapsulation of the structure retrieved from the execution of the <code>getVersion</code> command.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public PICCVersion(byte[] version)|Creates an instance of class <code>PICCVersion</code> @param version a byte array containing the PICC version information retrieved from the card|
|public PICCInfo getHardwareInfo()|@return an instance of class <code>PICCInfo</code> representing the hardware version information|
|public PICCInfo getSoftwareInfo()|@return an instance of class <code>PICCInfo</code> representing the software version information|
|public UID getUID()|@return an instance of class <code>UID</code> representing the card's unique identifier|
|public ProdBatchNum getProductionBatchNumber()|@return an instance of class <code>ProdBatchNum</code> representing the card's production batch number|
|public int getProductionWeek()|@return an int representing the card's production week|
|public int getProductionYear()|@return an int representing the card's production year|
    
