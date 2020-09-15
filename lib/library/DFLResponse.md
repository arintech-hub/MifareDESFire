# DFLResponse
Provides an abstraction of a Mifare DESFire Card, allowing to send native commands and receive the card responses through its methods.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public DFCard(ComManager cm)|Constructs an instance of class DFCard @param cm a previously connected ComManager instance|
|public DFResponse authenticate(int keyNum, DFKey key)|Executes the interpreted version of the Authenticate command, as defined in the Mifare DESFire API. Response only includes the Status Code returned by the card. @param keyNum the key number within the selected card application with which we want to authenticate @param key an instance of class 
