package week3.day2.assihnments;

import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
public class MissingElementsAnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1,2,3,4,7,6,8};
		 Set<Integer>Numbers=new HashSet<Integer>();
		 for(int i=0;i<arr.length;i++) {
		     Numbers.add(arr[i]);
		 }
		 System.out.println(Numbers);
		 List<Integer>missednum=new ArrayList<Integer>(Numbers);
		 for(int i=1;i<=missednum.size();i++) {
		     if(i!=missednum.get(i-1)) {
		         System.out.println(i);
		         break;
		     }
		 }
		 
	}

}
