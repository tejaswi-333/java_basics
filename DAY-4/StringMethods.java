public class StringMethods{
public static void main(String[]args){
    String s1="Python";
    String s2="Java";
    System.out.println(s1.equals(s2));
    System.out.println(s1==s2);

    String s3="java";
    String s4="JAVA";
    System.out.println(s3.equalsIgnoreCase(s4));

}
}