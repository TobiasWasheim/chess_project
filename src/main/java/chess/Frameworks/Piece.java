package chess.Frameworks;

public interface Piece {

    Color getColor();

    String getPieceType();

    int getHealth();

    void setHealth(int value);

    int getValue();

    boolean isMovementPossible(int fromRow, int fromCol, int toRow, int toCol);

}
