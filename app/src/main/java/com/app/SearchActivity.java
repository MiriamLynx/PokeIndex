package com.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.media.MediaPlayer;
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

import adapter.HabiAdapter;
import adapter.MtAdapter;
import adapter.ObjAdapter;
import adapter.PokeAdapter;
import domain.Habilidad;
import domain.Mt;
import domain.Objeto;
import domain.Pokemon;
import logic.DBHelper;
import thread.MainSound;
import thread.SoundThread;

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
        getMenuInflater().inflate(R.menu.about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.aboutitem) {
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
        private ArrayList<Pokemon> resultPokemon;
        private ArrayList<Objeto> resultObjeto;
        private ArrayList<Habilidad> resultHabilidad;
        private ArrayList<Mt> resultMt;
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
                   button = (ImageButton) rootView.findViewById(R.id.findAllButton);

                   list = (ListView) rootView.findViewById(R.id.list);

                   button.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           resultPokemon = DBHelper.getAllPokemon();
                           PokeAdapter adapter = new PokeAdapter(getActivity(), resultPokemon);
                           list.setAdapter(adapter);
                       }
                   });

                   list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                       @Override
                       public void onItemClick(AdapterView<?> parent, View view, int position,
                                               long id) {
                           permited = true;
                           Intent intent = new Intent(getActivity(), ItemActivity.class);
                           intent.putExtra("outcome", 0);
                           intent.putExtra("pokemon", (Serializable) resultPokemon.get(position));
                           startActivity(intent);
                       }
                   });

                   search = (SearchView) rootView.findViewById(R.id.search);

                   search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                       @Override
                       public boolean onQueryTextSubmit(String s) {
                           resultPokemon = DBHelper.findPokemon(search.getQuery().toString());
                           PokeAdapter adapter = new PokeAdapter(getActivity(), resultPokemon);
                           list.setAdapter(adapter);
                           return true;
                       }

                       @Override
                       public boolean onQueryTextChange(String s) {
                           return false;
                       }
                   });
                   break;

               case 1: view.setBackgroundResource(R.drawable.habilitysearch);
                   button = (ImageButton) rootView.findViewById(R.id.findAllButton);

                   list = (ListView) rootView.findViewById(R.id.list);

                   button.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           resultHabilidad = DBHelper.getAllHabilidad();
                           HabiAdapter adapter = new HabiAdapter(getActivity(), resultHabilidad);
                           list.setAdapter(adapter);
                       }
                   });

                   list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                       @Override
                       public void onItemClick(AdapterView<?> parent, View view, int position,
                                               long id) {
                           permited = true;
                           Intent intent = new Intent(getActivity(), ItemActivity.class);
                           intent.putExtra("outcome", 2);
                           intent.putExtra("habilidad1", (Serializable) resultHabilidad.get(position));
                           startActivity(intent);
                       }
                   });

                   search = (SearchView) rootView.findViewById(R.id.search);

                   search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                       @Override
                       public boolean onQueryTextSubmit(String s) {
                           resultHabilidad = DBHelper.findHabilidad(search.getQuery().toString());
                           HabiAdapter adapter = new HabiAdapter(getActivity(), resultHabilidad);
                           list.setAdapter(adapter);
                           return true;
                       }

                       @Override
                       public boolean onQueryTextChange(String s) {
                           return false;
                       }
                   });
                   break;

               case 2: view.setBackgroundResource(R.drawable.objectsearch);
                   button = (ImageButton) rootView.findViewById(R.id.findAllButton);

                   list = (ListView) rootView.findViewById(R.id.list);

                   button.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           resultObjeto = DBHelper.getAllObjeto();
                           ObjAdapter adapter = new ObjAdapter(getActivity(), resultObjeto);
                           list.setAdapter(adapter);
                       }
                   });

                   list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                       @Override
                       public void onItemClick(AdapterView<?> parent, View view, int position,
                                               long id) {
                           permited = true;
                           Intent intent = new Intent(getActivity(), ItemActivity.class);
                           intent.putExtra("outcome", 1);
                           intent.putExtra("objeto", (Serializable) resultObjeto.get(position));
                           startActivity(intent);
                       }
                   });

                   search = (SearchView) rootView.findViewById(R.id.search);

                   search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                       @Override
                       public boolean onQueryTextSubmit(String s) {
                           resultObjeto = DBHelper.findObjeto(search.getQuery().toString());
                           ObjAdapter adapter = new ObjAdapter(getActivity(), resultObjeto);
                           list.setAdapter(adapter);
                           return true;
                       }

                       @Override
                       public boolean onQueryTextChange(String s) {
                           return false;
                       }
                   });
                   break;
               case 3: view.setBackgroundResource(R.drawable.mtseach);
                   button = (ImageButton) rootView.findViewById(R.id.findAllButton);

                   list = (ListView) rootView.findViewById(R.id.list);

                   button.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View view) {
                           resultMt = DBHelper.getAllMt();
                           MtAdapter adapter = new MtAdapter(getActivity(), resultMt);
                           list.setAdapter(adapter);
                       }
                   });

                   list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                       @Override
                       public void onItemClick(AdapterView<?> parent, View view, int position,
                                               long id) {
                           permited = true;
                           Intent intent = new Intent(getActivity(), ItemActivity.class);
                           intent.putExtra("outcome", 3);
                           intent.putExtra("mt", (Serializable) resultMt.get(position));
                           startActivity(intent);
                       }
                   });

                   search = (SearchView) rootView.findViewById(R.id.search);

                   search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                       @Override
                       public boolean onQueryTextSubmit(String s) {
                           resultMt = DBHelper.findMt(search.getQuery().toString());
                           MtAdapter adapter = new MtAdapter(getActivity(), resultMt);
                           list.setAdapter(adapter);
                           return true;
                       }

                       @Override
                       public boolean onQueryTextChange(String s) {
                           return false;
                       }
                   });
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
