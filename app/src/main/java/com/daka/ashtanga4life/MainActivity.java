package com.daka.ashtanga4life;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);//Menu Resource, Menu
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.chants:
                //Toast.makeText(this, getResources().getString(R.string.chants), Toast.LENGTH_LONG).show();
                //this.showChant( getResources().getString(R.string.opening_chant_s));
                this.showChant(R.string.opening_chant_s);  // <-----I believe I have an issue here
                return true;
            case R.id.surya_a:
                this.startPractice(getResources().getString(R.string.suryanamaskara_a));
                return true;
            case R.id.surya_b:
                this.startPractice(getResources().getString(R.string.suryanamaskara_b));
                return true;
            case R.id.fundamental:
                this.startPractice(getResources().getString(R.string.fundamental_basic));
                return true;
            case R.id.primary:
                this.startPractice(getResources().getString(R.string.primary_series));
                return true;
            case R.id.intermediate:
                this.startPractice(getResources().getString(R.string.intermdediate_series));
                return true;
            case R.id.advanced:
                this.startPractice(getResources().getString(R.string.advanced_series));
                return true;
            case R.id.closing:
                this.startPractice(getResources().getString(R.string.closing_sequence));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void startPractice(String series_name){
        //This function will open the page where you can view and cycle
        //through the specified yoga series.
        Intent intent = new Intent(this, YogaPracticeActivity.class);
        Toast.makeText(this, series_name, Toast.LENGTH_LONG).show();
        intent.putExtra("SeriesName", series_name);
        startActivity(intent);
    }

    private void showChant( int chant_id){
        Intent intent = new Intent(this, YogaChantActivity.class);
        Toast.makeText(this, String.valueOf(chant_id), Toast.LENGTH_LONG).show();
        //intent.putExtra("ChantType", chant_name);
        intent.putExtra("ChantId", chant_id);
        startActivity(intent);
    }
}