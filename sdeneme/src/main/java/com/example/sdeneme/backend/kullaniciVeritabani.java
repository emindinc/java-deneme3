package com.example.sdeneme.backend;

import java.util.HashMap;

public class kullaniciVeritabani {
    // Kullanıcıları saklamak için bir HashMap
    private static HashMap<String, Kullanicilar> kullaniciMap = new HashMap<>();

    // Statik bir blokta varsayılan kullanıcıları ekleyebilirsiniz
    static {
        kullaniciMap.put("1282845", new Kullanicilar("Emin", "Dinc", "1282845", "blabla"));
        kullaniciMap.put("2378761", new Kullanicilar("Emre", "Yanalak", "2378761", "lalala"));
        kullaniciMap.put("5628722", new Kullanicilar("Eren", "Basali", "5628722", "bisiler"));
    }

    // Kullanıcı eklemek için bir metot
    public static void kullaniciEkle(Kullanicilar kullanici) {
        kullaniciMap.put(kullanici.getID(), kullanici);
    }

    // Kullanıcıyı ID ile almak için bir metot
    public static Kullanicilar getKullanici(String id) {
        return kullaniciMap.get(id); // Kullanıcı yoksa null döner
    }

    // Tüm kullanıcıları görmek için bir metot (isteğe bağlı)
    public static HashMap<String, Kullanicilar> getTumKullanicilar() {
        return kullaniciMap;
    }
}
