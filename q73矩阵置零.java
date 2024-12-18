public class q73矩阵置零 {
    class Solution {
        public void setZeroes(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            boolean row0_flag = false;
            boolean col0_flag = false;
            //check if first row has 0
            for(int i=0;i<row;i++){
                if(matrix[0][i]==0){
                    row0_flag = true;
                    break;
                }
            }

            //check if first col has 0
            for(int i = 0; i<col; i++){
                if(matrix[i][0]==0){
                    col0_flag = true;
                    break;
                }
            }
            //use firstline as tag
            for(int i = 0; i<row; i++){
                for(int j = 0; j<col; j++){
                    if(matrix[i][0]==0||matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
            if (row0_flag){
                for(int j = 0; j<col; j++){
                    matrix[0][j]=0;
                }
            }
            if (col0_flag){
                for(int j = 0; j<row; j++){
                    matrix[j][0]=0;
                }
            }
        }
    }
}
