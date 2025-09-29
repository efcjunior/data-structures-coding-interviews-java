package complexitymeasures;

public class ChallengeNestedLoopWithSubtraction {
    public static void main(String[] args) {
        int n = 10; // O(time complexity of the called function)
        int sum = 0; //O(1)
        double pie = 3.14; //O(1)


        for (int var = n; var >= 1; var = var - 3) { // O(n/3)
            System.out.println("Pie: " + pie); // O(n/3)

            for (int j = n; j >= 0; j = j - 1) { // O((n/3)*(n+1))
                sum++; // O((n/3)*(n+1))
            }
        } //end of outer for loop
        System.out.println("Sum: " + sum);//O(1)
    } //end of main
} //end of class
