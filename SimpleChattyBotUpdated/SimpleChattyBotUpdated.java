// Simple Chatty Bot with functions
package SimpleChattyBotUpdated;

import java.util.Scanner;

/**
 *
 * @author yei_r
 */
public class SimpleChattyBotUpdated {
    final static Scanner scanner = new Scanner(System.in); 
    
    public static void main(String[] args) {
        greet("Botty", "2022"); 
        remindName();
        guessAge();
        count();
        test();
        end();
    }
    
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
    }

    static void remindName() {
        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        
        int  question = scanner.nextInt();
        
        for (;;) { // Infinite loop
            if (question != 2) {
                System.out.println("Please, try again.");
                question = scanner.nextInt();
            } else {
                break; // Break the infinite loop
            }     
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); 
    }
    
}
