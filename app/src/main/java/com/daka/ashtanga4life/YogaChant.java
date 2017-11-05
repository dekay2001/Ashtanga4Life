package com.daka.ashtanga4life;

/**
 * Created by Dan on 11/2/2017.
 */
public class YogaChant {
    private int chant_id;
    private String chant;
    private int image_resource_id;

    public YogaChant(int chant_id, int image_res_id, String chant){
        this.chant = chant;
        this.image_resource_id = image_res_id;
        this.chant_id = chant_id;
    }

    public int get_chant_id(){return this.chant_id;}
    public String getChant(){
        return this.chant;
    }
    public int get_image_resource_id(){return this.image_resource_id;}
}
