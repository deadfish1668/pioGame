import players.PlayerComp;
import statistics.WinStatistics;


public class PioGame {


    public static void main(String[] args) {

        Game game = new Game(new WinStatistics());

        game.addPlayer(new PlayerComp("Konrad"));
        game.addPlayer(new PlayerComp("Wojtek"));
        game.printPlayers();

        for (int i=0; i<100; ++i) {
            game.play();
        }

        game.stats.print();

    }

}










