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

        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));
        ayats.add(new Surah(1, "Arabic", "Reading", "Uzbek"));

    }
}