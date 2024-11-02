package BookManage;
import java.util.*;
public class EBook extends Book implements Digital{
	protected String format;
	protected double fileSizeMB;

	@Override
	public double getFileSize() {
		return 0;
	}

	@Override
	public boolean isBigBook() {
		if(fileSizeMB >= 200 )return true;
		else return false;
	}

	public EBook() {
		super();
	}

	public EBook(int id, String title, String author, long price, String format, double fileSizeMB) {
		super(id, title, author, price);
		this.format = format;
		this.fileSizeMB = fileSizeMB;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public double getFileSizeMB() {
		return fileSizeMB;
	}

	public void setFileSizeMB(double fileSizeMB) {
		this.fileSizeMB = fileSizeMB;
	}

	@Override
	public String toString() {
		return "ID : " + super.id
				+"\nTitle : " + super.title
				+"\nAuthor : " + super.author
				+"\nPrice : " + super.price
				+"\nFormat : "+ format
				+"\nFile size  : "+	fileSizeMB;
	}

	@Override
	public void input() {
		Scanner In = new Scanner(System.in);
		System.out.println("Enter Information EBook");
		System.out.print("Enter ID : ");
		super.id =In.nextInt();
		In.nextLine();
		System.out.print("Enter Title : ");
		super.title =In.nextLine();
		System.out.print("Enter Auther : ");
		super.author =In.nextLine();
		System.out.print("Enter Price : ");
		super.price =In.nextLong();
		In.nextLine();
		System.out.print("Enter Format : ");
		format =In.nextLine();
		System.out.print("Enter File  Size MB : ");
		fileSizeMB =In.nextDouble();
		
	}
	

	
//	
//	public EBook() {
//		super();
//		
//	}
//	public EBook(int id, String title, String author, long price,String format,double fileSizeMB) {
//		super(id, title, author, price);
//		this.format = format;
//		this.fileSizeMB = fileSizeMB;
//		
//	}
//	public String getFormat() {
//		return format;
//	}
//	public void setFormat(String format) {
//		this.format = format;
//	}
//	public double getFileSizeMB() {
//		return fileSizeMB;
//	}
//	public void setFileSizeMB(double fileSizeMB) {
//		this.fileSizeMB = fileSizeMB;
//	}
//	public String toString() {
//		return super.toString()
//		+ "\nformat: "+format
//		+"\nFile Size MB : "+fileSizeMB;
//	}
//	public void input() {
//		Scanner In =new Scanner(System.in);
//		super.input();
//		System.out.print("Enter format :");
//		format = In.nextLine();
//		System.out.print("Enter File Size MB :");
//		fileSizeMB = In.nextDouble();
//	}
//	
//	public boolean isBigBook() {
//		if(fileSizeMB >= 200) return true;
//		 return false;
	
	
	
	
		


		
	
}
