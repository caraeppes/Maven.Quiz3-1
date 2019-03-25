package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];
        for(int i = 0; i < 3; i++){
            column[i] = getRow(i)[value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return getRow(rowIndex)[0].equals(getRow(rowIndex)[1]) && getRow(rowIndex)[0].equals(getRow(rowIndex)[2]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return getColumn(columnIndex)[0].equals(getColumn(columnIndex)[1]) &&
                getColumn(columnIndex)[0].equals(getColumn(columnIndex)[2]);
    }

    public Boolean isTopToBottomDiagonalHomogenous(){
        return board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]);
    }

    public Boolean isBottomToTopDiagonalHomogenous(){
        return board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]);
    }

    public String getWinner() {
        for(int i = 0; i < 3; i++){
            if(isRowHomogenous(i)){
                return board[i][0];
            }
            if(isColumnHomogeneous(i)){
                return getColumn(i)[0];
            }
            if(isTopToBottomDiagonalHomogenous() || isBottomToTopDiagonalHomogenous()) {
                return board[1][1];
            }
        }
        return "";
    }

    public String[][] getBoard() {
        return board;
    }
}
