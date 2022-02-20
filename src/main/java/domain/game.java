package domain;

public class game {
    private int id;
    private String naam;
    private String genre;
    private String developers;
    private String modes;
    private int year;

    public game( int gameID, String gameNaam, String gameGenre, String gameDeveloper, String gameModes, int gameYear ){
        id = gameID;
        naam = gameNaam;
        genre = gameGenre;
        developers = gameDeveloper;
        modes = gameModes;
        year = gameYear;
    }
}
