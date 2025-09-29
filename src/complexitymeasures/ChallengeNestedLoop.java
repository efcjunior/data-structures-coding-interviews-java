package complexitymeasures;

public class ChallengeNestedLoop {
    public static void main(String[] args) {
        int n = 10; // 1 step --> Note: n can be anything. This is just an example
        int sum = 0; // 1 step
        double pie = 3.14; // 1 step

        for (int var = 0; var < n; var = var + 3) { // n/3 steps
            System.out.println("Pie: " + pie); // n/3 steps
            for (int j = 0; j < n; j = j + 2) {  // (n/3 * n/2) steps
                sum++;   // (n/3 * n/2) steps
                System.out.println("Sum = " + sum);  // (n/3 * n/2) steps
            }
        }
    }
}
