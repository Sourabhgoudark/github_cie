class Student extends DateOfBirth {
    private String name;

    public Student(String name, String birthDate) {
        super(birthDate);
        this.name = name;
    }
    public void displayInfo(String currentDate) {
        int age = calculateAge(currentDate);
        System.out.println("Name: " + name + ", Age: " + age);
    }
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "2000-05-15");
        student1.displayInfo("2024-03-31");

        Student student2 = new Student("Alice", "2002-10-20");
        student2.displayInfo("2024-03-31");
    }
}
}