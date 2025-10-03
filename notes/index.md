# DSA Notes

###  Big O Vocabulary

1. Growth rates
2. Common functions
3. Big O notation
4. Slower growth
5. Moderate growth
6. Fast growth
7. Large inputs
8. Grow slowly and are more efficient for
9. Are typical in many algorithms
10. Grow extremely fast and are impractical for

### Growth Rates in Big O Notation

1. **Constant**: O(1)
2. **Logarithmic**: O(log n)
3. **Log-square**: O(log² n)
4. **Root-n**: O(√n)
5. **Linear**: O(n)
6. **Linearithmic**: O(n log n)
7. **Quadratic**: O(n²)
8. **Cubic**: O(n³)
9. **Quartic**: O(n⁴)
10. **Exponential**: O(2ⁿ)
11. **Exponential**: O(eⁿ)
12. **Factorial**: O(n!)

### Graph showing growth rates of the common functions using Big O notation

![graph-growth-rates-big-o.png](img/graph-growth-rates-big-o.png)

### Interpretation ###

* **Slower growth:** Functions like O(1), O(log n), and O(√n) grow slowly and are more efficient for large inputs.
* **Moderate growth:** O(n), O(n log n), and O(n²) are typical in many algorithms.
* **Fast growth:** O(2ⁿ), O(eⁿ), and specially O(n!) grow extremely fast and are impractical for large inputs.

### Operation Counting or Cost Model Analysis

**Operation counting** or **cost model analysis** in the context of algorithmic time complexity involves:

- Counting the number of **primitive operations** such as:
    - Assignments
    - Comparisons
    - Arithmetic operations
    - Read a variable value
    - Output
    - String formatting
- Expressing the **total cost as a function of input size** (e.g., `n`)
- Often used to derive the **exact number of operations** before simplifying to **Big-O notation**

### 🧠 Granularity in Operation Counting

The number of operations in a line of code can vary depending on the **level of analysis**, also known as **granularity**. Here's how it breaks down:

#### 🔹 High-Level (Macro)
- Each line of code is treated as a single or grouped operation.
- This approach is useful for estimating algorithmic complexity, such as Big-O notation.

#### 🔹 Mid-Level
- Lines are broken down into basic programming actions:
    - Memory access
    - Comparisons
    - Assignments

#### 🔹 Low-Level (Micro / Assembly-Like)
- Analysis considers individual CPU instructions:
    - Register loading
    - Arithmetic operations
    - Branching
- This level is used for performance profiling and low-level optimization.

#### ✅ Key Insight

The **operation count depends on the granularity** of your analysis.
- For **theoretical or algorithmic analysis**, a simplified count is sufficient.
- For **performance optimization**, a detailed breakdown is necessary.

### 📐 Steps to Convert `20n + 50` into Big O Notation

#### 1. Identify the Variable
- Determine the input size variable, which is `n` in this case.

#### 2. Focus on Growth
- Big O describes how the number of operations grows as `n` increases.
- Constant values (like `50`) become negligible for large `n`.

#### 3. Drop Constant Coefficients
- The coefficient `20` in `20n` is ignored in Big O.
- Big O focuses on the rate of growth, not the exact number of operations.

#### 4. Keep the Dominant Term
- In `20n + 50`, the term `20n` dominates as `n` grows.
- The constant `50` is dropped.

#### ✅ Final Big O Result
**O(n)**

This means the algorithm has **linear time complexity**, as the number of operations increases proportionally with the input size `n`.