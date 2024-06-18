/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> arr=new ArrayList<Integer>();
	while(true){
	    System.out.println("1.add");
	    System.out.println("2.insert");
	    System.out.println("3.remove");
	    System.out.println("4.display");
	    System.out.println("5.exit");
	    System.out.println("enter your choice");
	    int ch=sc.nextInt();
	    if(ch==1){
	        System.out.println("enter element");
	        int ele=sc.nextInt();
	        arr.add(ele);
	        System.out.println("element added");
	    }
	    else if(ch==2){
	        System.out.println("enter index");
	        int index=sc.nextInt();
	        if(index>=0&&index<=arr.size()){
	            System.out.println("enter element:");
	            int ele=sc.nextInt();
	            arr.add(index,ele);
	            System.out.println("element inserted");
	        }
	        else{
	            System.out.println("invalid index");
	        }
	        
	    }
	    else if(ch==3){
	        System.out.println("enter index to remove:");
	        int index=sc.nextInt();
	        if(index>=0&&index<=arr.size()){
	          arr.remove(index);
	          System.out.println("element removed");
	        }
	        else{
	       System.out.println("invalid index");
	       }
	    }
	    else if(ch==4){
	        for(int i=0;i<arr.size();i++)
	        System.out.println(arr.get(i));
	        
	    }
	    else if(ch==5){
	        System.out.println("exit....");
	     break;   
	    }
	    else{
	        System.out.println("invalid choice");
	        break;
	    }
	}
  }
}
