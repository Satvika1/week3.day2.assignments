package week3.day2.assihnments;
import java.util.List;

import java.util.ArrayList;
public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array={1,5,6,8,11,4};
		int[]array1= {1,2,8,4,9,7};
		
		List<Integer>list1=new ArrayList<Integer>();
		List<Integer>list2=new ArrayList<Integer>();
		list1.add(1);
		list1.add(5);
		list1.add(6);
		list1.add(8);
        list1.add(11);
        list1.add(4);
       
        list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
        list2.add(9);
        list2.add(7); 
       

      list1.retainAll(list2);
      System.out.println("intersection is"+ list1);
	}

}
