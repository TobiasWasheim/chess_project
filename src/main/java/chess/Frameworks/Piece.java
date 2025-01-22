package chess.Frameworks;

public interface Piece {

    Status isMovementAllowed(int fromRow, int fromCol, int toRow, int toCol);

    Chessboard controlSquares();

}
