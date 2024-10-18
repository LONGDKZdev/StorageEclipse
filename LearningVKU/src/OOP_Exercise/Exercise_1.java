package OOP_Exercise;
import java.util.*;

	public class Fraction
	{
		int numerator;
		int denominator;
	
	public Fraction (int numerator, int denominator) 
		{
		if(denominator == 0) {
			throw new IllegalArgumentException("ERROR!!!");
			}
		this.numerator = numerator;
		this.denominator = denominator;
		}

	
	public int getnumerator() {
		return numerator;
		}
	public int getdenominator() {
		return denominator;
		}
//                                                                                                   //
	// tính tổng phân số (a/b)+(c/d)
	// (a/b)+(c/d)= (b*c+a*d)/(b*d) = A/B
	// với: 
	//	 	this.numerator    là   a
	// 	    this.denominator  là   b
	//      other.numerator   là   c
	//  	other.denominator là   d
	public Fraction add(Fraction other) {
        int valueNumerator =other.numerator * this.denominator + this.numerator * other.denominator;
        int valueDenominator = this.denominator * other.denominator;
        return new Fraction(valueNumerator, valueDenominator);
    }

	// tính hiệu phân số (a/b)-(c/d)
    public Fraction subtract(Fraction other) {
    	int valueNumerator = other.numerator * this.denominator - this.numerator * other.denominator;
    	int valueDenominator = this.denominator * other.denominator;
        return new Fraction(valueNumerator, valueDenominator);
    }

    
    public Fraction multiply(Fraction other) {
    	int valueNumerator = this.numerator * other.numerator;
    	int valueDenominator = this.denominator * other.denominator;
        return new Fraction(valueNumerator, valueDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("ERROR! , (Division is the inverse of multiplication in fractions.) so that numerator must be != 0");
        }
        int valueNumerator = this.numerator * other.denominator;
        int valueDenominator = this.denominator * other.numerator;
        return new Fraction(valueNumerator, valueDenominator);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        }
        return numerator + "/" + denominator;
    	}
    public int gcd(int a, int b) {
    	while(b != 0) {
    		int r =a % b;
    		a=b;
    		b =r;
    	}
    	return a;
    }
    public void toigian() {
    	int ucln = gcd(numerator, denominator);
    	numerator = numerator/ucln;
    	denominator = denominator/ucln;
    }
    
	}
	public class Exercise_1 
	{
		public static void main(String[] args) {
	        Scanner In = new Scanner(System.in);

	        System.out.print ("Enter the fist value of numerator1 : " );
	        int num1 = In.nextInt();
	        System.out.print ("Enter the second value of denominator1 : " );
	        int den1 = In.nextInt();
	        
	        //
	        Fraction f1 = new Fraction(num1, den1);
	        //
	        
	        System.out.print("Enter the fist value of numerator2 : ");
	        int num2 = In.nextInt();
	        System.out.print("Enter the second value of denominator2 : ");
	        int den2 = In.nextInt();
	        
	        //
	        Fraction f2 = new Fraction(num2, den2);
	        //
	        
	        
	        System.out.println("The firt fraction : " + f1);
	        System.out.println("The second fraction : " + f2);
	        In.close();

	}

}
