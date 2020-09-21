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

// Represents the storage space required for particular structures

public class Size {
    /* Creates an instance of class <code>Size</code> @param size an int representing
     * the size in bytes */
    public Size(int size){
	this.size = size;
	this.type = SizeType.BYTES;
    }
	
    /* Creates an instance of class <code>Size</code> @param size an int representing 
     * the size @param type an instance of class <code>SizeType</code> that
     * indicates how the <code>size</code> parameter should be interpreted */
    public Size(int size, SizeType type){	
	if(type == SizeType.TWOn){			
            boolean b = ((size & 0x01)==1);
            int n = size / 2;
            if(!b){
		this.size = (int) Math.pow(2, (double) n);					
            }			
            else{
		this.size = ((int) Math.pow(2, (double) n) + 
			(int) Math.pow(2, (double) (n + 1)))/2;
            }
            this.type = SizeType.BYTES;
	}
	else{
            this.size = size;
            this.type = type;
	}
    }
	
    /* Creates an instance of class <code>Size</code> @param size a byte array 
     * representing the size in bytes */
    public Size(byte[] size){
	if(size == null) throw new NullPointerException();
	if(size.length != 3) throw new IllegalArgumentException();
	this.size = BAUtils.toInt(size);
        this.type = SizeType.BYTES;
    }
	
    /* Creates an instance of class <code>Size</code> @param size an byte array 
     * representing the size @param type an instance of class <code>SizeType</code> 
     * that indicates how the <code>size</code> parameter should be interpreted */
    public Size(byte[] size, SizeType type){
	if((size == null) || (type == null)) 
            throw new NullPointerException();
	if(type == SizeType.TWOn){
            if(size.length != 1) 
		throw new IllegalArgumentException();
            boolean b = ((size[0] & 0x01) == 1);
            int n = BAUtils.toInt(size) / 2;
            if(!b){
                this.size = (int) Math.pow(2, (double) n);				
            }			
            else{
                this.size = ((int) Math.pow(2, (double) n) + 
                       (int) Math.pow(2, (double) (n + 1)))/2;
            }
            this.type = SizeType.BYTES;
        }
	else{
            if(size.length != 3) 
		throw new IllegalArgumentException();
            this.size = BAUtils.toInt(size);
            this.type = type;
	}
    }
	
    // @return an int representing the size
    public int getSize(){ return this.size; }
	
    /* An instance of class <code>SizeType</code> that indicates how the 
     * <code>size</code> should be interpreted */
    public SizeType getType(){ return this.type; }
	
    // @return the byte array representation of the size number
    public byte[] toBA(){ return BAUtils.toBA(this.size, 3);}
	
    @Override
    public String toString(){
	return "" + this.size + " " + this.type;		
    }
	
    private int size;
    private SizeType type;
	
    // Provides singleton objects to represent the different size representations
    public enum SizeType{
	BYTES{
            public String toString(){ return "Bytes";}
	},
	
        RECORDS{
            public String toString(){ return "Records";}
	},
	
        TWOn{
            public String toString(){ return "Bytes"; }
	};
    }
	    
}
