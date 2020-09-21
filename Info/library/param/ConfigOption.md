# ConfigOption
Provides an encapsulation for the sending parameters of the <code>setConfiguration</code> command.

The class has the following methods and enummeration:

|METHODS                                       |DESCRIPTION                                                                                        |
|:---------------------------------------------|:--------------------------------------------------------------------------------------------------|
|public ConfigOption(boolean formatEnabled, boolean randIDEnabled)|Creates an instance of class <code>ConfigOption</code> for options of type <code>FC_RandID</code> @param formatEnabled a boolean indicating whether card formatting is allowed or not @param randIDEnabled a boolean indicating whether card formatting is allowed or not|
|public ConfigOption(DFKey key)|Creates an instance of class <code>ConfigOption</code> for options of type <code>KEY</code> @param key an instance of class <code>DFKey</code> representing the data of the key to be set|
|public ConfigOption(byte[] ATS)|Creates an instance of class <code>ConfigOption</code> for options of type <code>ATS</code> @param ATS a byte array containing the new <code>ATS</code> string to be set|
|public ConfigOptionType getOpt()|@return an instance of class <code>ConfigOptionType</code> representing the current configuration option type|
|public byte[] getDataBA()|@return the byte array representation of the current configuration options|
    
