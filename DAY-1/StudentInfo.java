public class StudentInfo{
    public static void main(String[] args) {
        String name1 = "Amit";
        int age1 = 20;
        double marks1 = 85; 

        String name2 = "Riya";
        int age2 = 21;
        double marks2 = 90;

        String name3 = "Karan";
        int age3 = 22;
        double marks3 = 75;

        double average = (marks1 + marks2 + marks3) / 3;

        System.out.println(name1 + " " + age1 + " " + marks1);
        System.out.println(name2 + " " + age2 + " " + marks2);
        System.out.println(name3 + " " + age3 + " " + marks3);

        System.out.println("Average Marks: " + average);
    }
}
