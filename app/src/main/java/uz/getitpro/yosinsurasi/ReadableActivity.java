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
        ayats.add(new Surah(21, getResources().getString(R.string.arabic_twenty_one), "Reading", "Uzbek"));
        ayats.add(new Surah(22, getResources().getString(R.string.arabic_twenty_two), "Reading", "Uzbek"));
        ayats.add(new Surah(23, getResources().getString(R.string.arabic_twenty_three), "Reading", "Uzbek"));
        ayats.add(new Surah(24, getResources().getString(R.string.arabic_twenty_four), "Reading", "Uzbek"));
        ayats.add(new Surah(25, getResources().getString(R.string.arabic_twenty_five), "Reading", "Uzbek"));
        ayats.add(new Surah(26, getResources().getString(R.string.arabic_twenty_six), "Reading", "Uzbek"));
        ayats.add(new Surah(27, getResources().getString(R.string.arabic_twenty_seven), "Reading", "Uzbek"));
        ayats.add(new Surah(28, getResources().getString(R.string.arabic_twenty_eight), "Reading", "Uzbek"));
        ayats.add(new Surah(29, getResources().getString(R.string.arabic_twenty_nine), "Reading", "Uzbek"));
        ayats.add(new Surah(30, getResources().getString(R.string.arabic_thirty), "Reading", "Uzbek"));
        ayats.add(new Surah(31, getResources().getString(R.string.arabic_thirty_one), "Reading", "Uzbek"));
        ayats.add(new Surah(32, getResources().getString(R.string.arabic_thirty_two), "Reading", "Uzbek"));
        ayats.add(new Surah(33, getResources().getString(R.string.arabic_thirty_three), "Reading", "Uzbek"));
        ayats.add(new Surah(34, getResources().getString(R.string.arabic_thirty_four), "Reading", "Uzbek"));
        ayats.add(new Surah(35, getResources().getString(R.string.arabic_thirty_five), "Reading", "Uzbek"));
        ayats.add(new Surah(36, getResources().getString(R.string.arabic_thirty_six), "Reading", "Uzbek"));
        ayats.add(new Surah(37, getResources().getString(R.string.arabic_thirty_seven), "Reading", "Uzbek"));
        ayats.add(new Surah(38, getResources().getString(R.string.arabic_thirty_eight), "Reading", "Uzbek"));
        ayats.add(new Surah(39, getResources().getString(R.string.arabic_thirty_nine), "Reading", "Uzbek"));
        ayats.add(new Surah(40, getResources().getString(R.string.forty), "Reading", "Uzbek"));
        ayats.add(new Surah(41, getResources().getString(R.string.arabic_forty_one), "Reading", "Uzbek"));
        ayats.add(new Surah(42, getResources().getString(R.string.arabic_forty_two), "Reading", "Uzbek"));
        ayats.add(new Surah(43, getResources().getString(R.string.arabic_forty_three), "Reading", "Uzbek"));
        ayats.add(new Surah(44, getResources().getString(R.string.arabic_forty_four), "Reading", "Uzbek"));
        ayats.add(new Surah(45, getResources().getString(R.string.arabic_forty_five), "Reading", "Uzbek"));
        ayats.add(new Surah(46, getResources().getString(R.string.arabic_forty_six), "Reading", "Uzbek"));
        ayats.add(new Surah(47, getResources().getString(R.string.arabic_forty_seven), "Reading", "Uzbek"));
        ayats.add(new Surah(48, getResources().getString(R.string.arabic_forty_eight), "Reading", "Uzbek"));
        ayats.add(new Surah(49, getResources().getString(R.string.arabic_forty_nine), "Reading", "Uzbek"));
        ayats.add(new Surah(50, getResources().getString(R.string.arabic_fifty), "Reading", "Uzbek"));
        ayats.add(new Surah(51, getResources().getString(R.string.arabic_fifty_one), "Reading", "Uzbek"));
        ayats.add(new Surah(52, getResources().getString(R.string.arabic_fifty_two), "Reading", "Uzbek"));
        ayats.add(new Surah(53, getResources().getString(R.string.arabic_fifty_three), "Reading", "Uzbek"));
        ayats.add(new Surah(54, getResources().getString(R.string.arabic_fifty_four), "Reading", "Uzbek"));
        ayats.add(new Surah(55, getResources().getString(R.string.arabic_fifty_five), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_fifty_six), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_fifty_seven), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_fifty_eight), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_fifty_nine), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_sixty), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_sixty_one), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_sixty_two), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_sixty_three), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_sixty_four), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_sixty_five), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_sixty_six), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_sixty_seven), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_sixty_eight), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_sixty_nine), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_seventy), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_seventy_one), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_seventy_two), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_seventy_three), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_seventy_four), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_seventy_five), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_seventy_six), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_seventy_seven), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_seventy_eight), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_seventy_nine), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_eighty), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_eighty_one), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_eighty_two), "Reading", "Uzbek"));
        ayats.add(new Surah(1, getResources().getString(R.string.arabic_eighty_three), "Reading", "Uzbek"));

    }
}