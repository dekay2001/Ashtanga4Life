package com.daka.ashtanga4life;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompatSideChannelService;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Created by Dan on 4/21/2016.
 * This class is intended to be responsible for retrieving
 * and providing YogaSeries or YogaPoses, as well as being
 * responsible for providing information to various activities
 * supported by the application.
 */
public class YogaGuru {
    private YogaDatabaseHelper yoga_db;

    YogaGuru(Context application_context){
        this.yoga_db = new YogaDatabaseHelper(application_context);
    }

    List<String> getAllSeriesNames(){
        /*Returns a list of all the series names
        that exist in the database.
        */
        List<String> series_names = new ArrayList<String>();
        List<YogaSeries> all_series;
        all_series = this.yoga_db.getAllYogaSeries();
        for (YogaSeries series : all_series){
            series_names.add(series.get_name());
        }
        return series_names;
    }

    YogaSeries getYogaSeries(String series_name){
        return this.yoga_db.getYogaSeries(series_name);
    }

    List<YogaPose> getRandomYogaPosesForSeries(String series_name, Integer num_poses){
        /*Returns a list the size the of yoga poses that have been randomized.
        * If the number specified is larger than the total number of poses in the series
        * it will return all of the poses in the series.*/
        YogaSeries yoga_series = this.getYogaSeries(series_name);
        return yoga_series.get_poses_randomized(num_poses);
    }

    // List<String> getPoses(String series_name){
    //     /*  Returns a list of all the series sankrit 
    //     names in order.
    //     */
    //     List<String> poses = new ArrayList<String>();
    //     YogaSeries series;
    //     List<YogaPose> series_poses;

    //     series = this.yoga_db.getYogaSeries(series_name);
    //     series_poses = series.get_poses();
    //     for (YogaPose p:series_poses) {
    //         poses.add(p.get_name_sanskrit());
    //     }
    //     return poses;
    // }
}
