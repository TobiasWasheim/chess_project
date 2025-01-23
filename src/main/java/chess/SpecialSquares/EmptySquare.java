package chess.SpecialSquares;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.standard.GameConstants;

public class EmptySquare implements Piece {

    @Override
    public int getHealth() {
        return 0;
    }

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
        return GameConstants.EMPTYSQUARE;
    }

    @Override
    public Color getColor() {
        return Color.NON;
    }

    @Override
    public void setHealth(int value) {}
}
