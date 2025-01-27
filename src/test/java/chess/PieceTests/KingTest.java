package chess.PieceTests;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.PieceTypes.King;
import chess.standard.GameConstants;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class KingTest {

    @Test
    public void shouldBePieceTypeKing() {
        // Given a king
        Piece king = new King(Color.WHITE);
        // When evaluating its piece type
        String pieceType = king.getPieceType();
        // Then assert that the piece type is "King"
        assertThat(pieceType,is(GameConstants.KING));
    }

    @Test
    public void shouldHavevalue0() {
        // Given a king
        Piece king = new King(Color.WHITE);
        // When evaluating its value
        int value = king.getValue();
        // Then assert that the value is 0
        assertThat(value,is(0));
    }

    @Test
    public void shouldBeWhiteForWhiteKing() {
        // Given a white king
        Piece king = new King(Color.WHITE);
        // When evaluating its color
        Color color = king.getColor();
        // Then assert that the king has color WHITE
        assertThat(color,is(Color.WHITE));
    }

    @Test
    public void shouldBeBlackForBlackKing() {
        // Given a black king
        Piece king = new King(Color.BLACK);
        // When evaluating its color
        Color color = king.getColor();
        // Then assert that the king has color BLACK
        assertThat(color,is(Color.BLACK));
    }

    @Test
    public void shouldNotBeAbleToMove2SquaresForward() {
        // Given a king
        Piece king = new King(Color.WHITE);
        // When validating if it can move two squares forward (from a1 to a3)
        boolean isMoveValid = king.isMovementPossible(1,1,3,1);
        // Then assert that the move is invalid
        assertThat(isMoveValid,is(false));
    }

    @Test
    public void shouldBeAbleToMove1SquareDiagonally() {
        // Given a king
        Piece king = new King(Color.WHITE);
        // When validating if it can move one square diagonally (from c3 to d4)
        boolean isMoveValid = king.isMovementPossible(3,3,4,4);
        // Then assert that the move is valid
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void shouldBeAbleToMove1SquareBackwards() {
        // Given a king
        Piece king = new King(Color.WHITE);
        // When validating if it can move one square backward (from e5 to e4)
        boolean isMoveValid = king.isMovementPossible(5,5,4,5);
        // Then assert that the move is valid
        assertThat(isMoveValid,is(true));
    }
}
