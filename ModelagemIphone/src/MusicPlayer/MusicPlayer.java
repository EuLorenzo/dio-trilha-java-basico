package MusicPlayer;

import java.util.Scanner;

public class MusicPlayer implements MusicPlayerInterface{
    private String currentMusic;

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

    @Override
    public void selectMusic(String music) {
        this.currentMusic = music;
        System.out.println("Selecting music: " + music);
    }

    @Override
    public void getCurrentMusic() {
        System.out.println("Current music: " + this.currentMusic);
    }
}
