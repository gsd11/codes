import java.util.Scanner;
public class days {
    public static void main(String args[]){
    	
        boolean quit=false;
        Bank b = new Bank();
        
        do{
            System.out.println("Enter your choice:");
            Scanner sc2=new Scanner(System.in);
            int ch=sc2.nextInt();
            switch(ch){
                case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 8:
                System.out.println("exiting......");
                quit=false;
            default:
                System.out.println("Please enter weekday number between 1-7.");
                break;
        }
    }while(!quit);    
    } 
}