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

// Provides an encapsulation of a card's unique identifier

public class UID {
    // Creates a default instance of class <code>UID</code>
    public UID(){
	this.uid = new byte[7];
    }

    /* Creates an instance of class <code>UID</code>
     * @param uid a byte array containing the card's unique identifier */
    public UID(byte[] uid){
	if(uid == null) throw new NullPointerException();
	if(uid.length != 7) throw new IllegalArgumentException();
	this.uid = uid;
    }

    // @return the byte array representation of the card's unique identifier
    public byte[] toBA(){
	return this.uid;
    }
	
    @Override
    public String toString(){
	return BAUtils.toString(this.toBA());
    }
	
    private byte[] uid;
	    
}
