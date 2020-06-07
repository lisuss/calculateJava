package com.example.awtSample;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();

    }

    private static void menu() {
        boolean loop = true;
        while (loop) {
            Scanner scan = new Scanner(System.in);
            int number;
            System.out.println("Options of this application are: ");
            System.out.println("0 - quit application\n" +
                    "1 - area of the rectangle \n" +
                    "2 - diagonal of the rectangle \n" +
                    "3 - area of the triangle \n" +
                    "4 - height of the triangle \n" +
                    "5 - show posible options");
            System.out.print("Enter a selected number ");
            number = scan.nextInt();


                switch (number) {
                    case 0:
                        System.exit(0);
                        loop = false;
                        break;
                    case 1:
                        System.out.println("You have chosen to calculate the area of rectangle");
                        Scanner scanRect = new Scanner(System.in);
                        System.out.println("Enter the length of first side of the rectangle ");
                        int a = scanRect.nextInt();
                        System.out.println("Enter the length of the second side");
                        int b = scanRect.nextInt();
                        System.out.println("The area of selected rectangle is euqal to " + a * b);
                        break;
                    case 2:
                        System.out.println("You have chosen to calculate the diagonal rectangle");
                        System.out.println("Enter the length of first side");
                        scanRect = new Scanner(System.in);
                        a = scanRect.nextInt();
                        System.out.println("Enter the length of the second side");
                        b = scanRect.nextInt();
                        System.out.println("The diagonal is equal to " + Math.sqrt(a*a+b*b));
                        break;
                    case 3:
                        System.out.println("You have chosen to calculate the area of the triangle");
                        System.out.println("Enter the length of the side");
                        scanRect = new Scanner(System.in);
                        a = scanRect.nextInt();
                        System.out.println("Enter the size of the height");
                        b = scanRect.nextInt();
                        System.out.println("The area of the traingle is equal to " + a * b / 2);
                        break;
                    case 4:
                        System.out.println("You want to know what the height of the triangle is");
                        System.out.println("Enter the side of traingle");
                        scanRect = new Scanner(System.in);
                        a = scanRect.nextInt();
                        System.out.println("The height is equal to " + a * Math.sqrt(3) / 2);
                        break;
                    case 5:
                        System.out.println("Options of this application are: ");
                        System.out.println("0 - quit application\n" +
                                "1 - area of the rectangle \n" +
                                "2 - diagonal of the rectangle \n" +
                                "3 - area of the triangle \n" +
                                "4 - height of the triangle \n" +
                                "5 - show posible options");
                        break;

                }

            }
        }

    }


