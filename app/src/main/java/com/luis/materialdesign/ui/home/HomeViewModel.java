package com.luis.materialdesign.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    private final MutableLiveData<Boolean> isLight;

    public HomeViewModel() {
        isLight = new MutableLiveData<>();
        isLight.setValue(true);
    }

    public void setIsLight(boolean value) {
        isLight.setValue(value);
    }

    public LiveData<Boolean> isLight() {
        return isLight;
    }

}