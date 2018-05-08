package com.example.android.quakereport;

public class Quake {
    private double magnitude;
    private String location;
    private String date;

    public Quake(double magnitude, String location, String date) {
        this.magnitude = magnitude;
        this.location = location;
        this.date = date;
    }

    public double getMagnitude() {
        return this.magnitude;
    }
    public String getLocation() {
        return this.location;
    }
    public String getDate() {
        return this.date;
    }
}
