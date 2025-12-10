import java.util.Arrays;

public class Datatypes {
    public static void main (String args[]){

        // Primitive data types
        byte val1=100; 
        short val2=1000;
        int val3=10;
        long val4=100000L;
        float val5=123.4f;
        double val6=123.44;
        boolean val7=true;
        char val8='t';
        
        System.out.println("Primitive data types: "); 
        System.out.println("Byte: " + val1);
        System.out.println("Short: " + val2);
        System.out.println("Int: " + val3);
        System.out.println("Long: " + val4);
        System.out.println("Float: " + val5);
        System.out.println("Double: " + val6);
        System.out.println("Boolean: " + val7);
        System.out.println("Char: " + val8);
        
        // Non-primitive data types
        String val9="Hello guys!";
        int arr[] ={2,5,22,5,21,56};

        System.out.println("\nNon-primitive data types: ");
        System.out.println("String: " + val9);
        System.out.println("Array: " + Arrays.toString(arr));
    }
}

