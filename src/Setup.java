public class Setup {
    public Setup(int playerCount) {
        int[] board = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            board[i] = (int) Math.random() * 5 + 3;
        }
    }
}
