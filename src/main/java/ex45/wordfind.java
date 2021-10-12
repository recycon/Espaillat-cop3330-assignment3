package ex45;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mario Espaillat
 */

import java.io.*;
import java.util.Scanner;

public class wordfind {

    ///scan word by word and if it finds the specific string it will replace it with the word use and then print it to the new file
    public static void wFile(File f, String fileName) throws IOException {
        Scanner scan = new Scanner(f);
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/ex45/" + fileName));


        while (scan.hasNextLine()) {
            String t = scan.next();
            if (t.equals("utilize")) {
                writer.write("use ");
            } else if (t.equals("\"utilize\"")) {
                writer.write("\"uses\"  ");
            } else if (t.equals("utilizes")) {

                writer.write("uses ");
            } else {
                writer.write(t + " ");
            }
        }
        writer.close();
    }

    //Ask for the name of the new file and then uses the method to print the new lines in the name of the new file


    public static void main(String[] args) throws Exception {
        Scanner fileN = new Scanner(System.in);
        System.out.print("Name of the new File?");
        String fileName = fileN.nextLine();


        File f = new File("src/main/java/ex45/exercise45_input.txt");
        wFile(f,fileName);

    }
}

