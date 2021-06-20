public class Contact
{
    private String address;
    private String phone;
    private String email;

    public String getAddress() { return address; }
    public void setAddress(String val) { address = val ;}

    public String getPhone() { return phone; }
    public void setPhone(String val) { phone = val ;}

    public String getEmail() { return email; }
    public void setEmail(String val) { email = val ;}

    private Contact() {}
    public Contact(String address, String phone, String email)
    {
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

}
