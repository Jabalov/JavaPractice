import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List<Subject> subjectsForStudent1 = new ArrayList<Subject>();
        subjectsForStudent1.add(new Subject("Data Structures", 70));
        subjectsForStudent1.add(new Subject("Java", 90));

        List<Subject> subjectsForInstructor = new ArrayList<Subject>();
        subjectsForInstructor.add(new Subject("DSA"));
        subjectsForInstructor.add(new Subject("Spark"));

        List<Student> students = new ArrayList<Student>();
        Student muhammed = new Student("Muhammed", "111", subjectsForStudent1);
        students.add(muhammed);

        List<OfficeHours> officeHours = new ArrayList<OfficeHours>();
        officeHours.add(new OfficeHours("Monday", "10pm", "12pm"));

        List<Instructor> instructors = new ArrayList<Instructor>();
        Instructor salah = new Instructor("Saleh", officeHours, subjectsForInstructor);
        instructors.add(salah);

        Admin admin = new Admin("Waleed", new Contact("Tanta", "011", "Waleed@gmail.com"), "Admin");

        Inistitute inistitute = new Inistitute("ITI", students, instructors, admin);
        inistitute.getInstructorInfo(salah);
        inistitute.getStudentGrades(muhammed);
    }
}
