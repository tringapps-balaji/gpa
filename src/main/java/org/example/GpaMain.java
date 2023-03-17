package org.example;
import gpacall.GpaCall;

import java.util.logging.Logger;
import java.util.Scanner;
public class GpaMain {
    private static Logger lg = Logger.getLogger("GPA");
    private static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        lg.info("Enter the name :");
        String name = sc.next();
        GpaCall gc = new GpaCall(name);
        lg.info("Enter the grade: ");
        String grade = sc.next();
        gc.GpaCalculate(grade);
        lg.info(gc.DispGpa());
        gc.UpdateGpa();
    }
}