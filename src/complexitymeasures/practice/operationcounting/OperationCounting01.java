package complexitymeasures.practice.operationcounting;

public class OperationCounting01 {

    public static void singleLoopAlgorithm(int n) {
        int total = 0; // 1 operation: assignment

        // Loop runs 'n' times
        // Loop setup: 1 operation (int i = 0)
        // Loop condition check: (i < n) → n + 1 times
        // Loop increment: i++ → n times
        // Loop body: total += i → 3 operations per iteration (read total, add i, assign result)
        for (int i = 0; i < n; i++) { // 1 + (n + 1) + n = 2n + 1 operations
            total += i;              // 3n operations
        }

        // Total operations in this method:
        // Initialization: 1
        // Loop control: 2n + 1
        // Loop body: 3n
        // => Total: 1 + 2n + 1 + 3n = 5n + 2 operations
    }

    public static void main(String[] args) {
        int[] inputSizes = {1000, 10000, 100000, 1000000}; // 1 operation: array assignment

        // Loop over inputSizes (length = 4)
        // Loop setup: 1 operation (iterator initialization)
        for (int size : inputSizes) { // 1 + 4 × (1 for retrieval + 1 for assignment) = 1 + 8 operations

            long startTime = System.nanoTime(); // 1 operation: assignment
            singleLoopAlgorithm(size);          // 5n + 2 operations (from above)
            long endTime = System.nanoTime();   // 1 operation: assignment

            double durationInMillis = (endTime - startTime) / 1_000_000.0;
            // 4 operations: read endTime, read startTime, subtract, divide, assign

            System.out.printf("Input size: %d, Time taken: %.3f ms%n", size, durationInMillis);
            // 4 operations: read size, read durationInMillis, format string, output
        }

        // Total operations in main loop per iteration:
        // 1 (startTime) + (5n + 2) + 1 (endTime) + 4 (duration calc) + 4 (output) = 5n + 12
        // Loop overhead: 1 (setup) + 8 (retrieval & assignment) = 9
        // Total per iteration: 5n + 12
        // For 4 iterations: 4 × (5n + 12) = 20n + 48
        // Plus array assignment: 1
        // Plus loop setup: 1
        // => Total: 20n + 50 operations
    }
}