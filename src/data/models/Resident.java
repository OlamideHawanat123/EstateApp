package data.models;

public class Resident {
    private int id;
    private String fullName;
    private String email;
    private String phone;
    private String houseNumber;
    private String occupation;
    private Resident resident;
    private AccessCode accessCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
