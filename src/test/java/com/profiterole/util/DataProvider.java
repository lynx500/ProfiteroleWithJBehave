package com.profiterole.util;

import java.util.Random;

public class DataProvider {

//    public String randomString(int len) {
//        Random rnd = new Random();
//        String s = "";
//        for (int i = 0; i < len; i++) {
//            s = s + (char) (32 + rnd.nextInt(95));
//        }
//        return s;
//    }

    public String randomString(int len) {
        String s = Integer.toString(randomInt(len));
        return s;
    }

    public int randomInt(int len) {
        Random rnd = new Random();
        int a = rnd.nextInt(len);
        return a;
    }

    public String randomEmail(int len) {
        String s = Integer.toString(randomInt(len));
        s = s + s + "@mail.com";
        return s;
    }
}
