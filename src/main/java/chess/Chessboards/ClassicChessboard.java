package chess.Chessboards;

import chess.Frameworks.Chessboard;
import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.PieceTypes.EmptySquare;
import chess.PieceTypes.Pawn;

public class ClassicChessboard implements Chessboard {

    private Piece[][] chessboard = {

        {},     // Row 1
        {new Pawn(Color.WHITE),new Pawn(Color.WHITE),new Pawn(Color.WHITE),new Pawn(Color.WHITE),      // Row 2
         new Pawn(Color.WHITE),new Pawn(Color.WHITE),new Pawn(Color.WHITE),new Pawn(Color.WHITE)},     // Row 2
        {new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare(),                    // Row 3
         new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare()},                   // Row 3
        {new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare(),                    // Row 4
         new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare()},                   // Row 4
        {new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare(),                    // Row 5
         new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare()},                   // Row 5
        {new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare(),                    // Row 6
         new EmptySquare(), new EmptySquare(),new EmptySquare(), new EmptySquare()},                   // Row 6
        {new Pawn(Color.BLACK),new Pawn(Color.BLACK),new Pawn(Color.BLACK),new Pawn(Color.BLACK),      // Row 7
         new Pawn(Color.BLACK),new Pawn(Color.BLACK),new Pawn(Color.BLACK),new Pawn(Color.BLACK)},     // Row 7
        {}      // Row 8
                                            };    

    @Override
    public Piece[][] getChessboard() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getRowLength() {
        return 8;
    }

    @Override
    public int getColumnLength() {
        return 8;
    }

}
