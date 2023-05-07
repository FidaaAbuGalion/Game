package inputs;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class AudioHandler {

    public static boolean off = false;
    public  static Clip clip = null;

    public static void RunMusic(String path){

        try {
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File((path)));
            clip = AudioSystem.getClip();
            clip.open(inputStream);
            if (!off) {
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
        } catch (UnsupportedAudioFileException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }
}
