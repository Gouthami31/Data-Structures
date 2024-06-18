/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/*public class Main
{
	public static void main(String[] args) {
		int a=10;
		demo.test(a);
	}
}
class demo{
    static void test(int x){
      System.out.println(x);
    }
}*/


/*public class Main                                      //method calling using array
{
	public static void main(String[] args) {
		int[] a={2,3,4,5,6,7};
		demo.test(a);
	}
}
class demo{
    static void test(int[] x){
      for(int n : x)
        System.out.println(n);
    }
}*/

/*public class Main             // call by reference (calling addresses)                                 
{
	public static void main(String[] args) {
		int[] a={2,3,4,5,6,7};
		demo.test(a);
		for(int n:a)
		  System.out.print(n+",");
	}
}
class demo{
    static void test(int[] x){
     for(int i=0;i<=x.length-1;i++)
       x[i]=x[i]+5;                      // adding 5 to each element
     for(int n : x)
        System.out.print(n+",");
    System.out.println();
    }
}*/

/*public class Main
{
	public static void main(String[] args) {
		int a=10;
		demo.test(a);
		System.out.print(a);
	}
}
class demo{
    static void test(int x){
        x=20;
      System.out.println(x);
    }
}*/

/*public class Main                        // giving value in second class then returning using class name
{
	public static void main(String[] args) {
	  int a =demo.give();
	   System.out.println(a);
	}
}
class demo{
    static int give( ){
      int x=10;
      return x;
    }
}*/

/*public class Main                        // giving value in second class then returning using class name
{
	public static void main(String[] args) {
	  int[] a =demo.give();
	  for(int n:a)
	   System.out.print(n+",");
	}
}
class demo{
    static int[] give( ){
      int[] x={10,5,8,3,7,9};
      return x;
    }
}*/
                                                // counting no.of words in a string based on the spaces
/*public class Main{                         
    public static void main(String[] args){
        String s="this is code class";
        int count=0;
        for(int i=0;i<=s.length()-1;i++){
          if(s.charAt(i)==' ')
            count++;
        }
        System.out.print(count+1);
    }
        
 }*/
 
public class Main{                         
    public static void main(String[] args){
        String s="this is a line of code";
        String[] arr=s.split(" ");// spliting into words and storing in a array
         System.out.println(arr.length); // print the length of array
        // printing each word in reverse order
        for(String n:arr){
        for(int i=n.length()-1;i>=0;i--)
           System.out.print(n.charAt(i));
        
        System.out.println();
        }
    }
}

 