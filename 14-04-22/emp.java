import java.util.Scanner;

public class emp{
    
     void tsal(){
      int c,f_sal,s_sal,a;
      Scanner sc=new Scanner(System.in);
      System.out.println("average salary");
      c=sc.nextInt();
      System.out.println("Salary of 1st employee");
      f_sal=sc.nextInt();
      System.out.println("Salary of 2rd employee");
      s_sal=sc.nextInt();
      a=f_sal+s_sal;
      a=c*3-a;
       System.out.println("Salary of 3rd employee:"+a);
    }

    public static void main(String args[]){     
        emp e=new emp();
        e.tsal();
        }
}