package com.CFWArraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.*;
public class arrayslist extends ArrayList<String> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// public java.util.ArrayList(int);
		// public java.util.ArrayList();
		  
		ArrayList al=new ArrayList();
		al.add(200);
		al.add("Karthrine Langford");
		al.add(300);
		al.add("Vineeth@gamil.com");
		al.add("O+");
		System.out.println("Darling: "+al);

		al.add(0, "Vikram");
		System.out.println("After Updation"+al);
		al.addAll(5, al);
		System.out.println("After collection"+al);
		
		//  public void trimToSize();

		ArrayList ar=new ArrayList(8);
		
		ar.add("w3school");
		ar.add("vineeth@gmail.com");
		ar.add("9863721912");
		ar.add("O+ve");
		ar.trimToSize();
		System.out.println("Arraylist after trim size:"+ar);

		//  public void ensureCapacity(int);
		
		ArrayList<String> student=new ArrayList<String>(2);
		student.add("Vineeth");
		student.add("Ranjith");
		student.add("Rajesh");
		student.add("Prasad");
		System.out.println("Students list"+student);
		student.ensureCapacity(10);
		
		student.add("Suresh");
		student.add("Tameen");
		student.add("John");
		student.add("Gopal");
		student.add("Naresh");
		student.add("Sowdha");
		student.add("Rama Krishna");
	
		System.out.println("Students after Addon"+student);
		// public boolean contains(java.lang.Object);
		
		boolean res=student.contains("Vineeth");
		System.out.println("Vineeth is Student of VNC: "+res);
		boolean res1=student.contains("Vikram");		
		System.out.println("Vikram is Student of VNC: "+res1);
		// public int size();
		
		ArrayList list=new ArrayList();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(9);
		list.add(7);
		System.out.println("List of Array: "+list);
		Integer size=list.size();
		System.out.println("Size of Array is: "+size);
		
		//   public boolean isEmpty();
		ArrayList list1=new ArrayList();
		if(list1.isEmpty())
		{
			System.out.println("Array is Empty");
		}
		else
		{
			System.out.println("Array is not Empty:");
		}
		
		//  public int indexOf(java.lang.Object);
		
		ArrayList A=new ArrayList();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		A.add(6);
		A.add(7);
		
		Integer p=A.indexOf(4);
		Integer p1=A.lastIndexOf(4);
		//p=p+2;
		p1=p1+1;
				
		System.out.println("First Occarance of Index of 4 is: "+p);
		System.out.println("Last Occarance of Index of 4 is: "+p1);
	
		//public java.lang.Object clone();
		System.out.println("First arraylist is"+A);
		ArrayList B=new ArrayList();
		B=(ArrayList)A.clone();
		System.out.println("Second arraylist is "+B);
		
		//	  public java.lang.Object[] toArray();
		
		ArrayList<Integer> C=new ArrayList<Integer>();
		C.add(20);
		C.add(30);
		C.add(40);
		C.add(50);
		Object[] Arr1=C.toArray();
		for(Object value:C) {
			
		System.out.println("Elemens of ArrayList is: "+ value) ;
		}
		//	public java.util.ListIterator<E> listIterator(int);
		//	public java.util.ListIterator<E> listIterator();
		//  public java.util.Iterator<E> iterator();
		//  public java.util.List<E> subList(int, int);

		// fectching 
		ListIterator li= student.listIterator();
		for(;li.hasNext();)
		{
			System.out.println(li.next());
			
		}
		for(;li.hasPrevious();)
		{
			System.out.println(li.previous());
			
		}
		//  E elementData(int);
		//   static <E> E elementAt(java.lang.Object[], int);
		//  public E get(int);
		//  public E set(int, E);
		//  public boolean add(E);
		//  public void add(int, E);
		//  public E remove(int);
		ArrayList D= new ArrayList();
		D.add("Beautiful");
		D.add("Great");
		D.add("Georgeous");
		D.add("Good");
		D.add("Comfort");
		System.out.println("Get Index Element of 2 is: "+D.get(2));
		D.set(2, "Angel");
		System.out.println("After Set Element is: "+D);
		D.add(1,"Darling");
		System.out.println("After updation is: "+D);
		D.remove(5);
		System.out.println("After removing: "+D);
	//	public boolean equals(java.lang.Object);
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean(false);
		//Comparing methods
		System.out.println(b1+" is comparing with "+b2+" = "+b1.equals(b2));
	//  boolean equalsRange(java.util.List<?>, int, int);
		
	//	public int hashCode();
		
		System.out.println("Hash code of D list: "+D.hashCode());
		System.out.println("Hash code of li list: "+li.hashCode());
	
	//  int hashCodeRange(int, int);
	//  public boolean remove(java.lang.Object);
	//  public void clear();
		D.clear();
		System.out.println("D list after clearing all: "+D);
	//	public boolean addAll(java.util.Collection<? extends E>);
	//  public boolean addAll(int, java.util.Collection<? extends E>);
		al.addAll(student);
		System.out.println("New Array size is: "+al.size());
		for(int i=0; i<23; i++)
		{
			System.out.println(al.get(i).toString());
		}
	//	protected void removeRange(int, int);
	//  public boolean removeAll(java.util.Collection<?>);
	//	public boolean retainAll(java.util.Collection<?>);
	//  boolean batchRemove(java.util.Collection<?>, boolean, int, int);
		
		arrayslist E=new arrayslist();
		E.add("Tiger");
		E.add("Leapord");
		E.add("Black Panther");
		E.add("Lion");
		E.add("Wolf");
		E.add("Fox");
		System.out.println("Wildlife Kings: "+E);
		E.removeRange(4, 5);
		System.out.println("After Removing range: "+E);
		E.removeAll(E);
		System.out.println("After Remove all:"+E);
		E.retainAll(E);
		System.out.println(E);
		Collection coll=new ConcurrentLinkedQueue();
		char i;
		for(i='a'; i<='z'; ++i)
		{
			coll.add(i);
		}
		System.out.println("Collection: "+coll);
		ArrayList li1=new ArrayList();
		li1.add('a');
		li1.add('e');
		li1.add('i');
		li1.add('o');
		li1.add('u');
		coll.retainAll(li1);
		System.out.println("Volwes: "+coll);
		//	public java.util.ListIterator<E> listIterator(int);
		ArrayList F=new ArrayList();
		F.add("Bengal Tiger");
		F.add("Chitha");
		F.add("Black Panther");
		F.add("Great Lion");
		F.add("Poller Wolf");
		F.add("Wild Fox");
		System.out.println("Forest wild animals: "+F);
		ListIterator li2=F.listIterator(1);
		for(;li2.hasNext();)
		{
			System.out.println(li2.next());
		}
		for(;li2.hasPrevious();)
		{
			System.out.println(li2.previous());
		}
		//	public java.util.Iterator<E> iterator();
		Iterator li3=F.iterator();
		for(;li3.hasNext();)
		{
			System.out.println(li3.next());
		}
		//	public java.util.List<E> subList(int, int);
		ArrayList G=new ArrayList();
		G.add("Kajal");
		G.add("Anushka");
		G.add("Tamanna");
		G.add("Shruthi");
		G.add("Illeana");
		G.add("Samantha");
		G.add("Rakul preet");
		G.add("Pooja Hegde");
		G.add("Keerthi Suresh");
		G.add("Rashmika");
		System.out.println("Tollywood Top Actress: " +G);
		List li4=G.subList(1, 9);
				System.out.println("Beautiful and Talented Actress"+li4);
	//  public void forEach(java.util.function.Consumer<? super E>);
		ArrayList crop=new ArrayList();
		crop.add("Rice");
		crop.add("Wheat");
		crop.add("Maize/corn");
		crop.add("Groundnut");
		crop.add("Red Gram");
		crop.add("Green Gram");
		crop.add("Jowar");
		System.out.println("Crops in India: "+crop);
		crop.forEach((e)->{System.out.println(e);});
				
	//	public java.util.Spliterator<E> spliterator();
		Spliterator li5=crop.spliterator();
		System.out.println("Spliter List of crops");
		li5.forEachRemaining((n) -> System.out.println(n));
	//	public boolean removeIf(java.util.function.Predicate<? super E>);
	//	boolean removeIf(java.util.function.Predicate<? super E>, int, int);
