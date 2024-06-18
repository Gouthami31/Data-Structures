/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

/*public class Main                                      
{
	public static void main(String[] args) {
		int[] arr={4,5,6,3,7,6,7,4,9,1};
		int small=arr[0];
		int big=arr[0];
		for(int i=1;i<=arr.length-1;i++){
		 if(arr[i]<small)                  //small element
		  small=arr[i];
		 if(arr[i]>big)                  // big element
		  big=arr[i];
		}
		System.out.println(big);
		System.out.println(small);
	}
}*/

/*public class Main                                            // big element
{
	public static void main(String[] args) {
		int[] arr={4,5,6,3,7,6,7,4,9,1};
		int big=arr[0];
		for(int i=1;i<=arr.length-1;i++){
		 if(arr[i]>big)
		  big=arr[i];
		}
		System.out.print(big);
	}
}*/

/*public class Main                                            
{
	public static void main(String[] args) {
		char[] arr={'a','b','c','@','1','2','3','$'};
		char ch=arr[0];
		char cha=arr[arr.length-1];
		if(ch>='a'&& ch<='z')                            // checking first element alphabet or not
		 System.out.println("yes alphabet");
		else 
		 System.out.println("not an alphabet");
		if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u')      // checking last element vowel or not
		  System.out.println("yes vowel");
		 else
		  System.out.println("not vowel");
	}
}*/

/*public class Main                                // printing all characters                   
{
	public static void main(String[] args) {
		char[] arr={'a','b','c','@','1','2','3','$'};
		for(int i=0;i<=arr.length-1;i++){
		  System.out.print(arr[i]);
		}
		System.out.println();                  // reverse order
		for(int i=arr.length-1;i>=0;i--)
		 System.out.print(arr[i]);
	}
}*/

/*public class Main                                                                                   
{
	public static void main(String[] args) {
		char[] arr={'a','b','c','@','1','2','3','$'};
		for(int i=0;i<=arr.length-1;i++)
		{
		  char ch=arr[i];  
		 if(ch>='a'&& ch<='z')                 // only alphabets
		   System.out.print(ch);
		 if(ch>='1'&& ch<='9')              // only digits
		   System.out.print(ch);
		}
		
	}
}*/

/*public class Main                                                                                   
{
	public static void main(String[] args) {
		char[] arr={'a','b','c','@','1','2','3','$'};          // counting digits,alphabets,symbols
		int c1=0,c2=0,c3=0;
		for(int i=0;i<=arr.length-1;i++)
		{
		  char ch=arr[i];
		  if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		    c1++;
		  else if(ch>='0'&&ch<='9')
		   c2++;
		  else
		   c3++;
		}
		System.out.println("alphabets count="+c1);
        System.out.println("digits count="+c2);
        System.out.println("symbols count="+c3);
	}
}*/

/*public class Main                                                // only symbols                                                   
{
	public static void main(String[] args) {
		char[] arr={'a','b','c','@','1','2','3','$'};
		for(int i=0;i<=arr.length-1;i++)
		{
		  char ch=arr[i];  
          if(!((ch>='1'&&ch<='9')||(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')))
           System.out.println(ch);
		}
	}
}*/