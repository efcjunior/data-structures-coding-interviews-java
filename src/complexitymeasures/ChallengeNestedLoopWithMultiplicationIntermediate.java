package complexitymeasures;

public class ChallengeNestedLoopWithMultiplicationIntermediate {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        int j = 1;
        double pie = 3.14;

        for (int var = 1; var < n; var += 3) {   // O(n/3)
            System.out.println("Pie: " + pie);    // O(n/3)
            j = 1;  // O(n/3)
            while (j < n) { // O((n/3) * (log3 n))
                sum += 1;      // O((n/3) * (log3 n))
                j *= 3;        // O((n/3) * (log3 n))
            }
        }
        System.out.println("Sum: " + sum); //O(1)
    }
} //end of class
