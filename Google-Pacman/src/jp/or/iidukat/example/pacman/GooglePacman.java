package jp.or.iidukat.example.pacman;

import android.app.Activity;
import android.os.Bundle;

public class GooglePacman extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public void onDestroy() {
    	
    }
}