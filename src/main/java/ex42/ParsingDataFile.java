package ex42;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mario Espaillat
 */

import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class ParsingDataFile {


    //counts the amount of lines in the file till it reaches null and then returns the value
    public static int count() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/java/ex42/exercise42_input.txt"));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();
        return lines;
    }

///using the count method it creates a string array and then the values are split and formated before printing to the compiler
    public static void main(String[] args) throws Exception{


        int x=count();
        Formatter f = new Formatter();


        try (Scanner input = new Scanner(new File("src/main/java/ex42/exercise42_input.txt"));) {

            String[] n = new String[x];
            int y=0;




            for (int i = 1; input.hasNext() == true; i++) {
                n[y] = input.nextLine();
                y++;

            }
            System.out.println("      Last      First     Salary\n" +
                    "     --------------------------");
            for(int i=0;i<x;i++) {
                String delims = "[,]";
                String[] tokens = n[i].split(delims);
                f.format("%10s %10s %10s\n", tokens[0], tokens[1], tokens[2]);



                //for (int d = 0; d < 3;d++) {
                   // System.out.print(tokens[d]+"     ");
                //}
               //System.out.print("\n");
            }






        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(f);

    }





}
