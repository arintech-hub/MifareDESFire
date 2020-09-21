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

/* Provides an encapsulation of the production batch number retrieved
 * with the PICC version information */

public class ProdBatchNum {
    /* Creates an instance of class <code>ProdBatchNum</code> @param number a byte
     * array representing the card's production batch number */
    public ProdBatchNum(byte[] number){
	if(number == null) throw new NullPointerException();
	if(number.length != 5) throw new IllegalArgumentException();
	this.number = number;
    }
	
    // @return the byte array representation of the card's production batch number
    public byte[] toBA(){
	return this.number;
    }
	
    @Override
    public String toString(){
	return BAUtils.toString(this.toBA());
    }
	
    private byte[] number;
    
}
