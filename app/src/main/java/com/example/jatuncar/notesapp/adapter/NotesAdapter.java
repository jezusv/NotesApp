package com.example.jatuncar.notesapp.adapter;

import android.speech.RecognizerIntent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jatuncar.notesapp.R;
import com.example.jatuncar.notesapp.models.Notes;

import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder>{

    private List<Notes> notes;

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txt_title;
        private TextView txt_Fecha;
        private TextView txt_detail;
        public ViewHolder(View itemView) {
            super(itemView);
            txt_title = itemView.findViewById(R.id.txt_title);
            txt_Fecha = itemView.findViewById(R.id.txt_Fecha);
            txt_detail = itemView.findViewById(R.id.txt_detail);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }


}
