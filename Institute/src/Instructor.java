import java.util.List;

public class Instructor
{
    private String name;
    private List<OfficeHours> officeHours = null;
    private List<Subject> subjects = null;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public List<OfficeHours> getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(List<OfficeHours> officeHours) {
        this.officeHours = officeHours;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void getSubjectsNames()
    {
        for (Subject subject : subjects)
            System.out.println(subject.getName() + " ");
    }


    public void getOfficeHoursDetailed()
    {
        for(OfficeHours hours: officeHours)
            System.out.println(hours.getDate() + " " + hours.getFrom() + " " + hours.getTo());
    }

    private Instructor(){}
    public  Instructor(String name, List<OfficeHours> officeHours, List<Subject> subjects)
    {
        this.name = name;
        this.officeHours = officeHours;
        this.subjects = subjects;
    }

}
