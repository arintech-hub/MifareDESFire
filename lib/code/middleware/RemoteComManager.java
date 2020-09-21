/*
 * The content of this project itself is licensed under the Creative Commons 
 * Attribution 3.0 Unported license, and the underlying source code used to 
 * format and display that content is licensed under the GNU License
 */
package arin.desfirelib.middleware;

import java.io.*;
import java.util.*;

import arin.desfirelib.library.CardType;
import arin.desfirelib.utils.ba.BAUtils;

/**
 * @author Tere Varano based on Francisco Rodriguez Algarra dflibrary 
 *         https://github.com/franrodalg/pfc
 * @version 2.0
 * @since 2020/09/01
 */

/* Provides an implementation of the ComManager interface, mainly addressed to 
 * the transmission of commands to and the reception of responses from a card 
 * located in a remote device. */

public class RemoteComManager implements ComManager {
    /* Creates an instance of RemoteComManager @param in a Scanner instance 
     * representing the input channel for receiving responses @param out a 
     * PrintWriter instance representing the output channel for sending commands */
    public RemoteComManager(Scanner in, PrintWriter out){
	this.in = in;
	this.out = out;
    }
	
    // {@inheritDoc}
    @Override
    public void scan() {}

    // {@inheritDoc}
    @Override
    public String[] listReaders() { return null; }

    // {@inheritDoc}
    @Override
    public void select(String readerName) {}

    // {@inheritDoc}
    @Override
    public void deselect() {}

    // {@inheritDoc}
    @Override
    public boolean isCardPresent() { return true; }

    // {@inheritDoc}
    @Override
    public void waitCardInsertion() {}

    // {@inheritDoc}
    @Override
    public void waitCardExtraction() {}

    // {@inheritDoc}
    @Override
    public void connect() {}

    // {@inheritDoc}
    @Override
    public byte[] send(byte[] command) {
	out.println(BAUtils.toString(command));	
	boolean ended = false;
	while((!ended) && (in.hasNextLine())){
            String line = in.nextLine();
            System.out.println(line);
            return BAUtils.toBA(line);
	}
	return null;
    }

    // {@inheritDoc}
    @Override
    public void reconnect() {}

    // {@inheritDoc}
    @Override
    public void disconnect() {}

    // {@inheritDoc}
    @Override
    public void release() {}

    // {@inheritDoc}
    @Override
    public CardType getCardType() { return null; }

    private Scanner in;
    private PrintWriter out;	
}

