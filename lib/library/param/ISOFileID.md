# ISOFileID
Provides an encapsulation of an ISO file identifier.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public ISOFileID()|Creates a default ISO file identifier|
|public ISOFileID(int fid)|Creates a file identifier @param fid an int representing the ISO file identifier|
|public ISOFileID(byte[] fid)|Creates an ISO file identifier @param fid a byte array representing the ISO file identifier|
|public int toInt()|@return the int representation of the ISO file identifier|
|public byte[] toBA()|@return the byte array representation of the ISO file identifier|
