package arkea;

public class OS extends Software{
    
    private String platform;
    //private static int total = 0;
    
    public OS() {
        
        this(000000, "default", "default", 0, 0f, "default");
    }
    
    public OS(int SKU, String name, String manufacturer, int price, float version, String platform) {
        
        this.SKU = SKU;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.version = version;
        this.platform = platform;
        
        //total++;
        
        //System.out.println("Total number of operating systems: " + total);
    }
    
    public String getPlatform() {
        
        return platform;
    }
}
