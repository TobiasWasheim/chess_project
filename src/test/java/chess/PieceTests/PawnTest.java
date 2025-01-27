package chess.PieceTests;

import chess.Frameworks.Chessboard;
import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.PieceTypes.Pawn;
import chess.Strategies.ChessboardStrategy.EmptyChessboard;
import chess.standard.GameConstants;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class PawnTest {

    private Chessboard chessboard = new EmptyChessboard();

    @Test
    public void shouldHaveValue1() {
        // Given a pawn
        Piece pawn = new Pawn(Color.WHITE, chessboard);
        // When evaluating its value
        int value = pawn.getValue();
        // Then assert that it has value 1
        assertThat(value,is(1));
    }

    @Test
    public void shouldBePieceTypePawn() {
        // Given a pawn
        Piece pawn = new Pawn(Color.WHITE, chessboard);
        // When evaluating its pieceType
        String pieceType = pawn.getPieceType();
        // Then assert that it has value 1
        assertThat(pieceType,is(GameConstants.PAWN));
    }

    @Test
    public void shouldWhitePawnBeWhite() {
        // Given a pawn
        Piece pawn = new Pawn(Color.WHITE, chessboard);
        // When evaluating its color
        Color color = pawn.getColor();
        // Then assert that it has color WHITE
        assertThat(color,is(Color.WHITE));
    }

    @Test
    public void shouldBlackPawnBeBlack() {
        // Given a pawn
        Piece pawn = new Pawn(Color.BLACK, chessboard);
        // When evaluating its color
        Color color = pawn.getColor();
        // Then assert that it has color BLACK
        assertThat(color,is(Color.BLACK));
    }

    @Test
    public void shouldWhitePawnMoveOneSquareForward() {
        // Given a white pawn
        Piece pawn = new Pawn(Color.WHITE,chessboard);
        // When validating if it can move one square forward (from c3 to c4)
        boolean isMoveValid = pawn.isMovementPossible(3,3,4,3);
        // then assert that move is valid
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void shouldBlackPawnMoveOneSquareBackward() {
        // Given a black pawn
        Piece pawn = new Pawn(Color.BLACK,chessboard);
        // When validating if it can move one square backward (from f5 to f4)
        boolean isMoveValid = pawn.isMovementPossible(5,6,4,6);
        // then assert that move is valid
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void shouldWhitePawnMove2SquaresForwardWhenOnSecondRow() {
        // Given a white pawn
        Piece pawn = new Pawn(Color.WHITE,chessboard);
        // When validating if it can move one square forward (from a2 to a4)
        boolean isMoveValid = pawn.isMovementPossible(2,1,4,1);
        // then assert that move is valid
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void shouldWBlackPawnMove2SquaresBackwardWhenOnSecondLastRow() {
        // Given a black pawn
        Piece pawn = new Pawn(Color.BLACK,chessboard);
        // When validating if it can move one square forward (from e7 to e5)
        boolean isMoveValid = pawn.isMovementPossible(7,5,5,5);
        // then assert that move is valid
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void whitePawnAttacksBlackPawnFromForward() {
        // Given a white pawn at e4 and a black pawn at d5
        Piece whitePawn = new Pawn(Color.WHITE,chessboard);
        Piece blackPawn = new Pawn(Color.BLACK,chessboard);

        chessboard.replacePieceAt(blackPawn,5,4);

        // When the white pawn attacks the white pawn
        boolean isMoveValid = whitePawn.isMovementPossible(4,5,5,4);
        // Then assert that the move is valid
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void whitePawnShouldNotAttackBlackPawnFromBehind() {
        // Given a white pawn at e4 and a black pawn at d3
        Piece whitePawn = new Pawn(Color.WHITE,chessboard);
        Piece blackPawn = new Pawn(Color.BLACK,chessboard);

        chessboard.replacePieceAt(blackPawn,3,4);

        // When the white pawn attacks the white pawn
        boolean isMoveValid = whitePawn.isMovementPossible(4,5,3,4);
        // Then assert that the move is valid
        assertThat(isMoveValid,is(false));
    }

    @Test
    public void blackPawnAttacksWhitePawn() {
        // Given a black pawn at c3 and a black pawn at b4
        Piece whitePawn = new Pawn(Color.WHITE,chessboard);
        Piece blackPawn = new Pawn(Color.BLACK,chessboard);

        chessboard.replacePieceAt(whitePawn,3,3);

        // When the black pawn attacks the white pawn
        boolean isMoveValid = blackPawn.isMovementPossible(4,2,3,3);
        // Then assert that the move is valid
        assertThat(isMoveValid,is(true));
    }

    @Test
    public void blackPawnShouldNotAttackWhitePawnFromFront() {
        // Given a black pawn at c3 and a black pawn at b2
        Piece whitePawn = new Pawn(Color.WHITE,chessboard);
        Piece blackPawn = new Pawn(Color.BLACK,chessboard);

        chessboard.replacePieceAt(whitePawn,3,3);

        // When the black pawn attacks the white pawn
        boolean isMoveValid = blackPawn.isMovementPossible(4,2,2,2);
        // Then assert that the move is valid
        assertThat(isMoveValid,is(false));
    }
}
