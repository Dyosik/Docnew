package ru.dvfu.mrcpk.java01.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String str;
        System.out.println("Вводите строки текста");
        System.out.println("Вводите 'стоп' для завершения");

        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equalsIgnoreCase("стоп"));
        }
    }
