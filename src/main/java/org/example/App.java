package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWhat is your name?\n");

        String name = scan.nextLine();
        System.out.println("\nHello, " + name + ", nice to meet you!\n");

    }
}
