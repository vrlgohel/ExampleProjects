package com.redhat;

/**
 * Created by Viral Gohel
 */
public class SuperException extends Exception{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SuperException(String message) {
        super(message);
    }
}
