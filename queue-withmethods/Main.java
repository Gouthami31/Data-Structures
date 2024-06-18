/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.util.Scanner;
public class Main
{
    static int[] queue=new int[5];
	 static int rear=0,front=0,size=5;
	 static void insert( int ele){
	      if(isfull())
	          System.out.println("stack is full");
	      else{
	             queue[rear]=ele;
	             rear++;
	             System.out.println("pushed");
	      }
	  }
	  static boolean isfull(){
	      if(rear==size)
	         return true;
	      else
	         return false;
	  }
	  static void delete(){
	      if(isempty()){
	          System.out.println("stack is empty");
	      }
	      else{
	          System.out.println(queue[rear]);
	          for(int i=0;i<=rear-1;i++)
	             queue[i]=queue[i+1];
	          rear--;
	      }
	  }
	  static boolean isempty(){
	      if(rear==0)
	        return true;
	       else  
	         return false;
	  }
	  
	  static void display(){
	      if(isempty())
	          System.out.println("stack is empty");
	     else
	      for(int i=front;i<=rear-1;i++)
	        System.out.println(queue[i]);
	  }
public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  while(true){
	      System.out.println("1.insert");
	       System.out.println("2.delete");
	        System.out.println("3.display");
	          System.out.println("4.exit");
	         System.out.println("enter your choice");
	         int ch=sc.nextInt();
	         if(ch==1){
	             System.out.println("enter element");
	             int ele=sc.nextInt();
	             insert(ele);
	         }
	         else if(ch==2){
	             delete();
	         }
	         else if(ch==3){
	             display();
	         }
	         else if(ch==4){
	             System.out.println("exit...");
	             break;
	         }
	         else{
	             System.out.println("invalid");
	         }
	    }
   }
}