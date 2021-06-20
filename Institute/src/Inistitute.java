import java.util.ArrayList;
import java.util.List;

public class Inistitute
{
    public String name;
    public List<Student> students = new ArrayList<Student>();
    public List<Instructor> instructors = new ArrayList<Instructor>();
    public Admin admin;

    public Inistitute(String name, List<Student> students, List<Instructor> instructors, Admin admin)
    {
        this.name = name;
        this.students = students;
        this.instructors = instructors;
        this.admin = admin;
    }

    public void getInstructorInfo(Instructor instructor)
    {
        Boolean answer = instructors.contains(instructor);

        if(!answer)
            System.out.println("This Instructor Doesn't exist!");
        else
        {
            System.out.println("Name " + instructor.getName() + "\n");
            instructor.getSubjectsNames();
            instructor.getOfficeHoursDetailed();
        }
    }

    public void getStudentGrades(Student student)
    {
        Boolean answer = students.contains(student);

        if(!answer)
            System.out.println("This Student Doesn't exist!");
        else {
            student.getTotalMarks();
        }
    }
}
