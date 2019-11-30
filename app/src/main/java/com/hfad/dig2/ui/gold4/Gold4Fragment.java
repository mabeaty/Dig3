package com.hfad.dig2.ui.gold4;

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



public class Gold4Fragment extends Fragment {

    private Gold4ViewModel gold4ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        gold4ViewModel =
                ViewModelProviders.of(this).get(Gold4ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gold4, container, false);
        final TextView textView = root.findViewById(R.id.text_gold4);
        gold4ViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}