/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package arin.desfirelib.library.param;

import arin.desfirelib.library.security.DFCrypto;
import arin.desfirelib.utils.ba.*;
import arin.desfirelib.utils.security.CipAlg;

/**
 * @author Tere Varano based on Francisco Rodriguez Algarra dflibrary 
 *         https://github.com/franrodalg/pfc
 * @version 2.0
 * @since 2020/09/01
 */

/* Provides an encapsulation of the structure retrieved from the execution of
 * the <code>getKeySettings</code> command */
         
public class KeySettingsRes {
    /* Creates an instance of class <code>KeySettingsRes</code>
     * @param keySettings an instance of class <code>KeySettings</code>
     * representing the current key settings @param maxNumOfKeys an int indicating 
     * the maximum number of keys allowed in the application */
    public KeySettingsRes(KeySettings keySettings, CipAlg alg, int maxNumOfKeys){
    	if((keySettings == null) || (alg == null)) throw new NullPointerException();
        setKeySettings(keySettings);
        this.alg = alg;
        setMaxNumOfKeys(maxNumOfKeys);
    }

    /* Creates an instance of class <code>KeySettingsRes</code> @param field a byte
     * array containing the card response to a <code>GetKeySettings</code> command */
    public KeySettingsRes(byte[] field){
    	if(field == null) throw new NullPointerException();
    	if(field.length != 2) throw new IllegalArgumentException();
        setKeySettings(BAUtils.extractSubBA(field, 0, 1));
        setMaxNumOfKeysAlg(BAUtils.extractSubBA(field, 1, 1));
    }
    
    /* @return an instance of class <code>KeySettings</code> representing the 
     * current key settings */
    public KeySettings getKeySettings(){
        return this.keySettings;
    }

    // @return an int indicating the maximum number of keys allowed in the application
    public int getMaxNumOfKeys(){
        return this.maxNumOfKeys;
    }
    
    /* @return an instance of class <code>CipAlg</code> representing the
     * currently set criptographic algorithm for the application */
    public CipAlg getAlg(){
     	return this.alg;
    }
    
    // @param ks a byte array representing the new key settings
    public void setKeySettings(byte[] ks){
     	if(ks == null) throw new NullPointerException();
   	if(ks.length != 1) throw new IllegalArgumentException();
      	setKeySettings(new KeySettings(ks));
    }
    
    /* @param ks an instance of class <code>KeySettings</code> representing the 
     * new key settings */
    public void setKeySettings(KeySettings ks){
    	if(ks == null) throw new NullPointerException();
    	this.keySettings = ks;
    }
    
    /* @param maxNumOfKeysAlg an byte array containing the maximum number 
     * of keys allowed in the application */
    public void setMaxNumOfKeysAlg(byte[] maxNumOfKeysAlg){
     	if(maxNumOfKeysAlg == null) 
            throw new NullPointerException();
    	if(maxNumOfKeysAlg.length != 1) 
            throw new IllegalArgumentException();
    	byte[] maxNumOfKeys = BAUtils.and(maxNumOfKeysAlg, BAUtils.toBA("0F"));
    	byte[] algBA = BAUtils.and(maxNumOfKeysAlg, BAUtils.toBA("C0"));
    	this.alg = DFCrypto.getAlg(algBA);
    	setMaxNumOfKeys(BAUtils.toInt(maxNumOfKeys));
    }
    
    /* @param maxNumOfKeys an int indicating the maximum number of keys
     * allowed in the application */
    public void setMaxNumOfKeys(int maxNumOfKeys){
    	if((maxNumOfKeys < 1) || (maxNumOfKeys > 14)) 
            throw new IllegalArgumentException();
    	this.maxNumOfKeys = maxNumOfKeys;
    }

    @Override
    public String toString(){
    	String s = "";
    	s = s + "Key Settings:\n " + this.getKeySettings().toString() + "\n";
        s = s + "Application Crypto Algorithm: " + this.getAlg().toString() + "\n" +
        		"Maximum number of keys: " + 
                                 this.getMaxNumOfKeys();
        return s;
    }
    
    private KeySettings keySettings;
    private CipAlg alg;
    private int maxNumOfKeys;
	    
}
