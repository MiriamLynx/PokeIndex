package com.app;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import domain.Habilidad;
import domain.Mt;
import domain.Objeto;
import domain.Pokemon;
import thread.MainSound;
import thread.SoundThread;

public class ItemActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.item, menu);
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
    public class PlaceholderFragment extends Fragment {

        private TextView text;
        private ImageView image;
        private ImageView typea;
        private ImageView typeb;
        private TextView descrip;
        private boolean permited;
        private String imagen;
        private ImageView speak;
        private TextView pp;
        private TextView pot;
        private TextView prec;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_item, container, false);

            int outcome = getIntent().getExtras().getInt("outcome");

            switch (outcome){

                case 0:
                    final Pokemon pokemon = (Pokemon) getIntent().getExtras().getSerializable("pokemon");

                    text  = (TextView) rootView.findViewById(R.id.itemtxt);

                    image = (ImageView) rootView.findViewById(R.id.pkimage);

                    typea = (ImageView) rootView.findViewById(R.id.typea);

                    typeb = (ImageView) rootView.findViewById(R.id.typeb);

                    descrip = (TextView) rootView.findViewById(R.id.desctext);

                    text.setText("Pokemon " + pokemon.getNumber() + "\t     " + pokemon.getName());

                    imagen = pokemon.getName().toLowerCase() + "i";
                    image.setBackgroundResource(getResources().getIdentifier("drawable/" + imagen, null, getPackageName()));

                    typea.setBackgroundResource(getResources().getIdentifier("drawable/" + pokemon.getTypea(), null, getPackageName()));

                    typeb.setBackgroundResource(getResources().getIdentifier("drawable/" + pokemon.getTypeb(), null, getPackageName()));

                    descrip.setText(pokemon.getDescription());

                    speak = (ImageView) rootView.findViewById(R.id.speakButton);

                    speak.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String sound = pokemon.getName().toLowerCase();
                            final MediaPlayer mp = MediaPlayer.create(getActivity(), getActivity().getResources().getIdentifier("drawable/" + sound + "a", null, getPackageName()));
                            SoundThread snd = new SoundThread(mp, false);
                            snd.start();
                        }
                    });

                    pp = (TextView) rootView.findViewById(R.id.pptxt);

                    pot = (TextView) rootView.findViewById(R.id.pottxt);

                    prec = (TextView) rootView.findViewById(R.id.prectxt);

                    pp.setVisibility(View.INVISIBLE);

                    pot.setVisibility(View.INVISIBLE);

                    prec.setVisibility(View.INVISIBLE);

                    break;

                case 1:
                    Objeto obj = (Objeto) getIntent().getExtras().getSerializable("objeto");

                    text  = (TextView) rootView.findViewById(R.id.itemtxt);

                    image = (ImageView) rootView.findViewById(R.id.pkimage);

                    typea = (ImageView) rootView.findViewById(R.id.typea);

                    typeb = (ImageView) rootView.findViewById(R.id.typeb);

                    descrip = (TextView) rootView.findViewById(R.id.desctext);

                    text.setText(obj.getNombre());

                    imagen = obj.getImagen().toLowerCase() + "i";
                    image.setBackgroundResource(getResources().getIdentifier("drawable/" + imagen, null, getPackageName()));

                    typea.setVisibility(View.INVISIBLE);

                    typeb.setVisibility(View.INVISIBLE);

                    descrip.setText(obj.getDescripcion());

                    speak = (ImageView) rootView.findViewById(R.id.speakButton);

                    speak.setVisibility(View.INVISIBLE);

                    pp = (TextView) rootView.findViewById(R.id.pptxt);

                    pot = (TextView) rootView.findViewById(R.id.pottxt);

                    prec = (TextView) rootView.findViewById(R.id.prectxt);

                    pp.setVisibility(View.INVISIBLE);

                    pot.setVisibility(View.INVISIBLE);

                    prec.setVisibility(View.INVISIBLE);

                    break;

                case 2:
                    Habilidad habi = (Habilidad) getIntent().getExtras().getSerializable("habilidad");

                    text  = (TextView) rootView.findViewById(R.id.itemtxt);

                    image = (ImageView) rootView.findViewById(R.id.pkimage);

                    typea = (ImageView) rootView.findViewById(R.id.typea);

                    typeb = (ImageView) rootView.findViewById(R.id.typeb);

                    descrip = (TextView) rootView.findViewById(R.id.desctext);

                    text.setText(habi.getName());

                    image.setBackgroundResource(getResources().getIdentifier("drawable/habilidad", null, getPackageName()));

                    typea.setVisibility(View.INVISIBLE);

                    typeb.setVisibility(View.INVISIBLE);

                    descrip.setText(habi.getDescrip());

                    speak = (ImageView) rootView.findViewById(R.id.speakButton);

                    speak.setVisibility(View.INVISIBLE);

                    pp = (TextView) rootView.findViewById(R.id.pptxt);

                    pot = (TextView) rootView.findViewById(R.id.pottxt);

                    prec = (TextView) rootView.findViewById(R.id.prectxt);

                    pp.setVisibility(View.INVISIBLE);

                    pot.setVisibility(View.INVISIBLE);

                    prec.setVisibility(View.INVISIBLE);

                    break;

                case 3:
                    Mt mt = (Mt) getIntent().getExtras().getSerializable("mt");

                    text  = (TextView) rootView.findViewById(R.id.itemtxt);

                    image = (ImageView) rootView.findViewById(R.id.pkimage);

                    typea = (ImageView) rootView.findViewById(R.id.typea);

                    typeb = (ImageView) rootView.findViewById(R.id.typeb);

                    descrip = (TextView) rootView.findViewById(R.id.desctext);

                    text.setText(mt.getNumero() + "\t     " + mt.getNombre());

                    String icon = "";

                    if(mt.getAtaque().equals("E")){
                        icon = "special";
                    }else{
                        if(mt.getAtaque().equals("O")){
                            icon = "other";
                        }else{
                            if(mt.getAtaque().equals("F")){
                                icon = "physical";
                            }
                        }
                    }

                    image.setBackgroundResource(getResources().getIdentifier("drawable/" + icon, null, getPackageName()));

                    typea.setBackgroundResource(getResources().getIdentifier("drawable/" + mt.getTipo(), null, getPackageName()));

                    typeb.setVisibility(View.INVISIBLE);

                    descrip.setText(mt.getDescrip());

                    speak = (ImageView) rootView.findViewById(R.id.speakButton);

                    speak.setVisibility(View.INVISIBLE);

                    pp = (TextView) rootView.findViewById(R.id.pptxt);

                    pot = (TextView) rootView.findViewById(R.id.pottxt);

                    prec = (TextView) rootView.findViewById(R.id.prectxt);

                    pp.setText("PP: " + mt.getPp());

                    pot.setText("Potencia: " + mt.getPotencia());

                    prec.setText("Precisión: " + mt.getPrecision());

                    break;
            }


            return rootView;
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
