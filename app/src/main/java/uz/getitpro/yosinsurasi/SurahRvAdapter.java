package uz.getitpro.yosinsurasi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SurahRvAdapter extends RecyclerView.Adapter<SurahRvAdapter.SurahHolder>  {


    Context contex;
    ArrayList<Surah> ayats;

    public SurahRvAdapter(Context context, ArrayList<Surah> ayats) {
        this.contex = context;
        this.ayats = ayats;
    }

    @NonNull
    @Override
    public SurahHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SurahHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return ayats.size();
    }

    public class SurahHolder extends RecyclerView.ViewHolder {
        public SurahHolder(@NonNull View itemView) {
            super(itemView);

            TextView textView = itemView.findViewById(R.id.item_sura_ayat_arabic_text);
        }
    }

}
