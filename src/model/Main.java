package model;

import java.util.Scanner;

import java.util.ResourceBundle;  
import java.util.Locale;

public class Main {

  public static void main( String [] args) {
        	  
        Cart cart = new Cart();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("MENY");
        System.out.println("----------------------------------");
        
        Product prod1 = new Product(1, "HvitKaffeKopp(TM)" , 20 , "DetteErEnHvitKaffe");
        Product prod2 = new Product(2, "SvartKaffeKopp(TM)" , 30 , "DetteErEnSvartKaffe");
        
        cart.addToCart(prod1);
        cart.addToCart(prod2);
        
        
//        System.out.println(prod1.toString());
//        System.out.println("-----------------------------------");
//        System.out.println(prod2.toString());
//        System.out.println("-------------------------------------");
        
        System.out.println("VELG DIN VEI");
        System.out.println("TAST 1 for å legge til produkt 1 i handlevogn:");
        System.out.println("TAST 2 for å legge til produkt 2 i handlevogn:");
        System.out.println("TAST 3 for å bytte språk til engelsk");
        System.out.println("TAST 4 for å bytte språk til tysk");
        
        int tall = sc.nextInt();
        
   
        Locale.setDefault(new Locale("no"));
        
        switch(tall) {
        
        case 1: 
        //legg inn i handlekurv, 
        cart.addToCart(prod1);
        System.out.println("Du har lagt til produkt 1 i handlekurven!");
        System.out.println("Hvor mange vil du ha?");
        int quantity1 = sc.nextInt();
        prod1.setQuantity(quantity1);
        break;
        case 2:
        	cart.addToCart(prod2);
            System.out.println("Du har lagt til produkt 2 i handlekurven!");
            System.out.println("Hvor mange vil du ha?");
            int quantity2 = sc.nextInt();
            prod2.setQuantity(quantity2);
        break;
        case 3: 
            System.out.println("You changed language to english!");
            
            Locale localeEN = new Locale("en");
            
            ResourceBundle messageEN = ResourceBundle.getBundle("message", localeEN);
            
            System.out.println("Chosen locale: " + localeEN);
                        
            System.out.println("MENY");
            for (Product p : cart.products) {
            	
            System.out.print(messageEN.getString(p.getName()) + " \n" +  
            	            messageEN.getString(p.getDescr()));
            System.out.println();
            
			}
            
            
            
        break;
        case 4: 
     
        	
        break;
        
        default:
        System.out.println("Prøv igjen");
        
        }
        
        

        
 
    }
	
	

	}

