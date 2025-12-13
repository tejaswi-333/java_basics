import java.util.Scanner;

public class EvenOrOdd{
    public static String evenorodd(int number){
        if(number==0){
            return "not defined";
        }
        else if (number%2==0) {
            return number+" is Even";
        }
        else{
            return number+" is Odd";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=sc.nextInt();
        System.out.println(evenorodd(number));
        sc.close();
    }
}