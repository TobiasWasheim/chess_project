package chess.PieceTypes;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.standard.GameConstants;

public class King implements Piece {

    private final Color color;

    public King(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String getPieceType() {
        return GameConstants.KING;
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public boolean isMovementPossible(int fromRow, int fromCol, int toRow, int toCol) {
        return Math.abs(toRow-fromRow) == 1 || Math.abs(toCol - fromCol) == 1;
    }
}
