package chess.PieceTypes;

import chess.Frameworks.Chessboard;
import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.Frameworks.Status;

public class Pawn implements Piece {

    private final Color color;

    public Pawn(Color color) {
        this.color = color;
    }

    @Override
    public Status isMovementAllowed(int fromRow, int fromCol, int toRow, int toCol) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Chessboard controlSquares() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
