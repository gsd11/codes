import java.util.Scanner;
class bank
{
    float balance=1000,c,d;
    float credit_amt=0,debit_amt=0;
    Scanner sc=new Scanner(System.in);

    void credit()
    {   
        System.out.println("Enter the credit amount : ");
        c=sc.nextFloat();
        if(c!=0){
            balance=balance+c;
            System.out.println(" "+ c +"is Credited to your account. ");
            System.out.println(" Your total balance is: "+balance);
        }
        else
        System.out.println("enter valid amount ");
    }
    void debit()
    {
        System.out.println("Enter the debit amount : ");
        d=sc.nextFloat();
        if(balance>d){
            balance=balance-d;
            System.out.println(" "+d+"is debited from your account. ");
            System.out.println(" Your total balance is: "+balance);
        }
        else
        System.out.println("enter valid amount ");
    }
    void tbalance()
    {
        System.out.println(" Your balance is: "+balance);
    }
    public static void main(String args[]){
        boolean quit=false;
        bank b = new bank();
        System.out.println("1. credit amount 2.debit amount  3.check balance 4.exit ");
        System.out.println("Enter your choice:");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        do{
            switch(ch){
                case 1:    
                b.credit(); 
                break;  
                case 2:    
                b.debit();
                break;
                case 3:
                b.tbalance();
                break;
                case 4:
                System.out.println("exiting.....");
                quit=true;
                break;
                default:
                System.out.println("Enter valid choice .....");
                break;
                }    
        }while(!quit);    
    } 
}