# ComCode
Provides singleton objects for the different command codes of the native Mifare DESFire command set. 

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public enum ComCode|Enumeration of the different command codes of the native Mifare DESFire command set|
|public abstract byte[] toBA()|@return the byte array representation of the command code|
