/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/*public class Main                                 //  swaping (i)th and (i+1)th location
{
	public static void main(String[] args) {
		int[] arr={20,80,60,40,70};
		int i=0;
		int x=arr[i];
		arr[i]=arr[i+1];
	    arr[i+1]=x;
	    for(int j=0;j<=arr.length-1;j++)
	      System.out.print(arr[j]+",");
	}
}*/

/*public class Main                                 //  swaping (i)th > (i+1)th location then swap
{
	public static void main(String[] args) {
		int[] arr={20,80,60,40,70};
		int i=0;
		if(arr[i]>arr[i+1]){
		int x=arr[i];
		arr[i]=arr[i+1];
	    arr[i+1]=x;
		}
	    for(int j=0;j<=arr.length-1;j++)
	      System.out.print(arr[j]+",");
	}
}*/

/*public class Main                                 //  swaping (i)th and (i+1)th location if ith>i+1th
{
	public static void main(String[] args) {
		int[] arr={20,80,60,40,70};
		for(int i=0;i<=3;i++){
		    if(arr[i]>arr[i+1]){
                int x=arr[i];
		       arr[i]=arr[i+1];
	            arr[i+1]=x;
	    	}
		}
	    for(int j=0;j<=arr.length-1;j++)
	      System.out.print(arr[j]+",");
	}
}*/

/*public class Main                                 //swaping all elements based on condition
{
	public static void main(String[] args) {
		int[] arr={20,80,60,40,70};
		int n=arr.length;
		for(int i=0;i<=n-2;i++)
		{
		 for(int j=0;j<=n-2;j++)
		 {
		   if(arr[i]>arr[i+1]){
	            	int x=arr[i];
	            	arr[i]=arr[i+1];
	                arr[i+1]=x;
		   }
		 }
		}
	    for(int i=0;i<=arr.length-1;i++)
	      System.out.print(arr[i]+",");
	}
}*/

/*import java.util.Scanner;
public class Main
{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of array");// reading size of array
      int n=sc.nextInt();
      int arr[]=new int[n];           // memory allocation
      System.out.println("enter "+n+" elements" );
      for(int i=0;i<=arr.length-1;i++)          // reading  array elements
        arr[i]=sc.nextInt();
      for(int i=0;i<=arr.length-1;i++) 
        System.out.print(arr[i]+",");
  }  
}*/

public class Main
{
    public static void main(String[] args)
    {
        int[] arr={7,2,4,8,9,1,5,6,3};
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0)
              count++;
        }
        int[] evens=new int[count]; // even arry
        int[] odds=new int[arr.length-count];// odd array
        int x=0;
        int y=0;
         for(int i=0;i<=arr.length-1;i++){            // for even array
            if(arr[i]%2==0){
                evens[x]=arr[i];
                x++;
            }
         }
         for(int i=0;i<=arr.length-1;i++){         // for odd array
            if(arr[i]%2!=0){
                odds[y]=arr[i];
                y++;
            }
         }
         for(int i=0;i<=evens.length-1;i++) //printng even array elements
            System.out.print(evens[i]);
        System.out.println();
         for(int i=0;i<=odds.length-1;i++)// odd array printing
            System.out.print(odds[i]);   
    }
} 
 
















