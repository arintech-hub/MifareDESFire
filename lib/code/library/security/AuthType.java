/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package arin.desfirelib.library.security;

/**
 * @author Tere Varano based on Francisco Rodriguez Algarra dflibrary 
 *         https://github.com/franrodalg/pfc
 * @version 2.0
 * @since 2020/09/01
 */

// Provides singleton objects to represent the current authentication status

public enum AuthType {
    //Card not currently authenticated
    NO_AUTH{
            public String toString(){
                return "Not authenticated";
            }
    },

    // Card authenticated with Triple DES Crypto DESFire Native Mode
    TDEA_NATIVE{
        public String toString(){
            return "Triple DES Crypto DESFire " +
	"Native Mode Authentication";
        }
    },

    // Card authenticated with Triple DES Crypto DESFire Standard Mode
    TDEA_STANDARD{
        public String toString(){
            return "Triple DES Crypto Standard " +
                "Mode Authentication";
	}
    },

    // Card authenticated with 3 Key Triple DES Crypto
    TDEA3{
	public String toString(){
            return "3 Key Triple DES Crypto Authentication";
	}
    },
	
    // Card authenticated with AES Crypto
    AES{
	public String toString(){
            return "AES Crypto Authentication";
	}
    };
}
