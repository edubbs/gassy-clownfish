package main.java.intfTest;
/*
 * Here's a comment.
 */
public class Softball implements Sport {
	double price;
	String name;
	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price = price;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	void printOut() {
		System.out.println("This sport "+name+" is expensive at $"+price);
	}
	
	

}
