package domain;

 import java.util.ArrayList;
import domain.Game;

public class gameDB {
    private int sequence=0;
    private final ArrayList<Game> games = new ArrayList<>();

    public ArrayList<Game> getGames() {
        return games;
    }

    public void add(Game Game) {
        games.add(Game);
    }

    }


