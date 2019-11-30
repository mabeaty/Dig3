package com.hfad.dig2.ui.gold6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.hfad.dig2.R;
import com.hfad.dig2.ui.gold6.Gold6ViewModel;


public class Gold6Fragment extends Fragment {

    private Gold6ViewModel gold6ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        gold6ViewModel =
                ViewModelProviders.of(this).get(Gold6ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gold6, container, false);
        final TextView textView = root.findViewById(R.id.text_gold6);
        gold6ViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}