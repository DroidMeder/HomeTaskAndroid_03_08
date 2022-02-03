package com.example.hometaskandroid_03_08.adaptors;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.hometaskandroid_03_08.SecondOnClick;
import com.example.hometaskandroid_03_08.databinding.ItemSecondBinding;
import com.example.hometaskandroid_03_08.models.SecondFrag;
import java.util.ArrayList;
public class AdAdaptor extends RecyclerView.Adapter<AdAdaptor.HoldView> {
    ArrayList<SecondFrag> list;
    private final SecondOnClick onClick;

    public AdAdaptor(ArrayList<SecondFrag> list, SecondOnClick onClick) {
        this.list = list;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public HoldView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemSecondBinding binding = ItemSecondBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);
        return new HoldView(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HoldView holder, int position) {
        holder.bind(list.get(position));
        holder.itemView.setOnClickListener(v -> onClick.secondOnClick(list.get(position)));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    protected static class HoldView extends RecyclerView.ViewHolder{
        ItemSecondBinding binding;
        public HoldView(@NonNull ItemSecondBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void bind(SecondFrag integer) {
            binding.textstat.setText(integer.getTextOne());
            binding.textView2.setText(integer.getTextTwo());
        }
    }
}
