package com.example.android.quakereport;

import java.text.SimpleDateFormat;

public class Earthquake {

    private String city;
    private double magnitude;
    private long mTimeInMillSeconds;
    private String url;

    public Earthquake(String city, double magnitude, long mTimeInMillSeconds, String url) {
        this.city = city;
        this.magnitude = magnitude;
        this.mTimeInMillSeconds = mTimeInMillSeconds;
        this.url = url;
    }

    public String getCity() {
        return city;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public long getDateTime() {
        return mTimeInMillSeconds;
    }

    public String getUrl() {
        return url;
    }
}
