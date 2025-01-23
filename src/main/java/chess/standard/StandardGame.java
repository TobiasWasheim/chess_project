package chess.standard;

import chess.Frameworks.Chessboard;
import chess.Frameworks.Color;
import chess.Frameworks.Game;
import chess.Frameworks.Piece;
import chess.Frameworks.Status;

public class StandardGame implements Game {

    private int turnNumber;

    public StandardGame() {
        // Initialize turn number
        this.turnNumber = 0;
        
        // Initialize chessboard



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
    public Status movePiece(Piece piece, int fromRow, int fromCol, int toRow, int toCol) {
        return null;
    }

    @Override
    public void endTurn() {
        turnNumber++;
    }

    @Override
    public Chessboard getChessboard() {
        return null;
    }

    @Override
    public Piece getPieceAt(int row, int column) {
        return null;
    }

}
