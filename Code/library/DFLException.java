/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package arin.desfirelib.library;

import arin.desfirelib.library.DFLException.ExType;
/**
 * @author Tere Varano based on Francisco Rodriguez Algarra dflibrary 
 *         https://github.com/franrodalg/pfc
 * @version 2.0
 * @since 2020/09/01
 */

// Provides an encapsulation of the most common communication errors

public class DFLException extends RuntimeException {

    /* @param type an object of class <code>ExType</code> representing the type 
     * of error that has occurred */
    public DFLException(ExType type){
	if(type == null) throw new NullPointerException();
	this.type = type;
    }
	
    /* @return an object of class <code>ExType</code> */
    public ExType getType(){
	return this.type;
    }
	
    private ExType type;

    /* Provides singleton objects for representing the most common
     * communication errors */
    public enum ExType{
        CANCELLED{},
	CANT_DISPOSE{},
	CARD_NOT_CONNECTED{},
	CARD_UNSUPPORTED{},
	CARD_UNAVAILABLE{},
	COMMAND_NOT_ALLOWED{},
	CONTEXT_NOT_INITIALIZED{},
	DUPLICATE_READER{},
	INSUFFICIENT_BUFFER{},
	INVALID_ATR{},
	INVALID_HANDLE{},
	INVALID_PARAMETER{},
	INVALID_TARGET{},
	INVALID_VALUE{},
	NO_MEMORY{},
	NO_READER_SELECTED{},
	NO_READERS_FOUND{},
	NO_SERVICE{},
	NO_SMARTCARD{},
	NOT_READY{},
	NOT_TRANSACTED{},
	PCI_TOO_SMALL{},
	PROTO_MISMATCH{},
	READER_NOT_FOUND{},
	READER_UNAVAILABLE{},
	READER_UNSUPPORTED{},		
	SECURITY_EXCEPTION{},
	SERVICE_STOPPED{},
	SHARING_VIOLATION{},
	SYSTEM_CANCELLED{},
	TIMEOUT{},
	UNKNOWN_CARD{},
	UNKNOWN_CARD_TYPE{},
	UNKNOWN_READER{},		
	UNKNOWN_STATUS_CODE{},
	UNSUPPORTED_FEATURE{},
	WRONG_FIELD_CLASS{},
	
	COMM_ERROR{},
	INTERNAL_ERROR{},
	UNKNOWN_ERROR{},
	WAITED_TOO_LONG{};
    }
	
    @Override
    public String toString(){
        return "DESFire Library Exception: " + type.toString();
    }
	
}

