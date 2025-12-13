import java.util.Scanner;

public class PrimeNum{
    public static void check(int number){
        boolean isPrime = true;
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        check(number);
        sc.close();
    }
}