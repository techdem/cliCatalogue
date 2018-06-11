package arkea;

import java.util.Collections;
import java.util.Scanner;

public class Menu {
    
    public void menu() {
        
        Catalogue itemList = new Catalogue();
        
        itemList.catalogue();
        
        String userChoice;
        int itemIndex = 0;
        
        boolean showInfo = false;
        boolean showHelp = false;
        boolean showSearch = false;
        
        //boolean sortPrice = false;
        //boolean sortSKU = false;
        
        Scanner inputScanner = new Scanner(System.in);
    
        do {
            
            System.out.println("**************************************************");
            System.out.println("* !!! Welcome to the ArKea digital catalogue !!! *");
            System.out.println("**************************************************");
            System.out.println("* Choose an option and press 'Enter' to confirm! *");
            System.out.println("*                                                *");
            System.out.println("* 'A': first; 'S': previous; 'D':next; 'F':last; *");
            System.out.println("*                                                *");
            System.out.println("* 'T': show cheapest;  'U': show most expensive; *");
            System.out.println("**************************************************");
            System.out.println("*                                                *");
            
            if (!showInfo && !showHelp && !showSearch) {
                
                //System.out.println("  Current Item:     " + (itemIndex+1) + " of " + itemList.items.size());
                System.out.println("  Current Item:     " + itemList.items.get(itemIndex).name + " (" + itemList.items.get(itemIndex).getClass().getSimpleName() +")");
                System.out.println("                                                  ");
            
            
            
                System.out.println("  SKU:     " + itemList.items.get(itemIndex).SKU);
                System.out.println("  Name:    " + itemList.items.get(itemIndex).name);
                System.out.println("  Price:   " + "$" + itemList.items.get(itemIndex).price);
            }
            
            else if (showHelp) {
                
                System.out.println("  Welcome to the help section!\n");
                System.out.println("  Option 'Q' will sort by price in ascending order.");
                System.out.println("  Option 'E' will sort by SKU in ascending order.");
                System.out.println("  Option 'G' allows searching for a specific SKU.");
            }
            
            else if (showSearch) {
                
                System.out.println("  Welcome to the search section!\n");
                System.out.println("  Please input a number of up to 6 digits!");
                System.out.println("  If there is no exact match the item");
                System.out.println("  with the nearest SKU will be returned!");
            }
            
            else {
                
                System.out.println("  Current Item:     " + itemList.items.get(itemIndex).name + " (" + itemList.items.get(itemIndex).getClass().getSimpleName() +")");
                System.out.println("                                                  ");
                System.out.println("  Manufacturer:   " + itemList.items.get(itemIndex).manufacturer);
                
                if (itemList.items.get(itemIndex).getClass().getSuperclass().getSimpleName().equals("Hardware")) {
                    
                    System.out.println("  Mass:           " + ((Hardware)itemList.items.get(itemIndex)).mass + "kg");
                    
                    if (itemList.items.get(itemIndex).getClass().getSimpleName().equals("Keyboard")) {
                        
                        System.out.println("  QWERTY:         " + ((Keyboard)itemList.items.get(itemIndex)).getQWERTY());
                    }
                    
                    if (itemList.items.get(itemIndex).getClass().getSimpleName().equals("Monitor")) {
                        
                        System.out.println("  Diagonal:       " + ((Monitor)itemList.items.get(itemIndex)).getDiagonal());
                    }
                }
                
                if (itemList.items.get(itemIndex).getClass().getSuperclass().getSimpleName().equals("Software")) {
                    
                    System.out.println("  Version:        " + "v"+ ((Software)itemList.items.get(itemIndex)).version);
                    
                    if (itemList.items.get(itemIndex).getClass().getSimpleName().equals("Application")) {
                        
                        System.out.println("  PEGI:           " + ((Application)itemList.items.get(itemIndex)).getSize() + "MB");
                    }
                    
                    if (itemList.items.get(itemIndex).getClass().getSimpleName().equals("Game")) {
                        
                        System.out.println("  PEGI:           " + ((Game)itemList.items.get(itemIndex)).getPEGI());
                    }
                    
                    if (itemList.items.get(itemIndex).getClass().getSimpleName().equals("OS")) {
                        
                        System.out.println("  Platform:       " + ((OS)itemList.items.get(itemIndex)).getPlatform());
                    }
                }
            }
            
            System.out.println("*                                                *");
            System.out.println("**************************************************");
            System.out.println("* 'Q': sort/price;  'G': search;  'E': sort/SKU; *");
            System.out.println("*                                                *");
            System.out.println("* 'H': help;     'I': toggle info;    'X': exit; *");
            System.out.println("**************************************************");
            
            
            userChoice = inputScanner.nextLine();
            
            showHelp = false;
            
            //showSearch = false;
            
            //showInfo = false;
            
            switch (userChoice) {
                
                case "a":
                case "A":
                    
                    showInfo = false;
                    showSearch = false;
                    
                    itemIndex = 0;
                    System.out.println("Selection: First item");
                    break;
                    
                case "s":
                case "S":
                	
                    showInfo = false;
                    showSearch = false;
                    
                    if (itemIndex > 0) {
                        itemIndex--;
                    }
                    
                    else {
                        
                        itemIndex = itemList.items.size()-1;
                    }
                    
                    System.out.println("Selection: Previous item");
                    break;
                    
                case "d":
                case "D":
                    
                    showInfo = false;
                    showSearch = false;
                    
                    if (itemIndex < itemList.items.size()-1) {
                        
                        itemIndex++;
                    }
                    
                    else {
                        
                        itemIndex = 0;
                    }
                    System.out.println("Selection: Next item");
                    break;
                    
                case "f":
                case "F":
                    
                    showInfo = false;
                    showSearch = false;
                    
                    itemIndex = itemList.items.size()-1;
                    System.out.println("Selection: Last item");
                    break;
                
                case "q":
                case "Q":
                    
                    showInfo = false;
                    showSearch = false;
                    
                    //if (!sortPrice) {
                        
                        Collections.sort(itemList.items, new Catalogue.sortItemDsc());
                        
                        //sortPrice = true;
                    //}
                    
//                    else {
//                        
//                        Collections.sort(itemList.items, new Catalogue.sortItemDsc());
//                        
//                        sortPrice = false;
//                    }
                    
                    itemIndex = 0;
                    
                    System.out.println("Selection: Toggle sort by price");
                    break;
                    
                case "e":
                case "E":
                    
                    showInfo = false;
                    showSearch = false;
                    
                    //if (!sortSKU) {
                        
                        Collections.sort(itemList.items, new Catalogue.sortSKUAsc());
                        
                        //sortSKU = true;
                    //}
                    
//                    else {
//                        
//                        Collections.sort(itemList.items, new Catalogue.sortSKUDsc());
//                        
//                        sortSKU = false;
//                    }
                    
                    itemIndex = 0;
                    
                    System.out.println("Selection: Toggle sort by SKU");
                    break;
                
                    
                case "g":
                case "G":
                    
                    showInfo = false;
                    
                    showSearch = true;
                    
                    System.out.println("Selection: Search by SKU");
                    break;
                    
                case "t":
                case "T":
                    
                    showInfo = false;
                    showSearch = false;
                    
                    itemIndex = itemList.getCheapest(itemList.items);
                    
                    System.out.println("Selection: Show cheapest item");
                    break;
                
                case "u":
                case "U":
                    
                    showInfo = false;
                    showSearch = false;
                    
                    itemIndex = itemList.getExpensive(itemList.items);
                    
                    System.out.println("Selection: Show most expensive item");
                    break;
                    
                case "i":
                case "I":
                    
                    showInfo = !showInfo;
                    
                    System.out.println("Selection: Toggle display more info");
                    break;
                    
                case "h":
                case "H":
                    
                    showInfo = false;
                    showSearch = false;
                    
                    showHelp = true;
                    
                    System.out.println("Selection: Display help");
                    break;
                    
                case "x":
                case "X":
                    
                    System.out.println("Selection: Application exit");
                    break;
                    
                default:
                    
                    int search = -1;

                    if (showSearch) {
                    
                        try {
                        
                            search = Integer.parseInt(userChoice);
                            
                            if (search <= 999999 && search >= 0) {
                        
                                itemIndex = itemList.searchSKU(search);
                                System.out.println("Selection: Search for SKU " + search);
                                showSearch = false;
                            }
                            
                            else {
                            
                                System.out.println("Number not within range! Please try again.");
                            }
                        }
                    
                        catch (Exception e) {
                        
                            System.out.println("Not a valid number!");
                        }
                    }
                    
                    else {
                    
                        System.out.println("Invalid input, please press \"h\" if you wish to see the manual!");
                    }
                    
                    break;
            }
            
        } while (!userChoice.equals("x") && !userChoice.equals("X"));
        
        inputScanner.close();
    }
}
