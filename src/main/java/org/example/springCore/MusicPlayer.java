package org.example.springCore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

  //  @Value("#{'${my.list.of.strings}'.split(',')}")

    private List<Music> listOfMusic = new ArrayList<>();

    private Music music;

    public MusicPlayer(List<Music> listOfMusic) {
        this.listOfMusic = listOfMusic;
    }

    public MusicPlayer() {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playSong() {
        Random random = new Random();
        System.out.println("Playing music " + listOfMusic.get(random.nextInt(2)).getSong());
    }
}

