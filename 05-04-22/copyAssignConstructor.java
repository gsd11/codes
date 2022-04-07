
public class copyAssignConstructor {

    int length,breadth;
    copyAssignConstructor(int l,int b){
        length=l;
        breadth=b;
    }
    copyAssignConstructor(){
    }
    void display(){
        System.out.println("length:"+length);
        System.out.println("breadth:"+breadth);
    }
    void area(){
        int a=length*breadth;
        System.out.println(a);
    }

    public static void main(String args[]){
        copyAssignConstructor r1=new copyAssignConstructor(5,6);
        System.out.println("Area of rectangle: ");
        r1.area();

        copyAssignConstructor r2=new copyAssignConstructor();
        r2.length=r1.length;
        r2.breadth=r1.breadth;
        r2.display();
    }
}
