package com.example.hometaskandroid_03_08.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hometaskandroid_03_08.R;
import com.example.hometaskandroid_03_08.databinding.FragmentFinalBinding;
import com.example.hometaskandroid_03_08.databinding.FragmentSecondMainBinding;

import org.w3c.dom.Text;

public class FinalFragment extends Fragment {
    private FragmentFinalBinding binding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= FragmentFinalBinding.inflate(LayoutInflater
                .from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        assert getArguments() != null;
        binding.imageView2.setImageResource(getArguments().getInt("key_one"));
        binding.textstat.setText(getArguments().getString("key_two"));
        binding.textView2.setText(getArguments().getString("key_three"));
    }
}