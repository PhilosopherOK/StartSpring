package org.example.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Music music = context.getBean("springstart",Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playSong();

        context.close();

    }
}
