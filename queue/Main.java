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
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int[] queue=new int[5];
	   int rear=0,front=0;
	   int size=5;
	  while(true){
	      System.out.println("1.insert");
	       System.out.println("2.delete");
	        System.out.println("3.display");
	          System.out.println("4.exit");
	         System.out.println("enter your choice");
	         int ch=sc.nextInt();
	         if(ch==1){
	             System.out.println("enter element:");
	             int ele=sc.nextInt();
	             queue[rear]=ele;
	             rear++;
	             if(rear==size)
	                System.out.println("full");
	         }
	         else if(ch==2){
	             if(rear==0)
	               System.out.println("empty");
	             else
	             {
	                 System.out.println(queue[rear]);
	                 for(int i=0;i<=rear-1;i++)
	                   queue[i]=queue[i+1];
	                 rear--;
	             }
	         }
	         else if(ch==3){
	             if(rear==0)
	               System.out.println("empty");
	           else
	           {
	               for(int i=front;i<=rear-1;i++)
	                 System.out.println(queue[i]);
	           }
	         }
	         else if(ch==4){
	             System.out.println("exit...");
	         }
	         else
	           {
	               System.out.println("invalid");
	               break;
	           }
	  }
	}
}
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             