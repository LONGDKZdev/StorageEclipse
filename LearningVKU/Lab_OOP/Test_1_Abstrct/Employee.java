package Test_1_Abstrct;

//Abstract class
abstract class Sunstar {
	int a;
	
	
  Sunstar() {
		System.out.println("");
	}
abstract void printInfo1();
 abstract void printInfo2();
}

//Abstraction performed using extends
class Employee extends Sunstar {
 void printInfo1()
 {
     String name = "avinash";
     int age = 21;
     float salary = 222.2F;

     System.out.println(name);
     System.out.println(age);
     System.out.println(salary);
     System.out.println("==================");
 }
 void printInfo2()
 {
     String name = "ADANFHJ";
     int age = 20;
     float salary = 232.2F;

     System.out.println(name);
     System.out.println(age);
     System.out.println(salary);
     System.out.println("==================");
 }
 
 class three extends Employee {
	 
 }
 
}

class Base {
	 public static void main(String args[])
	 {
	     Sunstar s = new Employee();
	     s.printInfo1();
	     s.printInfo2();
	 }
}


