public class Subject
{
    private String name;
    private double grade;

    public String getName() { return name; }
    public void setName(String val) { name = val; }

    public double getGrade() { return grade; }
    public void setGrade(double val) { grade = val; }

    private Subject() {}
    public Subject(String name)
    {
        this.name = name;
    }

    public Subject(String name, double grade)
    {
        this(name);
        this.grade = grade;
    }
}
