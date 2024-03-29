/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package arin.desfirelib.library.param;

import arin.desfirelib.library.security.DFKey;
import arin.desfirelib.utils.ba.BAUtils;

/**
 * @author Tere Varano based on Francisco Rodriguez Algarra dflibrary 
 *         https://github.com/franrodalg/pfc
 * @version 2.0
 * @since 2020/09/01
 */

/* Provides an encapsulation for the sending parameters of the 
 * <code>setConfiguration</code> command */

public class ConfigOption {
    /* Creates an instance of class <code>ConfigOption</code> for options of type
     * <code>FC_RandID</code> @param formatEnabled a boolean indicating whether 
     * card formatting is allowed or not @param randIDEnabled a boolean indicating 
     * whether card formatting is allowed or not */
    public ConfigOption(boolean formatEnabled, boolean randIDEnabled){
	this.opt = ConfigOptionType.FC_RandID;
	this.formatEnabled = formatEnabled;
	this.randIDEnabled = randIDEnabled;
    }
	
    /* Creates an instance of class <code>ConfigOption</code> for options of type 
     * <code>KEY</code> @param key an instance of class <code>DFKey</code>
     * representing the data of the key to be set */
    public ConfigOption(DFKey key){
	if(key == null) throw new NullPointerException();
	this.opt = ConfigOptionType.KEY;
	this.key = key;
    }
	
    /* Creates an instance of class <code>ConfigOption</code> for options of type 
     * <code>ATS</code> @param ATS a byte array containing the new <code>ATS</code>
     * string to be set */
    public ConfigOption(byte[] ATS){
	if(ATS == null) throw new NullPointerException();
	this.opt = ConfigOptionType.ATS;
	this.ATS = ATS;
    }
	
    /* @return an instance of class <code>ConfigOptionType</code>
     * representing the current configuration option type */
    public ConfigOptionType getOpt(){
	return this.opt;
    }
	
    // @return the byte array representation of the current configuration options
    public byte[] getDataBA(){
	byte[] data;
	if(opt == ConfigOptionType.FC_RandID){
            data = new byte[1];
            byte[] f = BAUtils.toBA("01");
            byte[] r = BAUtils.toBA("02");
            if(!this.formatEnabled) data = BAUtils.xor(data, f);
            if(this.randIDEnabled) data = BAUtils.xor(data, r);
	}
	else if(opt == ConfigOptionType.KEY)			
            data = BAUtils.concatenateBAs(this.key.getKeyData(), 
                    BAUtils.toBA(this.key.getKeyVersion(), 1));
	else data = this.ATS;
	return data;
    }
	
    @Override
    public String toString(){
	String s = opt.toString();
	if(opt == ConfigOptionType.FC_RandID){
            s = s + "\n";
            s = s + "Format card " + ((this.formatEnabled) ? "enabled" : "disabled") + "\n";
            s = s + "Rando ID " + ((this.randIDEnabled) ? "enabled" : "disabled");
	}
	else if(opt == ConfigOptionType.KEY)
            s = s + "\n" + this.key.toString();
	else s = s + ": 0x" + BAUtils.toString(ATS);
	return s;
    }
	
    private ConfigOptionType opt;
    private boolean formatEnabled;
    private boolean randIDEnabled;
    private DFKey key;
    private byte[] ATS;
        
}
