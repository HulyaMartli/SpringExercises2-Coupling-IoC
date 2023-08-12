package org.hulyam;

import java.io.Serializable;

public class EjbSample implements Serializable {

    /*
     * Enterprise Java Bean must include:
     * Public noargs constructor
     * Getters & Setters
     * Implements Serializable
     */
    public EjbSample() {

    }

    String text;
    int number;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
