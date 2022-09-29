package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList0 {

	 ArrayList list=new ArrayList();

	
	public static void main(String[] args) {
		ArrayList0 lt=new ArrayList0();
		
		lt.list.add(123);
		lt.list.add("array");
		
		Iterator  itr=lt.list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
