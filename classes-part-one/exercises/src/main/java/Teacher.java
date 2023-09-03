public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    void setLastName (String aLastName) {
        lastName = aLastName;
    }

    void setSubject(String aSubject) {
        subject = aSubject;
    }

    void setYearsTeaching(int aYearsTeaching) {
        yearsTeaching = aYearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }
}
