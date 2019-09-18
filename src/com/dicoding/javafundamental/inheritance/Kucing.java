package com.dicoding.javafundamental.inheritance;

import java.util.Objects;

public class Kucing extends Hewan implements Mamalia {

    private String ras;
    private String habitat;

    public Kucing() {
        super();
        System.out.println("construct Kucing");
    }

    public Kucing(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Kucing ras: " + ras + ", habitat: " + habitat;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Kucing) {
            Kucing other = (Kucing) object;
            return this.ras.equals(other.ras);
        } else {
            return false;
        }
    }

    @Override
    public void makan() {
        System.out.println("Kucing sedang makan");
    }

    public void makan(String food) {
        System.out.println("Kucing makan " + food);
    }
}
