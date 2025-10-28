package boardgame;

public class Piece {

    protected boardgame.Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    protected void setPosition(boardgame.Position position) {
        this.position = position;
    }
}
