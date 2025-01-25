package chess.PieceTests;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.PieceTypes.Queen;
import chess.standard.GameConstants;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class QueenTest {

    @Test
    public void shouldHaveValue9() {
        // Given a queen
        Piece queen = new Queen(Color.WHITE);
        // Getting its value
        int value = queen.getValue();
        // Assert that it has value 9
        assertThat(value,is(9));
    }

    @Test
    public void shouldBePieceTypeQueen() {
        // Given a queen
        Piece queen = new Queen(Color.WHITE);
        // Getting its piece type
        String pieceType = queen.getPieceType();
        // Assert that it has piece type Queen
        assertThat(pieceType,is(GameConstants.QUEEN));
    }

    @Test
    public void shouldHaveColorWhiteForWhiteQueen() {
        // Given a queen
        Piece queen = new Queen(Color.WHITE);
        // Getting its color
        Color color = queen.getColor();
        // Assert that the color is WHITE
        assertThat(color,is(Color.WHITE));
    }

    @Test
    public void shouldHaveColorBlackForBlackQueen() {
        // Given a queen
        Piece queen = new Queen(Color.BLACK);
        // Getting its color
        Color color = queen.getColor();
        // Assert that the color is BLACK
        assertThat(color,is(Color.BLACK));
    }

    @Test
    public void shouldMoveStraight() {
        // Given a queen
        Piece queen = new Queen(Color.WHITE);
        // Validating if it can move straight from b3 to b8
        boolean isMoveValid = queen.isMovementPossible(3,2,8,2);
        // Assert that the queen can move straight
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void shouldMoveToTheSide() {
        // Given a queen
        Piece queen = new Queen(Color.WHITE);
        // Validating if it can move to the side from c1 to g1
        boolean isMoveValid = queen.isMovementPossible(1,3,1,7);
        // Assert that the queen can move to the side
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void shouldMoveDiagonally() {
        // Given a queen
        Piece queen = new Queen(Color.WHITE);
        // Validating if it can move diagonally from a1 to f6
        boolean isMoveValid = queen.isMovementPossible(1,1,6,6);
        // Assert that the queen can move to the side
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void shouldNotMoveLikeKnight() {
        // Given a queen
        Piece queen = new Queen(Color.WHITE);
        // Validating if it can move like a knight from f3 to e5
        boolean isMoveValid = queen.isMovementPossible(3,6,5,5);
        // Assert that the queen cannot move like a knight
        assertThat(isMoveValid,is(false));
    }
}
