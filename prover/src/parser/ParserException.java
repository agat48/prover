/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parser;

/**
 *
 * @author Agat
 */
public class ParserException extends Exception {
    String msg;

    public ParserException() {
    }

    public ParserException(String msg) {
        this.msg = msg;
    }
    
}
