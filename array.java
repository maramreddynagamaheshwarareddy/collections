package collection;
import java.util.*;
public class array extends deque{

	public static void list3() {
		// TODO Auto-generated method stub
      ArrayList<Integer> list=new ArrayList<Integer>();
      list.add(31);
      list.add(454);
      list.add(23);
      list.add(356);
      System.out.println(list);
      list.set(2, 112);
      System.out.println(list);
     Collections.sort(list);
      list.add(1, 2143);
      System.out.println(list);
      list.add(2, 120);
      list.set(2, 111);
      Collections.sort(list, Collections.reverseOrder());
      System.out.println(list);
    	ArrayDeque<String> in=new ArrayDeque<String>();
    	in.offer("both");
    	in.addFirst("sowjanya");
    	in.addFirst("mahesh");
    	in.offer("are");
        in.offerLast("friends");
        System.out.print(in);
        list4();
        System.out.println("");
	}

}
