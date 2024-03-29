/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package arin.desfirelib.library.param;

import arin.desfirelib.utils.ba.BAUtils;

/**
 * @author Tere Varano based on Francisco Rodriguez Algarra dflibrary 
 *         https://github.com/franrodalg/pfc
 * @version 2.0
 * @since 2020/09/01
 */

/* Provides singleton objects for the different operations available via the 
 * <code>setConfiguration</code> command */

public enum ConfigOptionType {
    FC_RandID{
	public byte[] toBA(){ return BAUtils.toBA("00"); }
        public int toInt(){ return 0; }
	public String toString(){ 
            return "Enable/Disable Format Card and Random ID options"; 
        }
    },

    KEY{
	public byte[] toBA(){ return BAUtils.toBA("01"); }
	public int toInt(){ return 1; }
	public String toString(){ 
            return "Change PICC Master Key algorithm"; 
	}
    },

    ATS{
	public byte[] toBA(){ return BAUtils.toBA("02"); }
	public int toInt(){ return 2; }
	public String toString(){ return "Set personalized ATS"; }
    };
	
    // @return the byte array representation of the configuration option type
    public abstract byte[] toBA();
	
    // @return the int representation of the configuration option type
    public abstract int toInt();
	
    @Override
    public abstract String toString();
	
}

