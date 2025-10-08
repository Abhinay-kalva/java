import java.util.Scanner;
@FunctionalInterface
interface rev{
String reveString(String Str);
    
}
class pi{
    public static void main(String []args){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
rev reveStringrRev =Str->new StringBuilder(Str).reverse().toString();
System.out.println(reveStringrRev.reveString(a));
    }
}