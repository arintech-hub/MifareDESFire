# AIDS
Provides an encapsulation of the structure retrieved from an execution of the <code>getApplicationIDs</code> command.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public AIDS(byte[] aids)|Creates an instance of class <code>AIDS</code> @param aids a byte array containing the list of application identifiers|
| public AID[] getAids()|@return an array of instances of class <code>AID</code> containing the list of application identifiers present on the card|
|public AID getAid(int i)|@param i an index @return an instance of class <code>AID</code> representing the application identifier at position <code>i</code> in the retrieved list|
