class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // Start from the top-right corner
        int row = 0;
        int col = matrix[0].length - 1;

        // Continue until we go out of the matrix
        while (row < matrix.length && col >= 0) {

            // If the current element is the target, return true
            if (matrix[row][col] == target) {
                return true;
            }

            // If the current element is smaller than the target,
            // move DOWN because all elements to the left are even smaller.
            else if (matrix[row][col] < target) {
                row++;
            }

            // If the current element is larger than the target,
            // move LEFT because all elements below are even larger.
            else {
                col--;
            }
        }

        // Target is not present in the matrix
        return false;
    }
}