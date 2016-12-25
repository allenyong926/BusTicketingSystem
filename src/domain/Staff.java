/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author ASUS
 */
public class Staff {
    private static String staffId = "s100";
    private String id;
    private String name;
    private String icno;
    private String position;
    private String pwd;
    private String sex;
    private String ph;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private double salary ;
    private String question;
    private String ans;

    public Staff() {
    }

    public Staff(String id, String name, String icno, String position, String pwd, String sex, String ph, String address, String city, String state, String zip, String email, double salary, String question, String ans) {
        this.id = id;
        this.name = name;
        this.icno = icno;
        this.position = position;
        this.pwd = pwd;
        this.sex = sex;
        this.ph = ph;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.salary = salary;
        this.question = question;
        this.ans = ans;
    }

    public static String getStaffId() {
        return staffId;
    }

    public static void setStaffId(String staffId) {
        Staff.staffId = staffId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcno() {
        return icno;
    }

    public void setIcno(String icno) {
        this.icno = icno;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "Staff{" + "id=" + id + ", name=" + name + ", icno=" + icno + ", position=" + position + ", pwd=" + pwd + ", sex=" + sex + ", ph=" + ph + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", email=" + email + ", salary=" + salary + ", question=" + question + ", ans=" + ans + '}';
    }
      
}


