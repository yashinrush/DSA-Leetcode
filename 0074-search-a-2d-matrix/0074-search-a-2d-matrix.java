class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //bruteforce
        int row = matrix.length;
        int col = matrix[0].length;
        // for(int i=0; i<row; i++){//this loop help to find out the number of rows in the matrix
        //     for(int j=0; j<col; j++){// this loop help to find out the number of colums in the matrix
        //         if(matrix[i][j]==target){// this loop help to compare the target with the elements of the matrix
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //binary search approch
        int start = 0;
        int end = row*col-1;

        while(start<= end){
            int mid = start + (end - start) / 2;

            int midElement = matrix[mid / col][mid % col];

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}