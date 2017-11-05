package com.daka.ashtanga4life;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompatSideChannelService;
import android.widget.Toast;

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

    public YogaChant getChant(int chant_id){
        YogaChant chant;
        int chant_image;
        String chanting_text;

        switch (chant_id){
            case R.string.opening_chant_s:
                chant_image = R.drawable.opening_sanskrit;
                chanting_text = "vande gurunam charanaravinde\n" +
                        "sandarsita svatmasukhava bodhe\n" +
                        "nihsreyase jangalikayamane\n" +
                        "samsara halahala mohasantyai \n" +
                        "abahu purusakaram\n" +
                        "sankhacakrasi dharinam\n" +
                        "sahasra sirasam svetam\n" +
                        "pranamami patanjalim\n" +
                        "om";
                break;
            case R.string.opening_chant_e:
                chant_image = R.drawable.opening_sanskrit;
                chanting_text = "I bow to the lotus feet of the Gurus\n" +
                        "The awakening happiness of one’s own Self revealed\n" +
                        "Beyond better, acting like the Jungle physician\n" +
                        "Pacifying delusion, the poison of Sansara\n" +
                        "Taking the form of a man to the shoulders\n" +
                        "Holding a conch, a discus, and a sword\n" +
                        "One thousand heads white\n" +
                        "To Pantanjali, I salute";
                break;
            case R.string.closing_chant_s:
                chant_image = R.drawable.closing_sanskrit;
                chanting_text = "Om\n" +
                        "Svasthi Praja Bhyaha Pari Pala Yantam\n" +
                        "Nya Yena Margena Mahim Mahishaha\n" +
                        "Go Brahmanebhyaha Shubamastu Nityam\n" +
                        "Lokah Samastah Sukhino Bhavantu\n" +
                        "Shanti Shanti Shantihi";
                break;
            case R.string.closing_chant_e:
                chant_image = R.drawable.closing_sanskrit;
                chant_id = R.string.closing_chant_e;
                chanting_text = "May all be well with mankind.\n" +
                        "May the leaders of the earth protect in every way, by keeping to the right path.\n" +
                        "May there be goodness for those who know the earth to be sacred.\n" +
                        "May all the worlds be happy";
                break;
            default:
                chant_image = R.drawable.opening_sanskrit;
                chanting_text = "Unexpected chant_name specified";
        }

        chant = new YogaChant(chant_id,chant_image, chanting_text);
        return chant;
    }
}
