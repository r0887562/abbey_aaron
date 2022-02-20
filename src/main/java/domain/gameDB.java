package domain;

import java.util.ArrayList;
import java.util.List;

public class gameDB {
    private int sequence=0;
    private final List<game>Games = new ArrayList<>();



    public void add(game Games) {
        this.sequence++;

    }

    }

