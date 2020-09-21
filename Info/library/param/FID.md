# FID
Provides an encapsulation of a file identifier.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public FID()|Creates a default file identifier|
|public FID(int fid)|Creates a file identifier @param fid an int representing the file identifier|
|public FID(byte[] fid)|Creates a file identifier @param fid a byte array representing the file identifier|
|public int toInt()|@return the int representation of the file identifier|
|public byte[] toBA()|@return the byte array representation of the file identifier|
