package model;

import java.util.ArrayList;
import java.util.ListIterator;

public class Cart {

	   ArrayList<Product> products;
	    private int totQuantity;
	    private double totPrice;
	     
	    
	    public Cart() {
	        this.products = new ArrayList<Product>();
	        this.totQuantity = 0;
	        this.totPrice = 0;
	        
	    }
	        

	    public void addToCart(Product product) {
	        this.products.add(product);
	    }
	    
	    public void showCart() {
	        ListIterator<Product> iterator = products.listIterator();
	        
	        while(iterator.hasNext()) {
	            Product product = iterator.next();
	            System.out.println(product);
	        }
	    }
	    
	    public double getTotPrice() {
	        ListIterator<Product> iterator = products.listIterator();
	        this.totPrice = 0;
	        
	        while(iterator.hasNext()) {
	            Product product = iterator.next();
	            this.totPrice += product.getPrice() * product.getQuantity(); 
	        }
	        return this.totPrice;    
	    }
	    
	    public void printCart() {
	        ListIterator<Product> iterator = products.listIterator();
	        
	        while(iterator.hasNext()) {
	            Product prod = iterator.next();
	            System.out.print(prod.getName() +"\t");
	            System.out.print(prod.getDescr() +"\t");
	            System.out.print(prod.getPrice() +"\t");
	            System.out.println(prod.getQuantity() +"\t");
	        }
	        System.out.println(getTotPrice());
	    }
	
	
}
