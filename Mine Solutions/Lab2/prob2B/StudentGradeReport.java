package Lab2.prob2B;

public class StudentGradeReport {
    public static Student createStudent(String name) {
        Student student = new Student(name);
        GradeReport gradeReport = new GradeReport();
        student.setGradeReport(gradeReport);
        gradeReport.setStudent(student);
        return student;
    }
}
