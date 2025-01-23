package chess.Frameworks;

public enum Color {
    // White piece/player
    WHITE,
    // Black piece/player
    BLACK,
    // Non-color
    NON;

    public static Color computeOpponent(Color color) {
        return color == Color.WHITE ? Color.BLACK : Color.WHITE;
    }

}
