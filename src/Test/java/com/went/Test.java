package com.went;

import java.util.Random;

/**
 * Created by went on 16/7/30.
 */
public class Test {
    public static void main(String[] args){
        for (int i=0; i<10; i++){
            System.out.println(getRandom());
        }

    }

    public static String getRandom(){
        String format = "begin:";
        Random r = new Random();
//        for (int i = 0; i < 3; i++) {
            format += r.nextInt();
//        }
        return format;
    }
}
