package theorem;

import java.util.Scanner;

public class Pythgorean {
	public static void main(String[] args)
	{
	
	int i,j,k;
	
	System.out.println("NOTE:Please enter a value from 1 to 100");
	System.out.println("enter input a:");
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	
	System.out.println("enter input b:");
	Scanner ab = new Scanner(System.in);
	int b = ab.nextInt();
	System.out.println("enter input c:");
	Scanner ac = new Scanner(System.in);
	int c = ab.nextInt();
	i=a*a;
	j=b*b;
	k=c*c;
	sc.close();
	ab.close();
	ac.close();
	System.out.println("a^2="+i);
	System.out.println("b^2="+j);
	System.out.println("c^2="+k);
	if(i+j==k)
	{
		System.out.println("the number you entered is the hypotenuse of a Pythagorean triple or the number you entered is the hypotenuse of a pythagorean triple.");
	}
	else
	{
		System.out.println("the number you entered is the hypotenuse of a Pythagorean triple or the number you entered is not the hypotenuse of a pythagorean triple.");
		
	}
	
}
	
}
