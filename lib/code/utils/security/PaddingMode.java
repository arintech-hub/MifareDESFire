/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package arin.desfirelib.utils.security;

/**
 * @author Tere Varano based on Francisco Rodriguez Algarra dflibrary 
 *         https://github.com/franrodalg/pfc
 * @version 2.0
 * @since 2020/09/01
 */

// Provides singleton objects for representing the different options for padding arrays

public enum PaddingMode {
    // Padding with zeros 
    ZEROPadding{},
    
    // Padding with zeros and 0x80
    EIGHTPadding{};
    
}
