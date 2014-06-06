package com.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import adapter.PokeAdapter;
import domain.Pokemon;
import logic.DBHelper;
import thread.MainSound;

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
        private ListView list;
        private SearchView search;
        ArrayList<Pokemon> result;
        private boolean permited;

        public PlaceholderFragment() {
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            View rootView = inflater.inflate(R.layout.fragment_search, container, false);
           view  = (ImageView) rootView.findViewById(R.id.titleview);

            int title = getIntent().getExtras().getInt("title");

           switch (title){
               case 0: view.setBackgroundResource(R.drawable.pokemonsearch);
                   break;
               case 1: view.setBackgroundResource(R.drawable.habilitysearch);
                   break;
               case 2: view.setBackgroundResource(R.drawable.objectsearch);
                   break;
               case 3: view.setBackgroundResource(R.drawable.mtseach);
                   break;
           }

            button = (ImageButton) rootView.findViewById(R.id.findAllButton);

            list = (ListView) rootView.findViewById(R.id.list);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    result = DBHelper.getAll();
                    PokeAdapter adapter = new PokeAdapter(getActivity(), result);
                    list.setAdapter(adapter);
                }
            });

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position,
                                        long id) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), ItemActivity.class);
                    intent.putExtra("pokemon", (Serializable) result.get(position));
                    startActivity(intent);
                }
            });

            search = (SearchView) rootView.findViewById(R.id.search);

            search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String s) {
                    result = DBHelper.find(search.getQuery().toString());
                    PokeAdapter adapter = new PokeAdapter(getActivity(), result);
                    list.setAdapter(adapter);
                    return true;
                }

                @Override
                public boolean onQueryTextChange(String s) {
                    return false;
                }
            });

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
