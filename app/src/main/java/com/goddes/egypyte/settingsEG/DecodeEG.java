package com.goddes.egypyte.settingsEG;

import android.util.Base64;

public class DecodeEG {

    public static String decodeEG(String usfs){
        byte[] nhysfa = android.util.Base64.decode(usfs, Base64.DEFAULT);
        return new String(nhysfa);
    }
}
