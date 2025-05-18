package data.models;

import java.time.LocalDate;

public class AccessCode {
    private int id;
    private String code;
    private String otp;
    private LocalDate createdAt;
    private LocalDate expiryDate;
    private Resident resident;
    private Visitor visitor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
//        this.visitor = visitor;
    }

    public Resident getResident(){
        return resident;
    }

    public void setResident(Resident resident){
//        this.resident = resident;
    }
}
