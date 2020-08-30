/*  Created by IntelliJ IDEA.
 *  User: Harsh sharma
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Student info = new Student();
        info.studentInfo();
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me. ");
        System.out.println("2. Return a previously issued book for me. ");
        System.out.println("3. Show me all my issued book. ");
        System.out.println("4. Exit. ");
        System.out.println("Enter the option: ");
        Scanner scanner = new Scanner(System.in);
        int studentInput = scanner.nextInt();
    }
}
