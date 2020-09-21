# ValueRes
Provides an encapsulation of the structure retrieved from an execution of the <code>getValue</code> command.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public ValueRes(byte[] value, boolean checked)|Creates an instance of class <code>ValueRes</code> @param value a byte array representing the number stored in the file @param checked a boolean indicating whether the retrieved number has successfully passed an integrity check or not|
|public Value getValue()|@return an instance of class <code>Value</code> representing the number currently stored|
|public boolean isChecked()|@return <code>true</code> if the number currently stored has successfully passed an integrity check; <code>false</code> otherwise|
    
