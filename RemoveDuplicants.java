package week3.day2.assihnments;
import java.util.LinkedHashSet;
public class RemoveDuplicants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "We learn java basics as part of java sessions in java week1";   
	        removeDuplicates(str);   
	    }   
	public static void removeDuplicates(String str)   
 {     
      
     LinkedHashSet<Character> set = new LinkedHashSet<Character>();   
       
     for(int i=0;i<str.length();i++)   
         set.add(str.charAt(i));   
         
       
     for(Character ch : set)   
         System.out.print(ch);   
 }   
 
	}


