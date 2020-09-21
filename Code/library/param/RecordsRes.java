/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arin.desfirelib.library.param;

import arin.desfirelib.utils.ba.BAUtils;

/**
 * @author Tere Varano based on Francisco Rodriguez Algarra dflibrary 
 *         https://github.com/franrodalg/pfc
 * @version 2.0
 * @since 2020/09/01
 */

/* Provides an encapsulation of the structure retrieved from
 * an execution of the <code>readRecords</code> command */
         
public class RecordsRes {
    /* Creates an instance of class RecordsRes @param records a byte array containing 
     * the records to be stored @param recSize an instance of class <code>Size</code> 
     * representing the length of each record @param checked a boolean indicating 
     * whether the records have successfully passed an integrity check or not */
    public RecordsRes(byte[] records, Size recSize, boolean checked){
	if((records == null) || (recSize == null))
            throw new NullPointerException();
	if((records.length % recSize.getSize()) != 0)
            throw new IllegalArgumentException();
	int numOfRecords = records.length / recSize.getSize();
	this.records = new Data[numOfRecords];
	for(int i = 0; i < numOfRecords; i ++){
            this.records[i] = new Data(BAUtils.extractSubBA(
                    records, i*recSize.getSize(), recSize.getSize()));
	}
	this.isChecked = checked;
    }
	
    /* @return an array of instances of class <code>Data</code> representing the 
     * list of retrieved records */
    public Data[] getRecords(){ return this.records; }
	
    /* @return <code>true</code> if the current record list has
     * successfully passed an integrity check */
    public boolean isChecked(){ return this.isChecked; }
	
    @Override
    public String toString(){
	String s =  "Records: \n"; 
	for(int i = 0; i < this.records.length; i++){
            s = s + i + ".- " + this.records[i] + "\n";
	}
	if(!isChecked) s = s + "\nCaution: those Records haven't passed an integrity test";
	return s;
    }

    private boolean isChecked;
    private Data[] records;
    
}
