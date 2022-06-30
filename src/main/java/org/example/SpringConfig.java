package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    private List<Music> musicList;
    @Bean
    public Music rockMusic(){
        return new RockMusic();
    }
    @Bean
    public Music classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public Music popMusic(){
        return new PopMusic();
    }

    @Bean
    public List<Music> collectionMusic(){
        musicList = new ArrayList<>();
        musicList.add(rockMusic());
        musicList.add(classicalMusic());
        musicList.add(popMusic());
        return musicList;
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(collectionMusic());
    }
    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

}
