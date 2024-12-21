package com.example.sdeneme.backend;

import java.util.ArrayList;

public class kimyasallar {
    // Asitler, Bazlar ve Bileşikler listeleri
    public ArrayList<kimyasalDataBse> asitler = new ArrayList<>() {{
        add(new kimyasalDataBse("HCl", 1.0f));
        add(new kimyasalDataBse("H2SO4", 1.2f));
    }};

    public ArrayList<kimyasalDataBse> bazlar = new ArrayList<>() {{
        add(new kimyasalDataBse("NaOH", 13.0f));
        add(new kimyasalDataBse("KOH", 14.0f));
    }};

    ArrayList<kimyasalDataBse> bilesikler = new ArrayList<>();

    // Kimyasal grupları genel bir listede saklıyoruz
    ArrayList<ArrayList<kimyasalDataBse>> kimyasalListesi = new ArrayList<>() {{
        add(asitler);
        add(bazlar);
    }};

    public kimyasallar() {
    }

    // Yeni bir kimyasal eklemek için metot
    public void kimyasalEkle(String isim, float pH, String tip) {
        kimyasalDataBse yeniKimyasal = new kimyasalDataBse(isim, pH);
        if (tip.equalsIgnoreCase("asit")) {
            asitler.add(yeniKimyasal);
        } else if (tip.equalsIgnoreCase("baz")) {
            bazlar.add(yeniKimyasal);
        } else if (tip.equalsIgnoreCase("bilesik")) {
            bilesikler.add(yeniKimyasal);
        } else {
            System.out.println("Geçersiz kimyasal türü: " + tip);
        }
    }

    // İsimden kimyasalı bulma metodu
    public kimyasalDataBse kimyasalGetir(String isim) {
        for (kimyasalDataBse kimyasal : asitler) {
            if (kimyasal.getIsim().equalsIgnoreCase(isim)) {
                return kimyasal;
            }
        }
        for (kimyasalDataBse kimyasal : bazlar) {
            if (kimyasal.getIsim().equalsIgnoreCase(isim)) {
                return kimyasal;
            }
        }
        for (kimyasalDataBse kimyasal : bilesikler) {
            if (kimyasal.getIsim().equalsIgnoreCase(isim)) {
                return kimyasal;
            }
        }
        return null; // Eğer isim bulunamazsa
    }

    // Tüm kimyasalları yazdırma metodu
    public void kimyasallariYazdir() {
        System.out.println("Asitler: " + asitler);
        System.out.println("Bazlar: " + bazlar);
        System.out.println("Bileşikler: " + bilesikler);
    }
}
