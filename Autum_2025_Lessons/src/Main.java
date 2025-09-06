import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        example_with_if();
        example_with_while();
        example_with_for();
        emaple_4();
    }

    public static void example_with_if() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please enter your score:");
            score = scanner.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Entered wrong score try again!.");
                scanner.nextLine();
            }
        } while (score < 0 || score > 100);
        if (score>= 90) {
            System.out.println("You grade is A!");
        } else if (score >= 80) {
            System.out.println("You grade is B!");
        } else if (score >= 70) {
            System.out.println("You grade is C!");
        } else if (score >= 60) {
            System.out.println("You grade is D!");
        } else if (score >= 50) {
            System.out.println("You grade is E!");
        } else  {
            System.out.println("You grade is F!");
        }
    }

    public static void example_with_while() {
        String userInput = " ";
        Scanner scanner = new Scanner(System.in);
        while (!userInput.isEmpty()) {
            System.out.print("Please enter something: ");
            userInput = scanner.nextLine();
            String isExit = userInput.toLowerCase();
            if (isExit.equals("exit")) {
                System.out.println("Bye, you are enter " + userInput);
                break;
            }
            System.out.println("You've entered: " + userInput);
        }
    }
    public static void example_with_for() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a namber: ");
        int x = scanner.nextInt();
        int mod_x = Math.abs(x);
        int sum = 0;
        for (int i = 0; i <= mod_x; i++) {
            sum += i;
        }
        if (x < 0) {
            sum = -sum;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
    }

    public static void emaple_4() {
        int num_of_chanel = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please enter nuber of chanel: ");
            num_of_chanel = scanner.nextInt();
            scanner.nextLine();
            if (num_of_chanel > 0 && num_of_chanel < 100) {
                System.out.printf("Number of chanel is %d\n", num_of_chanel);
            } else if (num_of_chanel == 0) {
                System.out.println("Bye power is Off");
            } else  {
                System.out.println("You enter wrong chanel. Try again letter");
            }
        } while (num_of_chanel != 0);
    }
}