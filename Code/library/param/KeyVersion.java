/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package arin.desfirelib.library.param;

import arin.desfirelib.utils.ba.*;

/**
 * @author Tere Varano based on Francisco Rodriguez Algarra dflibrary 
 *         https://github.com/franrodalg/pfc
 * @version 2.0
 * @since 2020/09/01
 */

/* Provides an encapsulation for the key version number retrieved from the card 
 * via an execution of the <code>getKeyVersion</code> command */

public class KeyVersion {
    /* Creates an instance of class <code>KeyVersion</code> @param keyVersion an 
     * int indicating the current key version number */
    public KeyVersion(int keyVersion){
	setKV(keyVersion);
    }
	
    /* Creates an instance of class <code>KeyVersion</code> @param keyVersion a 
     * byte array representing the current key version number */
    public KeyVersion(byte[] keyVersion){
	if(keyVersion == null) throw new NullPointerException();
	if(keyVersion.length != 1) throw new IllegalArgumentException();
	int kv = BAUtils.toInt(keyVersion);
	if((kv < 0) || (kv > 255)) throw new IllegalArgumentException();
	this.keyVersion = kv;
    }

    // @param keyVersion an int indicating the new key version number
    public void setKV(int keyVersion){
	if((keyVersion < 0) || (keyVersion > 255)) 
            throw new IllegalArgumentException();
	this.keyVersion = keyVersion;
    }
	
    // @return the int representation of the current key version
    public int toInt(){
	return this.keyVersion;
    }
	
    // @return the byte array representation of the current key version
    public byte[] toBA(){
	return BAUtils.toBA(this.toInt(), 1);
    }
	
    @Override
    public String toString(){
	return "Key Version: " + keyVersion;
    }
	
    private int keyVersion;
	    
}
