package chess.PieceTests;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.PieceTypes.Bishop;
import chess.standard.GameConstants;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class BishopTest {

    @Test
    public void shouldHaveValue3() {
        // Given a bishop
        Piece bishop = new Bishop(Color.WHITE);
        // Evaluating its value
        int value = bishop.getValue();
        // Assert that it is 3
        assertThat(value,is(3));
    }

    @Test
    public void shouldHaveColorWhiteForWhiteBishop() {
        // Given a white bishop
        Piece bishop = new Bishop(Color.WHITE);
        // Evaluating its color
        Color color = bishop.getColor();
        // Assert that it is WHITE
        assertThat(color,is(Color.WHITE));
    }

    @Test
    public void shouldHaveColorBlackForBlackBishop() {
        // Given a black bishop
        Piece bishop = new Bishop(Color.BLACK);
        // Evaluating its color
        Color color = bishop.getColor();
        // Assert that it is BLACK
        assertThat(color,is(Color.BLACK));
    }

    @Test
    public void shouldBePieceTypeBishop() {
        // Given a bishop
        Piece bishop = new Bishop(Color.WHITE);
        // Evaluating its piece type
        String pieceType = bishop.getPieceType();
        // Assert that the piece type is Bishop
        assertThat(pieceType,is(GameConstants.BISHOP));
    }

    @Test
    public void shouldMoveDiagonally() {
        // Given a bishop
        Piece bishop = new Bishop(Color.WHITE);
        // Validating if it possible to move bishop diagonally from a1 to e5
        Boolean isMoveValid = bishop.isMovementPossible(1,1,5,5);
        // Assert that the move is valid
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void shouldNotMoveStraight() {
        // Given a bishop
        Piece bishop = new Bishop(Color.WHITE);
        // Validating if it possible to move bishop straight from d3 to d7
        Boolean isMoveValid = bishop.isMovementPossible(3,4,7,4);
        // Assert that the move is valid
        assertThat(isMoveValid,is(false));
    }
}
