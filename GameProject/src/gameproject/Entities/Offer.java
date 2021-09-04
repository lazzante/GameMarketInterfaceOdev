package gameproject.Entities;

public class Offer {
private String name;
private int discountRate;

public Offer(String name, int discountRate) {
	super();
	this.name = name;
	this.discountRate = discountRate;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getDiscountRate() {
	return discountRate;
}

public void setDiscountRate(int discountRate) {
	this.discountRate = discountRate;
}



}
