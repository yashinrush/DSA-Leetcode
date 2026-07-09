class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;      // Last row index
        int endcol = matrix[0].length - 1;   // Last column index

        while (startrow <= endrow && startcol <= endcol) {

            // ================= TOP BOUNDARY =================
            // j is used for column.
            // startrow is fixed and column changes.
            // Example:
            // matrix[0][0] = 1
            // matrix[0][1] = 2
            // matrix[0][2] = 3
            // matrix[0][3] = 4
            for (int j = startcol; j <= endcol; j++) {
                ans.add(matrix[startrow][j]);
            }

            // ================= RIGHT BOUNDARY =================
            // i is used for row.
            // endcol is fixed and row changes.
            // We start from startrow + 1 because the top-right element
            // is already printed in the top boundary.
            // Example:
            // matrix[1][3] = 8
            // matrix[2][3] = 12
            // matrix[3][3] = 16
            for (int i = startrow + 1; i <= endrow; i++) {
                ans.add(matrix[i][endcol]);
            }

            // ================= BOTTOM BOUNDARY =================
            // Print only if more than one row is remaining.
            // Otherwise the same row will be printed twice.
            if (startrow < endrow) {

                // Row is fixed (endrow)
                // Column moves from right to left.
                // endcol-1 because bottom-right element is already printed.
                // Example:
                // matrix[3][2] = 15
                // matrix[3][1] = 14
                // matrix[3][0] = 13
                for (int j = endcol - 1; j >= startcol; j--) {
                    ans.add(matrix[endrow][j]);
                }
            }

            // ================= LEFT BOUNDARY =================
            // Print only if more than one column is remaining.
            // Otherwise the same column will be printed twice.
            if (startcol < endcol) {

                // Column is fixed (startcol)
                // Row moves from bottom to top.
                // endrow-1 because bottom-left is already printed.
                // > startrow because top-left is already printed.
                // Example:
                // matrix[2][0] = 9
                // matrix[1][0] = 5
                for (int i = endrow - 1; i > startrow; i--) {

                    // LEFT boundary uses startcol, NOT startrow
                    ans.add(matrix[i][startcol]);
                }
            }

            // Spiral completed for one layer.
            // Move towards the inner layer.
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }

        return ans;
    }
}