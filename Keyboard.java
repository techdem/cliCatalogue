package arkea;

public class Keyboard extends Hardware {
    
    private boolean qwerty;
    //private static int total = 0;
    
    public Keyboard() {
        
        this(000000, "default", "default", 0, 0f, false);
    }
    
    public Keyboard(int SKU, String name, String manufacturer, int price, float mass, boolean qwerty) {
        
        this.SKU = SKU;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.mass = mass;
        this.qwerty = qwerty;
        
        //total++;
        
        //System.out.println("Total number of keyboards: " + total);
    }
    
    public boolean getQWERTY() {
        
        return qwerty;
    }
}