/*		ArrayList col;
		SamplePredicate<String> filter;
		col=new ArrayList();
		filter= new SamplePredicate<>();
		filter.varc1="White";
		col.add("White");
		col.add("Green");
		col.add("White");
		col.add("Black");
		col.add("Brown");
		col.add("White");
		System.out.println("List of Colors: "+col);
		col.removeIf(filter);
*/
	//	public void replaceAll(java.util.function.UnaryOperator<E>);
	//	public void sort(java.util.Comparator<? super E>);
		
		
	}
	
}
/*

  public java.util.ArrayList(int);
  public java.util.ArrayList();
  public java.util.ArrayList(java.util.Collection<? extends E>);
  public void trimToSize();
  public void ensureCapacity(int);
  public int size();
  public boolean isEmpty();
  public boolean contains(java.lang.Object);
  public int indexOf(java.lang.Object);
  int indexOfRange(java.lang.Object, int, int);
  public int lastIndexOf(java.lang.Object);
  int lastIndexOfRange(java.lang.Object, int, int);
  public java.lang.Object clone();
  public java.lang.Object[] toArray();
  public <T> T[] toArray(T[]);
  E elementData(int);
  static <E> E elementAt(java.lang.Object[], int);
  public E get(int);
  public E set(int, E);
  public boolean add(E);
  public void add(int, E);
  public E remove(int);
  public boolean equals(java.lang.Object);
  boolean equalsRange(java.util.List<?>, int, int);
  public int hashCode();
  int hashCodeRange(int, int);
  public boolean remove(java.lang.Object);
  public void clear();
  public boolean addAll(java.util.Collection<? extends E>);
  public boolean addAll(int, java.util.Collection<? extends E>);
  protected void removeRange(int, int);
  public boolean removeAll(java.util.Collection<?>);
  public boolean retainAll(java.util.Collection<?>);
  boolean batchRemove(java.util.Collection<?>, boolean, int, int);
  public java.util.ListIterator<E> listIterator(int);
  public java.util.ListIterator<E> listIterator();
  public java.util.Iterator<E> iterator();
  public java.util.List<E> subList(int, int);
  public void forEach(java.util.function.Consumer<? super E>);
  public java.util.Spliterator<E> spliterator();
  public boolean removeIf(java.util.function.Predicate<? super E>);
  boolean removeIf(java.util.function.Predicate<? super E>, int, int);
  public void replaceAll(java.util.function.UnaryOperator<E>);
  public void sort(java.util.Comparator<? super E>);
  void checkInvariants();
  static {};
}

C:\Users\vinee>
*/