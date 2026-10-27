package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PayRollCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        //open file w file reader and wrap in buffer reader
        //read each line of text
        try {
            FileReader fileReader = new FileReader("employees.csv");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // TODO: rewrite this loop so the read happens inside the while condition
            String line;
            //eat the header row
            String headerLine = bufferedReader.readLine();//ignore headrer
//            System.out.println(headerLine);
            //part where im missing to row and to card

            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
                //split into individual fields
                String[] fields = line.split(Pattern.quote("|"));

                // fields is an array containing 4 strings
                // [0] is Dallas, [1] is Ft. Worth, [2] is Austin
                int employeeId = Integer.parseInt(fields[0]);
                //^everything read from a file is a string
                //^so you convert from int to string
                String name = (fields[1]);
                double hoursWorked = Double.parseDouble(fields[2]);
                //method to change into double
                double payRate = Double.parseDouble(fields[3]);
                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                employees.add(employee);
                //system.out.println(employee.toCard());


            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading transactions");
            e.printStackTrace();
        }

        printEmployees(employees);


        printEmployeeTable(employees);

    }

    private static void printEmployeeTable(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toRow());
        }
    }

    private static void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }


}
