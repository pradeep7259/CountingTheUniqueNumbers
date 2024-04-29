package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listinterface {



	public static void main(String[] args) {
		
           int no=10;
		for(int i=0;i<no;i++){
			Scanner scanner=new Scanner(System.in);
			System.out.println("fdf");
			System.out.println("enter the name");
			String inputstring=scanner.nextLine();
		    ArrayList<String> arrayList=new ArrayList<>();
		    
              arrayList.add(i, inputstring);
			   System.out.println(arrayList);
		}
		
		
		
		

		//		List<Integer> list=new ArrayList();
		//		list.add(20);
		//		list.add(20);
		//		System.out.println(list);
		//		
		//		List<Integer> list2=new Vector<>();
		//		list2.add(20);
		//		list2.add(20);
		//		System.out.println(list2);
		//		
		//		List<String> list3=new LinkedList<>();
		//		list3.add("sanjay");
		//		list3.add("sanjay");
		//		
		//		System.out.println(list3);
		//		
		//		
		//		Set<Integer> set=new TreeSet<>();
		//		set.add(20);
		//		set.add(20);		
		//		System.out.println(set);

//		List<String> addOne = Arrays.asList("Present Add 1", "Param Add 1");
//		List<String> addTwo = Arrays.asList("Present Add 2", "Param Add 2");
//		List<String> addThree = Arrays.asList("Present Add 3", "Param Add 3");


//		Detailes studentOne = new Detailes(1, "Sam", "9876543210", 'A');
//		Detailes studentTwo = new Detailes(2, "Grace", "9876663210", 'B');
//		Detailes studentThree = new Detailes(3, "Karan", "0123456987", 'A');
//        Detailes s4=new Detailes();
		
//		List<Detailes> list = new ArrayList<>();
//		list.add(studentOne);
//		list.add(studentTwo);
//		list.add(studentThree);
//		list.
		
//		  ArrayList<Detailes> list = new ArrayList<>();
//		  list.add(studentThree);
////		  System.out.println(list.size());
//		  System.out.println(list);
		
//		  Vector<Detailes> vector = new Vector<>();
//		  vector.add(studentOne);
//		  System.out.println(vector);
		 
//		HashSet<Detailes> set = new HashSet<>();
//		set.add(studentOne);
//		set.add(studentOne);
//		System.out.println(set);
		
//		
//		List<Detailes> filterGradA = list.stream()
//				.filter(s -> s.getGrade() == 'A')
//				.collect(Collectors.toList());
//		
//		
////		System.out.println("filterGradA : "+filterGradA);
//		
//		list.stream()
//		.filter(s -> s.getGrade() == 'A')
//		.forEach(s -> System.out.println(s.getGrade()) );
		
		/*for(Detailes runner : list) {
			if(runner.getGrade() != 'B') {
				System.out.println("list : "+runner);
			}
		}*/
		
		
//		ArrayList<String> list = new ArrayList<>();
//		list.add("Ajay");
//		list.add("vijay");
//		list.add("sanjay");
//		list.add("sujay");
//		
//		
//		ArrayList<String> list1 = new ArrayList<>();
//		list1.add("Ajay");
//		list1.add("vijay");
//		list1.add("sanjay");
//		list1.add("sujay");
//		
//		String contactnumber ="987654321";
//            int a=11;	
//            a=2;
            
		
//		System.out.println(list.get(2));
//		System.out.println(list1.toString());
//		
//		System.out.println(list.toString());
//		System.out.println(list.equals(list1));
//		
//		if (list.get(2)=="sanjay") {
//			
//			System.out.println();
//	     	contactnumber="74835695823";
//	     	
//	     	if (contactnumber == "74835695823" ) {
//				
//	     		System.out.println("present");
//			} else {
//
//			}
//			
//			System.out.println(contactnumber);
//			
//			
//		} else {
//              System.out.println(list);
//		}

		
//		Iterator iterator = list.iterator();
//		while(iterator.hasNext())
//		{
////			System.out.println(iterator.next());
//			
////			System.out.println(iterator.hasNext());
//
////			System.out.println(iterator.hashCode());
//
////			System.out.println(iterator.toString());
//
//			System.out.println(iterator.next());
//			
//
//		}
	}

}
