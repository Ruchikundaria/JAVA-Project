package string;

import java.util.ArrayList;

public class String_To_Character {
	
	public static void main(String args[])
	{
		/*first*/
		String demo = "Hello Practice";
		char[] test = new char[14];
		for(int i=0;i<demo.length();i++)
		{
			test[i]=demo.charAt(i);
		}
		for(int j=0;j<test.length;j++)
		System.out.print(test[j]+",");
		System.out.println(" ");
		
		/*second*/
	ArrayList<Character> test1=new ArrayList<Character>();
	for(int i=0;i<demo.length();i++)
	{
		test1.add(demo.charAt(i));
	}
	System.out.println(test1);
	}



}
