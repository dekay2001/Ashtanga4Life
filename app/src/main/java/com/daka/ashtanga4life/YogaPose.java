package com.daka.ashtanga4life;
/**
 * Created by Dan on 6/8/2016.
 * The purpose of this class is to encapsulate
 * all the information about an particular yoga
 * pose.
 * It includes 
 *  common name
 *  image resource id associated
 *  sanskrit name.
 */
public class YogaPose {
    private String p_name;
    private String p_descr;
    private int image_resource_id;

    public YogaPose(String name, String descr, int image_res_id){
        this.p_name = name;
        this.p_descr = descr;
        this.image_resource_id = image_res_id;
    }

    public void print_info(){
        System.out.println("Name:  "+ p_name + " Image:  "+p_descr);
    }

    public String get_name_sanskrit(){
        return this.p_name;
    }

    public String get_description(){
        return this.p_descr;
    }

    public int get_image_resource_id(){
        return this.image_resource_id;
    }

    public String toString(){
        return this.p_name;
    }
}
