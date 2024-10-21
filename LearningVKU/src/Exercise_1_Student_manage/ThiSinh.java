package Exercise_1_Student_manage;
import java.util.Scanner;
public class ThiSinh {
	private  String ID;
	private  String name;
	private  double toan;
	private  double ly;
	private  double hoa;
	
	public ThiSinh() {
//		ID = 0;
		name= " ";
		toan = 0.0;
		ly = 0.0;
		hoa = 0.0;
	}
	public ThiSinh(String ID, String name, double toan, double ly, double hoa) {
		this.ID =ID;
		this.name =name;
		this.toan =toan;
		this.ly =ly;
		this.hoa =hoa;
	}
	
	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		this.ID = iD;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getToan() {
		return toan;
	}


	public void setToan(double toan) {
		this.toan = toan;
	}


	public double getLy() {
		return ly;
	}


	public void setLy(double ly) {
		this.ly = ly;
	}


	public double getHoa() {
		return hoa;
	}


	public void setHoa(double hoa) {
		this.hoa = hoa;
	}

	@Override
	public String toString() {
		return "Mã sinh viên: " +ID
				+ "\nTên sinh viên: "+ name
				+ "\nĐiểm toán: "+ toan
				+ "\nTĐiểm lý: "+ ly
				+ "\nTĐiểm hóa: "+ hoa;
	}

	public  void input() {
		Scanner In =new Scanner (System.in);
		
		System.out.print("Nhập ID : ");
		ID = In.nextLine();// đọc hết dòng 
		System.out.print("Nhập tên : ");
		name = In.nextLine();
		System.out.print("Nhập điểm toán : ");
		toan = In.nextInt();
		System.out.print("Nhập điểm lý : ");
		ly = In.nextInt();
		System.out.print("Nhập điểm hóa : ");
		hoa = In.nextInt();
		System.out.println("----------------------");
	}
	
	public double tongdiem() {
		double tongdiem = toan + ly + hoa;
		return tongdiem;
	}
	
	public boolean ketqua() {
		if(tongdiem() >=25 ) return true;
		else return false;// else có thể có hoặc không 
	}
	
}

