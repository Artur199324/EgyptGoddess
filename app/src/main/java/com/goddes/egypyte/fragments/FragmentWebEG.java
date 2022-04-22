package com.goddes.egypyte.fragments;

import static com.goddes.egypyte.activity.EG.sada;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.goddes.egypyte.R;
import com.goddes.egypyte.activity.EG;

public class FragmentWebEG extends Fragment {
    public static WebView webViewFullAppEG;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_web_e_g, container, false);
        webViewFullAppEG = view.findViewById(R.id.webViewFullAppEG);
        EG.webSetEG.setWebEG(webViewFullAppEG);
        webViewFullAppEG.loadUrl(sada);
        return view;
    }
}