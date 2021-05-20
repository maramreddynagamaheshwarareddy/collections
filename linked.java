package collection;
import java.util.*;
public class linked extends array{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<String> list1=new LinkedList<String>();
       list1.add("125");
       list1.add("goku");
       list1.add("saiyans");
       LinkedList<Integer> list2=new LinkedList<Integer>();
       list2.add(123);
       list2.add(523);
       list2.add(654);
       list2.add(22);
       list2.add(624);
       list2.add(254);
       list2.add(652);
       list2.add(655);
       System.out.println(list1);
       System.out.println("here i am getting the element of particular index"+list1.get(2));
       System.out.println(list2.toString());
       System.out.println("here using clone"+list1.clone());
       System.out.println("here i am getting the element index"+list2.indexOf(2));
      Iterator<Integer> ph=list2.descendingIterator();
      while(ph.hasNext())
      {
    	  System.out.print(" "+ph.next()+" ");
      }
      list2.addFirst(777777777);
      System.out.println("");
      list3();
     // System.out.println("after descending iterator"+list2);
	}

}
