package complexitymeasures;

public class ChallengeNestedLoopWithMultiplicationPRO {
    public static void main(String[] args) {
        int n = 10;   // O(1)
        int sum = 0;  // O(1)
        int j = 1;    // O(1)
        double pie = 3.14; // O(1)

        for (int var = 0; var < n; var++) {  // 0(n)

            System.out.println("Pie: " + pie); // 0(n)
            while(j < var) { // 0(n)
                sum += 1;  // 0(n)
                j *= 2;  // 0(n)
            }
        } //end of for loop
        System.out.println("Sum: " + sum); // O(1)
    } //end of main
} //end of class
