package com.example.hometaskandroid_03_08.ui;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hometaskandroid_03_08.R;
import com.example.hometaskandroid_03_08.SecondOnClick;
import com.example.hometaskandroid_03_08.adaptors.AdAdaptor;
import com.example.hometaskandroid_03_08.databinding.FragmentSecondMainBinding;
import com.example.hometaskandroid_03_08.models.SecondFrag;

import java.util.ArrayList;

public class SecondMainFragment extends Fragment implements SecondOnClick {
    private FragmentSecondMainBinding binding;
    private final ArrayList<SecondFrag> list=new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentSecondMainBinding.inflate(LayoutInflater
                .from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        load();
        binding.recViewOf1Frag.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        AdAdaptor adAdaptor = new AdAdaptor(list, this);
        binding.recViewOf1Frag.setAdapter(adAdaptor);
    }

    private void load() {
        list.add(new SecondFrag("Planet", "Earth (C-137)"));
        list.add(new SecondFrag("Cluster", "Abadango"));
        list.add(new SecondFrag("Space station", "Citadel of Ricks"));
        list.add(new SecondFrag("Planet", "Worldender's lair"));
        list.add(new SecondFrag("Microverse", "Anatomy Park"));
        list.add(new SecondFrag("TV", "Interdimensional Cable"));
        list.add(new SecondFrag("Resort", "Immortality Field Resort"));
        list.add(new SecondFrag("Planet", "Post-Apocalyptic Earth"));
        list.add(new SecondFrag("Planet", "Purge Planet"));
        list.add(new SecondFrag("Planet", "Venzenulon 7"));
        list.add(new SecondFrag("Planet", "Bepis 9"));
        list.add(new SecondFrag("Planet", "Cronenberg Earth"));
        list.add(new SecondFrag("Planet", "Bird World"));
        list.add(new SecondFrag("Space station", "St. Gloopy Noops Hospital"));
        list.add(new SecondFrag("Planet", "Earth (5-126)"));
        list.add(new SecondFrag("Dream", "Mr. Goldenfold's dream"));
        list.add(new SecondFrag("Planet", "Gromflom Prime"));
        list.add(new SecondFrag("Planet", "Earth (Rpl. Dimension)"));
    }

    @Override
    public void secondOnClick(SecondFrag secondFrag) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_one", R.drawable.image_1);
        bundle.putString("key_two", secondFrag.getTextOne());
        bundle.putString("key_three", secondFrag.getTextTwo());
        NavHostFragment.findNavController(SecondMainFragment.this).navigate(R.id.finalFragment, bundle);

    }
}