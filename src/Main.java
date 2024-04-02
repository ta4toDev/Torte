import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);// Scanner-Objekt für die Eingabe
    public static PrintStream out = System.out;   // PrintStream-Objekt für die Ausgabe

    public static void main(String[] args) {
        int x1;
        int x2;
        int x3;
        System.out.println("Bitte geben Sie eine Zahl ein:");
        x1 = in.nextInt(); // Eingabe lesen und x1 zuweisen
        x2 = x1 % 10; // Letzte Ziffer der Zahl erhalten
        x3 = x1 /10 % 10;
        if (x3 == 1)
            System.out.println(x1 + " " + "Torten");
        else if (x2 == 1)
            System.out.println(x1 + " " + "Torte");
        else if (x2 > 1 && x2 <= 4)
            System.out.println(x1 + " " + "Torten");
        else
            System.out.println(x1 + " " + "Torten");

    }
}