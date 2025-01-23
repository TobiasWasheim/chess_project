package chess.PieceTests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import chess.Frameworks.Piece;
import chess.SpecialSquares.EmptySquare;

public class EmptySquareTest {

    private Piece emptySquare;

    @BeforeEach
    public void setup() {
        // given an empty square
        emptySquare = new EmptySquare();
    }

    @Test
    public void shouldHaveHealth0() {
        // given, assert that health is zero
        int health = emptySquare.getHealth();
        assertThat(health,is(0));
    }

    @Test
    public void shouldHaveValue0() {
        //given, assert that value is zero
        int value = emptySquare.getValue();
        assertThat(value,is(0));
    }

    @Test
    public void shouldNeverBeAllowedMovement() {
        //given, assert that movement is false
        
        // When not moving
        boolean isMovementPossible1 = emptySquare.isMovementPossible(1, 1, 1, 1);
        assertThat(isMovementPossible1, is(false));

        // When moving forward
        boolean isMovementPossible2 = emptySquare.isMovementPossible(1, 1, 1, 4);
        assertThat(isMovementPossible2, is(false));

        // When moving to the side
        boolean isMovementPossible3 = emptySquare.isMovementPossible(1, 1, 8, 1);
        assertThat(isMovementPossible3, is(false));

        // When moving diagonally
        boolean isMovementPossible4 = emptySquare.isMovementPossible(1, 1, 4, 4);
        assertThat(isMovementPossible4, is(false));
    }
}