# CipAlg
Provides singleton objects for the representation of symmetric key criptographic algorithms.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public enum CipAlg|Enumerates the differents symmetric key criptographic algorithms objects|
|public abstract int getBlockLength()|@return an int representing the length of a cryptographic block in the specific algorithm|
|public abstract int getKeyLength()|@return an int representing the length of the key in the specific algorithm|
