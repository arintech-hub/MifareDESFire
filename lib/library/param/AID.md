# AID
Provides an encapsulation of an application identifier.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public AID()|Creates a default application identifier|
|public AID(int aid)|Creates an app identifier @param aid an int representing the app id|
|public AID(byte[] aid)|Creates an appl id @param aid a byte array representing the app id|
|public boolean isMaster()|Determines whether the application identifier represents the PICC Master Application or not @return <code>true</code> if the application identifier represents the PICC Master Application; <code>false</code> otherwise|
|public int toInt()|@return the int representation of the application identifier|
|public byte[] toBA()|@return the byte array representation of the application identifier|
