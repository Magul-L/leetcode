public class q289生命游戏 {
    class Solution {
        public void gameOfLife(int[][] board) {
            int n = board[0].length;
            int m = board.length;
            int count = 0;              // 统计每个格子周围八个位置的活细胞数
            for(int i =0;i<m;i++){
                for(int j =0;j<n;j++){
                    count = 0;
                    for(int x = -1; x <= 1; x++){
                        for(int y = -1; y <= 1; y++){
                            // 枚举周围八个位置，其中去掉本身（x = y = 0）和越界的情况
                            if((x == 0 && y == 0) || i + x < 0 || i + x >= m || j + y < 0 || j + y >= n)continue;
                            // 如果周围格子是活细胞（1）或者是活细胞变死细胞（2）的，都算一个活细胞
                            if(board[i + x][j + y] == 1 || board[i + x][j + y] == 2)count++;
                        }
                    }
                    if(board[i][j] == 1 && (count < 2 || count > 3))board[i][j] = 2;    // 格子本身是活细胞，周围满足变成死细胞的条件，标记为2
                    if(board[i][j] == 0 && count == 3)board[i][j] = 3;



                }
            }
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    // 死细胞为0，活细胞变成死细胞为2，都为偶数，模2为0，刚好是死细胞
                    // 活细胞为1，死细胞变成活细胞为3，都为奇数，模2为1，刚好是活细胞
                    board[i][j] %= 2;
                }
            }



        }
    }
}
