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

//Provides an encapsulation of an ISO file identifier

public class ISOFileID {
    // Creates a default ISO file identifier
    public ISOFileID(){
	this.fid = new byte[2];
    }
	
    // Creates a file identifier @param fid an int representing the ISO file identifier
    public ISOFileID(int fid){
	this.fid = BAUtils.toBA(fid, 2);
    }
	
    /* Creates an ISO file identifier @param fid a byte array representing the 
     * ISO file identifier */
    public ISOFileID(byte[] fid){
	if(fid == null) throw new NullPointerException();
	if(fid.length != 2) throw new IllegalArgumentException();
	this.fid = fid;
    }
	
    // @return the int representation of the ISO file identifier
    public int toInt(){
	return BAUtils.toInt(this.fid);
    }
	
    // @return the byte array representation of the ISO file identifier
    public byte[] toBA(){
	return this.fid;
    }

    @Override
    public String toString(){
	return "0x" + BAUtils.toString(this.fid);
    }
	
    byte[] fid;
	    
}
