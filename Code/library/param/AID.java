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

// Provides an encapsulation of an application identifier

public class AID {
    // Creates a default application identifier
    public AID(){
	this.aid = new byte[3];
    }
	
    // Creates an app identifier @param aid an int representing the app id
    public AID(int aid){
	this.aid = BAUtils.toBA(aid, 3);
    }
	
    // Creates an appl id @param aid a byte array representing the app id
    public AID(byte[] aid){
	if(aid == null) throw new NullPointerException();
	if(aid.length != 3) throw new IllegalArgumentException();
	this.aid = aid;
    }
	
    /* Determines whether the application identifier represents the PICC Master 
     * Application or not @return <code>true</code> if the application identifier 
     * represents the PICC Master Application; <code>false</code> otherwise */
    public boolean isMaster(){
	return BAUtils.compareBAs(this.aid, new byte[3]);
    }
	
    // @return the int representation of the application identifier
    public int toInt(){ return BAUtils.toInt(this.aid); }
	
    // @return the byte array representation of the application identifier
    public byte[] toBA(){ return this.aid; }
	
    @Override
    public String toString(){
	if (isMaster()) return "PICC Master Application";
	return "0x" + BAUtils.toString(toBA());		
    }
		
    private byte[] aid;

}

