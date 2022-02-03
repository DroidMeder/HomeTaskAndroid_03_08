package com.example.hometaskandroid_03_08.adaptors;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hometaskandroid_03_08.OnClick;
import com.example.hometaskandroid_03_08.databinding.ItemFirstBinding;
import com.example.hometaskandroid_03_08.models.FirstFrag;
import java.util.ArrayList;

public class FirstAdaptor extends RecyclerView.Adapter<FirstAdaptor.HoldView> {
    private final ArrayList<FirstFrag> list;
    private final OnClick onClick;

    public FirstAdaptor(ArrayList<FirstFrag> list, OnClick onClick) {
        this.list = list;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public HoldView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFirstBinding binding = ItemFirstBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);
        return new HoldView(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HoldView holder, int position) {
        holder.bind(list.get(position));
        holder.itemView.setOnClickListener(v -> onClick.onClick(list.get(position)));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected static class HoldView extends RecyclerView.ViewHolder {
        ItemFirstBinding binding;

        public HoldView(@NonNull ItemFirstBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(FirstFrag integer) {
            binding.imageView.setImageResource(integer.getPath());
            binding.textStatus.setText(integer.getStatus());
            binding.textName.setText(integer.getName());
        }
    }
}

