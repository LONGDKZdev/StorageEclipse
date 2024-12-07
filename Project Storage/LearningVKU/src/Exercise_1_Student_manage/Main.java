package Exercise_1_Student_manage;

public class Main {

	public static void main(String[] args) {
		thisinh a = new thisinh();
		a.input();

		System.out.println(a.toString());
		System.out.print("Tổng điểm : " + a.tongdiem()+"\n");
		System.out.println("----------------------");
		if(a.ketqua()) {
			System.out.println("Bạn đã đậu đại học !");
		}
		else {
			System.out.println("Bạn đã rớt đại học ");
		}
	}

}
