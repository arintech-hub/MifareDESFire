# CardType
Provides singleton objects representing some of the contactless card models of the Mifare family, and allows its identification according to the obtained ATR

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public enum CardType                          |Provides singleton objects representing some of the contactless card models of the Mifare family   |
|public static CardType getCardType(String atr)|Identifies a Mifare model according to the obtained ATR @param atr the obtained ATR of the detected| 
|                                              |contactless card @return a singleton <code>CardType</code> object representing the model of card   |
