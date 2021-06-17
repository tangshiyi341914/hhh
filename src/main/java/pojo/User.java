package pojo;

import java.sql.Date;

public class User {
    String Uid;
    String Uname;
    String Password;
    String Gender;
    int Age;
    String Role;
    Date Add_time;

    public User() {
    }

    public User(String uid, String uname, String password, String gender, int age, String role, Date add_time) {
        Uid = uid;
        Uname = uname;
        Password = password;
        Gender = gender;
        Age = age;
        Role = role;
        Add_time = add_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "Uid='" + Uid + '\'' +
                ", Uname='" + Uname + '\'' +
                ", Password='" + Password + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                ", Role='" + Role + '\'' +
                ", Add_time=" + Add_time +
                '}';
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public Date getAdd_time() {
        return Add_time;
    }

    public void setAdd_time(Date add_time) {
        Add_time = add_time;
    }
}
