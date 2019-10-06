/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vermeirl
 */
public class Client {

    private final String username;
    private final byte[] passwordHash;
    private final MessageDigest hashFunction;
    private Socket socket;

    public Client(String username, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        this.username = username;
        hashFunction = MessageDigest.getInstance("SHA-256");
        passwordHash = hashFunction.digest(password.getBytes("UTF-8"));
    }
    
    
}
