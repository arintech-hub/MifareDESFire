/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package arin.desfirelib.library.param;

/**
 * @author Tere Varano based on Francisco Rodriguez Algarra dflibrary 
 *         https://github.com/franrodalg/pfc
 * @version 2.0
 * @since 2020/09/01
 */

/* Provides an encapsulation of the structure retrieved from
 * an execution of the <code>getUID</code> command */

public class UIDRes {
    /* Creates an instance of class <code>UIDRes</code> @param uid a byte array
     * containing the card's unique identifier @param checked a boolean indicating 
     * whether the retrieved UID has successfully passed an integrity check or not */
    public UIDRes(byte[] uid, boolean checked){
	if(uid == null) throw new NullPointerException();
	if(uid.length != 7) throw new IllegalArgumentException();
	this.uid = new UID(uid);
	this.isChecked = checked;
    }
	
    /* @return an instance of class <code>UID</code> representing the card's
     * unique identifier */
    public UID getUID(){ return this.uid; }
	
    /* @return <code>true</code> if the card's unique identifier has 
     * successfully passed an integrity check; <code>false</code> otherwise */
    public boolean isChecked(){ return this.isChecked; }

    @Override
    public String toString(){
	String s =  "UID: " + this.uid;
	if(!isChecked) 
            s = s + "\nCaution: this UID hasn't " + 
		    "passed an integrity test";
	return s;
    }
	
    private boolean isChecked;
    private UID uid;
    
}
