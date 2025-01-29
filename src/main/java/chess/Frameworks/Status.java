package chess.Frameworks;

public enum Status {
    // Everything's ok
    OK,
    // Trying to play opponent's piece
    NOT_OWNER,
    // Trying to attack own piece
    ATTACK_NOT_ALLOWED_ON_OWN_PIECE,
    // Tried to move to a square that wasn't allowed
    MOVE_NOT_ALLOWED,
    // Tried to move outside the chessboard
    MOVE_OUT_OF_INDEX;
}
