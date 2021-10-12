package ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mario Espaillat
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NameSorter {
//counts the amount of lines till it reaches the NUll so the main can create a string
    public static int count() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/java/ex41/exercise41_input.txt"));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();






        return lines;
    }
//sorts the array of strings with the count of lines
public static String[] s(String [] c,int n) {
    Arrays.sort(c);
    // print output array

    return c;
}

///scan in the file and sort with methods and then write to the new file
    public static void main(String[] args) throws Exception{


       int x=count();
       System.out.println(x);


        try (Scanner input = new Scanner(new File("src/main/java/ex41/exercise41_input.txt"));) {

            String[] n = new String[x];
            int y=0;


            for (int i = 1; input.hasNext() == true; i++) {
                n[y] = input.nextLine();
                y++;

            }



            n=s(n,y);
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/ex41/exercise41_output.txt"));
            writer.write("Total of 7 names\n-----------------\n");
            for(int i=0;i<y;i++)
                writer.write(n[i]+"\n");
            writer.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}











