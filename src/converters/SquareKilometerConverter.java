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
public class SquareKilometerConverter extends AbstractConverter {
     public SquareKilometerConverter() {
        super("Kilometer^2 (km^2) [area]:");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value * 0.000001; //Km^2 para m^2
    }

    @Override
    public double fromBasicUnit(double value) {
        return value/0.000001; //Metro quadrado para Hectar
    }
}
