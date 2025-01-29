package chess.Standard;

import chess.Chessboards.ClassicalChessboard;
import chess.Chessboards.EmptyChessboard;
import chess.Frameworks.*;
import chess.PieceTypes.Bishop;
import chess.PieceTypes.Queen;
import chess.standard.StandardGame;
import org.junit.jupiter.api.Test;

import static chess.Frameworks.Color.WHITE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class MovePieceTests {

    @Test
    public void shouldBeAllowedForBishopToMoveDiagonally() {
        // Given a game and an empty board with bishop on d4
        Chessboard chessboard = new EmptyChessboard();
        chessboard.replacePieceAt(new Bishop(WHITE),4,4);
        Game game = new StandardGame(chessboard);
        // When bishop moves to f6, we evaluate the status for the move
        Piece bishop = game.getPieceAt(4,4);
        Status status = game.movePiece(bishop,4,4,6,6);
        // Then asserting the status it should be OK
        assertThat(status,is(Status.OK));
    }

    @Test
    public void shouldNotBeAllowedToMoveOutBoard() {
        // Given a game with an empty chessbboard with a queen at d4
        Chessboard chessboard = new EmptyChessboard();
        chessboard.replacePieceAt(new Queen(WHITE),4,4);
        Game game = new StandardGame(chessboard);
        // When queen moves to d10, we evaluate the status for the move
        Piece queen = game.getPieceAt(4,4);
        Status status = game.movePiece(queen, 4,4, 10,4);
        // Then asserting that the status should be out of index
        assertThat(status,is(Status.MOVE_OUT_OF_INDEX));
    }

    @Test
    public void shouldNotBeAbleToMoveOnWhitesTurn() {
        // Given a game with a normal chessboard
        Chessboard chessboard = new ClassicalChessboard();
        Game game = new StandardGame(chessboard);
        // White should not be able to play a black piece
        Piece pawn = game.getPieceAt(7,1);
        Status status = game.movePiece(pawn,7,1,6,1);
        // Then asserting that white cannot play with a piece that is black
        assertThat(status,is(Status.NOT_OWNER));
    }
}
