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
public class Literal extends FormulaPart {
    String lit;
    boolean positive;
    public Literal() {
        positive = true;
    }
    public Literal(String l, String sign) {
        lit = l;
        switch(sign) {
            case "~" : positive = false;
                break;
            default: positive = true;
                break;
        }
    }
}
