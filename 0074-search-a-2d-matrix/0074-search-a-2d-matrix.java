class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //bruteforce
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0; i<row; i++){//this loop help to find out the number of rows in the matrix
            for(int j=0; j<col; j++){// this loop help to find out the number of colums in the matrix
                if(matrix[i][j]==target){// this loop help to compare the target with the elements of the matrix
                    return true;
                }
            }
        }
        return false;
    }
}