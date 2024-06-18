/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> list=new ArrayList< >();
	    list.add(10);
	    list.add(12);
	    list.add(15);
	    list.add(18);
	    list.add(20);
		System.out.println(list);
		System.out.println(list.get(2));//to get second index value
		System.out.println(list.size());
		System.out.println(list.remove(1));//removing first index value
		for(int i=0;i<list.size();i++)//using for loop
		System.out.println(list.get(i));
		
	}
}*/
                                            // using for each loop
/*import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> list=new ArrayList< >();
	    list.add(10);
	    list.add(12);
	    list.add(15);
	    list.add(18);
	    list.add(20);
	    for(int item:list) 
	    System.out.println(item);
   }
}*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> list=new ArrayList< >();
	    Scanner sc=new Scanner(System.in);
	    while(true){
	        System.out.println("1.append");
	        System.out.println("2.insert");
	        System.out.println("3.replace");
	        System.out.println("4.remove");
	        System.out.println("5.display");
	        System.out.println("6.sort");
	        System.out.println("7.reverse");
	        System.out.println("8.quit");
	        System.out.println("enter your choice:");
	        int ch=sc.nextInt();
	        if(ch==1)
			{
				System.out.print("Enter element to append : ");
				int ele = sc.nextInt();
				list.add(ele);
				System.out.println("Element added");
			}
			else if(ch==2)
			{
			    System.out.println("enter index");
			    int index=sc.nextInt();
			    if(index>0&&index<=list.size()-1){
			        System.out.println("enter elemenet");
			        int ele=sc.nextInt();
			        list.add(index,ele);
			    }
			    else
			    System.out.println("no location");
			    
			}

	        
	        
	    }
	}
}