/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/*public class Main
{
	public static void main(String[] args) {
	    int[] arr={1,5,3,7,8,4,4,7,6};
		System.out.println("first element is"+arr[0]);
		System.out.println("length of arrey is"+arr.length);
		System.out.println("last element is"+arr[arr.length-1]);
	}
}*/

/*public class Main                                         // printing first and last element sum
{                                                            // checking first element even or not
	public static void main(String[] args) {
	    int[] arr={1,5,3,7,8,4,4,7,6};
		System.out.println(arr[0]+arr[arr.length-1]);
		if(arr[0]%2==0)
		 System.out.println("even");
		else 
		 System.out.println("odd");
	
	}
}*/

/*public class Main                                // comparing 1 and last element
{
	public static void main(String[] args) {
	    int[] arr={1,5,3,7,8,4,4,7,6};
		if(arr[0]>arr[arr.length-1])
		 System.out.println("first is big");
		else 
		 System.out.println("second is big");
		
 }
}*/

/*public class Main                                    // multiplivation for array element
{
	public static void main(String[] args) {
	    int[] arr={1,5,3,7,8,4,4,7,6};
	    for(int i=1;i<=10;i++)
		System.out.println(arr[5]+"*"+i+"="+(arr[5]*i));
		
 }
}*/

/*public class Main                                        // printing all array elements
{
	public static void main(String[] args) {
	    int[] arr={1,5,3,7,8,4,4,7,6};
	    for(int i=0;i<=arr.length-1;i++)
		 System.out.print(arr[i]);
		System.out.println();
		for(int i=arr.length-1;i>=0;i--)                // reverse order
		 System.out.print(arr[i]);
	}		
}*/

/*public class Main                                    // all even numbers
{
	public static void main(String[] args) {
	    int[] arr={1,5,3,7,8,4,4,7,6};
		for(int i=0;i<=arr.length-1;i++){
		 int n=arr[i];
		 if(n%2==0)
		  System.out.print(n);
	        
    }
  }
}*/
          
/*public class Main                                        // multiplication for all elements
{
	public static void main(String[] args) {
	    int[] arr={1,5,3,7,8,4,4,7,6};
		for(int i=0;i<=arr.length-1;i++){
		 int n=arr[i];
           for(int j=1;j<=10;j++)
	              System.out.println(n+"*"+j+"="+(n*j));
                  
      }
   }
}*/

/*public class Main                                     // factorial of all elements 
{
	public static void main(String[] args) {
	    int[] arr={1,5,3,7,8,4,4,7,6};
		for(int i=0;i<=arr.length-1;i++){
		 int n=arr[i];
		 int fact=1;
		 for(int j=1;j<=n;j++)
		   fact=fact*j;
		 System.out.println(fact);  
		}
	}
}*/

/*public class Main                                           // all prime numbers
{
	public static void main(String[] args) {
	    int[] arr={1,5,3,7,8,4,4,7,6};
		for(int i=0;i<=arr.length-1;i++){
		 int n=arr[i];
		 int count=0;
		 for(int j=1;j<=n;j++){
		   if(n%j==0)
		       count++;
		 }
		 if(count==2)
		   System.out.println(n);
		}
	}
}*/

/*public class Main                                                                 
{
	public static void main(String[] args) {
	    int[] arr={1,5,3,7,8,4,4,7,6};
	    int count=0;
	    int sum=0;
		for(int i=0;i<=arr.length-1;i++){
		 int n=arr[i];
		  if(n%2==0)
		   count++;                                           // counting even numbers
		   sum=sum+n;
	     }                                                  // adding all elements
	    System.out.println(count);
		System.out.println(sum);             
	}
}*/

/*public class Main                                       // perfect numbers                                                             
{
	public static void main(String[] args) {
	    int[] arr={6,28,496,8,3};
		for(int i=0;i<=arr.length-1;i++){
		 int n=arr[i];
		 int sum=0;
		  for(int j=1;j<=n-1;j++){
		    if(n%j==0)
		     sum=sum+j;
		  }
		if(sum==n)
		 System.out.println(n);
		  
		}
	}	   
}*/


/*public class Main{                                      // sum and avg of all elements
    public static void main(String[] args){
        int[] arr={1,3,2,4,5,6};
     float sum=0;
       float avg=0;
        for(int i=0;i<=arr.length-1;i++){
            
         int n=arr[i];
          sum=sum+n;
          avg=sum/arr.length ; 
         
        }
        System.out.println(sum);
        System.out.println(avg);
        
    }
}*/


		   
