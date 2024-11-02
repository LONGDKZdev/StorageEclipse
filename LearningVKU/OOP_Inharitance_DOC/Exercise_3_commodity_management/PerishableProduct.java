package Exercise_3_commodity_management;
import java.util.*;
public class PerishableProduct extends Product{
	protected String expiryDate;

	public PerishableProduct() {
	}
	
	public PerishableProduct(int id, String name, String manufacturer, long price, String expiryDate) {
		super(id, name, manufacturer, price);
		this.expiryDate = expiryDate;
	}
	
	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "\nexpiryDate : " + expiryDate;
	}
	
	public void input() {
		super.input();
		Scanner In =new Scanner(System.in);
		System.out.print("Enter expiryDate : ");
		expiryDate = In.nextLine();
	}

	

	


	
	
}
