package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music{

    private List<String> songs;
    private ClassicalMusic(){
        songs = new ArrayList<>();
        songs.add("Simphony №3");
        songs.add("Simphony №7");
        songs.add("Lunar Sonata");
    }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Init method");
    }
    public void doMyDestroy(){
        System.out.println("Destroy method");
    }
    public String getSong(){
        Random a = new Random();
        return songs.get(a.nextInt(songs.size()));
    }
}
