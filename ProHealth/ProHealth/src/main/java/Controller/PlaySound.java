
package Controller;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlaySound {
    public static final String sound = "C:\\Users\\Admin\\Desktop\\Giang\\mixkit-bells-of-summer-929.wav";
    public PlaySound(String filepath){
        try {
            File soundFile = new File(filepath);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
        }
    }
}
