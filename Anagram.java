// java program for anagram strings..

import java.util.*;
class Anagram
{
	public static void main(String args[])
	{
		String s1;
		String s2;
		Scanner scan=new Scanner(System.in);		
		System.out.println("Enter first string:");
		s1=scan.nextLine();
		System.out.println("Enter 2nd string:");
		s2=scan.nextLine();
		s1=s1.replaceAll(" ","");
		s2=s2.replaceAll(" ","");
		if(s1.length()!=s2.length())
		{	
			System.out.println("Strings are not anagrams:");
			System.exit(0);
		}
		else
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char ar1[]=s1.toCharArray();
			char ar2[]=s2.toCharArray();
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			if((Arrays.equals(ar1,ar2))==true)
			{
				System.out.println("Strings are anagrams");
			}
			else
			{
				System.out.println("Strings are not anagrams");		
			}
		}
	}
}