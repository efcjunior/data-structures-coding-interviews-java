package complexitymeasures;

public class ChallengeNestedLoopWithMultiplicationAdvanced {
    public static void main(String[] args) {
        int n = 10; //O(1)
        int sum = 0;//O(1)
        double pie = 3.14;//O(1)

        for (int var = 0; var < n; var++) {//2 + 3.(n+1) + 3.n
            int j = 1;//1
            System.out.println("Pie: " + pie);//3
            while(j < var) {//log_2(?)
                sum += 1;//
                j *= 2;
            }
        } //end of for loop
        System.out.println("Sum: " + sum);
    } //end of main
} //end of class
