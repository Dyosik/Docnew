package ru.dvfu.mrcpk.java01.example3;

import java.util.Scanner;

public class scun {
    public static void main(String[] args){
        int i;
        Scanner conin = new Scanner(System.in);
        while (conin.hasNextInt()){
            i = conin.nextInt();
            System.out.println("i=" + i);
        }
    }
}
