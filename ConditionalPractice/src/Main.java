import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Assignment 1
        System.out.println("Assignment 1");
        System.out.print("Hey, what's your name? (Sorry I keep forgetting.) ");
        String name = scanner.nextLine();

        System.out.print("Ok, " + name + ", how old are you? ");
        int age = scanner.nextInt();

        if (age < 16) System.out.println("You can't drive, " + name + ".");
        else if (age < 18) System.out.println("You can drive, but not vote, " + name + ".");
        else if (age < 25) System.out.println("You can vote, but not rent a car, " + name + ".");
        else System.out.println("You can do pretty much anything, " + name + ".");

        //Assignment 2
        System.out.println("Assignment 2");
        System.out.println("Please enter your current earth weight in pounds: ");
        double earthWeight = scanner.nextDouble();
        scanner.nextLine(); //clear the buffer

        while (true) {
            System.out.println("I have information for the following planets:");
            System.out.println("1. Venus   2. Mars    3. Jupiter\n4. Saturn  5. Uranus  6. Neptune");

            int planet = scanner.nextInt();
            scanner.nextLine(); //clear the buffer
            if (planet > 6 || planet <= 0) System.out.println("Please enter a valid planet number.");
            else {
                String weightTemplate = "Your weight would be %s pounds on that planet.\n";
                if (planet == 1) System.out.printf(weightTemplate, earthWeight * 0.78);
                else if (planet == 2) System.out.printf(weightTemplate, earthWeight * 0.39);
                else if (planet == 3) System.out.printf(weightTemplate, earthWeight * 2.65);
                else if (planet == 4) System.out.printf(weightTemplate, earthWeight * 1.17);
                else if (planet == 5) System.out.printf(weightTemplate, earthWeight * 1.05);
                else System.out.printf(weightTemplate, earthWeight * 1.23);

                break;
            }
        }

        //Assignment 3 (quiz). Extra newlines are littered throughout the code for formatting the output.
        System.out.println("Assignment 3");
        System.out.println("Are you ready for the quiz? (y/n)");
        String answer = scanner.nextLine();
        System.out.println("I don't actually know what " + answer + " means, but I'll just assume you are ready!\n");

        int score = 0;

        System.out.print("""
                Q1) What is the capital of Alaska?
                    1) Melbourne
                    2) Anchorage
                    3) Juneau
                """);
        int q1Answer = scanner.nextInt();

        if (q1Answer == 3) {
            ++score;
            System.out.println("That's right!\n");
        } else System.out.println("Sorry, that's wrong. The correct answer is 3 (Juneau).\n");


        System.out.print("""
                Q2) Can you store the value "cat" in a variable of type int?
                    1) yes
                    2) no
                """);

        int q2Answer = scanner.nextInt();
        if (q2Answer == 2) {
            ++score;
            System.out.println("That's right!\n");
        } else System.out.println("Sorry, that's wrong. The correct answer is 2 (no).\n");

        System.out.print("""
                What is the result of 9+6/3?
                    1) 5
                    2) 11
                    3) 15/3
                """);

        int q3Answer = scanner.nextInt();
        if (q3Answer == 2) {
            ++score;
            System.out.println("That's right!\n");
        } else System.out.println("Sorry, that's wrong. The correct answer is 2 (11).\n");

        System.out.println("\nOverall, you got " + score + " out of 3 questions correct.");
        System.out.println("Thanks for playing!");
    }

}