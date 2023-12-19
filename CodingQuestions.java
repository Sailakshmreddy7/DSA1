import java.util.*;

public class CodingQuestions {
    public static void main(String[] args) {
        // branchRegistrations();
        majorityParticipation();
    }

    public static void branchRegistrations() {
        // 2.ADVITIYA - An event conducted by department of CSE(DS), is conducting
        // technical events and
        // non technical events.there are n participants participating in both technical
        // and non technical
        // events. i’th index consists of department of ith participant. Now the head
        // organisers Manjunath
        // and Kareem wants to know the number of participants from each branch. Write a
        // program to help
        // Manjunath and Kareem in knowing the number of participants from each branch.
        // Input Format:
        // First line consists of integer n - n represents number of participants in
        // ADVITIYA.
        // Second line consists of n space separated names of branches.
        // Output Format:
        // Return each branch and its respective number of registrations
        // Test cases :
        // Input 1:
        // 10
        // ECE CSE CSE ECE EEE ME CSE CE CSE ME
        // Output 1:
        // CE 1
        // CSE 4
        // EEE 1
        // ECE 2
        // ME 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of participants: ");
        int n = sc.nextInt();
        System.out.print("Number of participants are: " + n);
        System.out.println();
        System.out.println("Enter Branches Separated by Spaces: ");
        String branches[] = new String[n];
        for (int i = 0; i < n; i++) {
            branches[i] = sc.next();
        }
        Map<String, Integer> branchCount = new HashMap<>();
        for (String branch : branches) {
            branchCount.put(branch, branchCount.getOrDefault(branch, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : branchCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void majorityParticipation() {
        // 3.ADVITIYA - An event conducted by department of CSE(DS), is conducting
        // technical event and
        // non technical events.There are n number of participants participating in the
        // event. A department
        // is said to have majority participation if the number of participants of
        // particular branch is more than
        // half of the total number of participants.
        // The branch is denoted with its respective codes.
        // ECE - 4
        // CSE - 5
        // CSE(DS) - 32
        // MECH - 3
        // EEE - 2
        // CIVIL - 1
        // Find Whether any branch have majority participation, If yes print yes and
        // code of branch else print
        // no.
        // Input Format:
        // First line consists of integer n - n represents number of participants.
        // Second line consists of n space separated codes of branches.
        // Output Format:
        // If majority participation branch exists, print Yes and code of branch
        // Else print No
        // Test cases :
        // Input 1:
        // 10
        // 4 4 32 4 3 4 4 3 2 4
        // Output 1:
        // Yes 4
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of participants: ");
        int n = sc.nextInt();
        System.out.print("No.of participants are: " + n);
        System.out.println();
        System.out.print("Branch codes: ");
        int[] branchcodes = new int[n];
        for (int i = 0; i < n; i++) {
            branchcodes[i] = sc.nextInt();
        }
        int votes = 1;
        int majorityBranch = branchcodes[0];
        for (int i = 1; i < branchcodes.length; i++) {
            if (votes == 0) {
                majorityBranch = branchcodes[i];
                votes++;
            } else if (majorityBranch == (branchcodes[i])) {
                votes++;
            } else {
                votes--;
            }

        }
        if (votes >= 1) {
            System.out.print("YES" + " " + majorityBranch);
        } else {
            System.out.println("NO");
        }
    }

}
