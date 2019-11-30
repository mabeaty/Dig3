package com.hfad.dig2.ui.gold6;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Gold6ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Gold6ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Kingdom Cards worth 6 gold are HAREM, and NOBLES.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}