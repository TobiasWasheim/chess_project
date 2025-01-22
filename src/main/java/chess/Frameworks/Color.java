package chess.Frameworks;

public enum Color {
    // White piece/player
    WHITE,
    // Black piece/player
    BLACK;

    public static Color computeOpponent(Color color) {
        return color == Color.WHITE ? Color.BLACK : Color.WHITE;
    }

}
