package chess.Frameworks;

public interface Piece {

    int getHealth();

    int getValue();

    Status isMovementAllowed(int fromRow, int fromCol, int toRow, int toCol);

}
