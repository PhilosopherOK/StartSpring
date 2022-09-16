package org.example.springCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration

public class SpringConfig {

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public JasMusic jasMusic() {
        return new JasMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(rockMusic(), classicalMusic(), jasMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

//    @Bean
//    public MusicPlayer musicPlayer(){
//        List<Music> musicList = new ArrayList<>();
//        musicList.add(rockMusic());
//        musicList.add(classicalMusic());
//        musicList.add(jasMusic());
//        return new MusicPlayer(musicList);
}