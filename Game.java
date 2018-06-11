package arkea;

public class Game extends Software {
    
    private int pegi;
    //private static int total = 0;
    
    public Game() {
        
        this(000000, "default", "default", 0, 0f, 0);
    }
    
    public Game(int SKU, String name, String manufacturer, int price, float version, int pegi) {
        
        this.SKU = SKU;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.version = version;
        this.pegi = pegi;
        
        //total++;
        
        //System.out.println("Total number of games: " + total);
    }
    
    public int getPEGI() {
        
        return pegi;
    }
}
