/**
 * @author Angus Wai, Student ID: 100719558
 * @date November 13, 2020
 * @version 0.0.1
 */

package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String name = null;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.printf("You Entered: %s", name);
    }
}
