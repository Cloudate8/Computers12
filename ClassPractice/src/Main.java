public class Main {
    public static void main(String[] args) {
        System.out.println("Test cases");
        Student student = new Student("John Doe");
        student.addCourse(new Course("Math", 90.5));
        student.addCourse(new Course("English", 80));
        student.addCourse(new Course("Science", 70));
        student.addCourse(new Course("History", 60));
        student.addCourse(new Course("Geography", 50));
        student.addCourse(new Course("Art", 40));
        student.addCourse(new Course("Music", 30));
        student.addCourse(new Course("Physical Education", 20));
        student.addCourse(new Course("Computer Science", 10));
        student.addCourse(new Course("Drama", 0));
        System.out.println(student);
        System.out.println("Average: " + student.getAverage());
        System.out.println("Courses:");
        student.printCourses();

        Student student2 = new Student("Jane Doe");
        student2.addCourse(new Course("Math", 90));
        student2.addCourse(new Course("English", 80));
        student2.addCourse(new Course("Science", 70));
        student2.addCourse(new Course("History", 60));
        student2.addCourse(new Course("Geography", 50));
        student2.addCourse(new Course("Art", 40));
        student2.addCourse(new Course("Music", 30));
        student2.addCourse(new Course("Physical Education", 20));
        student2.addCourse(new Course("Computer Science", 10));
        student2.addCourse(new Course("Drama", -20));
        System.out.println(student2);
        System.out.println("Average: " + student2.getAverage());
        System.out.println("Courses:");
        student2.printCourses();

        Student student3 = new Student("Jack Doe");
        student3.addCourse(new Course("Math", 100));
        student3.addCourse(new Course("English", 90));
        student3.addCourse(new Course("Science", 80));
        student3.addCourse(new Course("History", 70));
        student3.addCourse(new Course("Geography", 60));
        student3.addCourse(new Course("Art", 50));
        student3.addCourse(new Course("Music", 40));
        student3.addCourse(new Course("Physical Education", 30));
        student3.addCourse(new Course("Computer Science", 20));
        student3.addCourse(new Course("Drama", 10));
        System.out.println(student3);
        System.out.println("Average: " + student3.getAverage());
        System.out.println("Courses:");
        student3.printCourses();
    }
}
