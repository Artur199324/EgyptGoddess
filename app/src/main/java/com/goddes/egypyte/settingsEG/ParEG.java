package com.goddes.egypyte.settingsEG;

import static com.goddes.egypyte.modelEG.AppEG.czssx;
import static com.goddes.egypyte.modelEG.AppEG.bffx;
import static com.goddes.egypyte.modelEG.AppEG.vbdse;
import static com.goddes.egypyte.modelEG.AppEG.cxzcsa;
import static com.goddes.egypyte.modelEG.AppEG.bfdes;
import static com.goddes.egypyte.modelEG.AppEG.csaw;

import com.goddes.egypyte.activity.EG;

public class ParEG {
    public static EG eg;
    private static String fbToken;
    private static String fbId;

    public static String getFbToken() {
        return fbToken;
    }

    public static void setFbToken(String fbToken) {
        ParEG.fbToken = fbToken;
    }

    public static String getFbId() {
        return fbId;
    }

    public static void setFbId(String fbId) {
        ParEG.fbId = fbId;
    }

    public static String par(String czs) {
        String[] xzssa = czs.split("_");
        String czsa;
        String chstz;
        String bfdfd;
        String cdsd;
        String cds;
        String dcse;

        try {
            czsa = xzssa[0];
        } catch (Exception e) {

            czsa = "";
        }
        try {
            chstz = xzssa[1];
        } catch (Exception e) {

            chstz = "";
        }
        try {
            bfdfd = xzssa[2];
        } catch (Exception e) {
            bfdfd = "";

        }
        try {
            cdsd = xzssa[3];
        } catch (Exception e) {
            cdsd = "";

        }
        try {
            cds = xzssa[4];
        } catch (Exception e) {
            cds = "";
            ;
        }
        try {
            dcse = xzssa[5];
        } catch (Exception e) {
            dcse = "";

        }

        return DecodeEG.decodeEG("P21lZGlhX3NvdXJjZT0=") + vbdse +
                DecodeEG.decodeEG("JnN1YjE9") + czsa +
                DecodeEG.decodeEG("JnN1YjI9") + chstz +
                DecodeEG.decodeEG("JnN1YjM9") + bfdfd +
                DecodeEG.decodeEG("JnN1YjQ9") + cdsd +
                DecodeEG.decodeEG("JnN1YjU9") + cds +
                DecodeEG.decodeEG("JnN1YjY9") + dcse +
                DecodeEG.decodeEG("JmNhbXBhaWduPQ==") + bfdes +
                DecodeEG.decodeEG("Jmdvb2dsZV9hZGlkPQ==") + cxzcsa +
                DecodeEG.decodeEG("JmFmX3VzZXJpZD0=") + czssx +
                DecodeEG.decodeEG("JmFmX2NoYW5uZWw9") + csaw +
                DecodeEG.decodeEG("JmRldl9rZXk9") +   DecodeEG.decodeEG(bffx) +
                DecodeEG.decodeEG("JmJ1bmRsZT0=") + eg.getPackageName() +
                DecodeEG.decodeEG("JmZiX2FwcF9pZD0=") + fbId +
                DecodeEG.decodeEG("JmZiX2F0PQ==") + fbToken;


    }
}
