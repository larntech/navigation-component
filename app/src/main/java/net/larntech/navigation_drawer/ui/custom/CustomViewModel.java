package net.larntech.navigation_drawer.ui.custom;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CustomViewModel extends ViewModel {


    MutableLiveData<String> mText;
    public CustomViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is a custom fragment");

    }


    public LiveData<String> getText(){
        return mText;
    }
}
