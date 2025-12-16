package gr.aueb.cf.cf9.ch15.schoolapp;

/**
 * Teacher Java Bean
 */
public class Teacher {
    private String firstname;
    private String lastname;
    private long id;

    public Teacher(){

    }

    public Teacher(String firstname, String lastname, long id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id= " + id + ", firstname= " + firstname + ", lastname = " + lastname;
    }
}
