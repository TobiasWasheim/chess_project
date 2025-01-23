package chess.Strategies.ChessboardStrategy;

import chess.Frameworks.Chessboard;
import chess.Frameworks.Piece;
import chess.SpecialSquares.EmptySquare;

public class EmptyChessboard implements Chessboard {

    /*
    Initialize a chess board with empty squares 
    */
    private Piece[][] chessboard = 
    {    
        {new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare()},
        {new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare()},
        {new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare()},
        {new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare()},
        {new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare()},
        {new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare()},
        {new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare()},
        {new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare()}
    };

    @Override
    public int getRowLength() {
        return chessboard.length;
    }

    @Override
    public int getColumnLength() {
        return chessboard[0].length;
    }

    @Override
    public Piece[][] getChessboard() {
        return chessboard;
    }

    @Override
    public Piece getPieceAt(int row, int column) {
        return chessboard[row+1][column+1];
    }

    @Override
    public void replacePieceAt(Piece piece, int row, int col) {
        chessboard[row+1][col+1] = piece;
    }
}