package thread;

import android.media.MediaPlayer;

import java.io.File;
import java.net.MalformedURLException;

/**
 * Created by Lynx on 6/06/14.
 */
public class SoundThread extends Thread {

    private MediaPlayer mp;

    public SoundThread(MediaPlayer mp, boolean infinite){
        super("SoundThread");
        this.mp = mp;
        mp.setLooping(infinite);
    }

    @Override
    public void run(){
        mp.setVolume(1, 1);
        mp.start();
       return;
    }

    public void pauseSound() {
        mp.pause();
    }


    public void reanudeSound() {
        mp.start();
    }

}
