package mktclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;
import java.util.TreeSet;
import java.util.List;

public class CollectionProgram {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(30);
		a.add('M');
		a.add("Gokul");
		a.add(null);
		a.add(30);
		a.add(30);
		//Collections.sort(a);
		System.out.println("ArrayList: "+a);
		
		Vector v=new Vector();
		v.add(33);
		v.add(323);
		v.add(3783);
		v.add(32);
		v.add(4567);
		//v.add(false);
		Collections.sort(v);
		System.out.println("Vector: "+v);
		
		LinkedList l=new LinkedList();
		l.add(67);
		l.add(89);
		l.add(9087);
		l.add(54);
		l.add("John");
		l.add('G');
		l.add(null);
		l.add(true);
		//Collections.sort(l);
		System.out.println("LinkedList: "+l);
		
		PriorityQueue p=new PriorityQueue();
		p.add(779);
		p.add(456);
		p.add(896);
		p.add(987);
		p.add(33);
		p.add(9);
		p.add(88);
		p.add(988765);
		//Collections.sort(p);
		System.out.println("PriorityQueue: "+p);
		
		TreeSet t=new TreeSet();
		t.add(34);
		t.add(67);
		t.add(89);
		t.add(9087);
		t.add(54);
		t.add(574);
		t.add(6543);
		t.add(5432);
		t.add(3321);
		t.add(9432);
		//t.remove(9432);
		//t.add("John");
		//t.add('G');
		//t.add(null);
		//t.add(true);
		//Collections.sort(p);
		System.out.println("TreeSet: "+t);
		
		HashSet h=new HashSet();
		h.add(893);
		h.add(8455);
		h.add(89);
		h.add(3);
		h.add(8);
		h.add("Gokul");
		h.add("Gokul");
		h.add("Gokul");
		h.add("Gokul");
		h.add('G');
		h.add("null");
		h.add("null");
		h.add("null");
		h.add(true);
		h.add(98.5);
		h.add(98.5);
		h.add(98.5);
		//Collections.sort(h);;
		System.out.println("HashSet: "+h);
		
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(23);
		l1.add(23);
		l1.add(23);
		l1.add(23);
		l1.add(23);
		l1.add("Rohit");
		l1.add("Rohit");
		l1.add("Rohit");

		l1.add("Rohit");
		l1.add(45.55);
		l1.add(null);
		l1.add(false);
		//Collections.sort(l1);
		System.out.println("LinkedHashSet: "+l1);

	}

}
