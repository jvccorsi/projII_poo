/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

/**
 *
 * @author vitor
 */
public class GigabyteConverter extends AbstractConverter{
    public GigabyteConverter() {
        super("Gigabyte (GB) [storage]:");
    }
    
    @Override
    public double toBasicUnit(double value) {
        return value;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value;
    }
}
