import java.util.Scanner;
public class VoteSystem {
    public static void main(String[] args) {
        String[] candidates = {"Ali", "Bahar", "Majid", "Dara", "Ehsan"};
        char[] shortcuts = {'a', 'b', 'm', 'd', 'e'};
        int[] scores = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Available candidates (use letter or full name):");
        for(int i=0; i<candidates.length; i++) {
            System.out.printf("%s (%c) | ", candidates[i], shortcuts[i]);
        }
        System.out.print("\n\nEnter total voters: ");
        int totalVoters = input.nextInt();
        for (int voter = 1; voter <= totalVoters; voter++) {
            System.out.println("\nVoter #" + voter + ":");
            for (int priority = 1; priority <= 3; priority++) {
                System.out.print("Priority " + priority + ": ");
                String vote = input.next().toLowerCase();
                switch(vote) {
                    case "a":
                    case "ali":
                        scores[0] += (4 - priority);
                        break;
                    case "b":
                    case "bahar":
                        scores[1] += (4 - priority);
                        break;
                    case "m":
                    case "majid":
                        scores[2] += (4 - priority);
                        break;
                    case "d":
                    case "dara":
                        scores[3] += (4 - priority);
                        break;
                    case "e":
                    case "ehsan":
                        scores[4] += (4 - priority);
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                        priority--; 
                }
            }
            System.out.println("\nCurrent Scores:");
            for (int i = 0; i < candidates.length; i++) {
                System.out.printf("%s (%c): %d points\n", 
                    candidates[i], shortcuts[i], scores[i]);
            }
            System.out.println("--------------------------");
        }
        input.close();
    }
}