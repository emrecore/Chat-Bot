import java.util.Scanner;


public class Main {

    static String botName;


    public static void name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, I am your personal Chat Bot!");
        System.out.println("Please give me a name :)");
        botName = scanner.nextLine();
        System.out.println(botName + ": " + "I like this name, Thank You! Feel free to use all of my current abilities to your liking :)");
    }

    public static void main(String[] args) {
        name();
        System.out.println("Guessing / Counting / Quizzing / Adding / Subtracting / Multiplying / Dividing");
        Scanner scanner = new Scanner(System.in);
        String ability = scanner.nextLine();

        if (ability.isEmpty()) {
            System.out.println(botName + ": " + "Well then, I hope I will be able to assist you another time :)");
        } else if (ability.equals("Guessing")) {
            guessing();
        } else if (ability.equals("Counting")) {
            counting();
        } else if (ability.equals("Quizzing")) {
            quizzing();
        } else if (ability.equals("Adding")) {
            adding();
        } else if (ability.equals("Subtracting")) {
            subtracting();
        } else if (ability.equals("Multiplying")) {
            multiplying();
        } else if (ability.equals("Dividing")) {
            dividing();
        } else {
            System.out.println("I can't understand :(");
        }
    }


    public static void guessing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(botName + ": " + "I can guess anybody's age. Please provide me with the remainders of your age after dividing by 3, 5, and 7 :)");
        System.out.println("Separate your numbers with whitespace");
        int remainder1 = scanner.nextInt();
        int remainder2 = scanner.nextInt();
        int remainder3 = scanner.nextInt();
        int age = (remainder1 * 70 + remainder2 * 21 + remainder3 * 15) % 105;

        System.out.println(botName + ": " + "I feel like your age might be " + age + " :)");
    }


    public static void counting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(botName + ": " + "Please enter a Number :)");
        int finalNumber = scanner.nextInt();

        if (finalNumber == 0) {
            System.out.println(botName + ": " + "There is nothing to count :(");
            System.exit(0);
        }

        for (int startNumber = 0; finalNumber >= startNumber; startNumber++) {
            System.out.println(startNumber);
        }

        for (int startNumber = 0; finalNumber <= startNumber; startNumber--) {
            System.out.println(startNumber);
        }

    }


    public static void quizzing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(botName + ": " + "Please choose your quiz :)");
        System.out.println("1. 2. 3. 4.");
        String quiz = scanner.nextLine();

        if (quiz.equals("1.")) {
            Scanner answer = new Scanner(System.in);
            System.out.println("Which organelle is responsible for producing energy in the cell?");
            System.out.println("A. Nucleus");
            System.out.println("B. Mitochondrion");
            System.out.println("C. Ribosome");
            System.out.println("D. Golgi apparatus");


            for (; ; ) {
                String correct = answer.nextLine();
                if (correct.equals("B.")) {
                    System.out.println(botName + ": " + "Congratulations :)");
                    break;
                } else {
                    System.out.println(botName + ": " + "Try again :(");
                }
            }
        }

        if (quiz.equals("2.")) {
            Scanner answer = new Scanner(System.in);
            System.out.println("Which country has the most official languages?");
            System.out.println("A. India");
            System.out.println("B. Switzerland");
            System.out.println("C. South Africa");
            System.out.println("D. Canada");


            for (; ; ) {
                String correct = answer.nextLine();
                if (correct.equals("C.")) {
                    System.out.println(botName + ": " + "Congratulations :)");
                    break;
                } else {
                    System.out.println(botName + ": " + "Try again :(");
                }
            }
        }

        if (quiz.equals("3.")) {
            Scanner answer = new Scanner(System.in);
            System.out.println("Who was the first president of the United States?");
            System.out.println("A. Thomas Jefferson");
            System.out.println("B. Abraham Lincoln");
            System.out.println("C. George Washington");
            System.out.println("D. John Adams");


            for (; ; ) {
                String correct = answer.nextLine();
                if (correct.equals("C.")) {
                    System.out.println(botName + ": " + "Congratulations :)");
                    break;
                } else {
                    System.out.println(botName + ": " + "Try again :(");
                }
            }
        }

        if (quiz.equals("4.")) {
            Scanner answer = new Scanner(System.in);
            System.out.println("What does HTML stand for?");
            System.out.println("A. HyperText Markup Language");
            System.out.println("B. HighText Machine Language");
            System.out.println("C. HyperTool Markup Language");
            System.out.println("D. HyperText Managing Language");


            for (; ; ) {
                String correct = answer.nextLine();
                if (correct.equals("A.")) {
                    System.out.println(botName + ": " + "Congratulations :)");
                    break;
                } else {
                    System.out.println(botName + ": " + "Try again :(");
                }
            }
        }


    }

    public static void adding() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(botName + ": " + "Please enter your numbers :)");
        int number = 0;

        for (; ; ) {
            number = number + scanner.nextInt();
            System.out.println(number);

            if (number == 0) {
                System.out.println(botName + ": " + "We've reached Home <3");
                break;
            }
        }


    }

    public static void subtracting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(botName + ": " + "Please enter your numbers :)");
        int number = 0;

        for (; ; ) {
            number = number - scanner.nextInt();
            System.out.println(number);

            if (number == 0) {
                System.out.println(botName + ": " + "We've reached Home <3");
                break;
            }
        }
    }

    public static void multiplying() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(botName + ": " + "Please enter your numbers :)");
        int number = 1;

        for (; ; ) {
            number = number * scanner.nextInt();
            System.out.println(number);

            if (number == 0) {
                System.out.println(botName + ": " + "Now it's just boring :(");
                break;
            }
        }

    }

    public static void dividing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(botName + ": " + "Please enter your numbers :)");
        double number = scanner.nextDouble();

        for (; ; ) {
            number = number / scanner.nextInt();
            System.out.println(number);

            if (number < 0.000001) {
                System.out.println(botName + ": " + "I start to doubt if there is any amount left :(");
                break;
            }
        }

    }


}