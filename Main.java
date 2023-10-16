// Main.java U1
// Celvis

// Import
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Welcome and ask for name
        System.out.println("Welcome what is your name?");
        String name = scan.nextLine();

        // Say hello to name
        System.out.printf("\nHello %s. Are you ready to crack the code?\n", name);
        String crackCodeYesNo = scan.nextLine();

        // Check
        if (crackCodeYesNo.toLowerCase().equals("yes")) {
            // Output Start Phase 1

            // Phase 1 variable answer
            String phase1Answer = "abc";

            // Store/Input PHASE1
            System.out.println("");
            System.out.println("PHASE 1\nEnter a string:");
            String phase1 = scan.nextLine();

            // Check Phase 1
            if (phase1.equals(phase1Answer)) {
                // Output Start Phase 2

                // Phase 2 variable answer
                int phase2Answer = 40;

                // Store/input PHASE2
                System.out.println("");
                System.out.println("PHASE 2\nEnter a number:");
                int phase2 = scan.nextInt();

                // Check Phase 2
                if (phase2 == phase2Answer) {
                    // Start Phase 3

                    // Phase 3 variable answer
                    int phase3Answer = 2;

                    // Store/input PHASE3
                    System.out.println("");
                    System.out.println("PHASE 3\nEnter a number:");
                    int phase3 = scan.nextInt();

                    // Check Phase 3
                    if (phase3 == phase3Answer) {
                        // Output
                        System.out.println("\nCorrect!\nYou have cracked the code!");

                        // Close scanner and exit program
                        scan.close();
                        System.exit(0);
                    } else {
                        // Output
                        System.out.println("Sorry, that was incorrect!\nBetter luck next time!");

                        // Close scanner and exit program
                        scan.close();
                        System.exit(0);
                    }
                } else {
                    // Output
                    System.out.println("Sorry, that was incorrect!\nBetter luck next time!");

                    // Close scanner and exit program
                    scan.close();
                    System.exit(0);
                }

            } else {
                // Output
                System.out.println("Sorry, that was incorrect!\nBetter luck next time!");

                // Close scanner and exit program
                scan.close();
                System.exit(0);
            }

        } else if (crackCodeYesNo.toLowerCase().equals("no")) {
            // Output
            System.out.println("");

            // Close scanner and exit program
            scan.close();
            System.exit(0);
        } else {
            // Output
            System.out.println("\nThe response was not recongnized!");
        }
    }
    // test
}
