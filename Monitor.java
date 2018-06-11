package arkea;

public class Monitor extends Hardware{
    
    private float diagonal;
    //private static int total;
    
    public Monitor() {
        
        this(000000, "default", "default", 0, 0f, 0f);
    }
    
    public Monitor(int SKU, String name, String manufacturer, int price, float mass, float diagonal) {
        
        this.SKU = SKU;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.mass = mass;
        this.diagonal = diagonal;
        
        //total++;
        
        //System.out.println("Total number of monitors: " + total);
    }
    
    public float getDiagonal() {
        
        return diagonal;
    }
}
