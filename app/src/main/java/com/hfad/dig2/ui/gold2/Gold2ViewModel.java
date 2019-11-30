package com.hfad.dig2.ui.gold2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Gold2ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Gold2ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Kingdom Cards worth 2 gold are COURTYARD, PAWN, and SECRET CHAMBER.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}