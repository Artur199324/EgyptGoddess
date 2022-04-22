package com.goddes.egypyte.viewmodelEG;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.goddes.egypyte.activity.EG;
import com.goddes.egypyte.modelEG.AppEG;
import com.goddes.egypyte.modelEG.ConnectionsEG;
import com.goddes.egypyte.modelEG.DeepEG;

public class VmEg extends AndroidViewModel {
    ConnectionsEG connectionsEG;
    DeepEG deepEG;
    AppEG appEG;

    public VmEg(@NonNull Application application) {
        super(application);
        appEG = new AppEG();
        connectionsEG = new ConnectionsEG();
        deepEG = new DeepEG();
    }

    public ConnectionsEG connectionsVM() {
        connectionsEG.connectionsEG();
        return connectionsEG;
    }

    public DeepEG deepEG(String fbEg, EG eg){
        deepEG.settingsDeepEG(fbEg,eg);
        deepEG.deepLinkEG(eg);
        return deepEG;
    }

    public void appEG(EG eg){
        appEG.appEG(eg);
    }
}
