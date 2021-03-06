/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import converters.AbstractConverter;
import converters.AbstractConverter;
/**
 *
 * @author potedesorvete
 */
public class KnotConverter extends AbstractConverter {
    public KnotConverter () {
        super("Knot (kt) [speed]:");
    }

     
     @Override
     public double toBasicUnit(double value) {
         return value * 1.944; //Knot para Metros/s
     }
 
     @Override
     public double fromBasicUnit(double value) {
         return value /1.944; //Metros/s para Knot
     }
 }

