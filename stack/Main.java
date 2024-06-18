/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int[] stk=new int[5];
	   int top=-1,size=5;
	  while(true){
	      System.out.println("1.push");
	       System.out.println("2.pop");
	        System.out.println("3.peek");
	         System.out.println("4.traverse");
	          System.out.println("5.exit");
	         System.out.println("enter your choice");
	         int ch=sc.nextInt();
	         if(ch==1){
	             System.out.println("enter element:");
	             int ele=sc.nextInt();
	             if(top==size-1)
	               System.out.println("stack is full");
	             else{
	                 top++;
	                 stk[top]=ele;
	                 System.out.println("element is popped");
	             }
	         }
	         else if(ch==2){
	             if(top==-1)
	               System.out.println("empty");
	             else{
	               System.out.println(stk[top]+"popped");
	                top--;
	             }
	         }
	        else if(ch==3){
	            if(top==-1)
	               System.out.println("empty");
	             else{
	               System.out.println(stk[top]+"popped");
	             }
	        }
	        else if(ch==4){
	            if(top==-1){
	               System.out.println("empty");
	            }
	            else{
	                for(int i=top;i>=0;i--)
	                  System.out.println(stk[i]);
	            }
	        }
	        else if(ch==5){
	            System.out.println("exit");
	            break;
	        }
	        else{
	            System.out.println("invalid choice");
	            break;
	        }
	         
	  }
	}
}
