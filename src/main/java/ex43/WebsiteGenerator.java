package ex43;

import javax.swing.text.Document;
import javax.swing.text.Element;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Mario Espaillat
 */

public class WebsiteGenerator {

    ///creates the file using the string name and writes to the file
    public static void createFile(String c) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/ex43/" + c));
        writer.write("Here is your " + c + " file");
        writer.close();


    }




/////scan in the site name and arthor and then prints the info into the html file and then also genarates the css and js file if the user would like to or not
    public static void main(String[] args) throws IOException {
        //Site name: awesomeco
        // Author: Max Power
        //. Do you want a folder for JavaScript? y
        //Do you want a folder for CSS? y


        Scanner in = new Scanner(System.in);
        System.out.println("Site name: ");
        String site = in.nextLine();
        createFile(site);

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/ex43/in.HTML"));


        System.out.println("Author: ");
        String author = in.nextLine();
        bw.write("<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta " + author + ">\n" +
                "    <title>" + site + "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "</body>\n" +
                "</html>");
        bw.close();

        System.out.println("Do you want a folder for JavaScript? ");
        String YoN = in.nextLine();
        if (YoN.equals("y")) {
            BufferedWriter writejs = new BufferedWriter(new FileWriter("src/main/java/ex43/js.javaScript"));
        }
        System.out.println("Do you want a folder for CSS? ");
        String YoNCSS = in.nextLine();
        if (YoNCSS.equals("y")) {
            BufferedWriter writeCSS = new BufferedWriter(new FileWriter("src/main/java/ex43/css.CSS"));
        }
        System.out.println("Created ./website/" + site + "\n" +
                "Created ./website/" + site + "/index.html");

        if (YoN.equals("y")) {
            System.out.println("Created ./website/" + site + "/js/");
            if (YoNCSS.equals("y")) {
                System.out.println("Created ./website/" + site + "/css/");
            }


        }
    }
}








