package com.daka.ashtanga4life;
import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Dan on 11/25/2016.
 */
public class YogaDatabaseHelper extends SQLiteOpenHelper{
    private static final String DB_NAME = "ashtanga4life";
    private static final int DB_VERSION = 1;

    YogaDatabaseHelper(Context context){
        super(context,DB_NAME,null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

        //YogaPoses
        db.execSQL("CREATE TABLE YogaPoses("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "SANSKRIT_NAME TEXT, "
                + "IMAGE_RESOURCE_ID INTEGER, "
                + "DESCRIPTION TEXT);");
        db.execSQL("Insert into YogaPoses(SANSKRIT_NAME,DESCRIPTION,IMAGE_RESOURCE_ID) "
                + "select 'Adho Mukha Svanasana', '', "+ R.drawable.csm_06__adho_mukha_svanasana
                + " union all "
                + " select 'Baddha Padmasana', '', "+R.drawable.csm_09a__baddha_padmasana
                + " union all "
                + " select 'Balasana', '', "+R.drawable.csm_08e__balasana
                + " union all "
                + " select 'Chaturanga Dandasana', '', "+R.drawable.csm_04__chaturanga_dandasana
                + " union all "
                + " select 'Halasana', '', "+R.drawable.csm_02__halasana
                + " union all "
                + " select 'KarnaPidasana', '', "+R.drawable.csm_03__karna_pidasana
                + " union all "
                + " select 'Mathsyasana', '', "+R.drawable.csm_06__mathsyasana
                + " union all "
                + " select 'PadaHastasana', '', "+R.drawable.csm_2__pada_hastasana
                + " union all "
                + " select 'Padangusthasana', '', "+R.drawable.csm_1__padangusthasana
                + " union all "
                + " select 'Padmasana', '', "+R.drawable.csm_10__padmasana
                + " union all "
                + " select 'Parivritta Parsvakonasana', '', "+R.drawable.csm_4_2__parivritta_parsvakonasana
                + " union all "
                + " select 'Parivritta Trikonasana', '', "+R.drawable.csm_3_2__parivritta_trikonasana
                + " union all "
                + " select 'Parsvottanasana', '', "+R.drawable.csm_6__parsvottanasana
                + " union all "
                + " select 'Pindasana', '', "+R.drawable.csm_05__pindasana
                + " union all "
                + " select 'Prasariata Padottanasana A', '', "+R.drawable.csm_5_1__prasarita_padottanasana_a
                + " union all "
                + " select 'Prasariata Padottanasana B', '', "+R.drawable.csm_5_2__prasarita_padottanasana_b
                + " union all "
                + " select 'Prasariata Padottanasana C', '', "+R.drawable.csm_5_3__prasarita_padottanasana_c
                + " union all "
                + " select 'Prasariata Padottanasana D', '', "+R.drawable.csm_5_4__prasarita_padottanasana_d
                + " union all "
                + " select 'Slamba Sarvangasana', '', "+R.drawable.csm_01b__salamba_sarvangasana
                + " union all "
                + " select 'Salamba Sarvangasana Vinyasa', '', "+R.drawable.csm_01a__salamba_sarvangasana_vinyasa_in
                + " union all "
                + " select 'Samasthiti', '', "+R.drawable.csm_10__samasthiti
                + " union all "
                + " select 'Shavasana', '', "+R.drawable.csm_12__shavasana
                + " union all "
                + " select 'Sirsasana A', '', "+R.drawable.csm_08a__sirsasana_a
                + " union all "
                + " select 'Sirsasana B', '', "+R.drawable.csm_08b__sirsasana_b
                + " union all "
                + " select 'The Way Out', '', "+R.drawable.csm_08d__the_way_out
                + " union all "
                + " select 'Urdhva Dandasana', '', "+R.drawable.csm_08c__urdhva_dandasana
                + " union all "
                + " select 'Urdhva Mukha Svanasana', '', "+R.drawable.csm_05__urdhva_mukha_svanasana
                + " union all "
                + " select 'Urdhva Padmasana', '', "+R.drawable.csm_04__urdhva_padmasa
                + " union all "
                + " select 'Urdhva Vrikasana', '', "+R.drawable.csm_09__urdhva_vrikasana
                + " union all "
                + " select 'Utkatasana', '', "+R.drawable.utkatasana
                + " union all "
                + " select 'Utpluthee', '', "+R.drawable.csm_11__utpluthee
                + " union all "
                + " select 'Uttana Padasana', '', "+R.drawable.csm_07__uttana_padasana
                + " union all "
                + " select 'Uttanasana A', '', "+R.drawable.csm_02__uttanasana_a
                + " union all "
                + " select 'Uttanasana B', '', "+R.drawable.csm_03__uttanasana_b
                + " union all "
                + " select 'Utthita Parsvakonasana', '', "+R.drawable.csm_4_1__utthita_parsvakonasana
                + " union all "
                + " select 'Utthita Trikonasana', '', "+R.drawable.csm_3_1__utthita_trikonasana
                + " union all "
                + " select 'Virabhadrasana A', '', "+R.drawable.csm_12__virabhadrasana_a  
                + " union all "
                + " select 'Utthitahasta Padangusthasana Vinyasa', '', "+R.drawable.csm_01a__utthita_hasta_padangusthasana_vinyasa
                + " union all "
                + " select 'Utthitahasta Padangusthasana', '', "+R.drawable.csm_01b__utthita_hasta_padangusthasana
                + " union all "
                + " select 'Utthita Parsvasahita', '', "+R.drawable.csm_01c__utthita_parsvasahita
                + " union all "
                + " select 'Utthitahasta Padangusthasana B', '', "+R.drawable.csm_01d__utthita_hasta_padangusthasana_b
                + " union all "
                + " select 'Ardhabaddha Padmottanasana', '', "+R.drawable.csm_02__ardha_baddha_padmottanasana
                + " union all "
                + " select 'Virabhadrasana B', '', "+R.drawable.csm_04b__virabatrasana_b
                + " union all "
                + " select 'Virabhadrasana Vinyasa Out', '', "+R.drawable.csm_04c__virabatrasana_vinyasa_out_a
                + " union all "
                + " select 'Utkatasana Vinyasa Out', '', "+R.drawable.csm_03b__utkatasana_vinyasa_out
                + " union all "
                + " select 'Dandasana', '', "+R.drawable.csm_05a__paschimattanasana_vinyasa_in_dandasana
                + " union all "
                + " select 'Paschimattanasana A', '', "+R.drawable.csm_05b__paschimattanasana_a
                + " union all "
                + " select 'Paschimattanasana B', '', "+R.drawable.csm_06__paschimattanasana_b
                + " union all "
                + " select 'Paschimattanasana C', '', "+R.drawable.csm_07__paschimattanasana_c
                + " union all "
                + " select 'Paschimattanasana D', '', "+R.drawable.csm_08__paschimattanasana_d
                + " union all "
                + " select 'Purvattanasana', '', "+R.drawable.csm_09__purvattanasana
                + " union all "
                + " select 'Ardhabaddhapadma Paschimattananasana', '', "+R.drawable.csm_10__ardha_baddha_padma_paschimattanasana
                + " union all "
                + " select 'Triangamukhaekapada Paschimattanasana', '', "+R.drawable.csm_11__triang_mukha_eka_pada_paschimattanasana
                + " union all "
                + " select 'Janusirsasana A', '', "+R.drawable.csm_12__janu_sirsasana_a
                + " union all "
                + " select 'Janusirsasana B', '', "+R.drawable.csm_13__janu_sirsasana_b
                + " union all "
                + " select 'Janusirsasana C', '', "+R.drawable.csm_14__janu_sirsasana_c
                + " union all "
                + " select 'Marichyasana A', '', "+R.drawable.csm_15__marichyasana_a
                + " union all "
                + " select 'Marichyasana B', '', "+R.drawable.csm_16a__marichyasana_b
                + " union all "
                + " select 'Marichyasana B(out)', '', "+R.drawable.csm_16b__marichyasana_b
                + " union all "
                + " select 'Marichyasana C', '', "+R.drawable.csm_17__marichasana_c
                + " union all "
                + " select 'Marichyasana D', '', "+R.drawable.csm_18__marichyasana_d
                + " union all "
                + " select 'Navasana', '', "+R.drawable.csm_19a__navasana
                + " union all "
                + " select 'Lolasana', '', "+R.drawable.csm_19b__lolasana
                + " union all "
                + " select 'Navasana vinyasa out', '', "+R.drawable.csm_19c__navasana_vinyasa_out
                + " union all "
                + " select 'Bhujapidasana vinyasa in', '', "+R.drawable.csm_20a__bhuja_pindasana_vinyasa_in
                + " union all "
                + " select 'Bhujapidasana', '', "+R.drawable.csm_20b__bhuja_pindasana_
                + " union all "
                + " select 'Kurmasana', '', "+R.drawable.csm_21a__kurmasana
                + " union all "
                + " select 'Suptakurmasana', '', "+R.drawable.csm_21b__supta_kurmasana
                + " union all "
                + " select 'Suptakurmasana vinyasa out', '', "+R.drawable.csm_21c__supta_kurmasana_vinyasa_out
                + " union all "
                + " select 'Suptakurmasana vinyasa out2', '', "+R.drawable.csm_21d__supta_kurmasana_vinyasa_out
                + " union all "
                + " select 'Suptakurmasana vinyasa out3', '', "+R.drawable.csm_21e__supta_kurmasana_vinyasa_out
                + " union all "
                + " select 'Garbhapindasana', '', "+R.drawable.csm_23a__gaba_pindasana
                + " union all "
                + " select 'Garbhapindasana b', '', "+R.drawable.csm_23b__gaba_pindasana
                + " union all "
                + " select 'Kukutasana', '', "+R.drawable.csm_24__kukkutasana
                + " union all "
                + " select 'Baddhakonasana A', '', "+R.drawable.csm_25a__baddha_konasana_a
                + " union all "
                + " select 'Baddhakonasana B', '', "+R.drawable.csm_25b_baddha_konasana_b
                + " union all "
                + " select 'Baddhakonasana C', '', "+R.drawable.csm_25c_baddha_konasana_c
                + " union all "
                + " select 'Upavisthakonsana A', '', "+R.drawable.csm_26a_upavistha_konasana_a
                + " union all "
                + " select 'Upavisthakonsana B', '', "+R.drawable.csm_26b__upavistha_konasana_b
                + " union all "
                + " select 'Suptakonasana', '', "+R.drawable.csm_27a__supta_konasana
                + " union all "
                + " select 'Suptakonasana vinyasa out 1', '', "+R.drawable.csm_27b__supta_konasana_vinyasa_out
                + " union all "
                + " select 'Suptakonasana vinyasa out 2', '', "+R.drawable.csm_27c__supta_konasana_vinyasa_out
                + " union all "
                + " select 'Suptapadangunsthasana', '', "+R.drawable.csm_28a__supta_padagunsthasana
                + " union all "
                + " select 'Suptaparvasahita', '', "+R.drawable.csm_28b__supta_parsvasahita
                + " union all "
                + " select 'Ubhayapadangusthasana vinyasa in', '', "+R.drawable.csm_29a__ubhaya_padangusthasana_vinyasa_in
                + " union all "
                + " select 'Ubhayapadangusthasana', '', "+R.drawable.csm_29b__ubhaya_padangusthasana
                + " union all "
                + " select 'Urdhvamukapaschimottanasana vinyasa in', '', "+R.drawable.csm_30a__urdhva_muka_paschimottanasana_vinyasa_in
                + " union all "
                + " select 'Urdhvamukapaschimottanasana', '', "+R.drawable.csm_30b__urdhva_muka_paschimottanasana
                + " union all "
                + " select 'Setubandhasana', '', "+R.drawable.csm_31__setu_bandhasana
                + " union all "
                + " select 'Urdhadhanurasana', '', "+R.drawable.csm_32__urdhva_dhanurasana
                + " union all "
                + " select 'Chakrasana', '', "+R.drawable.csm_33__chakrasana
                + " union all "
                + " select 'Paschimattanasana', '', "+R.drawable.csm_34__paschimattanasana
                + " union all "
                + " select 'Yoga-Mudra', '', "+R.drawable.csm_09b__yoga_mudra +";");


        //YogaSeries
        db.execSQL("CREATE TABLE YogaSeries("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "DESCRIPTION TEXT);");
        db.execSQL("Insert into YogaSeries(Name, Description) "
            +"select 'Suryanamaskara A', 'Sun Salutation A'"
            +" union all "
            +"select 'Suryanamaskara B', 'Sun Salutation B'"
            +" union all "
            +"select 'Fundamental Basic Sequence', 'Fundamental Basic Sequence'"
            +" union all "
            +"select 'Finishing Sequence', 'Finishing Sequence'"
            +" union all "
            +"select 'Primary Series', 'Primary Series'"
            +" union all "
            +"select 'Intermediate Series', 'Intermediate Series'"
            +" union all "
            +"select 'Advanced A Series', 'Advanced A Series'"
            +" union all "
            +"select 'Make My Own', 'Create your own series!'");
        //SeriesPoseSequence
        db.execSQL("CREATE TABLE SeriesPoseSequence(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "series_id integer, " +
                "pose_id INTEGER, " +
                "pose_sequence INTEGER, " +
                "FOREIGN KEY(series_id) references YogaSeries(_id)," +
                "FOREIGN KEY(pose_id) references YogaPoses(_id));");
        //Surya Namaskara A
        db.execSQL("insert into SeriesPoseSequence(series_id,pose_id, pose_sequence) "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara A') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Urdhva Vrikasana') as p_id, "+
                "        1 as p_seq "+
                "UNION ALL  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara A') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Uttanasana A') as p_id, "+
                "        2 as p_seq "+
                "UNION ALL  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara A') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Uttanasana B') as p_id, "+
                "        3 as p_seq "+
                "UNION ALL  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara A') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Chaturanga Dandasana') as p_id, "+
                "        4 as p_seq "+
                "UNION ALL  "+ 
                "select (select  _id from YogaSeries where name = 'Suryanamaskara A') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Urdhva Mukha Svanasana') as p_id, "+
                "        5 as p_seq "+
                "UNION ALL  "+ 
                "select (select  _id from YogaSeries where name = 'Suryanamaskara A') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Adho Mukha Svanasana') as p_id, "+
                "        6 as p_seq "+
                "UNION ALL  "+ 
                "select (select  _id from YogaSeries where name = 'Suryanamaskara A') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Uttanasana B') as p_id, "+
                "        7 as p_seq "+
                "UNION ALL  "+ 
                "select (select  _id from YogaSeries where name = 'Suryanamaskara A') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Uttanasana A') as p_id, "+
                "        8 as p_seq "+
                "UNION ALL  "+ 
                "select (select  _id from YogaSeries where name = 'Suryanamaskara A') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Urdhva Vrikasana') as p_id, "+
                "        9 as p_seq "+
                "UNION ALL  "+ 
                "select (select  _id from YogaSeries where name = 'Suryanamaskara A') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Samasthiti') as p_id, "+
                "        10 as p_seq;"); 
        //Surya Namaskara B
        db.execSQL("insert into SeriesPoseSequence(series_id,pose_id, pose_sequence) "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Urdhva Vrikasana') as p_id, "+
                "        1 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Utkatasana') as p_id, "+
                "        2 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Uttanasana A') as p_id, "+
                "        3 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Uttanasana B') as p_id, "+
                "        4 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Chaturanga Dandasana') as p_id, "+
                "        5 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Urdhva Mukha Svanasana') as p_id, "+
                "        6 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Adho Mukha Svanasana') as p_id, "+
                "        7 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Virabhadrasana A') as p_id, "+
                "        8 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Chaturanga Dandasana') as p_id, "+
                "        9 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Urdhva Mukha Svanasana') as p_id, "+
                "        10 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Adho Mukha Svanasana') as p_id, "+
                "        11 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Virabhadrasana A') as p_id, "+
                "        12 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Chaturanga Dandasana') as p_id, "+
                "        13 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Urdhva Mukha Svanasana') as p_id, "+
                "        14 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Adho Mukha Svanasana') as p_id, "+
                "        15 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Uttanasana B') as p_id, "+
                "        16 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Uttanasana A') as p_id, "+
                "        17 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Utkatasana') as p_id, "+
                "        18 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Suryanamaskara B') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Samasthiti') as p_id, "+
                "        19 as p_seq;"); 

        //Fundamental Basic Sequence
        db.execSQL("insert into SeriesPoseSequence(series_id,pose_id, pose_sequence) "+
                "select (select  _id from YogaSeries where name = 'Fundamental Basic Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Padangusthasana') as p_id, "+
                "        1 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Fundamental Basic Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'PadaHastasana') as p_id, "+
                "        2 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Fundamental Basic Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Utthita Trikonasana') as p_id, "+
                "        3 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Fundamental Basic Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Parivritta Trikonasana') as p_id, "+
                "        4 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Fundamental Basic Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Utthita Parsvakonasana') as p_id, "+
                "        5 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Fundamental Basic Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Parivritta Parsvakonasana') as p_id, "+
                "        6 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Fundamental Basic Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Prasariata Padottanasana A') as p_id, "+
                "        7 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Fundamental Basic Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Prasariata Padottanasana B') as p_id, "+
                "        8 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Fundamental Basic Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Prasariata Padottanasana C') as p_id, "+
                "        9 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Fundamental Basic Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Prasariata Padottanasana D') as p_id, "+
                "        10 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Fundamental Basic Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Parsvottanasana') as p_id, "+
                "        11 as p_seq;");
        //Primary Series
        db.execSQL("insert into SeriesPoseSequence(series_id,pose_id, pose_sequence) "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Utthitahasta Padangusthasana Vinyasa') as p_id, "+
                "        1 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Utthitahasta Padangusthasana') as p_id, "+
                "        2 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Utthita Parsvasahita') as p_id, "+
                "        3 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Utthitahasta Padangusthasana B') as p_id, "+
                "        4 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Ardhabaddha Padmottanasana') as p_id, "+
                "        5 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Utkatasana') as p_id, "+
                "        6 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Utkatasana Vinyasa Out') as p_id, "+
                "        7 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Virabhadrasana A') as p_id, "+
                "        8 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Virabhadrasana B') as p_id, "+
                "        9 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Virabhadrasana Vinyasa Out') as p_id, "+
                "        10 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Dandasana') as p_id, "+
                "        11 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Paschimattanasana A') as p_id, "+
                "        12 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Paschimattanasana B') as p_id, "+
                "        13 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Paschimattanasana C') as p_id, "+
                "        14 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Paschimattanasana D') as p_id, "+
                "        15 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Purvattanasana') as p_id, "+
                "        16 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Ardhabaddhapadma Paschimattananasana') as p_id, "+
                "        17 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Triangamukhaekapada Paschimattanasana') as p_id, "+
                "        18 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Janusirsasana A') as p_id, "+
                "        19 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Janusirsasana B') as p_id, "+
                "        20 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Janusirsasana C') as p_id, "+
                "        21 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Marichyasana A') as p_id, "+
                "        22 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Marichyasana B') as p_id, "+
                "        23 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Marichyasana B(out)') as p_id, "+
                "        24 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Marichyasana C') as p_id, "+
                "        25 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Marichyasana D') as p_id, "+
                "        26 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Navasana') as p_id, "+
                "        27 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Lolasana') as p_id, "+
                "        28 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Navasana vinyasa out') as p_id, "+
                "        29 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Bhujapidasana vinyasa in') as p_id, "+
                "        30 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Bhujapidasana') as p_id, "+
                "        31 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Kurmasana') as p_id, "+
                "        32 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Suptakurmasana') as p_id, "+
                "        33 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Suptakurmasana vinyasa out') as p_id, "+
                "        34 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Suptakurmasana vinyasa out2') as p_id, "+
                "        35 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Suptakurmasana vinyasa out3') as p_id, "+
                "        36 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Garbhapindasana') as p_id, "+
                "        37 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Garbhapindasana b') as p_id, "+
                "        38 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Kukutasana') as p_id, "+
                "        39 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Baddhakonasana A') as p_id, "+
                "        40 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Baddhakonasana B') as p_id, "+
                "        41 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Baddhakonasana C') as p_id, "+
                "        42 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Upavisthakonsana A') as p_id, "+
                "        43 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Upavisthakonsana B') as p_id, "+
                "        44 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Suptakonasana') as p_id, "+
                "        45 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Suptakonasana vinyasa out 1') as p_id, "+
                "        46 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Suptakonasana vinyasa out 2') as p_id, "+
                "        47 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Suptapadangunsthasana') as p_id, "+
                "        48 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Suptaparvasahita') as p_id, "+
                "        49 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Ubhayapadangusthasana vinyasa in') as p_id, "+
                "        50 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Ubhayapadangusthasana') as p_id, "+
                "        51 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Urdhvamukapaschimottanasana vinyasa in') as p_id, "+
                "        52 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Urdhvamukapaschimottanasana') as p_id, "+
                "        53 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Setubandhasana') as p_id, "+
                "        54 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Urdhadhanurasana') as p_id, "+
                "        55 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Chakrasana') as p_id, "+
                "        56 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Primary Series') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Paschimattanasana') as p_id, "+
                "        57 as p_seq  ;");

        //Finishing Sequence
        db.execSQL("insert into SeriesPoseSequence(series_id,pose_id, pose_sequence) "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Salamba Sarvangasana Vinyasa') as p_id, "+
                "        1 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Slamba Sarvangasana') as p_id, "+
                "        2 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Halasana') as p_id, "+
                "        3 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'KarnaPidasana') as p_id, "+
                "        4 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Urdhva Padmasana') as p_id, "+
                "        5 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Pindasana') as p_id, "+
                "        6 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Mathsyasana') as p_id, "+
                "        7 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Uttana Padasana') as p_id, "+
                "        8 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Sirsasana A') as p_id, "+
                "        9 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Sirsasana B') as p_id, "+
                "        10 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Urdhva Dandasana') as p_id, "+
                "        11 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'The Way Out') as p_id, "+
                "        12 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Balasana') as p_id, "+
                "        13 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Baddha Padmasana') as p_id, "+
                "        14 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Yoga-Mudra') as p_id, "+
                "        15 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Padmasana') as p_id, "+
                "        16 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Utpluthee') as p_id, "+
                "        17 as p_seq "+
                "union all  "+
                "select (select  _id from YogaSeries where name = 'Finishing Sequence') as s_id, "+
                "       (select  _id from YogaPoses where sanskrit_name = 'Shavasana') as p_id, "+
                        "18 as p_seq;");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    private List<String> get_text(String table_name, String column_name){
        List<String> text_values = new ArrayList<String>();
        String selectQuery = "Select "+column_name+" from "+table_name;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                text_values.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return text_values;
    }

    /**
    * Getting all yoga series
    * returns a list of series names.
    * */
    public List<String> getAllYogaSeriesNames(){
        return this.get_text("YogaSeries", "name");
    }

    /**
    * */
    public List<String> getAllYogaPoseNames(){
        return this.get_text("YogaPoses", "sanskrit_name");
    }

    public List<String> getAllYogaPosesForSeries(String series_name){
        /* *  Gets the poses sanskrit name for the specified series in
        order of pose sequence.
        select pose_sequence, Sanskrit_name, Name
        from SeriesPoseSequence SPS join YogaPoses YP on YP._id=SPS.pose_id  
                            join YogaSeries YS on YS._id = SPS.series_id
        order by series_id, pose_sequence;
        * */
        List<String> text_values = new ArrayList<String>();
        String selectQuery = "Select YP.sanskrit_name " +
                            " from SeriesPoseSequence SPS join YogaPoses YP on YP._id=SPS.pose_id " +
                            "    join YogaSeries YS on YS._id = SPS.series_id " +
                            " where YS.Name = '"+series_name+ "' " +
                            " order by SPS.pose_sequence;";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                text_values.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return text_values;
    }

    public List<YogaPose> getAllPosesForSeries(Integer series_id){
        List<YogaPose> yoga_poses = new ArrayList<YogaPose>();
        int i=0;
        YogaPose yoga_pose;
        String selectQuery = "Select YP._id, YP.sanskrit_name, YP.IMAGE_RESOURCE_ID, YP.description " +
                            " from SeriesPoseSequence SPS join YogaPoses YP on YP._id=SPS.pose_id " +
                            "    join YogaSeries YS on YS._id = SPS.series_id " +
                            " where YS._id = "+series_id +
                            " order by SPS.pose_sequence;";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                yoga_pose = new YogaPose(cursor.getString(1), cursor.getString(3), cursor.getInt(2));
                yoga_poses.add( yoga_pose );
                i++;
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return yoga_poses;
    }

    public List<YogaSeries> getAllYogaSeries(){
        /*
            Returns a list of all the YogaSeries that exist in the
            database.
            Each series will have been initialized with all
            of the yogaPoses in its series in the order in which
            they are expected to be executed.
        */
        List<YogaSeries> yoga_series_list = new ArrayList<YogaSeries>();
        YogaSeries yoga_series;
        List<YogaPose> yoga_poses;
        int series_id;
        String selectQuery = "Select _id, name, description from YogaSeries";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                series_id = cursor.getInt(0);
                yoga_poses = this.getAllPosesForSeries(series_id);
                yoga_series = new YogaSeries(cursor.getString(1), cursor.getString(2), yoga_poses);
                yoga_series_list.add(yoga_series);
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return yoga_series_list;
    }

    public YogaSeries getYogaSeries(String series_name){
        /*  Reteturns a YogaSeries object that has been
        initialized with all of the poses in the series in 
        the order in which they should be practiced.
        */
        YogaSeries yoga_series = null;
        List<YogaPose> yoga_poses;
        int series_id;
        String selectQuery = "Select _id, name, description from YogaSeries where name = '"+series_name+"'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                series_id = cursor.getInt(0);
                yoga_poses = this.getAllPosesForSeries(series_id);
                yoga_series = new YogaSeries(cursor.getString(1), cursor.getString(2), yoga_poses);
            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return yoga_series;
    }
}
