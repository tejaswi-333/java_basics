public class StudentSystem {
    public static void main(String[] args) {

        int rno = 3;
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] ages = {20, 21, 19};
        double[] marks = {85.5, 90.0, 78.5};

        double totalMarks = 0;

        System.out.println("--------------------------------------");
        System.out.printf("%-3s | %-10s | %-5s | %-5s%n", "Sno", "NAME", "AGE", "MARKS");
        System.out.println("--------------------------------------");

        for (int i = 0; i < rno; i++) {
            System.out.printf("%-3s | %-10s | %-5d | %-5.2f%n", (i+1), names[i], ages[i], marks[i]);

            totalMarks = totalMarks + marks[i];
        }

        double average = totalMarks / rno;

        System.out.println("--------------------------------------");
        System.out.printf("Average Class Marks: %.2f%n", average);
        System.out.println("--------------------------------------");
    }
}