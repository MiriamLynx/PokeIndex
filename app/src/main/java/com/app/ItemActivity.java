package com.app;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
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

import domain.Pokemon;
import thread.MainSound;

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

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_item, container, false);

            Pokemon pokemon = (Pokemon) getIntent().getExtras().getSerializable("pokemon");

            text  = (TextView) rootView.findViewById(R.id.itemtxt);

            image = (ImageView) rootView.findViewById(R.id.pkimage);

            typea = (ImageView) rootView.findViewById(R.id.typea);

            typeb = (ImageView) rootView.findViewById(R.id.typeb);

            descrip = (TextView) rootView.findViewById(R.id.desctext);

            text.setText("Pokemon " + pokemon.getNumber() + "\t" + pokemon.getName());

            String imagen = pokemon.getName().toLowerCase() + "i";
            image.setBackgroundResource(getResources().getIdentifier("drawable/" + imagen, null, getPackageName()));

            typea.setBackgroundResource(getResources().getIdentifier("drawable/" + pokemon.getTypea(), null, getPackageName()));

            typeb.setBackgroundResource(getResources().getIdentifier("drawable/" + pokemon.getTypeb(), null, getPackageName()));

            descrip.setText(pokemon.getDescription());

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
