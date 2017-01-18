package com.redhat;

/**
 * Created by Viral Gohel
 */
public class MyException extends SuperException{
    private String from;
    private String summary;

    public void setFrom(String from) {
        this.from = from;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getFrom() {
        return from;
    }

    public String getSummary() {
        return summary;
    }

    public MyException(String message) {
        super(message);
    }

}
