package chess.Frameworks;

public interface Piece {

    Color getColor();

    String getPieceType();

    int getValue();

    boolean isMovementPossible(int fromRow, int fromCol, int toRow, int toCol);

}
