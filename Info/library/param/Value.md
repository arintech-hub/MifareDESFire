# Value
Provides an encapsulation of a number to write in or read from a <code>Value</code> file.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public Value()|Creates a default instance of class <code>Value</code>|
|public Value(int value)|Creates an instance of class <code>Value</code> @param value an int indicating the number to store|
|public Value(byte[] value)|Creates an instance of class <code>Value</code> @param value an byte array indicating the number to store|
|public int getValue()|@return an int indicating the stored number|
|public byte[] toBA()|@return an byte array representing the stored number|
    
