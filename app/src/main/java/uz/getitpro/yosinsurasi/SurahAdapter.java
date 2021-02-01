package uz.getitpro.yosinsurasi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SurahAdapter extends BaseAdapter {

    Context context;
    List<Surah> ayats;

    public SurahAdapter(Context context, List<Surah> ayats) {
        this.context = context;
        this.ayats = ayats;
    }

    @Override
    public int getCount() {
        return ayats.size();
    }

    @Override
    public Object getItem(int position) {
        return ayats.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.item_surah, parent, false);

        TextView txtArabic= convertView.findViewById(R.id.item_sura_ayat_arabic_text);
        TextView txtReading = convertView.findViewById(R.id.item_sura_ayat_reading_text);
        TextView txtUzbek = convertView.findViewById(R.id.item_sura_ayat_uzbek_text);

        txtArabic.setText(ayats.get(position).getArabicText());
        txtReading.setText(ayats.get(position).getReadingText());
        txtUzbek.setText(ayats.get(position).getUzbekText());

        return convertView;
    }
}
