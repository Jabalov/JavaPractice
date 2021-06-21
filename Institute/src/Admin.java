import java.util.List;

public class Admin
{
    private String name;
    private Contact contact;
    private String role;

    public String getName() { return name; }
    public void setName(String val) { name = val ;}

    public Contact getContact() { return contact; }
    public void setContact(Contact val) { contact = val ;}

    public String getRole() { return role; }
    public void setRole(String val) { role = val ;}

    private Admin() {}
    public Admin(String name, Contact contact, String role)
    {
        this.name = name;
        this.contact = contact;
        this.role = role;
    }

}
