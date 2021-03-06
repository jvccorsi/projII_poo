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
 * @author jvcco
 */
public class MiliGramaConverter extends AbstractConverter {
     public MiliGramaConverter() {
        super("Miligrama (mg) [mass]:");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value / 0.000001; //Miligrama para KG
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 1000000; //KG para Miligrama
    }
}
