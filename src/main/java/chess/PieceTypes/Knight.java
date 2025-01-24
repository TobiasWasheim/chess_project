package chess.PieceTypes;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.standard.GameConstants;

public class Knight implements Piece {

    private final Color color;

    public Knight(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String getPieceType() {
        return GameConstants.KNIGHT;
    }

    @Override
    public int getValue() {
        return 3;
    }

    @Override
    public boolean isMovementPossible(int fromRow, int fromCol, int toRow, int toCol) {
        // Note to self: Code can be simplified, but this is more readable!

        // Moves one square forward/backwards and two squares to the side
        if (Math.abs(fromRow-toRow) == 1 && Math.abs(fromCol - toCol) == 2) {
            return true;
        }
        // Moves two square forward/backwards and one squares to the side
        if (Math.abs(fromRow-toRow) == 2 && Math.abs(fromCol - toCol) == 1) {
            return true;
        }
        // Else return false
        return false;
    }
}
