public class MethodOverload {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();

        System.out.println("Sum of integers: " + obj.add(5, 10));
        System.out.println("Sum of doubles: " + obj.add(5.5, 10.5));
        System.out.println("Concatenation of strings: " + obj.add("Hello, ", "World!"));
    }
}