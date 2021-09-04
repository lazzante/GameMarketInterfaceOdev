package gameproject.Entities;

public class Game {
private String name;
private String details;
private int price;
private int priceAfterDiscount;

public Game(String name, String details,int price,Offer offer) {
	super();
	this.name = name;
	this.details = details;
	this.price = price;
	this.priceAfterDiscount=this.price-(this.price*offer.getDiscountRate()/100);
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDetails() {
	return details;
}

public void setDetails(String details) {
	this.details = details;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getPriceAfterDiscount() {
	return priceAfterDiscount;
}

public void setPriceAfterDiscount(int priceAfterDiscount) {
	this.priceAfterDiscount = priceAfterDiscount;
}



}
