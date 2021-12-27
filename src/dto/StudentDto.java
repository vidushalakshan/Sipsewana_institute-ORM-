package dto;

import java.util.Date;

public class StudentDto {
    private String regnum;
    private String studentname;
    private String studentnum;
    private String email;
    private double mobilenum;
    private Date birthday;
    private String gender;
    private String nic;

    public StudentDto() {
    }

    public StudentDto(String regnum, String studentname, String studentnum, String email, double mobilenum, Date birthday, String gender, String nic) {
        this.regnum = regnum;
        this.studentname = studentname;
        this.studentnum = studentnum;
        this.email = email;
        this.mobilenum = mobilenum;
        this.birthday = birthday;
        this.gender = gender;
        this.nic = nic;
    }

    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(String studentnum) {
        this.studentnum = studentnum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(double mobilenum) {
        this.mobilenum = mobilenum;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regnum='" + regnum + '\'' +
                ", studentname='" + studentname + '\'' +
                ", studentnum='" + studentnum + '\'' +
                ", email='" + email + '\'' +
                ", mobilenum=" + mobilenum +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", nic='" + nic + '\'' +
                '}';
    }
}
