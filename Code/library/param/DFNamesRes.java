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

/* Provides an encapsulation of the structure retrieved from the execution of
 * the <code>getDFNames</code> command*/

public class DFNamesRes {
    /* Creates an instance of class <code>DFNamesRes</code> @param dfNames A 
     * bi-dimensional byte array containing the list of retrieved DF-Name strings */
    public DFNamesRes(byte[][] dfNames){
	if(dfNames == null) throw new NullPointerException();
	this.dfnames = new DFNameInfo[0];
	for(int i = 0; i < dfNames.length; i++){
            addDFName(dfNames[i]);
	}
    }
	
    /* Adds a new DF-Name to the current <code>DFNamesRes</code> instance
     * @param dfName a byte array representing a DF-Name string */
    public void addDFName(byte[] dfName){
	if(dfName == null) throw new NullPointerException();
	DFNameInfo[] aux = new DFNameInfo[this.dfnames.length + 1];
	System.arraycopy(this.dfnames, 0, aux, 0, dfnames.length);
	aux[dfnames.length] = new DFNameInfo(dfName);
	this.dfnames = aux;
    }
	
    // @return an array of instances of class <code>DFNameInfo</code>
    public DFNameInfo[] getDFNames(){ return this.dfnames; }
	
    @Override
    public String toString(){
	String s = "DF-Names of all active applications on the PICC: \n";
	if(this.dfnames.length == 0) 
            s = s + "No applications with DF-Name present on the PICC";
	else{
            for(int i = 0; i < this.dfnames.length; i++){
		s = s + this.dfnames[i].toString() + "\n";
            }
	}
	return s;
    }
	
    private DFNameInfo[] dfnames;
	    
}
