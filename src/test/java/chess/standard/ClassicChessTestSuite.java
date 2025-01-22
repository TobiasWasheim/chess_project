package chess.standard;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

import chess.Frameworks.Color;

public class ClassicChessTestSuite {

    @Test
    public void shouldgetTurnNumberReturn0ForTurn1() {
        // Given a game
        StandardGame game = new StandardGame();

        // When doing nothing
        int turnNumber = game.getTurnNumber();
        // Assert that getTurnNumber() should return 0
        assertThat(turnNumber, is(0));
    }

    @Test
    public void shouldgetTurnNumberReturn1ForTurn2() {
        // Given a game
        StandardGame game = new StandardGame();

        // When ending turn
        game.endTurn();
        int turnNumber = game.getTurnNumber();
        // Assert that getTurnNumber() should return 0
        assertThat(turnNumber, is(1));
    }

    @Test
    public void shouldBeWhiteForFirstTurn() {
        // Given a game
        StandardGame game = new StandardGame();

        // When doing nothing...
        Color playerInTurn = game.getPlayerInTurn();
        assertThat(playerInTurn,is(Color.WHITE));
    }

    @Test
    public void shouldBeBlackForFirstTurn() {
        // Given a game
        StandardGame game = new StandardGame();

        // When next turn
        game.endTurn();
        Color playerInTurn = game.getPlayerInTurn();
        assertThat(playerInTurn,is(Color.BLACK));
    }
}
