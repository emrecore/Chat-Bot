import java.util.Scanner;


public class Main {

    static String botName;

    public static void name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, I am your personal Chat Bot!");
        System.out.println("Please give me a name :)");
        botName = scanner.nextLine();
        System.out.println(botName + ":" + " " + "I like this name, Thank You! Feel free to use all of my current abilities to your liking :)");
    }

    public static void main(String[] args) {
        name();
        System.out.println("Guessing / Counting / ");
        Scanner scanner = new Scanner(System.in);
        String ability = scanner.nextLine();

        if (ability.equals("Guessing")) {
            guessing();
        }

        if (ability.equals("Counting")) {
            counting();
        }
    }

    public static void guessing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(botName + ":" + " " + "I can guess anybody's age. Please provide me with the remainders of your age after dividing by 3, 5, and 7 :)");
        System.out.println("Separate your numbers with whitespace");
        int remainder1 = scanner.nextInt();
        int remainder2 = scanner.nextInt();
        int remainder3 = scanner.nextInt();
        int age = (remainder1 * 70 + remainder2 * 21 + remainder3 * 15) % 105;

        System.out.println(botName + ":" + " " + "I feel like your age might be " + age + " :)");
    }


    public static void counting() {
        System.out.println("Soon...");
    }




}
