package ex46;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mario Espaillat
 */

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class WordFrq {

        private int count;
        private String name;



///counts the amount of stars for the specific count

        public static void stars(int s){

        for(int i=0;i<s;i++){
            System.out.print("*");
        }
    }

    //sorts the the count of the name of the animal by comparison

        public static WordFrq[] sort(WordFrq b[]){
        WordFrq temp;
        int i=0;
        while (i < 3) {
            for (i = 1; i < 3; i++) {
                if (b[i-1].count > b[i].count) {
                    temp = b[i];
                    b[i] = b[i-1];
                    b[i-1] = temp;
                    break;
                }
            }
        }


        return b;





    }






    public WordFrq(String name, int count) {
        this.name = name;
        this.count = count;
    }

    //Scan the amount of the specific  name and use the methods to sort and print the amount of stars

        public static void main(String[] args) throws Exception {


        int b = 0;
        int s = 0;
        int m = 0;
        Formatter r = new Formatter();


        File f = new File("src/main/java/ex46/exercise46_input.txt");
        Scanner scan = new Scanner(f);


        while (scan.hasNextLine()) {
            String t = scan.next();
            if (t.equals("mushroom")) {
                m++;
            } else if (t.equals("snake")) {
                s++;
            } else if (t.equals("badger")) {

                b++;
            }


        }


        WordFrq[] t = new WordFrq[3];
        t[0] = new WordFrq("badger", b);
        t[1] = new WordFrq("mushroom", m);
        t[2] = new WordFrq("snake", s);


        sort(t);





        int y = 0;
        for (int z = 2; z > -1; z--) {
            System.out.print(t[z].name+"   ");
            stars(t[z].count);
            System.out.print("\n");
        }
    }
    }

