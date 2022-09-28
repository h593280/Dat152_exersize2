package model;

public class Product {

    private int prodId;
    private String name;
    private int price;
    private String descr;
    private int quantity;
    
    public Product() {
        
    }

    public Product(int prodId, String name, int price, String descr) {
        this.prodId = prodId;
        this.name = name;
        this.price = price;
        this.descr = descr;
        this.quantity = 0; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
    
    public int prodId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quand) {
        this.quantity=quand;
    }

	@Override
	public String toString() {
		return  "navn: " + name + "\n" +
	            "pris: kr " + price + "\n" + 
				"beskrivelse: " + descr;
	}
    
    
	
}
