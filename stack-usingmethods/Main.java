/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/*import java.util.*;
import java.util.Scanner;
public class Main
{
    static int[] stk=new int[5];
	 static int top=-1,size=5;
	 static void push( int ele){
	      if(isfull())
	          System.out.println("stack is full");
	      else{
	             top++;
	             stk[top]=ele;
	             System.out.println("pushed");
	      }
	  }
	  static boolean isfull(){
	      if(top==size-1)
	         return true;
	      else
	         return false;
	  }
	  static void pop(){
	      if(isempty()){
	          System.out.println("stack is empty");
	      }
	      else{
	          System.out.println(stk[top]+"popped");
	          top--;
	      }
	  }
	  static boolean isempty(){
	      if(top==-1)
	        return true;
	       else  
	         return false;
	  }
	  static void peek(){
	      if(isempty()){
	          System.out.println("empty");
	      }
	      else{
	         System.out.println(stk[top]+"popped"); 
	      }
	  }
	  static void traverse(){
	      if(isempty())
	          System.out.println("stack is empty");
	     else
	      for(int i=top;i>=0;i--)
	        System.out.println(stk[i]);
	  }
public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  while(true){
	      System.out.println("1.push");
	       System.out.println("2.pop");
	        System.out.println("3.peek");
	         System.out.println("4.traverse");
	          System.out.println("5.exit");
	         System.out.println("enter your choice");
	         int ch=sc.nextInt();
	         if(ch==1){
	             System.out.println("enter element");
	             int ele=sc.nextInt();
	             push(ele);
	         }
	         else if(ch==2){
	             pop();
	         }
	         else if(ch==3){
	             peek();
	         }
	         else if(ch==4){
	             traverse();
	         }
	         else if(ch==5){
	             System.out.println("exit...");
	             break;
	         }
	         else{
	             System.out.println("invalid");
	         }
	    }
   }
}*/
import java.util.Scanner;

public class Main {
    static int[] stk = new int[5];
    static int top = -1;
    static int size = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.traverse");
            System.out.println("5.exit");
            System.out.println("enter your choice");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("enter element");
                int ele = sc.nextInt();
                push(ele);
            } else if (ch == 2) {
                pop();
            } else if (ch == 3) {
                peek();
            } else if (ch == 4) {
                traverse();
            } else if (ch == 5) {
                System.out.println("exit...");
                break;
            } else {
                System.out.println("invalid");
            }
        }
    }

    static void push(int ele) {
        if (isfull())
            System.out.println("stack is full");
        else {
            top++;
            stk[top] = ele;
            System.out.println("pushed");
        }
    }

    static boolean isfull() {
        return top == size - 1;
    }

    static void pop() {
        if (isempty()) {
            System.out.println("stack is empty");
        } else {
            System.out.println(stk[top] + " popped");
            top--;
        }
    }

    static boolean isempty() {
        return top == -1;
    }

    static void peek() {
        if (isempty()) {
            System.out.println("empty");
        } else {
            System.out.println(stk[top] + " peeked");
        }
    }

    static void traverse() {
        if (isempty())
            System.out.println("stack is empty");
        else
            for (int i = top; i >= 0; i--)
                System.out.println(stk[i]);
    }
}

	             