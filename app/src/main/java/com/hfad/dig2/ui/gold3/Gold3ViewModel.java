package com.hfad.dig2.ui.gold3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Gold3ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Gold3ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Kingdom Cards worth 3 gold are GREAT HALL, MASQUERDE, SHANTY TOWN, STEWARD, " +
                "SWINDLER, and WISHING WELL");
    }

    public LiveData<String> getText() {
        return mText;
    }
}