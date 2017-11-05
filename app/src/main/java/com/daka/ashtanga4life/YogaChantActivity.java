package com.daka.ashtanga4life;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class YogaChantActivity extends AppCompatActivity {
    private YogaGuru guru;
    private YogaChant current_chant;

    private YogaGuru getYogaGuru(){
        if (this.guru == null){
            this.guru = new YogaGuru(getApplicationContext());
        }
        return this.guru;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_chant);

        Intent intent = getIntent();
        int chant_id = intent.getIntExtra("ChantId", 0);
        Toast.makeText(this, getResources().getString(chant_id), Toast.LENGTH_LONG).show();

        this.show_chant(chant_id);
    }

    private void show_chant(int chant_id){
        final String OPENING_CHANT_SANSCRIT = getResources().getString(R.string.opening_chant_s);
        final String OPENING_CHANT_ENGLISH = getResources().getString(R.string.opening_chant_e);
        final String CLOSING_CHANT_SANSCRIT = getResources().getString(R.string.closing_chant_s);
        final String CLOSING_CHANT_ENGLISH = getResources().getString(R.string.closing_chant_e);
        YogaGuru guru;
        YogaChant yoga_chant;
        guru = this.getYogaGuru();

        yoga_chant = guru.getChant(chant_id);
        this.display_chant(yoga_chant);
    }

    private void display_chant(YogaChant yoga_chant){
        TextView chantName = (TextView) findViewById(R.id.textViewChantName);
        TextView selectedChant = (TextView) findViewById(R.id.editChant);
        ImageView sanscritView = (ImageView) findViewById(R.id.imageViewSanscrit);

        //Set the title, chant text and also the sanskrit image.
        chantName.setText(getResources().getString(yoga_chant.get_chant_id()));
        selectedChant.setText(yoga_chant.getChant());
        sanscritView.setImageResource(yoga_chant.get_image_resource_id());
        sanscritView.setContentDescription(yoga_chant.getChant());
    }
}