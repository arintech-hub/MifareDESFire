# DFNameInfo
Provides an encapsulation for each entry of an <code>DFNamesRes</code> structure.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public DFNameInfo(AID aid, ISOFileID fid, DFName dfname)|Creates an instance of class <code>DFNameInfo</code> @param aid an instance of class <code>AID</code> representing the application identifier @param fid an instance of class <code>ISOFileID</code> representing the ISO file identifier @param dfname an instance of class <code>DFName</code> representing|
|public DFNameInfo(byte[] dfNameInfo)|Creates an instance of class <code>DFNameInfo</code> @param dfNameInfo a byte array containing an entry of a <code>DFNamesRes</code> structure|
|public DFNameInfo(byte[] aid, byte[] fid, byte[] dfname|Creates an instance of class <code>DFNameInfo</code> @param aid the byte array representation of an application identifier @param fid the byte array representation of an ISO file identifier @param dfname the byte array representation of a DF-Name string|
|public AID getAID()|@return an instance of class <code>AID</code> representing the app id|
|public ISOFileID getFID()|@return an instance of class <code>ISOFileID</code> representing the ISO file identifier|
|public DFName getDFName()|@return an instance of class <code>DFName</code> representing the DF-Name string|
    
