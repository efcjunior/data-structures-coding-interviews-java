package complexitymeasures;

public class ChallengeNestedLoopWithMultiplicationBasic {
    public static void main(String[] args) {
        int n = 10; // O(time complexity of the called function)
        int sum = 0; //O(1)
        double pie = 3.14; //O(1)
        int var = 1; //O(?)
        while(var < n) {
            System.out.println("Pie: " + pie);
            //O(?)
            for (int j = 1; j < n; j = j + 2) {
                sum++;
            }
            var *= 3;
        } //end of while loop
        System.out.println("Sum: " + sum); //O(1)
    } //end of main
} //end of class
