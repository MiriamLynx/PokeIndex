package com.app;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.ImageButton;

import java.util.ArrayList;

import thread.MainSound;

public class TypesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types);

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
    public static class PlaceholderFragment extends Fragment {

        private ImageButton bug;
        private ImageButton dark;
        private ImageButton dragon;
        private ImageButton electric;
        private ImageButton fairy;
        private ImageButton fight;
        private ImageButton fire;
        private ImageButton flying;
        private ImageButton ghost;
        private ImageButton grass;
        private ImageButton ground;
        private ImageButton ice;
        private ImageButton normal;
        private ImageButton poison;
        private ImageButton psych;
        private ImageButton rock;
        private ImageButton steel;
        private ImageButton water;
        private boolean permited;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_types, container, false);

            bug = (ImageButton) rootView.findViewById(R.id.bugbutton);
            dark = (ImageButton) rootView.findViewById(R.id.darkbutton);
            dragon = (ImageButton) rootView.findViewById(R.id.dragonbutton);
            electric = (ImageButton) rootView.findViewById(R.id.electricbutton);
            fairy = (ImageButton) rootView.findViewById(R.id.fairybutton);
            fight = (ImageButton) rootView.findViewById(R.id.fightbutton);
            fire = (ImageButton) rootView.findViewById(R.id.firebutton);
            flying = (ImageButton) rootView.findViewById(R.id.flyingbutton);
            ghost = (ImageButton) rootView.findViewById(R.id.ghostbutton);
            grass = (ImageButton) rootView.findViewById(R.id.grassbutton);
            ground = (ImageButton) rootView.findViewById(R.id.groundbutton);
            ice = (ImageButton) rootView.findViewById(R.id.icebutton);
            normal = (ImageButton) rootView.findViewById(R.id.normalbutton);
            poison = (ImageButton) rootView.findViewById(R.id.poisonbutton);
            psych = (ImageButton) rootView.findViewById(R.id.psychbutton);
            rock = (ImageButton) rootView.findViewById(R.id.rockbutton);
            steel = (ImageButton) rootView.findViewById(R.id.steelbutton);
            water = (ImageButton) rootView.findViewById(R.id.waterbutton);

            bug.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type","bug");
                    startActivity(intent);
                }
            });

            dark.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "dark");
                    startActivity(intent);
                }
            });

            dragon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "dragontt");
                    startActivity(intent);
                }
            });

            electric.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "electric");
                    startActivity(intent);
                }
            });

            fairy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "fairy");
                    startActivity(intent);
                }
            });

            fight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "fight");
                    startActivity(intent);
                }
            });

            flying.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "flying");
                    startActivity(intent);
                }
            });

            ghost.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "ghost");
                    startActivity(intent);
                }
            });

            grass.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "grass");
                    startActivity(intent);
                }
            });

            ground.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "ground");
                    startActivity(intent);
                }
            });

            ice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "ice");
                    startActivity(intent);
                }
            });

            normal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "normal");
                    startActivity(intent);
                }
            });

            poison.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "poison");
                    startActivity(intent);
                }
            });

            rock.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "rock");
                    startActivity(intent);
                }
            });

            steel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "steel");
                    startActivity(intent);
                }
            });

            fire.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "fire");
                    startActivity(intent);
                }
            });

            water.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "water");
                    startActivity(intent);
                }
            });

            psych.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    permited = true;
                    Intent intent = new Intent(getActivity(), EffectivenessActivity.class);
                    intent.putExtra("type", "psych");
                    startActivity(intent);
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
