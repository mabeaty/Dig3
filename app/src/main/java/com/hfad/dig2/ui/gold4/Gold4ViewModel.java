package com.hfad.dig2.ui.gold4;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Gold4ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public Gold4ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Kingdom Cards worth 4 gold are IRONWORKS, BARON, CONSPIRATOR, SCOUT, " +
                "MINING VILLAGE, BRIDGE, and COPPERSMITH.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}