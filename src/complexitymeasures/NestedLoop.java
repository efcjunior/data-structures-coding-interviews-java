package complexitymeasures;

public class NestedLoop {

    public static void main(String[] args) {
        int n = 5; // 1 step => 1
        int m = 7; // 1 step => 1
        int sum = 0; // 1 step => 1
        for (int i = 0; i < n; i++) { // n steps => 1 + 3.(n + 1) + 3.n
            for (int j = 0; j < m; j++) { // n*m steps
                sum++; // n*m steps n.(3m)
            }
        }
        System.out.println("Sum: " + sum); // 1 step => 2
    }
}

//1 + 1 + 1 => 3
//6n + 4
//n.(6m + 4) => 6mn + 4n
//n.(3m) => 3mn
//2

//9 + 10n + 9mn
