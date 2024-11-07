package Test_2_Interface;
//interface

//A simple interface
interface In1 {

 // public, static and final
 final int a = 10;

 // public and abstract
 void display();
}

//A class that implements the interface.
class TestClass implements In1 {

 // Implementing the capabilities of
 // interface.
 @Override
public void display(){
   System.out.println("Geek");
 }


 // Driver Code
 public static void main(String[] args)
 {
     TestClass t = new TestClass();
     t.display();
     System.out.println(In1.a);
 }

}



