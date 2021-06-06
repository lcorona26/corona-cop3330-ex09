/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Corona
 */
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    static final int constant = 350;

    public static void main(String[] args){
        App app = new App();
        String length = app.readLength();
        String width = app.readWidth();
        int area = app.calcArea(length, width);
        int gallons = app.calcGallons(area);
        app.printOutput(area, gallons);
    }

    private void printOutput(int area, int gallons) {
        String message = String.format("You will need to purchase %s gallons of paint to cover %s square feet.", gallons, area);
        System.out.print(message);
    }

    private int calcGallons(int area) {

        int gallons = (area/constant);
        if(area > constant)
            gallons += 1;
        return gallons;
    }


    private int calcArea(String length, String width) {
        int intL = Integer.parseInt(length);
        int intW = Integer.parseInt(width);
        int area = intL*intW;
        return area;
    }

    private String readLength() {
        System.out.print("What is the length of the ceiling? ");
        String length = in.nextLine();
        return length;
    }

    private String readWidth() {
        System.out.print("What is the width of the ceiling? ");
        String width = in.nextLine();
        return width;
    }
}
