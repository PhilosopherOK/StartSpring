package org.example.springCore;

public class MusicPlayer {
    private Music music;
    public MusicPlayer(Music music){
        this.music = music;
    }
    public void playSong(){
        System.out.println("Playing music " + music.getSong());
    }
}
