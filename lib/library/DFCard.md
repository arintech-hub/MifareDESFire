# DFCard
Provides an abstraction of a Mifare DESFire Card, allowing to send native commands and receive the card responses through its methods.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public enum ComCode|Enumeration of the different command codes of the native Mifare DESFire command set|
|public abstract byte[] toBA()|@return the byte array representation of the command code|
