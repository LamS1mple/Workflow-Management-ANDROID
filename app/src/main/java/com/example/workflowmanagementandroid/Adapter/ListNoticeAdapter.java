package com.example.workflowmanagementandroid.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.workflowmanagementandroid.R;

public class ListNoticeAdapter extends RecyclerView.Adapter<ListNoticeAdapter.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_notice, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageNotice, editNotice;
        private TextView titleNotice, contentNotice, timeNotice;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            editNotice = itemView.findViewById(R.id.ic_edit_notice);
            imageNotice = itemView.findViewById(R.id.img_item_notice);
            timeNotice = itemView.findViewById(R.id.time_notice);
            contentNotice = itemView.findViewById(R.id.content_notice);
            titleNotice = itemView.findViewById(R.id.title_notice);
        }
    }
}
