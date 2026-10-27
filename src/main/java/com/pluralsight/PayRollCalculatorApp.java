package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class PayRollCalculatorApp {
    public static void main(String[] args) {
        //open file w file reader and wrap in buffer reader
        //read each line of text
        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // TODO: rewrite this loop so the read happens inside the while condition
            String line;
            while ((line = bufferedReader.readLine())!= null) {
//                System.out.println(line);
                //split into individual fields
                String [] fields = line.split(Pattern.quote("|"));

                // fields is an array containing 4 strings
                // [0] is Dallas, [1] is Ft. Worth, [2] is Austin
                System.out.println(fields[0]);
                System.out.println(fields[1]);
                System.out.println(fields[2]);
                System.out.println(fields[3]);
                System.out.println("-------------");

//                // Alternatively: Pattern.quote() returns a regular expression for the literal pipe
//                String[] cities2 = input.split(Pattern.quote("|"));
//                System.out.println(cities2[1]);
//                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading transaction");
//            e.printStackTrace();
        }
    }



}
