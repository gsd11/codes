public class strreverse {
    public static void main(String args[]){
        java.util.Scanner sc =new java.util.Scanner(System.in);
        String rev="",str=sc.next();

        for(int i=str.length()-1;i>=0;i--){
             rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
