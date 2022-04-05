class paraConstructor
{  
    int a,b,c;
    paraConstructor(int a1,int b1)
  {
    a=a1;
    b=b1;
    c=a+b;
  }  
  void display(){
    System.out.println("Total of"+" "+a+"+"+b+"="+c);
  }
  public static void main(String args[])
  {  
    paraConstructor c =new paraConstructor(10,5);  
    c.display();
  }  
} 