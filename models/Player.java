package models;

import java.util.UUID;

public class Player {
    private String name;
    private String id;
    //Contructor.
    public Player(String name){
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }
    //Getter functions.
    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }
}
