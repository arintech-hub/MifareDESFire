# JSCIOComManager
Provides method definitions for using the javax.smartcardio API in order to communicate with smart cards

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public String[] listReaders()                 |List the available readers|
|public void select(String readerName)         |Select the reader to establish the communication|
|public void deselect()                        |Deselect the reader in current use|
|public boolean isCardPresent()                |Returns a boolean variable corresponding to true if a card is present; and false otherwise|
|public void waitCardInsertion()               |Forces to wait for card|
|public void waitCardExtraction()              |Forces to wait for card extraction|
|public void connect()                         |Tries to connect to reader|
|public byte[] send(byte[] command)            |Sends the APDU command to the communication channel|
|public void reconnect()                       |Reconnects the communication|
|public void disconnect()                      |Disconnect the communication with card|
|public void release()                         |Releases the communication|
|public CardType getCardType()                 |Gets the type of card within the current communication|
|private void checkSetUp()                     |Checkup of the setup; throws DFLException of Context not initialized and No reader selected|
|protected static DFLException convertException(Exception e)|Get the DFLException|
