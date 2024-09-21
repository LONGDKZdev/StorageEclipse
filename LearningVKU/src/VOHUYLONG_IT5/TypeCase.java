package VOHUYLONG_IT5;

public class TypeCase {

	public static void main(String[] args) {
//      ***Type Case***
		
//double valueOut =  valueA / valueB; //result = 1.0 ====> FIX : extral (double) before value you use 
//EX:===> double valueOut = (double) valueA / valueB;
//khi chia thì trả về kết quả có kiểu dữ liệu lớn nhất VD: (long/int=long) hoặc (int/int=int) 
//kết quả đang là kiểu số nguyên ===> số thực  
//doubel ===> float ===> long ===> int ===> short ===> byte

		int valueA= 72;
		double valueB = valueA;
		System.out.println(valueB);
		
///////////         Narroe Type Case(gán ngược lại)
		System.out.println("đối với trường hợp ngược lại ");
		double valueC = 71.2;
		int valueD = valueC;
		System.out.println(valueD);
		
	}

}
