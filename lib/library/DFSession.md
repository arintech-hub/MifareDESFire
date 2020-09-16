# DFSession
Encapsulates the response returned by the execution of a native command in a Mifare DESFire. It contains an object of class <code>SC</code> representing the Status Code returned, and sometimes also a generic <code>Object</code> that can be casted to the particular class of the response field

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public DFResponse(byte[] sc)|@param sc a byte array representing the Status Code obtained from the card response|
|public DFResponse(SC sc|@param sc an object of class <code>SC</code> representing the Status Code obtained from the card respons|
