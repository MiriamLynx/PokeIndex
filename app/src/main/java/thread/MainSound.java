package thread;

import android.app.Activity;
import android.media.MediaPlayer;

import com.app.R;

/**
 * Created by Lynx on 6/06/14.
 */
public class MainSound {

    private static SoundThread main;

    public static void startSound(Activity ctx){
        final MediaPlayer mp = MediaPlayer.create(ctx, R.drawable.apptheme);
        main = new SoundThread(mp, true);
        main.start();

    }


    public static void pauseSound() {
        main.pauseSound();
    }

    public static void reanudeSound(){
        main.reanudeSound();
    }

}