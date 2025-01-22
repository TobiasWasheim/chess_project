package chess.Frameworks;

public interface Game {

    Chessboard getChessboard();

    Piece getPieceAt(int row, int column);

    Color getWinner();

    Color getPlayerInTurn();

    int getTurnNumber();

    Status movePiece(Piece piece);

    void endTurn();

}
