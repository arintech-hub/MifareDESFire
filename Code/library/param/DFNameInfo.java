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

// Provides an encapsulation for each entry of an <code>DFNamesRes</code> structure

public class DFNameInfo {
    /* Creates an instance of class <code>DFNameInfo</code> @param aid an instance 
     * of class <code>AID</code> representing the application identifier
     * @param fid an instance of class <code>ISOFileID</code> representing
     * the ISO file identifier @param dfname an instance of class <code>DFName</code> 
     * representing */
    public DFNameInfo(AID aid, ISOFileID fid, DFName dfname){
	if((aid == null) || (fid == null) || (dfname == null)) 
            throw new NullPointerException();
	this.aid = aid;
	this.fid = fid;
	this.dfname = dfname;	
    }
	
    /* Creates an instance of class <code>DFNameInfo</code> @param dfNameInfo a 
     * byte array containing an entry of a <code>DFNamesRes</code> structure */
    public DFNameInfo(byte[] dfNameInfo){
	if(dfNameInfo == null) throw new NullPointerException();
	if(dfNameInfo.length < 5) throw new IllegalArgumentException();
	this.aid = new AID(BAUtils.extractSubBA(dfNameInfo, 0, 3));
	this.fid = new ISOFileID(
		BAUtils.extractSubBA(dfNameInfo, 3, 2));
	this.dfname = new DFName(
		BAUtils.extractSubBA(dfNameInfo, 5, dfNameInfo.length - 5));	
    }
	
    /* Creates an instance of class <code>DFNameInfo</code> @param aid the byte 
     * array representation of an application identifier @param fid the byte array 
     * representation of an ISO file identifier @param dfname the byte array 
     * representation of a DF-Name string */
    public DFNameInfo(byte[] aid, byte[] fid, byte[] dfname){
	if((aid == null) || (fid == null) || (dfname == null)) 
            throw new NullPointerException();
	this.aid = new AID(aid);
	this.fid = new ISOFileID(fid);
	this.dfname = new DFName(dfname);
    }
	
    // @return an instance of class <code>AID</code> representing the app id
    public AID getAID(){ return this.aid; }
	
    // @return an instance of class <code>ISOFileID</code> representing the ISO file identifier
    public ISOFileID getFID(){ return this.fid; }
	
    // @return an instance of class <code>DFName</code> representing the DF-Name string
    public DFName getDFName(){ return this.dfname; }

    @Override
    public String toString(){
	String s = "";
	s = s + "AID: " + this.aid.toString() + "\n";
	s = s + "FID: " + this.fid.toString() + "\n";
	s = s + "DFName: " + this.dfname.toString();
	return s;
    }
	
    private DFName dfname;
    private AID aid;
    private ISOFileID fid;
	    
}
