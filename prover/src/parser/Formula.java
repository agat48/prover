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
public class Formula extends FormulaPart {
    LogicalSign sign;
    ArrayList<FormulaPart> literals;
    public Formula() {
        literals = new ArrayList<>();
    }
    public Formula(FormulaPart p, FormulaPart q, LogicalSign s) {
        super();
        literals.add(p);
        literals.add(q);
        sign = s;
    }
}
