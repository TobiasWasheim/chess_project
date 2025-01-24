package chess.PieceTests;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.PieceTypes.Rook;
import chess.standard.GameConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RookTest {


    @Test
    public void shouldBePieceTypeRook() {
        // Given a rook
        Piece rook = new Rook(Color.WHITE);
        // assert that piece type is "Rook"
        String type = rook.getPieceType();
        assertThat(type,is(GameConstants.ROOK));
    }

    @Test
    public void shouldHaveValue5() {
        // Given a rook
        Piece rook = new Rook(Color.WHITE);
        // assert that the value is 5
        int value = rook.getValue();
        assertThat(value,is(5));
    }

    @Test
    public void shouldHaveColorWhiteForWhiteRook() {
        // Given a white rook
        Piece rook = new Rook(Color.WHITE);
        // Assert that the color is WHITE
        Color color = rook.getColor();
        assertThat(color,is(Color.WHITE));
    }

    @Test
    public void shouldHaveColorBlackForBlackRook() {
        // Given a black rook
        Piece rook = new Rook(Color.BLACK);
        // Assert that the color is BLACK
        Color color = rook.getColor();
        assertThat(color,is(Color.BLACK));
    }

    @Test
    public void shouldMoveStraight() {
        // Given a rook
        Piece rook = new Rook(Color.WHITE);
        // When the rook moves 3 squares forward (from a1 to a4)
        boolean moveIsValid = rook.isMovementPossible(1,1,1,4);
        assertThat(moveIsValid,is(true));
    }

    @Test
    public void shouldMoveToTheSide() {
        // Given a rook
        Piece rook = new Rook(Color.WHITE);
        // When the rook moves 5 squares to the left (from a2 to f2)
        boolean moveIsValid = rook.isMovementPossible(1,2,6,2);
        assertThat(moveIsValid,is(true));
    }

    @Test
    public void shouldNotMoveDiagonally() {
        // Given a rook
        Piece rook = new Rook(Color.WHITE);
        // When the rook moves 3 squares diagonally (from a1 to d4)
        boolean moveIsValid = rook.isMovementPossible(1,1,4,4);
        assertThat(moveIsValid,is(false));
    }
}
