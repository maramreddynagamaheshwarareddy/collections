package collection;
import java.util.*;
import java.lang.NullPointerException;
public class priority {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 PriorityQueue<String> list1c=new PriorityQueue<String>();
	       list1c.add("rowdy");
	       list1c.add("gohan");
	       list1c.add("gangleader");
	       PriorityQueue<Integer> listn=new PriorityQueue<Integer>();
	       listn.add(123);
	       listn.add(523);
	       listn.add(654);
	       listn.add(22);
	       System.out.println("");
	       System.out.println(list1c);
	       System.out.println(listn.toString());
	       System.out.println("here i am checking the elements "+listn.isEmpty());
	       System.out.println("here i am getting the sizeof deque"+listn.size());
	     
	       System.out.println("here i am getting the element "+listn.contains(123));
	       System.out.println("here i am getting the elemens of array"+listn);
	       
	      Iterator<Integer> ph=listn.iterator();
	      while(ph.hasNext())
	      {
	    	  System.out.print(" "+ph.next()+" ");
	      }
	      System.out.println(listn.remove(123));
	      listn.add(777777777);
	      System.out.println(listn);
	}

}
