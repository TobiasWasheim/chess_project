package chess.Frameworks;

public enum Status {
    // Everything's ok
    OK,
    // Trying to play opponent's piece
    NOT_OWNER,
    // Trying to play on opponent's turn
    NOT_PLAYER_IN_TURN,
    // Trying to attack own piece
    ATTACK_NOT_ALLOWED_ON_OWN_PIECE,
    // Trying to move/attack a piece that has already been moved
    ATTACK_NOT_ALLOWED_FOR_NON_ACTIVE_PIECE,
    // Tried to move to a square that wasn't allowed
    MOVE_NOT_ALLOWED;
}
