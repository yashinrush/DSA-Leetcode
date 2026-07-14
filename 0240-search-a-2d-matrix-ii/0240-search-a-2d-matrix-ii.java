class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // Start from the top-right corner of the matrix
        int row = 0;
        int col = matrix[0].length - 1;

        // Continue until we go outside the matrix
        while (row < matrix.length && col >= 0) {

            // If the current element is the target, return true
            if (matrix[row][col] == target) {
                return true;

            // If the target is smaller than the current element,
            // move LEFT because all elements below are even larger.
            } else if (target < matrix[row][col]) {
                col--;

            // If the target is greater than the current element,
            // move DOWN because all elements to the left are smaller.
            } else {
                row++;
            }
        }

        // Target was not found in the matrix
        return false;
    }
}