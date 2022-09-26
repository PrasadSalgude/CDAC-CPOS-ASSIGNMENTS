
import java.util.*;

//Q.1. Check the given number is even or odd.

class EvenOdd {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);   
		System.out.println("Enter the number");
		int num = sc.next();
		if (num % 2==0)
		{
			System.out.println("Given number is " + Even);
		}
		else
		{
			System.out.println("Given number is " + Odd);
		}
}


//Q.2. wriet a java program to find factorial of a given number

class Factorial {
    public static void main(String[] args) {
		long fact=1;
		Scanner sc= new Scanner (System.in);   
		System.out.println("Please enter whole number: ");
		long num = sc.nextInt();
		if (num ==0 || num==1)
		{
			System.out.println("Factorial of "+ num +" is " + 1);;
		}
		else if (num>0)
			{
			for(long a=num; a>0; --a)
			{
				fact=fact*a;
			}
			System.out.println("Factorial of "+ num +" is " + fact);
		}
		else
		{
		    System.out.println("Please enter whole number");
		}

}
}


// Q.3 Find the factorial of a number using recursion.

class FactorialRecursion {

	
	static long fact(long num1) {
		if (num1==0 || num1==1)
		{
			return 1;

		}
		else
		{
			
			return num1*fact(num1-1);
		}
	}
		

    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);   
		System.out.println("Please enter whole number: ");
		long num = sc.nextLong();
		System.out.println("factorial of "+num+" is "+fact(num));
		}
}


//Q.4. swap two number without using third variable approach


class Swap {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);   
		System.out.println("Enter 1st number");
		long num1 = sc.nextLong();
		System.out.println("Enter 2nd number");
		long num2 = sc.nextLong();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("1st number: "+num1);
		System.out.println("2nd number: "+num2);	
	}
}



//Q.5 How to check wheather given number is positive or negative?


class PositiveNegative {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);   
		System.out.println("Enter the number: ");
		long num = sc.nextLong();
		if(num>0)
		{
			System.out.println(num+" is positive number");
		}
		else if(num<0)
		{
			System.out.println(num+" is negative number");
		}
		else
		{
			System.out.println(num+" is neither positive nor negative number");
		}
	}
}
		
		

//Q.6. Write a java program to find wheather a given number is leap year or not?


class LeapYear {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);   
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if(num%100==0&&num%4==0)
		{
			System.out.println(num+" is Leap year");
		}
		else if(num%100!=0&&num%4==0)
		{
			System.out.println(num+" is leap year");
		}
		else
		{
			System.out.println(num+" is not a Leap year");
		}
	}
}


//Q.7. Write a java program to find print 1 to 10 without using loop?


class WithoutLoop {
    public static void main(String[] args) {
		Recursion(1);
	}
	public static void Recursion(int num) {
		if (num<=10)
		{
			System.out.println(num);
			Recursion(num+1);
		}
	}
}


//Q.8.  Write a java program to print digits of a given number


import java.io.*;

class Digits {
    public static void main(String[] args){
		Scanner sc= new Scanner (System.in);   
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		String s=Integer.toString(num);
		
		for(int i=0; i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
	}
}


//Q.9.  Write a java program to print all the factors of a given number


class Factors{	
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number: ");
		long num= sc.nextLong();
		for(int i=1;i<=(num/2);i++){
			if(num%i==0){
				System.out.println(i);
			}
		}
		System.out.println(num);
		
	}
	
}


//Q.10.  Write a java program to find the sum of digits of a given number


class Factors{	
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		int sum=0;
		for(int i=0; num>0;i++){
		   sum=sum+(num%10);
		   num=num/10;
		}
		System.out.println(sum);
	}
}



//Q.11. Write a java program to find smallest of 3 numbers (a, b, c).


class Smallest{	
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1st number: ");
		System.out.println("Enter 2nd number: ");
		System.out.println("Enter 3rd number: ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		if(num1<=num2){
			if(num1<=num3){
				System.out.println(num1+" is smalllest number");
			}
		}
		else if(num2<=num3){
			System.out.println(num2+" is smalllest number");
		}
		else{
			System.out.println(num3+" is smalllest number");
		}
	}
}

