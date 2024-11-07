package BookManage2;

import java.util.Scanner;

public class EBook2 extends Book2 implements Digital2{
	protected String format ;
	protected double fileSizeMB ;



	public EBook2() {
		super();
	}

	public EBook2(int id, String title, String author, long price, String format, double fileSizeMB) {
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
	public double fileSizeMB2() {
		return 0;
	}

	@Override
	public boolean isBigBook2() {

		if(fileSizeMB >= 200 ) {
			return true;
		} else {
			return false;
		}
	}


	@Override
	public String toString2() {
		return "ID : " + super.id
				+"\nTitle : " + super.title
				+"\nAuthor : " + super.author
				+"\nPrice : " + super.price
				+"\nFormat : "+ format
				+"\nFile size  : "+	fileSizeMB;
	}
@Override
public void input2() {
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

}
