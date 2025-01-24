package chess.PieceTypes;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.standard.GameConstants;

public class Rook implements Piece {

    private Color color;

    public Rook(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String getPieceType() {
        return GameConstants.ROOK;
    }

    @Override
    public int getValue() {
        return 5;
    }

    @Override
    public boolean isMovementPossible(int fromRow, int fromCol, int toRow, int toCol) {
        // Rook moves to the side
        if (fromRow != toRow && fromCol == toCol) {
            return true;
        }
        // Rook moves straight
        if (fromRow == toRow && fromCol != toCol) {
            return true;
        }
        // If rook does not move straight or to the side
        return false;
    }
}
