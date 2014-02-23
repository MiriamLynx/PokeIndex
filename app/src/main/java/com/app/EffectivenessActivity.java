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
import android.widget.ImageButton;
import android.widget.ImageView;

import logic.DoNotAffect;
import logic.Effective;
import logic.Ineffective;

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
        private ImageView donotaffect;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_effectiveness, container, false);
            currenttypeview = (ImageView) rootView.findViewById(R.id.currenttypeview);
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
            ImageView[] ineffectiveviews = new ImageView[] {
                    ineffective1,
                    ineffective2,
                    ineffective3,
                    ineffective4,
                    ineffective5
            };
            donotaffect = (ImageView) rootView.findViewById(R.id.donotaffect);
            String type = getIntent().getExtras().getString("type");
            String[] effectives = Effective.getArray(type);
            String[] ineffectives = Ineffective.getArray(type);
            String[] donotaffects = DoNotAffect.getArray(type);
            currenttypeview.setBackgroundResource(getId(type));
            for(int i = 0; i < effectives.length; i++)
                effectiveviews[i].setBackgroundResource(getId(effectives[i]));
            for(int i = 0; i < ineffectives.length; i++)
                ineffectiveviews[i].setBackgroundResource(getId(ineffectives[i]));
            if(donotaffects.length > 0){
                donotaffect.setBackgroundResource(getId(donotaffects[0]));
            }
            return rootView;
        }

    private int getId(String type){
        if(type.equals("bug")){
            return 0x7f020001;
        }else if(type.equals("dark")){
            return 0x7f020007;
        }else if(type.equals("dragon")){
            return 0x7f02000a;
        } else if(type.equals("electric")){
            return 0x7f02000e;
        }else if(type.equals("fairy")){
            return 0x7f020012;
        }else if(type.equals("fight")){
            return 0x7f020015;
        }else if(type.equals("fire")){
            return 0x7f020018;
        }else if(type.equals("flying")){
            return 0x7f02001b;
        }else if(type.equals("ghost")){
            return 0x7f02001e;
        }else if(type.equals("grass")){
            return 0x7f020021;
        }else if(type.equals("ground")){
            return 0x7f020024;
        }else if(type.equals("ice")){
            return 0x7f020028;
        }else if(type.equals("poison")){
            return 0x7f02002f;
        }else if(type.equals("psych")){
            return 0x7f020033;
        }else if(type.equals("steel")){
            return 0x7f020039;
        }else if(type.equals("rock")){
            return 0x7f020036;
        }else if(type.equals("normal")){
            return 0x7f02002c;
        }else if(type.equals("water")){
            return 0x7f02003d;
        }
        return -1;
    }
}
}
