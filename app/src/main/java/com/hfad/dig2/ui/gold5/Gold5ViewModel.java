package com.hfad.dig2.ui.gold5;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Gold5ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Gold5ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Kingdom Cards worth 5 gold are DUKE, MINION, SABOTEUR, " +
                "TRADING POST, TRIBUTE, TORTURER, and UPGRADE.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}