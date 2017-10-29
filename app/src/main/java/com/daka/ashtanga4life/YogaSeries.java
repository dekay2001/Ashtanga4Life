package com.daka.ashtanga4life;
import java.util.List;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

/**
 * Created by Dan on 6/13/2016.
 * The purpose of this class is to 
 * encapsulate all the information
 * about a given yoga seres, including
 * its name and a list of yoga poses 
 * associated with it, and the order
 * in which the poses are to be
 * practiced.  It is capable of 
 * iterating through the poses in the series.
 */
public class YogaSeries {
    private String name;
    private String descr;
    private List<YogaPose> poses;
    private int current_pose;

    public YogaSeries(String name, String descr, List<YogaPose> poses){
        this.name = name;
        this.descr = descr;
        this.poses = poses;
        this.current_pose = -1;
    }

    public int get_current_pose_seq(){
        return this.current_pose;
    }

    public int get_pose_count(){
        return this.poses.size();
    }

    public String get_name(){
        return this.name;
    }

    public String get_description(){
        return this.descr;
    }

    public YogaPose get_next_pose(){
        if (this.current_pose < this.poses.size()-1){
            this.current_pose++;
        }
        else{
            this.current_pose = 0;  //Circle back around
        }
        return this.poses.get(current_pose);  //Current pose is now the next pose
    }

    public YogaPose get_previous_pose(){
        if (this.current_pose > 0){
            this.current_pose--;
        }
        else{
            this.current_pose = this.poses.size()-1;  //Circle back around
        }
        return this.poses.get(current_pose); //Current pose is now previous to what it was
    }

    public YogaPose get_pose_first(){
        return this.poses.get(0);
    }

    public List<YogaPose> get_poses(){
        return this.poses;
    }

    public List<YogaPose> get_poses_randomized(){
        /*Returns a copy of all the poses in the series
        * in a random order.*/
        Long seed = System.nanoTime();
        List<YogaPose> ordered_poses = this.get_poses();
        List<YogaPose> unordered_poses = new ArrayList<YogaPose>();
        Collections.copy(unordered_poses, ordered_poses);
        Collections.shuffle(unordered_poses, new Random(seed));
        return unordered_poses;
    }

    public List<YogaPose> get_poses_randomized(Integer num){
        /*Returns the specified number of poses from a random
        * list of poses in the series.  If the number is
        * bigger than the total numer of poses in the series
        * then all the poses in the series are returned.*/
        List<YogaPose> unordered_poses = this.get_poses_randomized();
        List<YogaPose> first_n_poses = new ArrayList<YogaPose>();
        if( this.get_pose_count() < num){
            return this.get_poses_randomized();
        }
        for (int i = 0; i < num -1 ; i++) {
            first_n_poses.add(unordered_poses.get(i));
        }
        return first_n_poses;
    }

    public String toString(){
        return this.name;
    }
}
