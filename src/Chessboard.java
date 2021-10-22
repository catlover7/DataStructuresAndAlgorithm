import org.junit.Test;

/**
 * @author 韩志伟
 * @Description 棋盘覆盖问题 学号 2019122030 特殊棋盘（1,1）
 * L型骨牌：用到的L型骨牌个数为(4^k-1)/3 ,将所有L型骨牌从1开始连续编号，用一个全局变量表示：
 * static int tile =1；
 * @create 2021-09-26-21:01
 */
class ChessboardCoverage {

    public static int tile = 1;
    public int[][] board; // 整形数组保存棋盘
    public ChessboardCoverage(int size) {

        board = new int[size][size];
    }
    /**
     * 棋盘覆盖函数
     * @param tr	标示当前所在棋盘的左上角行位置
     * @param tc	标示当前所在棋盘的左上角列位置
     * @param dr	标示特殊棋盘的行位置
     * @param dc	标示特殊棋盘的列位置
     * @param size	棋盘的长度
     */
    public void ChessBoard(int tr,int tc, int dr, int dc, int size) {

        if(size==1) {
            // 递归边界
            return ;
        }
        int t = tile ++;	// L型骨牌编号
        int s = size/2; 		// 分割棋盘
        // 覆盖左上角子棋盘
        if(dr<tr+s && dc<tc+s) {

            // 特殊方格在此棋盘中
            ChessBoard(tr, tc, dr, dc, s);
        }else {

            // 此棋盘中无特殊方格，用t号L型骨牌覆盖右下角
            board[tr+s-1][tc+s-1] = t;
            // 覆盖其余方格
            ChessBoard(tr,tc,tr+s-1,tc+s-1,s);
        }

        // 覆盖右上角子棋盘
        if(dr<tr+s && dc>=tc+s) {

            //	特殊方格在此棋盘中
            ChessBoard(tr, tc+s, dr, dc, s);
        }else {

            // 此棋盘中无特殊方格，用t号L型骨牌覆盖左下角
            board[tr+s-1][tc+s] = t;
            // 覆盖其余方格
            ChessBoard(tr, tc+s, tr+s-1, tc+s, s);
        }
        //	覆盖左下角子棋盘
        if(dr>=tr+s && dc<tc+s) {

            // 特殊方格在此棋盘中
            ChessBoard(tr+s, tc, dr, dc,s);
        }else {

            // 此棋盘中无特殊方格，用t号 L型骨牌覆盖右上角
            board[tr+s][tc+s-1] = t;
            // 覆盖其余方格
            ChessBoard(tr+s, tc, tr+s, tc+s-1,s);
        }
        // 覆盖右下角子棋盘
        if(dr>=tr+s && dc>=tc+s) {

            // 特殊方格在此棋盘中
            ChessBoard(tr+s, tc+s, dr, dc, s);
        }else {

            // 此棋盘中无特殊方格， 用t号L型骨牌
            board[tr+s][tc+s] = t;
            // 覆盖其余方格
            ChessBoard(tr+s, tc+s, tr+s,tc+s,s);
        }
    }


    /**
     * 测试size=8的情况
     * @param args
     */
    public static void main(String[] args) {

        ChessboardCoverage chessboardCoverage = new ChessboardCoverage(8);
        chessboardCoverage.ChessBoard(0, 0, 1, 1, 8);
        for(int i=0; i<chessboardCoverage.board.length; i++) {

            for(int j=0; j<chessboardCoverage.board.length; j++) {

                System.out.print(String.format("%5d", chessboardCoverage.board[i][j]));
            }
            System.out.println();
        }
    }
}