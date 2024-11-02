package Exercise_3_commodity_management;
import java.util.Scanner;
public class Product {
protected int id;
protected String name;
protected String manufacturer;
protected long price;



public Product() {
	}

public Product(int id, String name, String manufacturer, long price) {
	this.id = id;
	this.name = name;
	this.manufacturer = manufacturer;
	this.price = price;
	}

public int getId() {
	return id;
	}

public void setId(int id) {
	this.id = id;
	}

public String getName() {
	return name;
	}

public void setName(String name) {
	this.name = name;
	}

public String getManufacturer() {
	return manufacturer;
	}

public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
	}

public long getPrice() {
	return price;
	}

public void setPrice(long price) {
	this.price = price;
	}

@Override
public String toString() {
	return 	  "id:" + id 
			+ "\nname=" + name 
			+ "\nmanufacturer=" + manufacturer 
			+ "\nprice=" + price;
	}

public void input() {
	Scanner In =new Scanner(System.in);
	System.out.print("Enter ID : ");
	id = In.nextInt();
	name = In.nextLine();
	System.out.print("Enter Product name : ");
	name = In.nextLine();
	System.out.print("Enter Manufacturer : ");
	manufacturer = In.nextLine();
	System.out.print("Enter product Price : ");
	price = In.nextLong();
	}

}
