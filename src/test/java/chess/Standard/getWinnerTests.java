package chess.Standard;

import chess.Chessboards.ClassicalChessboard;
import chess.Chessboards.EmptyChessboard;
import chess.Frameworks.Chessboard;
import chess.Frameworks.Color;
import chess.Frameworks.Game;
import chess.PieceTypes.King;
import chess.standard.StandardGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static chess.Frameworks.Color.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class getWinnerTests {

    @Test
    public void shouldBeNoWinnerIfBothKingsExist() {
         // Given a standardGame with a classical chess board
        Chessboard chessboard = new ClassicalChessboard();
        Game game = new StandardGame(chessboard);
        // When evaluating the winner of the game
        Color winner = game.getWinner();
        // Then asserting that the winner should be NON
        assertThat(winner,is(NON));
    }

    @Test
    public void shouldBeNoWinnerIfNoKings() {
        // Given a game with an empty board
        Chessboard chessboard = new EmptyChessboard();
        Game game = new StandardGame(chessboard);
        // When evaluating the winner of the game
        Color winner = game.getWinner();
        // Then asserting that the winner should be NON
        assertThat(winner,is(NON));
    }

    @Test
    public void shouldBeWhiteWinsIfOnlyWhiteKingExists() {
        // Given a game with an empty board and adding a white king to e1.
        Chessboard chessboard = new EmptyChessboard();
        chessboard.replacePieceAt(new King(WHITE),1,5);
        Game game = new StandardGame(chessboard);
        // When evaluating the winner of the game
        Color winner = game.getWinner();
        // Then asserting that the winner should be WHITE
        assertThat(winner,is(WHITE));

    }

    @Test
    public void shouldBeBlackWinsIfOnlyBlackKingExists() {
        // Given a game with an empty board and adding a black king to e8.
        Chessboard chessboard = new EmptyChessboard();
        chessboard.replacePieceAt(new King(BLACK),8,5);
        Game game = new StandardGame(chessboard);
        // When evaluating the winner of the game
        Color winner = game.getWinner();
        // Then asserting that the winner should be BLACK
        assertThat(winner,is(BLACK));

    }
}
