class Solution {
    public int[][] transpose(int[][] matrix) {
        //numbers of rows in the original matrix
        int rows = matrix.length;
        //number of columns in the original matrix
        int cols = matrix[0].length;
        //create a new matrix with swapped dimensions
        int[][] transpose = new int[cols][rows];

        //traverse the original matrix
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                //swap rows and cols indices
                transpose[j][i]=matrix[i][j];
            }
        }
        //return the transpose matrix
        return transpose;

    }
}