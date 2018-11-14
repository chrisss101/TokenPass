public class TokenPass {

    private int[] board;
    private int currentPlayer = 0;
    public TokenPass(int playerCount) {
        int[] board = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            board[i] = (int) Math.random() * 10 + 1;
        }
    }

    public  void distributeTokens(int playerCount) {
        int playerTokens = board[currentPlayer];

        while (playerTokens > 0) {
            board[currentPlayer]++;
            playerTokens--;
            if (currentPlayer != playerCount) {
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

}
