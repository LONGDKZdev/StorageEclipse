package Exercise_1_Student_manage;

public class Main {

	public static void main(String[] args) {
		ThiSinh a = new ThiSinh();
		a.input();

		System.out.println(a.toString());
		System.out.print("Tổng điểm : " + a.tongdiem());
		if(a.ketqua() == true) {
			System.out.println("Bạn đã đậu đại học !");
		}
		else {
			System.out.println("Bạn đã rớt đại học ");
		}
	}

}
