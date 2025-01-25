package chess.PieceTypes;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.standard.GameConstants;

public class Bishop implements Piece {

    private final Color color;

    public Bishop(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String getPieceType() {
        return GameConstants.BISHOP;
    }

    @Override
    public int getValue() {
        return 3;
    }

    @Override
    public boolean isMovementPossible(int fromRow, int fromCol, int toRow, int toCol) {

        // Bishop moving diagonally
        return fromRow - fromCol == toRow - toCol;
    }
}
