package com.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import thread.MainSound;
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
        getMenuInflater().inflate(R.menu.about, menu);
        return true;
    }

    private void showAbout() {
        View messageView = getLayoutInflater().inflate(R.layout.about, null, false);
        TextView textView = (TextView) messageView.findViewById(R.id.about_credits);
        textView.setText("Esta aplicación ha sido desarrollada por " + "\n" + "Miriam Abalo Fernández" + "\n\n" + "Diseño gráfico" + "\n" + "Base de datos" + "\n" + "Backend");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.ic_launcher);
        builder.setTitle(R.string.app_name);
        builder.setView(messageView);
        builder.create();
        builder.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.aboutitem:
                showAbout();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public class PlaceholderFragment extends Fragment {

        private ImageButton buttonPokemon;
        private ImageButton buttonHabilities;
        private ImageButton buttonTypes;
        private ImageButton buttonObjects;
        private ImageButton buttonMt;
        private SoundThread snd;
        private boolean permited;
        private MenuItem mi;

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
                    permited = true;
                    Intent intent = new Intent(getActivity(), SearchActivity.class);
                    intent.putExtra("title",0);
                    startActivity(intent);
                }
            });

            buttonHabilities.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), SearchActivity.class);
                    intent.putExtra("title",1);
                    startActivity(intent);
                }
            });

            buttonObjects.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), SearchActivity.class);
                    intent.putExtra("title",2);
                    startActivity(intent);
                }
            });

            buttonMt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), SearchActivity.class);
                    intent.putExtra("title",3);
                    startActivity(intent);
                }
            });


            buttonTypes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), TypesActivity.class);
                    startActivity(intent);
                }
            });

            startSound();

            return rootView;
        }

        public void startSound(){
            MainSound.startSound(getActivity());
        }

        @Override
        public void onResume() {
            MainSound.reanudeSound();
            super.onResume();
        }

        @Override
        public void onPause() {
            if(!permited){
                MainSound.pauseSound();
            }else{
                permited = false;
            }
            super.onPause();
        }
    }

}
