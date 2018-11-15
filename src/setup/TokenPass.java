package setup;


public class TokenPass {

    private int[] board;
    private int currentPlayer = 0;
    public TokenPass(int playerCount) {
        int[] board = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            board[i] = (int) Math.random() * 10 + 1;
        }
    }

    public  void distributeTokens() {
        int playerTokens = board[currentPlayer];

        while (playerTokens > 0) {
            board[currentPlayer]++;
            playerTokens--;
            if (currentPlayer != board.length) {
                currentPlayer++;
            }
            else {
                currentPlayer = 0;
            }

        }

    }

    public void BubbleSort(int[] arr ) {
        Boolean swappable = true;
        int place = 0;
        while (swappable == true) {
            boolean swapped = false;
            for (int i = 0; i < arr.length - 1; i++ ) {
                if (arr[i] > arr[i+1]) {
                    swapped = true;
                    place = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = place;
                }
            }
            if (!swapped) {
                swappable = false;
            }
        }
    }
    public void printBoard() {
        for (int i  = 0; i < board.length; i++ ) {
            for (int j = 0; j < board[i]; j++ ) {
                System.out.println("l");
            }
            System.out.println(" ");
        }
    }
    public void nextPlayer() {
        currentPlayer = board[currentPlayer + 1];
    }
    public int gameOver() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == 0) {
                return currentPlayer;
            }
        }
        return -1;
    }

}
