public class copyConstructor {

    int length,breadth;
    copyConstructor(int l,int b){
        length=l;
        breadth=b;
    }
    copyConstructor(copyConstructor r){
        length=r.length;
        breadth=r.breadth;
    }
    void display(){
        System.out.println(length);
        System.out.println(breadth);
    }
    public static void main(String args[]){
        copyConstructor r1=new copyConstructor(5,6);
        copyConstructor r2=new copyConstructor(r1);
        r2.display();
    }
}
