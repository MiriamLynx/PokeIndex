package com.app;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import logic.DoNotAffect;
import logic.Effective;
import logic.Ineffective;
import thread.MainSound;

public class EffectivenessActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_effectiveness);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.effectiveness, menu);
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

        private ImageView currenttypeview;
        private ImageView effective1;
        private ImageView effective2;
        private ImageView effective3;
        private ImageView effective4;
        private ImageView effective5;
        private ImageView ineffective1;
        private ImageView ineffective2;
        private ImageView ineffective3;
        private ImageView ineffective4;
        private ImageView ineffective5;
        private ImageView ineffective6;
        private ImageView ineffective7;
        private ImageView donotaffect;
        private ImageView donotaffectlabel;
        private ImageView title;
        private boolean permited;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_effectiveness, container, false);
            currenttypeview = (ImageView) rootView.findViewById(R.id.currenttypeview);
            title = (ImageView) rootView.findViewById(R.id.typetitle);
            effective1 = (ImageView) rootView.findViewById(R.id.effective1);
            effective2 = (ImageView) rootView.findViewById(R.id.effective2);
            effective3 = (ImageView) rootView.findViewById(R.id.effective3);
            effective4 = (ImageView) rootView.findViewById(R.id.effective4);
            effective5 = (ImageView) rootView.findViewById(R.id.effective5);
            ImageView[] effectiveviews = new ImageView[] {
                    effective1,
                    effective2,
                    effective3,
                    effective4,
                    effective5
            };
            ineffective1 = (ImageView) rootView.findViewById(R.id.ineffective1);
            ineffective2 = (ImageView) rootView.findViewById(R.id.ineffective2);
            ineffective3 = (ImageView) rootView.findViewById(R.id.ineffective3);
            ineffective4 = (ImageView) rootView.findViewById(R.id.ineffective4);
            ineffective5 = (ImageView) rootView.findViewById(R.id.ineffective5);
            ineffective6 = (ImageView) rootView.findViewById(R.id.ineffective6);
            ineffective7 = (ImageView) rootView.findViewById(R.id.ineffective7);
            ImageView[] ineffectiveviews = new ImageView[] {
                    ineffective1,
                    ineffective2,
                    ineffective3,
                    ineffective4,
                    ineffective5,
                    ineffective6,
                    ineffective7
            };
            String type = getIntent().getExtras().getString("type");
            title.setBackgroundResource(getTitle(type));
            String[] effectives = Effective.getArray(type);
            String[] ineffectives = Ineffective.getArray(type);
            String[] donotaffects = DoNotAffect.getArray(type);
            currenttypeview.setBackgroundResource(getId(type));
            for(int i = 0; i < effectives.length; i++)
                effectiveviews[i].setBackgroundResource(getId(effectives[i]));
            for(int i = 0; i < ineffectives.length; i++)
                ineffectiveviews[i].setBackgroundResource(getId(ineffectives[i]));
            if(donotaffects.length > 0){
                donotaffect = (ImageView) rootView.findViewById(R.id.donotaffect);
                donotaffectlabel = (ImageView) rootView.findViewById(R.id.donotaffectlabel);
                donotaffect.setBackgroundResource(getId(donotaffects[0]));
                donotaffectlabel.setBackgroundResource(R.drawable.noafecta);
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

    private int getId(String type){
        if(type.equals("bug")){
            return R.drawable.bug;
        }else if(type.equals("dark")){
            return R.drawable.dark;
        }else if(type.equals("dragontt")){
            return R.drawable.dragontt;
        } else if(type.equals("electric")){
            return R.drawable.electric;
        }else if(type.equals("fairy")){
            return R.drawable.fairy;
        }else if(type.equals("fight")){
            return R.drawable.fight;
        }else if(type.equals("fire")){
            return R.drawable.fire;
        }else if(type.equals("flying")){
            return R.drawable.flying;
        }else if(type.equals("ghost")){
            return R.drawable.ghost;
        }else if(type.equals("grass")){
            return R.drawable.grass;
        }else if(type.equals("ground")){
            return R.drawable.ground;
        }else if(type.equals("ice")){
            return R.drawable.ice;
        }else if(type.equals("poison")){
            return R.drawable.poison;
        }else if(type.equals("psych")){
            return R.drawable.psych;
        }else if(type.equals("steel")){
            return R.drawable.steel;
        }else if(type.equals("rock")){
            return R.drawable.rock;
        }else if(type.equals("normal")){
            return R.drawable.normaltt;
        }else if(type.equals("water")){
            return R.drawable.water;
        }
        return -1;
    }

        private int getTitle(String type){
            if(type.equals("bug")){
                return R.drawable.bicho;
            }else if(type.equals("dark")){
                return R.drawable.siniestro;
            }else if(type.equals("dragontt")){
                return R.drawable.dragon;
            } else if(type.equals("electric")){
                return R.drawable.electrico;
            }else if(type.equals("fairy")){
                return R.drawable.hada;
            }else if(type.equals("fight")){
                return R.drawable.lucha;
            }else if(type.equals("fire")){
                return R.drawable.fuego;
            }else if(type.equals("flying")){
                return R.drawable.volador;
            }else if(type.equals("ghost")){
                return R.drawable.fantasma;
            }else if(type.equals("grass")){
                return R.drawable.planta;
            }else if(type.equals("ground")){
                return R.drawable.tierra;
            }else if(type.equals("ice")){
                return R.drawable.hielo;
            }else if(type.equals("poison")){
                return R.drawable.veneno;
            }else if(type.equals("psych")){
                return R.drawable.psiquico;
            }else if(type.equals("steel")){
                return R.drawable.acero;
            }else if(type.equals("rock")){
                return R.drawable.roca;
            }else if(type.equals("normal")){
                return R.drawable.normal;
            }else if(type.equals("water")){
                return R.drawable.agua;
            }
            return -1;
        }
}
}
