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
public class Bus {
    private String busNo;
    private String busPlateNo;
    private String busType;
    private int numOfSeat;

    public Bus() {
    }

    public Bus(String busNo, String busPlateNo, String busType, int numOfSeat) {
        this.busNo = busNo;
        this.busPlateNo = busPlateNo;
        this.busType = busType;
        this.numOfSeat = numOfSeat;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public String getBusPlateNo() {
        return busPlateNo;
    }

    public void setBusPlateNo(String busPlateNo) {
        this.busPlateNo = busPlateNo;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    @Override
    public String toString() {
        return "Bus{" + "busNo=" + busNo + ", busPlateNo=" + busPlateNo + ", busType=" + busType + ", numOfSeat=" + numOfSeat + '}';
    }
    
}
