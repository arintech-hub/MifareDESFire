# UIDRes
Provides an encapsulation of the structure retrieved from an execution of the <code>getUID</code> command.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public UIDRes(byte[] uid, boolean checked)|Creates an instance of class <code>UIDRes</code> @param uid a byte array containing the card's unique identifier @param checked a boolean indicating whether the retrieved UID has successfully passed an integrity check or not|
|public UID getUID()|@return an instance of class <code>UID</code> representing the card's unique identifier|
|public boolean isChecked()|@return <code>true</code> if the card's unique identifier has successfully passed an integrity check; <code>false</code> otherwise|
