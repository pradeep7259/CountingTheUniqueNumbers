package in.dev.predeep.impl;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import in.dev.predeep.service.CollectionService;

public class CollectionServiceImpl implements CollectionService {

//	private static final List<String> LIST_OF_STRING;
//	private static final Scanner SCANNER;
//
//	static {
//		LIST_OF_STRING = new ArrayList<>();
//		SCANNER = new Scanner(System.in);
//	}
//
//	public void listExamplesOne() {
//
//		try {
//
//			boolean flag = true;
//
//			while (flag) {
//
//				out.println("******************************************");
//				out.println("Press : 1 : Add New Names.");
//				out.println("Press : 2 : See All Names.");
//				out.println("Press : clear: Clear the list.");
//				out.println("Press : stop : Stop the Application.");
//				out.println("------------------------------------------");
//
//				String key = SCANNER.next();
//				String clear = key;
//				String stop = key;
//				switch (key) {
//				case "1":
//
//					out.println("Enter name : ");
//					String userInput = SCANNER.next();
//
//					if (LIST_OF_STRING.contains(userInput) == true) {
//						System.out.println("This name is already existed");
//						break;
//					} else {
//						LIST_OF_STRING.add(userInput);
//						break;
//					}
//
//				case "2":
//					out.println("your mobile number : ");
//					String usermobile = SCANNER.next();
//					boolean flag1=true;
//					if (flag1 == true) {
//						out.println(LIST_OF_STRING.stream().sorted().collect(Collectors.toList()));
//                         break;
//					} else {
//						out.println("please enter your mobile number");
//						break;
//					}
//				
//				case "clear":
//					LIST_OF_STRING.clear();
//					break;
//				case "stop":
//					out.println("------------------ THE END -------------------");
//					flag = false;
//					break;
//				default:
//					out.println("Something Wrong! " + LIST_OF_STRING);
//					break;
//				}
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			SCANNER.close();
//		}
//	}

	private static final List<String> LIST_OF_DETAILS;
	private static final Scanner SCANNER ;
	static {
		LIST_OF_DETAILS = new ArrayList<>();
		SCANNER = new Scanner(System.in);
	}
	public void listExamplesOne() {
		
		try {
			boolean flag = true;
			
			while(flag)
			{
				out.println("press 1: for enter the name");
				out.println("press 2: for see the all names");
				out.println("press 3 : for delete the names lisrt");
				out.println("press 4 : for to end the appliction");
				
				String key= SCANNER.next();
				switch(key) {
				case "1":
					 out.println("enter the name :");
					 String userinput = SCANNER.next();
					 LIST_OF_DETAILS.add(userinput);
					 break ;
				case "2":
					out.println(LIST_OF_DETAILS.stream().sorted().collect(Collectors.toList()));
					 break ;
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
