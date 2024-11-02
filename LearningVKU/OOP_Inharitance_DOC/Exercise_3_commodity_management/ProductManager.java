
package Exercise_3_commodity_management;
import java.util.*;
public class ProductManager {
	protected Product[] products;
	protected int size ;
	protected int n;
	
	public ProductManager() {
		Scanner In =new Scanner(System.in);
		System.out.print("Enter limit storage : ");
		n = In.nextInt();
		products = new Product[n];
		size =0;
	}

	public ProductManager(Product[] products, int size) {
		this.products = products;
		this.size = size;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void addProductP(Product product) {
		if(product != null) {
			System.out.println(" This perishable product already exists. !");
			return;
		}
		products[size] = product;
		size++;
	}
	public Product searchProduct(int id) {
		for(int i =0; i < size; i++) {
			if(products[i].getId() == id ) {
				return products[i];
			}
		}
		System.out.println("cann't find product have ID " + id);
		return null;
	}
}
	
////Chương trình 2
//package Exercise_3_commodity_management;
//import java.util.*;
//
//public class ProductManager {
//	protected Product[] products;
//	protected int size;
//	protected int n;
//	
//	public ProductManager() {
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter limit storage: ");
//		n = in.nextInt();
//		products = new Product[n];
//		size = 0;
//	}
//	
//	public ProductManager(Product[] products, int size) {
//		this.products = products;
//		this.size = size;
//	}
//
//	public Product[] getProducts() {
//		return products;
//	}
//
//	public void setProducts(Product[] products) {
//		this.products = products;
//	}
//
//	public int getSize() {
//		return size;
//	}
//
//	public void setSize(int size) {
//		this.size = size;
//	}
//	
//	public void addProductP(Product product) {
//		book[size] = book;
//		size++;
//	}
//	
//	public Product searchProduct(int id) {
//		for (int i = 0; i < size; i++) {
//			if (products[i].getId() == id) {
//				return products[i];
//			}
//		}
//		System.out.println("Cannot find product with ID " + id);
//		return null;
//	}
//}