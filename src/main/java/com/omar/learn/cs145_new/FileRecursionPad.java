package com.omar.learn.cs145_new;

import java.io.File;
import java.util.Scanner;

public class FileRecursionPad {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fileName = console.nextLine();

        File f = new File(fileName);

        if (!f.exists())
            System.out.println("Error");
        else
            filePrint(f);
    }

    public static void filePrint(File f) {
        filePrint(f, 0);
    }

    private static void filePrint(File f, int level) {
        pad(level);
        System.out.println(f.getName());

        if (f.isDirectory()) {
            for (File path : f.listFiles()) {
                filePrint(path, level + 1);
            }
        }
    }

    private static void pad(int level) {
        for (int i = 0; i < level; i++) System.out.print("     ");
    }
}























         

