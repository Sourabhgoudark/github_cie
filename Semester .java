package github_cie;
import java.util.HashMap;
import java.util.Map;

class Semester {
    private String semesterName;
    private Map<String, Integer> courses;

    public Semester(String semesterName) {
        this.semesterName = semesterName;
        this.courses = new HashMap<>();
    }

    public void addCourse(String courseName, int marks) {
        courses.put(courseName, marks);
    }

    public void displayCourses() {
        System.out.println("Semester: " + semesterName);
        if (courses.isEmpty()) {
            System.out.println("No courses added yet.");
        } else {
            for (Map.Entry<String, Integer> entry : courses.entrySet()) {
                System.out.println("Course: " + entry.getKey() + ", Marks: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Semester semester1 = new Semester("Semester 1");
        semester1.addCourse("Java", 85);
        semester1.addCourse("python", 78);
        semester1.addCourse("c++", 92);

        Semester semester2 = new Semester("Semester 2");
        semester2.addCourse("Computer Science", 88);
        semester2.addCourse("maths", 79);

        semester1.displayCourses();
        System.out.println();
        semester2.displayCourses();
    }
}
