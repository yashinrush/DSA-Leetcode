class Solution {
    public int diagonalSum(int[][] mat) {

        int sum = 0;

        // n = number of rows (Matrix is always n x n)
        int n = mat.length;

        // Traverse each row once
        for (int i = 0; i < n; i++) {

            // ================= PRIMARY DIAGONAL =================
            // Row and Column are the same.
            // Formula: mat[i][i]
            //
            // Example:
            // 1 2 3
            // 4 5 6
            // 7 8 9
            //
            // i = 0 -> mat[0][0] = 1
            // i = 1 -> mat[1][1] = 5
            // i = 2 -> mat[2][2] = 9
            sum += mat[i][i];

            // ================= SECONDARY DIAGONAL =================
            // Row increases from top to bottom.
            // Column decreases from right to left.
            //
            // Formula: mat[i][n-1-i]
            //
            // Example:
            // i = 0 -> mat[0][2] = 3
            // i = 1 -> mat[1][1] = 5
            // i = 2 -> mat[2][0] = 7

            // If the current element is NOT the middle element,
            // then add the secondary diagonal.
            //
            // Why?
            // In an odd-sized matrix (3x3, 5x5...), the middle element
            // belongs to both diagonals.
            // Without this condition, it would be added twice.
            if (i != n - 1 - i) {
                sum += mat[i][n - 1 - i];
            }
        }

        // Return total diagonal sum
        return sum;
    }
}