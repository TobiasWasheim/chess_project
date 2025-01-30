package chess.standard;

import chess.Frameworks.Chessboard;
import chess.Frameworks.Color;
import chess.Frameworks.Game;
import chess.Frameworks.Piece;
import chess.Frameworks.Status;

import java.util.ArrayList;
import java.util.List;

import static chess.Frameworks.Color.*;

public class StandardGame implements Game {

    private int turnNumber;
    private Chessboard chessboard;

    public StandardGame(Chessboard chessboard) {
        // Initialize turn number
        this.turnNumber = 0;
        
        // Initialize chessboard
        this.chessboard = chessboard;
    }

    @Override
    public Color getWinner() {
        ArrayList<Piece> kings = new ArrayList<>();

        // Go through the chessboard
        for (Piece[] list : chessboard.getChessboard()) {
            for (Piece piece : list) {
                String pieceType = piece.getPieceType();
                // If piece is king, add it to the list "kings"
                if (pieceType.equals(GameConstants.KING)) {
                    kings.add(piece);
                }
            }
        }
        // if both kings or zero kings are in the kings list, there is no winner
        if (kings.size() == 2 || kings.isEmpty()) {
            return NON;
        }
        // If only one king is in the list, the color of the king wins
        return kings.get(0).getColor();
    }

    @Override
    public Color getPlayerInTurn() {
        if (turnNumber % 2 == 0) {return WHITE;}
        return BLACK;
    }

    @Override
    public int getTurnNumber() {
        return turnNumber;
    }

    @Override
    public Status movePiece(Piece piece, int fromRow, int fromCol, int toRow, int toCol) {
        // check that player is on turn
        if (! getPlayerInTurn().equals(piece.getColor())) {
            return Status.NOT_OWNER;
        }

        // check that the movement is possible
        if (! piece.isMovementPossible(fromRow,fromCol,toRow,toCol)) {
            return Status.MOVE_NOT_ALLOWED;
        }
        // check that the movement is inside the bounds of the chess board
        if (toRow > 8 || toCol > 8) {
            return Status.MOVE_OUT_OF_INDEX;
        }

        // check that a piece does not attack another piece of same color
        if (piece.getColor().equals(chessboard.getPieceAt(toRow,toCol).getColor())) {
            return Status.ATTACK_NOT_ALLOWED_ON_OWN_PIECE;
        }

        endTurn();
        return Status.OK;
    }

    @Override
    public void endTurn() {
        turnNumber++;
    }

    @Override
    public Chessboard getChessboard() {
        return chessboard;
    }

    @Override
    public Piece getPieceAt(int row, int column) {
        return chessboard.getPieceAt(row,column);
    }

}
