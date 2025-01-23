package chess.Frameworks;

public interface Chessboard {

    void replacePieceAt(Piece piece, int row, int col);

    int getRowLength();

    int getColumnLength();

    Piece[][] getChessboard();

    Piece getPieceAt(int row, int column);
}
