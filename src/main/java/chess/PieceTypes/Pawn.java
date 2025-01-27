package chess.PieceTypes;

import chess.Frameworks.Chessboard;
import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.standard.GameConstants;

import static chess.Frameworks.Color.BLACK;
import static chess.Frameworks.Color.WHITE;

public class Pawn implements Piece {

    private final Color color;
    private final Chessboard chessboard;

    public Pawn(Color color, Chessboard chessboard) {
        this.color = color;
        this.chessboard = chessboard;
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
        if (color.equals(WHITE) && toCol == fromCol && (toRow - fromRow == 1 || toRow == 4)) {

            return true;
        }

        // Black pawn moves 1 square backwards
        if (color.equals(BLACK) && toCol == fromCol && (toRow - fromRow == -1 || toRow == chessboard.getRowLength()-3)) {
            return true;
        }

        // White pawn attacks piece diagonally infront
        String defendingPieceType = chessboard.getPieceAt(toRow,toCol).getPieceType();
        boolean movesDiagonallyForward = toRow - fromRow == 1 && Math.abs(toCol - fromCol) == 1;
        if (color.equals(WHITE) && movesDiagonallyForward && ! defendingPieceType.equals(GameConstants.EMPTYSQUARE)) {
            return true;
        }

        // Black pawn attacks piece diagonally backward
        boolean movesDiagonallybackward = toRow - fromRow == -1 && Math.abs(toCol - fromCol) == 1;
        if (color.equals(BLACK) && movesDiagonallybackward && ! defendingPieceType.equals(GameConstants.EMPTYSQUARE)) {
            return true;
        }

        return false;
    }
}
