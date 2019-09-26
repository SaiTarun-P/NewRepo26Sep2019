package Practice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class TwentysixSeptember{

	@Test(groups = "TC1", priority = 1)
	public void findANumberIsprime() {
		int num, count = 0;
		System.out.println("Enter number to check if it is prime or not: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		for (int i = 1; i <= 9; i++) {
			if (num % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}

	@Test(groups = "TC2", priority = 1)
	public void primeNumbers() {
		int num, count = 0;
		System.out.println("Enter number to print the prime number to the given: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println("Prime Numbers till " + num + " are:");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 2)
				System.out.print(i + " ");
			count = 0;
		}
	}

	@Test(groups = "TC3", priority = 2)
	public void palandromeForInt() {
		int num, tempVar, newNum = 0;
		System.out.println("\nEnter number to check if it is palandrome or not: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		tempVar = num;
		while (tempVar != 0) {
			newNum = newNum * 10 + tempVar % 10;
			tempVar = tempVar / 10;
		}
		if (newNum == num)
			System.out.println("Given " + num + " is a Palindrome");
		else
			System.out.println("Given " + num + " is not a Palindrome");
	}

	@Test(groups = "TC4", priority = 2)
	public void palandromeForString() {
		String var, tempVar;
		System.out.println("\nEnter Sting to check if it is palandrome or not: ");
		Scanner s = new Scanner(System.in);
		var = s.nextLine();
		// tempVar = var;
		// while(tempVar)
		StringBuffer sb = new StringBuffer(var);
		String revVar = sb.reverse().toString();
		if (revVar.equalsIgnoreCase(var))
			System.out.println("Given " + var + " is a Palindrome");
		else
			System.out.println("Given " + var + " is not a Palindrome");
	}

	@Test(groups = "fibo", priority = 3)
	public void fibonacciSeries() {
		int num = 5, a = 0, b = 1,c;
		int i = 2;
		System.out.print(a+" "+b);
		do {
			  c=a+b;
			  System.out.print(" "+c);
			  a=b;
			  b=c;
			  i++;
		} while (i <= num);
	}
	
	@Test(groups = "polymorphism", priority = 4)
	public void compileTimePolymorphism(){
		Parent p = new Parent();
		p.methodOne();		
		Child c = new Child();
		c.methodTwo();
		Parent P1 = new Child();
		P1.methodOne();
		P1.methodTwo();
//		Child C = new Parent();
//		C.methodTwo();
		
	}
	
}
