//constructor overloading program
public class rect {

    int length,breadth;
    rect(int l,int b){
        length=l;
        breadth=b;
    }
    rect(int s){
        length=breadth=s;
    }

    void area(){
        int a=length*breadth;
        System.out.println(a);
    }

    public static void main(String args[]){
        rect r1=new rect(5,6);
        System.out.println("Area of rectangle: ");
        r1.area();

        rect r2=new rect(4);
        System.out.println("Area of square: ");
        r2.area();
    }
}
