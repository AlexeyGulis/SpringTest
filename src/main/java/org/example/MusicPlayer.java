package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    @Autowired
    @Qualifier("rockMusic")
    private Music music;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setMusic(Music music) {
        musicList = new ArrayList<Music>();
        musicList.add(music);
    }

    public MusicPlayer(Music music) {
        musicList = new ArrayList<Music>();
        musicList.add(music);
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic() {
        /*System.out.println("Playing: " + music.getSong());
        if (musicList != null) {
            for (Music p : musicList
            ) {
                System.out.println("Playing: " + p.getSong());
            }
        } else {
            System.out.println("Playing: " + music.getSong());
        } */
        return "Playing: " + music.getSong();
    }
}
