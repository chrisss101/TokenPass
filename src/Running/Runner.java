package Running;
import setup.TokenPass;

public class Runner {
    public static void main(String args[]) {
        TokenPass game1 = new TokenPass(6);

        while (game1.Ongoing = true) {
            game1.printBoard(6);
            game1.distributeTokens();
            game1.nextPlayer();
            game1.gameOver();
        }
        game1.printBoard(6);
        System.out.println("the winner is" + game1.currentPlayer);

    }
}
