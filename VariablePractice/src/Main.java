import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Problem 1
        int room = 113;
        double e = 2.71828;
        String lesson = "Computer Science";

        String roomMessage = "This is room # " + room;
        String eMessage = "e is close to " + e;
        String lessonMessage = "I am learning a bit about " + lesson;

        System.out.println(roomMessage);
        System.out.println(eMessage);
        System.out.println(lessonMessage);


        /*
        Your schedule
        It seems that the values given for the length of the table sizes are not correct -
        the teachers' column is supposed to be 26 characters, but the last value is 37 characters. Adjusted table accordingly to ensure expected output.
        */

        String headerAndFooter = "+" + "-".repeat(61) + "+";
        String lineTemplate = "| %d | %s | %s |\n";

        String[] lessons = {"English III", "Precalculus", "Music Theory", "Biotechnology", "Principles of Technology I", "Latin II", "AP US History", "Business Computer Information Systems"};
        String[] teachers = {"Ms. Lapan", "Mrs. Gideon", "Mr. Davis", "Ms. Palmer", "Ms. Garcia", "Mrs. Barnett", "Ms. Johannessen", "Mr. James"};

        System.out.println(headerAndFooter);
        for (int i = 0; i < lessons.length; ++i) {
            String formattedLessonName = " ".repeat(37 - lessons[i].length()) + lessons[i];
            String formattedTeacherName = " ".repeat(15 - teachers[i].length()) + teachers[i];
            System.out.printf(lineTemplate, i + 1, formattedLessonName, formattedTeacherName);
        }
        System.out.println(headerAndFooter);

        // Hot Dog Stand
        double priceHotDog = 5.50;
        double priceDrink = 2.0;
        double taxMultiplier = 1.12;
        Scanner scanner = new Scanner(System.in);
        String hotDogQuantityPrompt = "Enter the quantity of hot dogs wanted: ";
        String drinksQuantityPrompt = "Enter the quantity of drinks wanted: ";
        String orderTotalTemplate = "Your total is: $%.2f";
        String invalidQuantityMessage = "Invalid quantity";

        System.out.println(hotDogQuantityPrompt);
        int hotDogQuantity = scanner.nextInt();
        if (hotDogQuantity < 0) {
            System.out.println(invalidQuantityMessage);
            return;
        }
        System.out.println(drinksQuantityPrompt);
        int drinksQuantity = scanner.nextInt();
        if (drinksQuantity < 0) {
            System.out.println(invalidQuantityMessage);
            return;
        }

        double total = (priceHotDog * hotDogQuantity + priceDrink * drinksQuantity) * taxMultiplier;
        System.out.printf(orderTotalTemplate, total);
    }
}