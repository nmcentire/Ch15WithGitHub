package com.servin.android.ch15withgithub;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "Ch15";

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);

        listView = new ListView(this);
        setContentView(listView);

        String[] rowNames = { "Red", "Green", "Blue"};
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,rowNames);
        listView.setAdapter(adapter);


        Log.v(TAG, "Verbose");
        Log.i(TAG, "Information");
        Log.d(TAG, "Debug");
        Log.e(TAG, "Error");
        Log.w(TAG, "Warn");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
