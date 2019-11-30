package com.hfad.dig2.ui.gold3;

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

import com.hfad.dig2.ui.gold3.Gold3ViewModel;


public class Gold3Fragment extends Fragment {

    private Gold3ViewModel gold3ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        gold3ViewModel =
                ViewModelProviders.of(this).get(Gold3ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gold3, container, false);
        final TextView textView = root.findViewById(R.id.text_gold3);
        gold3ViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}