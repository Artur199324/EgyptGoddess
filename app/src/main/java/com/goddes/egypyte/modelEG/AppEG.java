package com.goddes.egypyte.modelEG;

import android.util.Log;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.goddes.egypyte.activity.EG;
import com.goddes.egypyte.settingsEG.DecodeEG;
import com.goddes.egypyte.settingsEG.ParEG;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

import java.util.Map;

public class AppEG {

    public static String czssx;
    public static String vszcs = "-";
    public static String cxzcsa;
    public static String vzsa;
    public static String bffx = "UWJSVG5nYTlVY3JSVnB6ODRURWtlZQ==";
    public static String bfdes;
    public static String vbdse;
    public static String csaw;

    public void appEG(EG eg) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    cxzcsa = AdvertisingIdClient.getAdvertisingIdInfo(eg.getApplicationContext()).getId();
                    Log.d("weq",cxzcsa);
                } catch (Exception e) {
                }
            }
        }).start();

        czssx = AppsFlyerLib.getInstance().getAppsFlyerUID(eg.getApplicationContext());
        Log.d("weq", czssx);
        AppsFlyerLib.getInstance().init(DecodeEG.decodeEG(bffx), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                vszcs = map.get(DecodeEG.decodeEG("YWZfc3RhdHVz")).toString();
                Log.d("weq", vszcs);
                if (vszcs.equals(DecodeEG.decodeEG("Tm9uLW9yZ2FuaWM="))){

                    try {
                        bfdes = map.get(DecodeEG.decodeEG("Y2FtcGFpZ24=")).toString();
                    }catch (Exception e){

                    }

                    try {

                        vbdse = map.get(DecodeEG.decodeEG("bWVkaWFfc291cmNl")).toString();
                    }catch (Exception e){

                    }

                    try {

                        csaw = map.get(DecodeEG.decodeEG("YWZfY2hhbm5lbA==")).toString();
                    }catch (Exception e){

                    }



                    vzsa = ParEG.par(bfdes);
                }
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        }, eg.getApplicationContext());
        AppsFlyerLib.getInstance().start(eg.getApplicationContext());

    }


}
