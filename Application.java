package arkea;

public class Application extends Software{
    
    private int size;
    //private static int total = 0;
    
    public Application() {
        
        this(000000, "default", "default", 0, 0f, 0);
    }
    
    public Application(int SKU, String name, String manufacturer, int price, float version, int size) {
        
        this.SKU = SKU;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.version = version;
        this.size = size;
        
        //total++;
        
        //System.out.println("Total number of applications: " + total);
    }
    
    public int getSize() {
        
        return size;
    }
}
