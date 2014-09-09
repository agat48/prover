/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parser;

import java.util.ArrayList;

/**
 *
 * @author Agat
 */
public class Parser {
    ArrayList<String> stack = new ArrayList<>();
    public boolean checkSemantic(String s) throws ParserException {
        if(s.split("(").length != s.split(")").length) {
            throw new ParserException("Check parenthesis!");
        }
        return true;
    }
    public ArrayList<FormulaPart> parseFormula(String s) {
        ArrayList<FormulaPart> parts = new ArrayList<>();
        String analyzed = new String(s);
        
        return parts;
    }
}
