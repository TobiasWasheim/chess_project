package chess.PieceTypes;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.standard.GameConstants;

public class Queen implements Piece {


    private final Color color;

    public Queen(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String getPieceType() {
        return GameConstants.QUEEN;
    }

    @Override
    public int getValue() {
        return 9;
    }

    @Override
    public boolean isMovementPossible(int fromRow, int fromCol, int toRow, int toCol) {

        // Queen moving to the side
        if (fromRow != toRow && fromCol == toCol) {
            return true;
        }
        // Queen moves straight
        if (fromRow == toRow && fromCol != toCol) {
            return true;
        }

        // Queen moves diagonally
        if (fromRow - fromCol == toRow - toCol) {
            return true;
        }

        // Else returns cannot move
        return false;
    }
}
