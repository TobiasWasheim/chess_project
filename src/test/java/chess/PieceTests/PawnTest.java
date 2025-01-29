package chess.PieceTests;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.PieceTypes.Pawn;
import chess.standard.GameConstants;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class PawnTest {

    @Test
    public void shouldHaveValue1() {
        // Given a pawn
        Piece pawn = new Pawn(Color.WHITE);
        // When evaluating its value
        int value = pawn.getValue();
        // Then assert that it has value 1
        assertThat(value,is(1));
    }

    @Test
    public void shouldBePieceTypePawn() {
        // Given a pawn
        Piece pawn = new Pawn(Color.WHITE);
        // When evaluating its pieceType
        String pieceType = pawn.getPieceType();
        // Then assert that it has value 1
        assertThat(pieceType,is(GameConstants.PAWN));
    }

    @Test
    public void shouldWhitePawnBeWhite() {
        // Given a pawn
        Piece pawn = new Pawn(Color.WHITE);
        // When evaluating its color
        Color color = pawn.getColor();
        // Then assert that it has color WHITE
        assertThat(color,is(Color.WHITE));
    }

    @Test
    public void shouldBlackPawnBeBlack() {
        // Given a pawn
        Piece pawn = new Pawn(Color.BLACK);
        // When evaluating its color
        Color color = pawn.getColor();
        // Then assert that it has color BLACK
        assertThat(color,is(Color.BLACK));
    }

    @Test
    public void shouldWhitePawnMoveOneSquareForward() {
        // Given a white pawn
        Piece pawn = new Pawn(Color.WHITE);
        // When validating if it can move one square forward (from c3 to c4)
        boolean isMoveValid = pawn.isMovementPossible(3,3,4,3);
        // then assert that move is valid
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void shouldBlackPawnMoveOneSquareBackward() {
        // Given a black pawn
        Piece pawn = new Pawn(Color.BLACK);
        // When validating if it can move one square backward (from f5 to f4)
        boolean isMoveValid = pawn.isMovementPossible(5,6,4,6);
        // then assert that move is valid
        assertThat(isMoveValid,is(true));

    }


}
