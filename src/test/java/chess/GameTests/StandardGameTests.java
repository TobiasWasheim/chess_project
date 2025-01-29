package chess.GameTests;

import chess.Frameworks.Chessboard;
import chess.Frameworks.Color;
import chess.Frameworks.Game;
import chess.Frameworks.Piece;
import chess.PieceTypes.Pawn;
import chess.Chessboards.EmptyChessboard;
import chess.standard.GameConstants;
import chess.standard.StandardGame;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class StandardGameTests {

    private Chessboard chessboard;

    @Test
    public void shouldBeWhiteFirstInTurn() {
        // Given a chess game
        Game game = new StandardGame(chessboard);
        // When getting player in turn for the first round
        Color playerInturn = game.getPlayerInTurn();
        // Then assert that the player is WHITE
        assertThat(playerInturn,is(Color.WHITE));
    }

    @Test
    public void shouldBeBlackSecondInTurn() {
        // Given a chess game
        Game game = new StandardGame(chessboard);
        // When getting player in turn for the second round
        game.endTurn();
        Color playerInTurn = game.getPlayerInTurn();
        // Then assert that the player is BLACK
        assertThat(playerInTurn,is(Color.BLACK));
    }

    @Test
    public void shouldBeTurn0ForFirstTurn() {
        // Given a chess game
        Game game = new StandardGame(chessboard);
        // When getting the player turn number
        int turnNumber = game.getTurnNumber();
        // Then assert that the turn number is 0
        assertThat(turnNumber,is(0));
    }

    @Test
    public void shouldBeTurn1ForSecondTurn() {
        // Given a chess game
        Game game = new StandardGame(chessboard);
        // When getting the player turn for second turn
        game.endTurn();
        int turnNumber = game.getTurnNumber();
        // Then assert that the turn number is 1
        assertThat(turnNumber,is(1));
    }

    @Test
    public void shouldBePawnAtE5ForChessBoardWithPawnAtE5() {
        // Given a chessboard and game
        chessboard = new EmptyChessboard();
        chessboard.replacePieceAt(new Pawn(Color.WHITE), 5,5);
        Game game = new StandardGame(chessboard);
        // When getting piece at E5
        Piece pawn = game.getPieceAt(5,5);
        // Then assert that the pawn should be at e5
        assertThat(pawn.getPieceType(),is(GameConstants.PAWN));
    }
}
