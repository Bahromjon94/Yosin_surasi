package uz.getitpro.yosinsurasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ReadableActivity extends AppCompatActivity {

    private ListView listRoot;
    private SurahAdapter adapter;
    private List<Surah> ayats;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_readable);

        Toast.makeText(this, "Bismillahir Rohmanir Rohim", Toast.LENGTH_SHORT).show();

        listRoot = findViewById(R.id.list_root);
        ayats = new ArrayList<>();
        adapter = new SurahAdapter(this, ayats);
        listRoot.setAdapter(adapter);

        getText();
    }

    public void getText() {

        ayats.add(new Surah(1, getResources().getString(R.string.arabic_one), "Reading", "Uzbek"));
        ayats.add(new Surah(2, getResources().getString(R.string.arabic_two), "Reading", "Uzbek"));
        ayats.add(new Surah(3, getResources().getString(R.string.arabic_three), "Reading", "Uzbek"));
        ayats.add(new Surah(4, getResources().getString(R.string.arabic_four), "Reading", "Uzbek"));
        ayats.add(new Surah(5, getResources().getString(R.string.arabic_five), "Reading", "Uzbek"));
        ayats.add(new Surah(6, getResources().getString(R.string.arabic_six), "Reading", "Uzbek"));
        ayats.add(new Surah(7, getResources().getString(R.string.arabic_seven), "Reading", "Uzbek"));
        ayats.add(new Surah(8, getResources().getString(R.string.arabic_eight), "Reading", "Uzbek"));
        ayats.add(new Surah(9, getResources().getString(R.string.arabic_nine), "Reading", "Uzbek"));
        ayats.add(new Surah(10, getResources().getString(R.string.arabic_ten), "Reading", "Uzbek"));
        ayats.add(new Surah(11, getResources().getString(R.string.arabic_eleven), "Reading", "Uzbek"));
        ayats.add(new Surah(12, getResources().getString(R.string.arabic_twelve), "Reading", "Uzbek"));
        ayats.add(new Surah(13, getResources().getString(R.string.arabic_thirteen), "Reading", "Uzbek"));
        ayats.add(new Surah(14, getResources().getString(R.string.arabic_fourteen), "Reading", "Uzbek"));
        ayats.add(new Surah(15, getResources().getString(R.string.arabic_fifteen), "Reading", "Uzbek"));
        ayats.add(new Surah(16, getResources().getString(R.string.arabic_sixteen), "Reading", "Uzbek"));
        ayats.add(new Surah(17, getResources().getString(R.string.arabic_seventeen), "Reading", "Uzbek"));
        ayats.add(new Surah(18, getResources().getString(R.string.arabic_eighteen), "Reading", "Uzbek"));
        ayats.add(new Surah(19, getResources().getString(R.string.arabic_nineteen), "Reading", "Uzbek"));
        ayats.add(new Surah(20, getResources().getString(R.string.arabic_twenty), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_one), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_one), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_one), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_one), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_one), "Reading", "Uzbek"));

    }
}