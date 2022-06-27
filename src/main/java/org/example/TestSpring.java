package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer mp = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(mp.playMusic(Type.CLASSICAL));
        context.close();
    }
}
