package Tet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversewordsSentence {
	
	public static void main(String args[]){
		String str = "This is my name";
		String a[] = str.split(" ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
		///Using Arraylist
		List<String> ls = new ArrayList<String>();
		String rev="";
		ls = Arrays.asList(a);
		//ArrayList<String> als = (ArrayList<String>) ls;
		Collections.reverse(ls);
		for(String al : ls)
		{
			rev = rev + al +" ";
			//System.out.print(al+" ");
		}
			//System.out.println(new StringBuffer(rev).reverse());
		System.out.println();
		System.out.println(rev);
	}

}
