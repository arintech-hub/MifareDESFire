# DEFLException
Provides an encapsulation of the most common communication errors

The class has the following methods and enummeration:

|            METHODS             |                                         DESCRIPTION                                               |
|:-------------------------------|:--------------------------------------------------------------------------------------------------|
|public DFLException(ExType type)|@param type an object of class <code>ExType</code> representing the type of error that has occurred|
|public ExType getType()         |@return an object of class <code>ExType</code>                                                     |
|public enum ExType              |Provides singleton objects for representing the most common communication errors                   |
