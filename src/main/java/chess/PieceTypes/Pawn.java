package chess.PieceTypes;

import chess.Frameworks.Chessboard;
import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.standard.GameConstants;

import static chess.Frameworks.Color.BLACK;
import static chess.Frameworks.Color.WHITE;

public class Pawn implements Piece {

    private Color color;

    public Pawn(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String getPieceType() {
        return GameConstants.PAWN;
    }

    @Override
    public int getValue() {
        return 1;
    }

    @Override
    public boolean isMovementPossible(int fromRow, int fromCol, int toRow, int toCol) {

        // White pawn moves 1 square forwards or two squares forward in first turn
        if (color.equals(WHITE) && toCol == fromCol && toRow - fromRow == 1) {

            return true;
        }

        // Black pawn moves 1 square backwards
        if (color.equals(BLACK) && toCol == fromCol && toRow - fromRow == -1) {
            return true;
        }

        return false;
    }
}
