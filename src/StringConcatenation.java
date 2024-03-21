import java.util.Scanner;

public class StringConcatenation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String concatFirstSecond = firstString.concat(secondString);
        String concatSecondFirst = secondString.concat(firstString);

        System.out.println("First + Second: " + concatFirstSecond);
        System.out.println("Second + First: " + concatSecondFirst);

        if (isAlternating(firstString, secondString)) {
            System.out.println("The composition of two different Strings is alternating.");
        } else {
            System.out.println("The composition of two different Strings is NOT alternating.");
        }

        scanner.close();
    }


    private static boolean isAlternating(String first, String second) {
        String concatFirstSecond = first.concat(second);
        String concatSecondFirst = second.concat(first);

        return concatFirstSecond.equals(concatSecondFirst);
    }
}
