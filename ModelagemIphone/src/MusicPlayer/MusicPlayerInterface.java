package MusicPlayer;

import java.util.Scanner;

public abstract interface MusicPlayerInterface {
    void playMusic();
    void stopMusic();
    void selectMusic(String music);
    void getCurrentMusic();
}
