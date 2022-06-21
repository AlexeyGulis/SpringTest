package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer mP = context.getBean("musicPlayer",MusicPlayer.class);
        mP.playMusic();
        System.out.println("MusicPlayer name: " + mP.getName());
        System.out.println("Volume: " + mP.getVolume());
        context.close();
    }
}
