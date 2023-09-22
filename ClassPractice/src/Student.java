import java.util.ArrayList;

public class Student {

    private final String name;
    private final int studentID;
    private final ArrayList<Course> courses;

    public static int latestStudentId = 1;
    public static int studentIdGenerator() {
        return latestStudentId++;
    }

    public Student(String name) {
        this.name = name;
        this.studentID = studentIdGenerator();
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    
    public double getAverage() {
        double total = 0;
        for (Course course : courses) {
            total += course.getStudentGrade();
        }
        return total / courses.size();
    }
    
    public void printCourses() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }
    
    @Override
    public String toString() {
        return name + " (" + studentID + ")";
    }
}
