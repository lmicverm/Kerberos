/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Message.KRB_AS_REQ;
import Message.Message;

/**
 *
 * @author vermeirl
 */
public class Main {
    public static void main(String[] args) {
        Message message = new KRB_AS_REQ("test", "test");
    }
}
