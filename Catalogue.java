package arkea;

import java.util.ArrayList;
import java.util.Comparator;

public class Catalogue {
    
    ArrayList<Item> items = new ArrayList<>();
    
    public void catalogue() {
    	
        items.add(new Keyboard(111111, "KB100", "Dell", 15, 0.1f, false));
        items.add(new Keyboard(111112, "KB200", "Dell", 20, 0.11f, true));
        items.add(new Keyboard(111113, "KBB-100", "LG", 30, 0.2f, false));
        items.add(new Keyboard(111114, "KBB-200", "LG", 50, 0.15f, true));
        items.add(new Keyboard(111115, "Chroma", "Razer", 150, 0.3f, true));
        
        items.add(new Monitor(211116, "EliteDisplay", "HP", 250, 3.5f, 24));
        items.add(new Monitor(211117, "EliteDisplay", "HP", 350, 4.5f, 27));
        items.add(new Monitor(211118, "UltraSharp", "Dell", 200, 3, 21));
        items.add(new Monitor(211119, "UltraSharp", "Dell", 325, 4, 24));
        items.add(new Monitor(211120, "UltraSharp", "Dell", 450, 5, 27));
        
        items.add(new Application(311121, "Word", "Microsoft", 200, 17.2f, 500));
        items.add(new Application(311122, "Excel", "Microsoft", 250, 17.2f, 650));
        items.add(new Application(311123, "PowerPoint", "Microsoft", 150, 17.2f, 800));
        items.add(new Application(311124, "Chrome", "Google", 50, 50.05f, 100));
        items.add(new Application(311125, "Thunderbird", "Mozilla", 100, 25.25f, 300));
        
        items.add(new Game(411126, "Gothic", "Piranha Bytes", 10, 3.2f, 16));
        items.add(new Game(411127, "Morrowind", "Bethesda", 5, 3.3f, 12));
        items.add(new Game(411128, "Divinity", "Larian", 15, 2.3f, 12));
        items.add(new Game(411129, "Test Drive Unlimited", "Eden Games", 20, 15, 7));
        items.add(new Game(411130, "The Longest Journey", "Funcom", 20, 5, 7));
        
        items.add(new OS(511131, "Windows", "Microsoft", 100, 7.7f, "PC"));
        items.add(new OS(511132, "OS X", "Apple", 10, 10.7f , "Macintosh"));
        items.add(new OS(511133, "Ubuntu", "Canonical Ltd.", 5, 15.5f, "PC"));
        items.add(new OS(511134, "Kali Linux", "Offensive Security", 5, 12.2f, "PC"));
        items.add(new OS(511135, "Debian", "Debian Project", 5, 19.9f, "PC"));
    }
    
    public int getCheapest(ArrayList<Item> a) {
        
        int cheap = Integer.MAX_VALUE;
        int cheapIndex = 0;
        
        for (int i = 0; i < a.size(); i++) {
            
            if (a.get(i).price < cheap) {
                
                cheap = a.get(i).price;
                cheapIndex = i;
            }
        }
        
        return cheapIndex;
    }
    
    public int getExpensive(ArrayList<Item> a) {
        
        int expensive = Integer.MIN_VALUE;
        int expensiveIndex = 0;
        
        for (int i = 0; i < a.size(); i++) {
            
            if (a.get(i).price > expensive) {
                
                expensive = a.get(i).price;
                expensiveIndex = i;
            }
        }
        
        return expensiveIndex;
    }
    
//    public static class sortItemAsc implements Comparator<Item> {
//        @Override
//        
//        public int compare(final Item a, final Item b) {
//            
//            return a.price - b.price;
//        }
//    }
    
    public static class sortItemDsc implements Comparator<Item> {
        @Override
        
        public int compare(final Item a, final Item b) {
            
            return b.price - a.price;
        }
    }
    
    public static class sortSKUAsc implements Comparator<Item> {
        @Override
        
        public int compare(final Item a, final Item b) {
            
            return a.SKU - b.SKU;
        }
    }
    
//    public static class sortSKUDsc implements Comparator<Item> {
//        @Override
//        
//        public int compare(final Item a, final Item b) {
//            
//            return b.SKU - a.SKU;
//        }
//    }
    
    public int searchSKU(int search) {
        
        int dif = Integer.MAX_VALUE;
        int result = 0;
        
        for (int i = 0; i < items.size(); i++) {

            if (Math.abs(search - items.get(i).SKU) < dif) {

                dif = Math.abs(search - items.get(i).SKU);
                result = i;
                System.out.println(dif);
            }
        }
        
        return result;
    }
}
