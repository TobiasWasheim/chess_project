package chess.Chessboards;

import chess.Frameworks.Chessboard;
import chess.Frameworks.Piece;
import chess.PieceTypes.*;
import chess.SpecialSquares.EmptySquare;

import static chess.Frameworks.Color.BLACK;
import static chess.Frameworks.Color.WHITE;

public class ClassicalChessboard implements Chessboard {

    private final Piece[][] chessboard = {
            {new Rook(WHITE), new Knight(WHITE), new Bishop(WHITE), new Queen(WHITE), new Knight(WHITE), new Bishop(WHITE), new Knight(WHITE), new Rook(WHITE)},
            {new Pawn(WHITE), new Pawn(WHITE),new Pawn(WHITE), new Pawn(WHITE),new Pawn(WHITE), new Pawn(WHITE),new Pawn(WHITE), new Pawn(WHITE)},
            {new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare()},
            {new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare()},
            {new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare()},
            {new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare(), new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare()},
            {new Pawn(BLACK), new Pawn(BLACK),new Pawn(BLACK), new Pawn(BLACK),new Pawn(BLACK), new Pawn(BLACK),new Pawn(BLACK), new Pawn(BLACK)},
            {new Rook(BLACK), new Knight(BLACK), new Bishop(BLACK), new Queen(BLACK), new Knight(BLACK), new Bishop(BLACK), new Knight(BLACK), new Rook(BLACK)}
    };

    @Override
    public void replacePieceAt(Piece piece, int row, int col) {
        chessboard[row-1][col-1] = piece;
    }

    @Override
    public int getRowLength() {
        return chessboard[0].length;
    }

    @Override
    public int getColumnLength() {
        return chessboard.length;
    }

    @Override
    public Piece[][] getChessboard() {
        return chessboard;
    }

    @Override
    public Piece getPieceAt(int row, int column) {
        return chessboard[row-1][column-1];
    }
}
