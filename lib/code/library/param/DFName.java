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

// Provides an encapsulation for a DF-Name string

public class DFName {
    /* Creates an instance of class <code>DFName</code> @param dfname a byte array 
     * representing a DF-Name string */
    public DFName(byte[] dfname){
	if(dfname == null) throw new NullPointerException();
	if(dfname.length > 16) throw new IllegalArgumentException();
	this.dfname = dfname;
    }
	
    // @return the byte array representation of a DF-Name string
    public byte[] getDFName(){ return this.dfname; }
	
    @Override
    public String toString(){ return "0x" + BAUtils.toString(this.dfname); }
	
    private byte[] dfname;
	    
}
