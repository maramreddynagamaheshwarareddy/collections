package collection;
import java.util.*;
public class deque {
		public static void list4() {
			// TODO Auto-generated method stub
	       Deque<String> list1d=new ArrayDeque<String>();
	       list1d.add("gang");
	       list1d.add("vegita");
	       list1d.add("monster");
	       Deque<Integer> list3=new ArrayDeque<Integer>();
	       list3.add(123);
	       list3.add(523);
	       list3.add(654);
	       list3.add(22);
	       list3.add(624);
	       list3.add(254);
	       list3.add(652);
	       list3.add(655);
	       System.out.println("");
	       System.out.println(list1d);
	      // System.out.println("here i am getting the element of particular index"+list1.get(2));
	       System.out.println(list3.toString());
	      // System.out.println("here using clone"+list1.clone());
	       System.out.println("here i am getting the element "+list3.peekFirst());
	       System.out.println("here i am getting the sizeof deque"+list3.size());
	       System.out.println("here i am getting the element "+list3.pollFirst());
	       System.out.println("here i am getting the element "+list3.removeLast());
	       System.out.println("here i am getting the elemens of array"+list3);
	      Iterator<Integer> ph=list3.descendingIterator();
	      while(ph.hasNext())
	      {
	    	  System.out.print(" "+ph.next()+" ");
	      }
	      
	      list3.addFirst(777777777);
	      System.out.println(list3);
	     // System.out.println("after descending iterator"+list2);
		}

	}

