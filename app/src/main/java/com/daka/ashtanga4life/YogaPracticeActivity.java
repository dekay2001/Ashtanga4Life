package com.daka.ashtanga4life;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Handler;
import android.widget.Toast;

public class YogaPracticeActivity extends AppCompatActivity {
    private YogaGuru guru;
    private YogaSeries current_series;
    private boolean paused = true;
    private long start_time = 0;
    Handler timerHandler = new Handler();
    Runnable timerRunnable = new Runnable(){
    	@Override
    	public void run(){
    		long millis = System.currentTimeMillis() - start_time;
    		int seconds = (int) (millis / 1000);
    		int minutes = seconds / 60;
    		seconds = seconds % 60;
            if(!paused) {
                show_next_pose();
            }
    		timerHandler.postDelayed(this, 2500);
    	}
    };

    private YogaGuru getYogaGuru(){
        if (this.guru == null){
            this.guru = new YogaGuru(getApplicationContext());
        }
        return this.guru;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_practice);
        Intent intent = getIntent();
        String series_name = intent.getStringExtra("SeriesName");
        
        YogaGuru guru;
        YogaSeries yoga_series;

        guru = this.getYogaGuru();
        Toast.makeText(this, series_name, Toast.LENGTH_LONG).show();
        yoga_series = guru.getYogaSeries(series_name);

        this.current_series = yoga_series;
        this.show_next_pose();
        start_time = System.currentTimeMillis();
        timerHandler.postDelayed(timerRunnable, 100);
    }

    public void onClickTogglePaused(View view) {
        //The boolean will not stop the timer, but it will determine if
        //the next pose is displayed.
        Button pauseButton = (Button) findViewById(R.id.togglePauseTimer);
        this.paused = !this.paused;
        if(this.paused) {
            pauseButton.setText("Play");
        }
        else{
            pauseButton.setText("Pause");
        }
    }

    public void onClickNext(View view) {
        //Shows the next pose.
        this.show_next_pose();
    }

    public void onClickPrevious(View view){
        //Shows the previous pose.
        this.show_previous_pose();
    }

    public void show_next_pose(){
        //Shows the next pose in the current series.
    	this.show_pose(true);
    }

    public void show_previous_pose(){
        //Shows the previous pose in the current series.
        this.show_pose(false);
    }

    private void show_pose(boolean increment){
        //Shows either the previous or next pose in the series.
        TextView selectedPose = (TextView) findViewById( R.id.editTextPoseName);
        ImageView poseViewer = (ImageView) findViewById(R.id.imageViewPose);
        YogaPose next_pose;
        if(this.current_series == null){
            Toast.makeText(this, "Current Series is Null", Toast.LENGTH_LONG).show();
            selectedPose.setText("Current Series is null");
        }
        else {
            if (increment) {
                next_pose = this.current_series.get_next_pose();
            } else {
                next_pose = this.current_series.get_previous_pose();
            }

            //selectedPose.setText(series_name);
            selectedPose.setText(next_pose.get_name_sanskrit());
            poseViewer.setImageResource(next_pose.get_image_resource_id());
            poseViewer.setContentDescription(this.current_series.get_name());
        }
    }
}