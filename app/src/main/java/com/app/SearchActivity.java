package com.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import domain.Pokemon;
import logic.DBHelper;

public class SearchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search, menu);
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

        private ImageView view;
        private ImageView image;
        private ImageButton button;
        private TextView list;

        public PlaceholderFragment() {
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            View rootView = inflater.inflate(R.layout.fragment_search, container, false);
           view  = (ImageView) rootView.findViewById(R.id.titleview);
           image = (ImageView) rootView.findViewById(R.id.imageview);

            int title = getIntent().getExtras().getInt("title");

           switch (title){
               case 0: view.setBackgroundResource(R.drawable.pokemonsearch);
                       image.setBackgroundResource(R.drawable.pokedex);
                   break;
               case 1: view.setBackgroundResource(R.drawable.habilitysearch);
                   image.setBackgroundResource(R.drawable.habilidad);
                   break;
               case 2: view.setBackgroundResource(R.drawable.objectsearch);
                   image.setBackgroundResource(R.drawable.pot);
                   break;
               case 3: view.setBackgroundResource(R.drawable.mtseach);
                   image.setBackgroundResource(R.drawable.mtmo);
                   break;
           }

            button = (ImageButton) rootView.findViewById(R.id.findAllButton);

            list = (TextView) rootView.findViewById(R.id.listText);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<Pokemon> result = DBHelper.getAll();
                    list.setText(makeString(result));
                }
            });

            return rootView;
        }

        private String makeString(List<Pokemon> pokemons){
            String s = "";
            for(int i = 0; i < pokemons.size(); i++){
                s += pokemons.get(i).getNumber() + " " + pokemons.get(i).getName() + "\n";
            }
            return s;
        }
    }

}
