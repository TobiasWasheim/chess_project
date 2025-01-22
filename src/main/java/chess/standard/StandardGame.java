package chess.standard;

import chess.Frameworks.Chessboard;
import chess.Frameworks.Color;
import chess.Frameworks.Game;
import chess.Frameworks.Piece;
import chess.Frameworks.Status;

public class StandardGame implements Game {

    private int turnNumber = 0;
    private Chessboard chessboard;

    public StandardGame(Chessboard chessboard) {
        // Chess board
        this.chessboard = chessboard;

    }

    @Override
    public Color getWinner() {
        return Color.WHITE;
    }

    @Override
    public Color getPlayerInTurn() {
        if (turnNumber % 2 == 0) {return Color.WHITE;}
        return Color.BLACK;
    }

    @Override
    public int getTurnNumber() {
        return turnNumber;
    }

    @Override
    public Status movePiece(Piece piece) {
        return Status.OK;
    }

    @Override
    public void endTurn() {
        turnNumber++;
    }

}
