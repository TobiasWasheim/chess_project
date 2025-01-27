package chess.ChessboardTests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import chess.Frameworks.Color;
import chess.Frameworks.Piece;
import chess.PieceTypes.Bishop;
import chess.PieceTypes.Pawn;
import chess.standard.GameConstants;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import chess.Frameworks.Chessboard;
import chess.Strategies.ChessboardStrategy.EmptyChessboard;

public class EmptyChessboardTest {

    private Chessboard chessboard;

    @BeforeEach
    public void setup() {
        // Given an empty chess board
        chessboard = new EmptyChessboard();
    }

    @Test
    public void shouldHave8Rows() {
        // assert that the chess board has 8 rows
        assertThat(chessboard.getRowLength(),is(8));
    }

    @Test
    public void shouldHave8Columns() {
        // assert that the chessboard has 8 columns
        assertThat(chessboard.getColumnLength(),is(8));
    }

    @Test
    public void shouldReturnPawnAtE5WhenItsThere() {
        // When we add a pawn to the field e5
        Piece pawn = new Pawn(Color.WHITE, chessboard);
        chessboard.replacePieceAt(pawn, 5, 5);
        
        Piece pawnAtE5 = chessboard.getPieceAt(5, 5);
        // Then assert that the pawn should be there
        assertThat(pawnAtE5.getPieceType(),is(GameConstants.PAWN));
    }

    @Test
    public void shouldReturnBishopAtE3WhenItsThere() {
        // When we add a bishop to the field e5
        Piece bishop = new Bishop(Color.WHITE);
        chessboard.replacePieceAt(bishop, 3, 5);

        Piece pawnAtE5 = chessboard.getPieceAt(3, 5);
        // Then assert that the bishop should be there
        assertThat(pawnAtE5.getPieceType(),is(GameConstants.BISHOP));
    }
}