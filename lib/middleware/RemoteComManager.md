# RemoteComManager
Provides an implementation of the ComManager interface, mainly addressed to  * the transmission of commands to and the reception of responses from a card located in a remote device.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public RemoteComManager(Scanner in, PrintWriter out)|Creates an instance of RemoteComManager @param in a Scanner instance representing the input channel for receiving responses @param out a PrintWriter instance representing the output channel for sending commands|
|public void scan()|Scan for readers and cards|
|public String[] listReaders()|Get the array of the available readers|
|public void select(String readerName)|Select reader|
|public void deselect()|Deselect command|
|public boolean isCardPresent()|Returns a boolean variable according if card is present|
|public void waitCardInsertion()|Wait for card insertion|
|public void waitCardExtraction()|Wait for card extraction|
|public void connect()|Connect to card|
|public byte[] send(byte[] command)|Send command to card| 
|public void reconnect()|Try to recconect to card|
|public void disconnect()|Disconnects from card|
|public void release()|Release the communication|
|public CardType getCardType()|Gets the CardType|

