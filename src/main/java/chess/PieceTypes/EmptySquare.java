package chess.PieceTypes;

import chess.Frameworks.Chessboard;
import chess.Frameworks.Piece;
import chess.Frameworks.Status;

public class EmptySquare implements Piece {

    @Override
    public Status isMovementAllowed(int fromRow, int fromCol, int toRow, int toCol) {
        return Status.OK;
    }

    @Override
    public Chessboard controlSquares() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
