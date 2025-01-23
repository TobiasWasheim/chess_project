package chess.SpecialSquares;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.standard.GameConstants;

public class EmptySquare implements Piece {

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public boolean isMovementPossible(int fromRow, int fromCol, int toRow, int toCol) {
        // Default - as empty squares cannot move
        return false;
    }

    @Override
    public String getPieceType() {
        // has empty square type
        return GameConstants.EMPTYSQUARE;
    }

    @Override
    public Color getColor() {
        // has non-color (might change that in the future to get black/white chess board?)
        return Color.NON;
    }

}
