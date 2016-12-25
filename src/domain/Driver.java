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
public class Driver {
    private String name;
    private String sex;
    private String ph;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String busplateno;
    private String icno;
    private double salary ;

    public Driver() {
    }

    public Driver(String name, String sex, String ph, String address, String city, String state, String zip, String email, String busplateno, String icno, double salary) {
        this.name = name;
        this.sex = sex;
        this.ph = ph;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.busplateno = busplateno;
        this.icno = icno;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getBusplateno() {
        return busplateno;
    }

    public void setBusplateno(String busplateno) {
        this.busplateno = busplateno;
    }

    public String getIcno() {
        return icno;
    }

    public void setIcno(String icno) {
        this.icno = icno;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Driver{" + "name=" + name + ", sex=" + sex + ", ph=" + ph + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", email=" + email + ", busplateno=" + busplateno + ", icno=" + icno + ", salary=" + salary + '}';
    }
      
}
