public class Course {
    private final String subjectName;
    private final double studentGrade;

    public Course(String subjectName, double studentGrade) {
        this.subjectName = subjectName;
        this.studentGrade = studentGrade >= 0 ? studentGrade : 0;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    @Override
    public String toString() {
        return subjectName;
    }
}
