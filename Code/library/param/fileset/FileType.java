/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package arin.desfirelib.library.param.fileset;

import arin.desfirelib.utils.ba.*;

/**
 * @author Tere Varano based on Francisco Rodriguez Algarra dflibrary 
 *         https://github.com/franrodalg/pfc
 * @version 2.0
 * @since 2020/09/01
 */

/* Provides singleton objects representing the different file types available
 * in Mifare DESFire cards */

public enum FileType {
    STANDARD_DATA{
	public int toInt(){
            return 0;
	}
	public String toString(){
            return "Standard Data File";
	}
    },

    BACKUP_DATA{
	public int toInt(){
            return 1;
	}
	public String toString(){
            return "Backup Data File";
	}	
    },

    VALUE{
        public int toInt(){
            return 2;
	}
	public String toString(){
            return "Value File";
	}
    },

    LINEAR_RECORD{
	public int toInt(){
            return 3;
	}
	public String toString(){
            return "Linear Record File";
	}
    },
    CYCLIC_RECORD{
	public int toInt(){
            return 4;
	}
	public String toString(){
            return "Cyclic Record File";
	}
    };
	
    // @return the byte array representation of the current file type
    public byte[] toBA(){
	return BAUtils.toBA(this.toInt(), 1);
    }
	
    // @return the int representation of the current file type
    public int toInt(){
	return this.toInt();		
    }
	
    /* Obtains the <code>FileType</code> object corresponding to the given
     * byte array representation of a file type @param fileType a byte array 
     * representing a file type @return the <code>FileType</code> object 
     * corresponding to <code>fileType</code> */
    public static FileType toFileType(byte[] fileType){
	if(fileType == null) throw new NullPointerException();
	if(fileType.length != 1) throw new IllegalArgumentException("");
	return toFileType(BAUtils.toInt(fileType));
    }
	
    /* Obtains the <code>FileType</code> object corresponding to the given
     * integer representation of a file type @param fileType an int representing 
     * a file type @return the <code>FileType</code> object corresponding to
     * <code>fileType</code> */
    public static FileType toFileType(int fileType){
	switch(fileType){
            case 0: return STANDARD_DATA;
            case 1: return BACKUP_DATA;
            case 2: return VALUE;
            case 3: return LINEAR_RECORD;
            case 4: return CYCLIC_RECORD;
            default: throw new IllegalArgumentException(""); 
	}		
    }

    @Override
    public abstract String toString();    
}
