package com.example.sdeneme.backend;

public class kimyasalDataBse {
    private String isim;
    private float pH;

    public kimyasalDataBse(String isim, float pH) {
        this.isim = isim;
        this.pH = pH;
    }

    public String getIsim() {
        return isim;
    }

    public float getpH() {
        return pH;
    }

    @Override
    public String toString() {
        return isim + " (pH: " + pH + ")";
    }
}

