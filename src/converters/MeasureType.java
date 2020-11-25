package converters;

public enum MeasureType {
    
    COMPRIMENTO("comprimento", "metre (m)"), //ok
    AREA("area", "square metre (m\\u33a1)"),
    VOLUME("volume", "litre (L)"),//ok
    MASS("mass", "kilogram (kg)"),//ok
    TIME("time", "second (s)"),//ok
    SPEED("speed", "m/s"), // ok
    ACCELERATION("accelerations", "m/s\u00b2"); // ok
   
    private final String type;
    private final String basicUnit;

    MeasureType(String type, String basicUnit) {
        this.type = type;
        this.basicUnit = basicUnit;
    }

    public final String getBasicUnit() {
        return basicUnit;
    }
    public final String getTypeString() {
        return type;
    }
    
     @Override
    public String toString() {
        return this.type + " [" + this.basicUnit + "]";
    }
    
    
}