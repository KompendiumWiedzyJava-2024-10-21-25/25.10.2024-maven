package com.comarch.szkolenia.maven;

import org.apache.commons.codec.digest.DigestUtils;

public class App {
    public static void main(String[] args) {
        String password = "Cos";
        String hash = DigestUtils.md5Hex(password);
        System.out.println(hash);

        String[] tab = new String[10];
        tab[0] = "Cos";

        metoda(tab[0]);

        //??
        //??
    }

    public static void metoda(String s) {
        //??
        //??
        //??
    }
}
