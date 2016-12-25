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
public class Schedule {
    private String busNo;
    private String date;
    private double price;
    private String time;
    private int numOfSeat;
    private String pointOfDeparture;
    private String destination;

    public Schedule() {
    }

    public Schedule(String busNo, String date, double price, String time, int numOfSeat, String pointOfDeparture, String destination) {
        this.busNo = busNo;
        this.date = date;
        this.price = price;
        this.time = time;
        this.numOfSeat = numOfSeat;
        this.pointOfDeparture = pointOfDeparture;
        this.destination = destination;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public String getPointOfDeparture() {
        return pointOfDeparture;
    }

    public void setPointOfDeparture(String pointOfDeparture) {
        this.pointOfDeparture = pointOfDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Schedule{" + "busNo=" + busNo + ", date=" + date + ", price=" + price + ", time=" + time + ", numOfSeat=" + numOfSeat + ", pointOfDeparture=" + pointOfDeparture + ", destination=" + destination + '}';
    }
    
}
