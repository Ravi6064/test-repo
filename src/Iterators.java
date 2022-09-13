import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterators {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		System.out.println(l1);
	    Iterator l3=l1.iterator();
	    //l3.
	    while(l3.hasNext()) 
	    System.out.println(l3.next()  + " ");
	    
	    System.out.println("------------");
	    //while(l3.hasPrevious()) 
	    //	System.out.println(l3.hasPrevious() + " ");
	    
	    
	    ListIterator<Integer> l2 =l1.listIterator();
	   
	    while (l2.hasNext()) 
		System.out.println(l2.next());
	    System.out.println("------------");
	    while (l2.hasPrevious())
	    	System.out.println(l2.previous());
	    	

		//l1.add(10);

	    
		//for(int i =0;i<=l1.)
		//l1.listIterator(index)
		//HashSet<Integer> h1= new HashSet<>();
		//h1.i

		

	}

}
