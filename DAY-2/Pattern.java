import java.util.Scanner;

public class Pattern {
    public static void printPattern(int rows) {

        for(int i=1; i<=rows; i++){                     // Outer loop rows
            for(int space=1; space<=rows-i; space++){   // inner loop columns
                System.out.print(" ");
            }
            for(int star=1; star<=i; star++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=rows-1; i>=1; i--){
            for(int space=1; space<=rows-i; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=i; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        printPattern(rows);

        sc.close();

    }
}
