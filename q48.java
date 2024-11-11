public class q48 {
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            int[][] tmp = new int[n][];
            for(int i=0;i<n;i++){
                tmp[i] = matrix[i].clone();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[j][n - 1 - i] = tmp[i][j];
                }
            }

        }
    }
}
