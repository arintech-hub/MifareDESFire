/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package arin.desfirelib.library.param;

import arin.desfirelib.utils.ba.*;
import arin.desfirelib.utils.ba.DigitUtils.SignMode;

/**
 * @author Tere Varano based on Francisco Rodriguez Algarra dflibrary 
 *         https://github.com/franrodalg/pfc
 * @version 2.0
 * @since 2020/09/01
 */

// Provides an encapsulation of a number to write in or read from a <code>Value</code> file

public class Value {
    // Creates a default instance of class <code>Value</code>
    public Value(){
	this.value = 0;
    }
	
    /* Creates an instance of class <code>Value</code>
     * @param value an int indicating the number to store */
    public Value(int value){
	this.value = value;
    }
	
    /* Creates an instance of class <code>Value</code>
     * @param value an byte array indicating the number to store */
    public Value(byte[] value){
	if(value == null) throw new NullPointerException();
	if(value.length != 4) throw new IllegalArgumentException();
	this.value = BAUtils.toInt(value, SignMode.SIGNED);
    }
	
    // @return an int indicating the stored number
    public int getValue(){ return this.value; }
	
    // @return an byte array representing the stored number
    public byte[] toBA(){ return BAUtils.toBA(
	this.value, 4, SignMode.SIGNED); }
	
    @Override
    public String toString(){
	String s = "" + this.value;
	return s;
    }
	
    private int value;
	    
}
