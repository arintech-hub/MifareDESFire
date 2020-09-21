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

/* Provides an encapsulation for the data to be written in or read from
 * Standard Data and Backup Data files */

public class Data {
    /* Creates an instance of class <code>Data</code>
     * @param data a byte array containing the data frame */
    public Data(byte[] data){
	if(data == null) throw new NullPointerException();
	this.data = data;	
    }
	
    // @return the byte array representation of the data frame
    public byte[] toBA(){
	return this.data;
    }
	
    // @return an instance of class <code>Size</code> representing the length of the data
    public Size getLength(){
	return new Size(this.data.length);
    }
	
    // @param data a byte array representing the data frame to be set
    public void setData(byte[] data){
	if(data == null) throw new NullPointerException();
	this.data = data;
    }

    @Override
    public String toString(){
	String s =  "0x" + BAUtils.toString(this.toBA());
	return s;
    }
	
    private byte[] data;    
}