//Q.12. How to add two numbers without using arithmatic operator in java

class SumWithoutOperator{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1st number: ");
		System.out.println("Enter 2nd number: ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int i;
		if (num1>num2){
			for(i=0; num1>num2;i++){
				num1=num1-1;
			}
			System.out.println("sum of "+num1+" and "+num2+" is "+(2*num2+i));
		}
		else{
			for(i=0; num2>num1;i++){
				num2=num2-1;
			}
			System.out.println("sum of "+num1+" and "+num2+" is "+(2*num1+i));
		}
		}
}


//Q.13. Write a java program to reverse a given number


class Reverse{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number: ");
		int num= sc.nextInt();
		String s=Integer.toString(num);
		String reverse="";
		for (int i=s.length()-1;i>=0;i--){
			reverse=reverse+s.charAt(i);
		}
		System.out.println("Reverse of the given number is "+reverse);
	}
}
		

//Q.14.Write a java program to find GCD of two given number


class GCD{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1st number: ");
		System.out.println("Enter 2nd number: ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int gcd=1;
		for (int i=1; i<=num1 && i<=num2;i++){
			if(num1%i==0&&num2%i==0){
				gcd=i;
			}
		}
		System.out.println("GCD of the given numbers is "+gcd);
	}
}


//Q.15 Write a java program to find LCM of two given number


class LCM{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1st number: ");
		System.out.println("Enter 2nd number: ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int gcd=1;
		for (int i=1; i<=num1 && i<=num2;i++){
			if(num1%i==0&&num2%i==0){
				gcd=i;
			}
		}
		System.out.println("LCM of the given numbers is "+((num1*num2)/gcd));
	}
}


//Q.16. Write a java program to find LCM of two given number using the prime factors method.


class LCM{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1st number: ");
		System.out.println("Enter 2nd number: ");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int LCM=1;
		for (int i=1; i<=num1 && i<=num2;i++){
			if(num1%i==0&&num2%i==0){
				LCM=LCM*i;
				num1=num1/i;
				num2=num2/i;
				if(num1==1||num2==1){
					break;
				}
			}
		}
		LCM=(num1*num2*LCM);
		System.out.println("LCM of the given numbers is "+LCM);
	}
}



//Q.17. Check wheather the given number is palindrome or not


class Reverse{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number: ");
		int num= sc.nextInt();
		String s=Integer.toString(num);
		String reverse="";
		for (int i=s.length()-1;i>=0;i--){
			reverse=reverse+s.charAt(i);
		}
		if (s.equals(reverse)){
			System.out.println(num+" is palindrome number");
		}
		else{
		    System.out.println(num+" is not palindrome number");
		}
	}
}


//Q.18. Write a java program to print all the prime factors of the given number.


class PrimeFactors{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number: ");
		int num= sc.nextInt();
		System.out.println("Prime factors of "+num+" are: ");
		for (int i=1;i<=(num/2);i++){
			if(num%i==0){
				System.out.print(i+",");
			}
		}
		System.out.print(num);
	}
}


//Q.19. Write a java program to print all the even numbers between two given numbers.


class EvenNumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter small number: ");
		int num1= sc.nextInt();
		System.out.println("Enter large number: ");
		int num2= sc.nextInt();
		System.out.println("Even numbers between "+num1+" and "+num2+" are: ");
		if(num1%2==0){
		    for (int i=num1;i<=num2;i=i+2){
				System.out.print(i+" ");
		    }
		}
		else{
		    for (int i=num1+1;i<=num2;i=i+2){
				System.out.print(i+" ");
		    }
		}
	}
}


//Q.20 Write a java program to print all the odd numbers between two given numbers.


class OddNumbers{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter small number: ");
		int num1= sc.nextInt();
		System.out.println("Enter large number: ");
		int num2= sc.nextInt();
		System.out.println("Odd numbers between "+num1+" and "+num2+" are: ");
		if(num1%2!=0){
		    for (int i=num1;i<=num2;i=i+2){
				System.out.print(i+" ");
		    }
		}
		else{
		    for (int i=num1+1;i<=num2;i=i+2){
				System.out.print(i+" ");
		    }
		}
	}
}