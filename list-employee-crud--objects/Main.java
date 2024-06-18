/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class employee{
    private int id;
    private String name;
    private double sal;
    public employee(int id,String name,double sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    public void display(){
        System.out.println( "empid:,"+id+ " empname:"+name+ " empsal:"+sal);
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name ){
        this.name=name;
    }
    public double getsal(){
        return this.sal;
    }
    public void setsal(double sal){
        this.sal=sal;
    }
    
   
}
public class Main
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   ArrayList<employee>list=new ArrayList<>();
   while(true){
       System.out.println("1.add ");
       System.out.println("2.remove");
       System.out.println("3.display");
       System.out.println("4.update");
       System.out.println("5.exit");
       System.out.println("enter your choice");
       int ch=sc.nextInt();
       if(ch==1){
           System.out.println("enter employee details");
           int id=sc.nextInt();
           String name=sc.next();
           double sal=sc.nextDouble();
           employee e=new employee(id,name,sal);
           list.add(e);
           System.out.println("employee added");
       }
       else if(ch==2){
          System.out.println("enter emp id:");
          int id=sc.nextInt();
          for(employee e:list)
          {
              if(e.getId()==id){
                  list.remove(e);
                  System.out.println("removed succesfully");
                  break;
              }
          }
       }
       else if(ch==3){
          System.out.println("enter emp id:");
          int id=sc.nextInt();
          for(employee e:list)
          {
              if(e.getId()==id){
                  e.display();
                  break;
              } 
          }
        }
        else if(ch==4){
           System.out.println("enter emp id,name:");
          int id=sc.nextInt();
          String name=sc.next();
          for(employee e:list)
          {
              if(e.getId()==id){
                  e.setId(id);
                  e.setName(name);
                  System.out.println("details updated succesfully");
                  break;
              } 
          } 
        }
        else if(ch==5){
            System.out.println("exiting...");
            break;
        }
        else{
            System.out.println("invalid choice");
            break;
        }
    }
  }
}
