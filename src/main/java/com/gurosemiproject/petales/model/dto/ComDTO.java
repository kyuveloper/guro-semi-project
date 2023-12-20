package com.gurosemiproject.petales.model.dto;

public class ComDTO {
    private int comCode;
    private String comName;
    private  double comLat;
    private double comLon;

    public ComDTO() {
    }

    public ComDTO(int comCode, String comName, double comLat, double comLon) {
        this.comCode = comCode;
        this.comName = comName;
        this.comLat = comLat;
        this.comLon = comLon;
    }

    public int getComCode() {
        return comCode;
    }

    public void setComCode(int comCode) {
        this.comCode = comCode;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public double getComLat() {
        return comLat;
    }

    public void setComLat(double comLat) {
        this.comLat = comLat;
    }

    public double getComLon() {
        return comLon;
    }

    public void setComLon(double comLon) {
        this.comLon = comLon;
    }

    @Override
    public String toString() {
        return "ComDTO{" +
                "comCode=" + comCode +
                ", comName='" + comName + '\'' +
                ", comLat=" + comLat +
                ", comLon=" + comLon +
                '}';
    }
}
