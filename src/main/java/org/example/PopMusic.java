package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PopMusic implements Music{

    private List<String> songs;

    public PopMusic(){
        songs = new ArrayList<>();
        songs.add("Umbrella");
        songs.add("Stay in Alive");
        songs.add("Gangnam Style");
    }

    @Override
    public String getSong() {
        Random a = new Random();
        return songs.get(a.nextInt(songs.size()));
    }
}
