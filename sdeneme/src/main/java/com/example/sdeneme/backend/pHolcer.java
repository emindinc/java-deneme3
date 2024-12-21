package com.example.sdeneme.backend;

public class pHolcer implements makineler {
    private String isim;
    private boolean calisiyorMu;

    public pHolcer(String isim) {
        this.isim = isim;
        this.calisiyorMu = false;
    }

    @Override
    public void calisiyor() {
        this.calisiyorMu = true;
    }

    @Override
    public void durdur() {
        this.calisiyorMu = false;
    }

    public String getIsim() {
        return isim;
    }

    public boolean isCalisiyorMu() {
        return calisiyorMu;
    }

}
