package at.ac.fhcampuswien;

import java.util.Scanner;


public class App {

    //todo Task 1
    public void sayHelloWorld() {
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals() {
        // input your solution here
        int Buchstabe = 'Z';
        int Zahlbuch = 0xface;
        int Zahlen = 012;
        int idk = (int) 80L;
        int haus = (int)44e-1f;
        int Wie = (int)5.5f;
        int ne =(int) 8.88e1;
        int nix = (int)99.9;



        int sum =  Buchstabe +  Zahlbuch + idk + Zahlen +  haus +  Wie +  ne +  nix;

        System.out.println(sum);

        // Quelle: https://www.w3schools.com/java/java_variables.asp

    }

    //todo Task 4
    public void addTwoNumbers() {
        // input your solution here
        Scanner scan = new Scanner(System.in);

        int number1;
        int number2;

        number1 = scan.nextInt();
        number2 = scan.nextInt();

        System.out.println(number1 + number2);

        // Quelle: https://www.youtube.com/watch?v=dz-_Ok5WdVA&t=186s&ab_channel=JonasKeil

    }

    //todo Task 5
    public void swapTwoNumbers() {
        // input your solution here
        Scanner scan2 = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Before Swap:");
        System.out.print("x: ");
        x = scan2.nextInt();

        System.out.print("y: ");
        y = scan2.nextInt();

        System.out.println("After Swap:");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x: " + x);
        System.out.println("y: " + y);


        // Quelle: https://www.baeldung.com/java-swap-two-variables + https://www.javatpoint.com/program-to-swap-two-numbers-without-using-the-third-variable


    }

    //todo Task 6
    public void compareTwoNumbers() {
        // input your solution here
        Scanner scan3 = new Scanner(System.in);

        int n1;
        int n2;

        System.out.print("n1: ");
        n1 = scan3.nextInt();

        System.out.print("n2: ");
        n2 = scan3.nextInt();

        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n2 > n1");

        } else {
            System.out.println("n1 == n2");
        }


        //http://www.javaschubla.de/2007/javaerst0070.html#:~:text=Zahlen%20kann%20man%20in%20Java,mehr%20als%20einem%20Zeichen%20besteht).

    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
        Scanner scan4 = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int Umsatz = scan4.nextInt();

        if (Umsatz < 0 || Umsatz >= 100000) {
            System.out.println("Invalid Revenue");
        }
        if (Umsatz >=0 && Umsatz < 20000){
            System.out.println("Poor Sales Revenue");
        }
        if (Umsatz >=20000 && Umsatz < 50000){
            System.out.println("Average Sales Revenue");
        }
        if (Umsatz >=50000 && Umsatz < 80000){
            System.out.println("Good Sales Revenue");
        }
        if (Umsatz >=80000 && Umsatz < 100000){
            System.out.println("Poor Sales Revenue");
        }


        // Quelle: https://www.java-forum.org/thema/mehrere-if-bedingungen.179290/

    }



    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scan5 = new Scanner(System.in);

       int Provision;

       System.out.print("Enter CommissionClass:");
       Provision = scan5.nextInt();

       switch(Provision){
           case 1:
               System.out.println(" Your Commission Rate was set to 0.01");
               break;

           case 2:
               System.out.println(" Your Commission Rate was set to 0.02");
               break;

           case 3:
               System.out.println(" Your Commission Rate was set to 0.03");
               break;

           case 4:
               System.out.println(" Your Commission Rate was set to 0.04");
               break;

           default:
               System.out.println(" Your Commission Rate was set to 0.0");
               break;
       }
        // https://javabeginners.de/Schleifen_und_Verzweigungen/switch_-case_-Verzweigung.php

    }

    //todo Task 9
    public void leapyear() {
        // input your solution here
        Scanner scan6 = new Scanner(System.in);

        int year;

        System.out.print("Year: ");
        year = scan6.nextInt();

        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println("Leapyear");
        }
        else if (year % 100 ==1 && year % 400 ==1) {
            System.out.println("Not a Leapyear");
        }
        else {
            System.out.println("Not a Leapyear");
        }

       // Quelle: https://mein-javablog.de/java-uebung-bedingte-anweisung/
    }
    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner scan7 = new Scanner(System.in);

        int number1;
        int number10;
        int number100;
        int ganzzahl;

        System.out.print("Number: ");
        ganzzahl = scan7.nextInt();

        number1 = ganzzahl % 10;
        number10 = (ganzzahl /10) % 10;
        number100 = (ganzzahl /100);

        System.out.println(number1 +""+ number10 +""+ number100);

        // Quelle: https://www.arduinoforum.de/arduino-Thread-Integer-Zahl-in-einer-zehner-hunderter-und-tausender-zerlegen





    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}