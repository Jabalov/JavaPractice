import java.util.ArrayList;
import java.util.List;

public class Student
{
    private String name;
    private String id;
    private List<Subject> subjects = null;

    public String getName() { return name; }
    public void setName(String val) {name = val;}

    public String getId() { return id; }
    public void setId(String val) { id = val; }

    public List<Subject> getSubjects() { return subjects; }
    public void setSubjects(List<Subject> val) {subjects = val;}

    private Student(){}
    public Student(String name, String id, List<Subject> subjects)
    {
        this.name = name;
        this.id = id;
        this.subjects = subjects;
    }

    public void getTotalMarks()
    {
        int numberOfSubjects = subjects.size();
        double total = 0;
        for(Subject subject : subjects)
            total += subject.getGrade();

        total /= numberOfSubjects;
        System.out.println("For Student: " + this.getName());
        System.out.println("Total Grades Are: " + total);
    }
}