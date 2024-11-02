package Exercise_3_commodity_management;
import java.util.*;
public class NonPerishableProduct extends Product{
	protected int warrantyPeriod ;


	public NonPerishableProduct(int id, String name, String manufacturer, long price,int warrantyPeriod) {
		super(id, name, manufacturer, price);
		this.warrantyPeriod = warrantyPeriod;
	}


	@Override
	public String toString() {
		return "\nwarrantyPeriod=" + warrantyPeriod + " month";
	}

	@Override
	public void input() {
		Scanner In = new Scanner(System.in);
		super.input();
		System.out.print("Enter warrantyPeriod (month) : ");
		warrantyPeriod = In.nextInt();
	}


	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}


	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
	
	
	
	
}
