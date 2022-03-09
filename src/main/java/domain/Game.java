package domain;



public class Game {
    private int id;
    private String naam;
    private String developers;
    private int IGN;
    private int Pegi;
   private String release;


    public Game(int gameID, String gameNaam, String gameDeveloper, int gameIGN , int gamePegi, String gameRelease ){
        id = gameID;
        naam = gameNaam;
        developers = gameDeveloper;
        IGN = gameIGN;
        Pegi = gamePegi;
        release = gameRelease;
    }



    private void setNaam(String naam) {
        this.naam = naam;
        if (naam == null){
            throw new IllegalArgumentException("Naam mag niet leeg zijn.");
        }
    }

    public void setDevelopers(String developers) {
        this.developers = developers;
        if (developers == null) {
            throw new IllegalArgumentException("Developer mag niet leeg zijn");
        }
    }

    public void setIGN(int IGN) {
        this.IGN = IGN;
        if(IGN < 0 ) {
            throw new IllegalArgumentException("IGN rating kan niet negatief zijn");
        }

        if(IGN > 10) {
            throw new IllegalArgumentException("IGN kan niet hoger zijn dan 10");
        }
    }

    public String getNaam() {
        return naam;
    }

    public int getIGN() {
        return IGN;
    }

    public int getPegi() {
        return Pegi;
    }

    public String getRelease() {
        return release;
    }

    public String getDevelopers() {
        return developers;
    }

    public int getId() {
        return id;
    }


}
