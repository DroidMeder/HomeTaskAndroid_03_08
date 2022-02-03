package com.example.hometaskandroid_03_08.ui;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.hometaskandroid_03_08.OnClick;
import com.example.hometaskandroid_03_08.R;
import com.example.hometaskandroid_03_08.adaptors.FirstAdaptor;
import com.example.hometaskandroid_03_08.databinding.FragmentFirstMainBinding;
import com.example.hometaskandroid_03_08.models.BaseFragment;
import com.example.hometaskandroid_03_08.models.FirstFrag;
import java.util.ArrayList;

public class FirstMainFragment extends BaseFragment implements OnClick {
    private FragmentFirstMainBinding binding;
    private final ArrayList<FirstFrag> list=new ArrayList<>();
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentFirstMainBinding.inflate(LayoutInflater
                .from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        load();
        FirstAdaptor adAdaptor = new FirstAdaptor(list, this);
        binding.recViewOf1Frag.setAdapter(adAdaptor);
    }

    private void load() {
        list.add(new FirstFrag(R.drawable._image_einstein, "dead","Albert Einstein"));
        list.add(new FirstFrag(R.drawable._image_jerry, "alive","Jerry Smith"));
        list.add(new FirstFrag(R.drawable._image_morty, "alive","Morty Smith"));
        list.add(new FirstFrag(R.drawable._image_rick, "alive","Rick Sanchez"));
    }

    @Override
    public void onClick(FirstFrag firstFrag) {
        navigate(FirstMainFragmentDirections.actionFirstFragmentToFinalFragment(
                String.valueOf(firstFrag.getPath()),
                firstFrag.getStatus(), firstFrag.getName()));
    }
}