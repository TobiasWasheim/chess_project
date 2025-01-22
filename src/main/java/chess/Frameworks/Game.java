package chess.Frameworks;

public interface Game {

    Color getWinner();

    Color getPlayerInTurn();

    int getTurnNumber();

    Status movePiece(Piece piece);

    void endTurn();



}
