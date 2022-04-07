import java.util.Scanner;

class area
{
    void calculateArea(float x)
    {
        System.out.println("Area of the square: "+x*x);
    }
    void calculateArea(float x, float y)
    {
        System.out.println("Area of the rectangle: "+x*y);
    }
    void calculateArea(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle: "+area);
    }
    public static void main(String args[]){
        area a = new area();
        System.out.println("1. square 2. rectangle 3. circle");
        System.out.println("Enter your choice:");
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int ch=sc.nextInt();
    switch(ch){
 
            case 1:    
            a.calculateArea(6.1f);
              
             break;  
            case 2:    
            a.calculateArea(10,22);
              
             break;
            case 3:
            a.calculateArea(6.1); 
                break;
            default:     
            System.out.println("wrong case no.");
            }    
       
    }
	 
    }