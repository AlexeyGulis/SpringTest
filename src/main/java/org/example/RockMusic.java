package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{

    private List<String> songs;

    public RockMusic(){
        songs = new ArrayList<>();
        songs.add("Black Parade");
        songs.add("Nothing else matter");
        songs.add("Smoke on the water");
    }
    public String getSong(){
        Random a = new Random();
        return songs.get(a.nextInt(songs.size()));
    }
}
