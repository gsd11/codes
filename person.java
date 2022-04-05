
public class person {
    String name,address;
    int age;
      void printperson(String name,int age,String address) {
      System.out.println("name  : " + name );
      System.out.println("age :" + age);
      System.out.println("address:"+address);
   }

   public static void main(String args[]) {
      person p = new person();
      p.printperson("Gaurav",22,"kalyan");
   }
}