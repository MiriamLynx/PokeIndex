package com.app;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.io.File;
import java.util.ArrayList;

import thread.SoundThread;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        private ImageButton buttonPokemon;
        private ImageButton buttonHabilities;
        private ImageButton buttonTypes;
        private ImageButton buttonObjects;
        private ImageButton buttonMt;
        private SoundThread snd;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            buttonPokemon = (ImageButton) rootView.findViewById(R.id.pokemonbutton);
            buttonHabilities = (ImageButton) rootView.findViewById(R.id.habilitiesbutton);
            buttonTypes = (ImageButton) rootView.findViewById(R.id.typesbutton);
            buttonObjects = (ImageButton) rootView.findViewById(R.id.objectsbutton);
            buttonMt = (ImageButton) rootView.findViewById(R.id.mtbutton);

            buttonPokemon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), SearchActivity.class);
                    intent.putExtra("title",0);
                    startActivity(intent);
                }
            });

            buttonHabilities.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), SearchActivity.class);
                    intent.putExtra("title",1);
                    startActivity(intent);
                }
            });

            buttonObjects.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), SearchActivity.class);
                    intent.putExtra("title",2);
                    startActivity(intent);
                }
            });

            buttonMt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), SearchActivity.class);
                    intent.putExtra("title",3);
                    startActivity(intent);
                }
            });


            buttonTypes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getActivity(), TypesActivity.class);
                    startActivity(intent);
                }
            });

            startSound();

            return rootView;
        }

        public void startSound(){
            final MediaPlayer mp = MediaPlayer.create(getActivity(), R.drawable.apptheme);
            snd = new SoundThread(mp, true);
            snd.start();
        }

    }

}
