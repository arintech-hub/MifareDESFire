#Size

Represents the storage space required for particular structures.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public Size(int size)|Creates an instance of class <code>Size</code> @param size an int representing the size in bytes|
|public Size(int size, SizeType type)|Creates an instance of class <code>Size</code> @param size an int representing the size @param type an instance of class <code>SizeType</code> that indicates how the <code>size</code> parameter should be interpreted|
|public Size(byte[] size)|Creates an instance of class <code>Size</code> @param size a byte array representing the size in bytes|
|public Size(byte[] size, SizeType type)|Creates an instance of class <code>Size</code> @param size an byte array representing the size @param type an instance of class <code>SizeType</code> that indicates how the <code>size</code> parameter should be interpreted|
|public int getSize()|@return an int representing the size|
|public SizeType getType()|An instance of class <code>SizeType</code> that indicates how the <code>size</code> should be interpreted|
|public byte[] toBA()|@return the byte array representation of the size number|
|public enum SizeType()|Provides singleton objects to represent the different size representations|
   
