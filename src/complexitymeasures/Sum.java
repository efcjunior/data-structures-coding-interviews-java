package complexitymeasures;

public class Sum {

    static void main() {
        int n = 10; // 1 step (1)
        int sum = 0; // 1 step (1)
        for (int i = 0; i < n; i++) {//1 + 3.(n+1) + 3.n => 1 + 3n + 3 + 3n => 6n + 4
            sum += 1; // n steps - 3.n
        }
        System.out.println(sum); // 1 step => 2
    }
}