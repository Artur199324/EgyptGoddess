package com.goddes.egypyte.modelEG;

import androidx.annotation.Nullable;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.goddes.egypyte.activity.EG;
import com.goddes.egypyte.settingsEG.ParEG;

public class DeepEG {

    private   String deepEG = null;
    private   String strDeepLinkEG = "-";

    public DeepEG() {
    }

    public String getDeepEG() {
        return deepEG;
    }

    public void setDeepEG(String deepEG) {
        this.deepEG = deepEG;
    }

    public String getStrDeepLinkEG() {
        return strDeepLinkEG;
    }

    public void setStrDeepLinkEG(String strDeepLinkEG) {
        this.strDeepLinkEG = strDeepLinkEG;
    }

   public void settingsDeepEG(String fbEg,EG eg){
       FacebookSdk.setApplicationId(fbEg);
       FacebookSdk.setAdvertiserIDCollectionEnabled(true);
       FacebookSdk.sdkInitialize(eg.getApplicationContext());
       FacebookSdk.fullyInitialize();
       FacebookSdk.setAutoInitEnabled(true);
       FacebookSdk.setAutoLogAppEventsEnabled(true);
   }

    public void deepLinkEG(EG eg){

        AppEventsLogger.activateApp(eg.getApplication());
        AppLinkData.fetchDeferredAppLinkData(eg.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {

                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(eg);

                }
                if (appLinkData != null) {

                    String[] as = appLinkData.getTargetUri().toString().split("://");
                    setDeepEG(as[1]);
                    setStrDeepLinkEG( ParEG.par(getDeepEG()));

                } else {

                }
            }
        });
    }
}
