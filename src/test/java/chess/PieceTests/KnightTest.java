package chess.PieceTests;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.PieceTypes.Knight;
import chess.standard.GameConstants;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class KnightTest {

    @Test
    public void shouldHaveValue3() {
        // Given a knight
        Piece knight = new Knight(Color.WHITE);
        // When evaluating its value
        int value = knight.getValue();
        // Assert that it is 3
        assertThat(value,is(3));
    }

    @Test
    public void shouldbePieceTypeKnight() {
        // Given a knight
        Piece knight = new Knight(Color.WHITE);
        // when evaluating its piece type
        String pieceType = knight.getPieceType();
        // Assert that it is a knight
        assertThat(pieceType,is(GameConstants.KNIGHT));
    }

    @Test
    public void shouldHaveColorWhiteForWhiteKnight() {
        // Given a white knight
        Piece knight = new Knight(Color.WHITE);
        // when evaluating its color
        Color color = knight.getColor();
        // Assert that the color is WHITE
        assertThat(color,is(Color.WHITE));
    }

    @Test
    public void shouldHaveColorBlackForBlackKnight() {
        // Given a black knight
        Piece knight = new Knight(Color.BLACK);
        // Evaluating its color
        Color color = knight.getColor();
        // Assert that the color is BLACK
        assertThat(color,is(Color.BLACK));
    }

    @Test
    public void shouldMoveTwoColumnsAndOneRow() {
        // Given a knight
        Piece knight = new Knight(Color.WHITE);
        // Checking if moving the knight two columns and one row (from d3 to e5) is possible
        Boolean isMoveValid = knight.isMovementPossible(3,4,5,5);
        // Assert that move is valid
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void shouldMoveOneColumnAndTwoRows() {
        // Given a knight
        Piece knight = new Knight(Color.WHITE);
        // Checking if moving the knight one column and two rows (from a1 to b3) is possible
        Boolean isMoveValid = knight.isMovementPossible(1,1,3,2);
        // Assert that the move is valid
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void shouldNotBeAbleToMoveDiagonally() {
        // Given a knight
        Piece knight = new Knight(Color.WHITE);
        // Checking if moving the knight three squares diagoanlly (a1 to d4) is possible
        Boolean isMovevalid = knight.isMovementPossible(1,1,4,4);
        // Assert that the move is not valid
        assertThat(isMovevalid,is(false));
    }
}
