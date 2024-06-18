/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*import java.util.*;                                  
public class Main
{
	public static void main(String[] args) {
		List<emp> list=new ArrayList<emp>();
		list.add(new emp(1,"gouthu",22000));
		list.add(new emp(2,"tharu",30000));
		list.add(new emp(3,"divya",35000));
		for(emp e:list)
		{
		    e.details();
		}
	}
}
class emp{
    private int id;
    private String name;
    private int salary;
    public emp(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void details(){
        System.out.println("id is "+this.id+" name is "+this.name+ " and salary is "+this.salary);
    }
}*/
                                                                 //using arrays
/*import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] id={1,2,3};
		String[] name={"aaa","bbb","ccc"};
		double[] salary={25000,30000,32000};
		List<emp> list=new ArrayList<emp>();
		for(int i=0;i<=id.length-1;i++)
		{
		    emp e=new emp(id[i],name[i],salary[i]);
		    list.add(e);
		}
		System.out.println("details are:");
		for(emp e:list){
		   e.details();
		}
	}
}
class emp{
    private int id;
    private String name;
    private double salary;
    public emp(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void details(){
        System.out.println("id is "+this.id+" name is "+this.name+ " and salary is "+this.salary);
    }
}*/



/*import java.util.*;                                  // reading input
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 employee details");
		
		List<emp> list=new ArrayList<emp>();
		for(int i=1;i<=3;i++)
		{
		    System.out.println("enter emp "+i+ " details");
		    int id=sc.nextInt();
		    String name=sc.next();
		    Double salary=sc.nextDouble();
		    emp e=new emp(id,name,salary);
		    list.add(e);
		    //e.details();
		}
		System.out.println("details are:");
		for(emp e:list){
		   e.details();
		}
		
	}
}
class emp{
    private int id;
    private String name;
    private double salary;
    public emp(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void details(){
        System.out.println("id is"+this.id+" name is "+this.name+ " and salary is "+this.salary);
    }
}*/



/*import java.util.*;                               // using while loop
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    List<emp> list=new ArrayList<emp>();
	    while(true){
		System.out.println("enter  employee details");
		int id=sc.nextInt();
		String name=sc.next();
		double salary=sc.nextDouble();
		emp e1=new emp(id,name,salary);
		list.add(e1);
		System.out.println("do you want to add another details(y/n):");
		char ch=sc.next().charAt(0);
		if(ch=='n')
		  break;
	    }
		System.out.println("details are:");
		for(emp e:list)
		{
		   e.details();
		}
	}
}
class emp{
    private int id;
    private String name;
    private double salary;
    public emp(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void details(){
        System.out.println("id is "+this.id+" name is "+this.name+ " and salary is "+this.salary);
    }
}*/


import java.util.*;                               // using while loop
public class Main
{
	public static void main(String[] args) {
        List<student> list=new ArrayList<student>();
		list.add(new student(1,"aaa","java",21,"hyd"));
		list.add(new student(2,"bbb","python",22,"mumbai"));
		list.add(new student(3,"ccc",".net",21,"pune"));
		list.add(new student(4,"ddd","c",20,"banglore"));
		System.out.println("student details are:");
		for(student s:list){
		  s.details();
		}
		System.out.println("display only id=102 details:");
		for(student s:list){
		    if(s.getid()==102){
		      s.details();
		    }
		}
		System.out.println("display details of id 102 & 104");
		for(student s:list){
		    if((s.getid()==102) || (s.getid()==104)){
		        s.details();
		    }
		}
		System.out.println("display details of course java");
		for(student s:list){
		   if(s.getCourse()=="java"){
		       s.details();
		   } 
		}
		System.out.println("display count of course .net");
		int count=0;
		for(student s:list)
		{
		    if(s.getCourse()==".net"){
		        count++;
		    }
		}
		 System.out.println(count);
		System.out.println("display details of student of min age");
		int minage=22;
		for(student s:list){
		    if(s.getage()<minage){
		        for(student s:list){
		            s.details();
		      }
		   }
		    
	   }
  }
}
class student{
    private int id;
    private String name;
    private String course;
    private int age;
    private String location;
    public student(int id,String name, String course, int age, String location){
        this.id=id;
        this.name=name;
        this.course=course;
        this.age=age;
        this.location=location;
    }
    public void details(){
        System.out.println(id+","+name+","+course+","+age+","+location);
    }
    public int getid(){
        return this.id;
    }
    public String getCourse(){
        return this.course;
    }
    public int getage(){
        return this.age;
    }
    
}