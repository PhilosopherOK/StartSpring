package org.example.springCore;

import java.util.LinkedList;
import java.util.List;

public class MusicPlayer {
    public List<Music> getListOfMusic() {
        return listOfMusic;
    }
    public void setListOfMusic(List<Music> listOfMusic) {
        this.listOfMusic = listOfMusic;
    }
    private List <Music> listOfMusic = new LinkedList<>();

    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playSong() {
        for(Music music:listOfMusic) {
            System.out.println("Playing music " + music.getSong());
        }
    }
}
