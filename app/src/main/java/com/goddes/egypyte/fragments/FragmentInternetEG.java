package com.goddes.egypyte.fragments;

import static com.goddes.egypyte.activity.EG.casw;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.basel.DualButton.DualButton;
import com.goddes.egypyte.R;
import com.goddes.egypyte.activity.EG;


public class FragmentInternetEG extends Fragment {

    public static EG eg;
    DualButton cscz;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_internet_e_g, container, false);

        cscz = view.findViewById(R.id.interBtn);
        cscz.setDualClickListener(new DualButton.OnDualClickListener() {
            public void onClickFirst(Button btn) {
                casw.vibrate(200);
            }
            public void onClickSecond(Button btn) {
                eg.startActivity(new Intent(eg.getApplicationContext(),EG.class));
                eg.finishAffinity();
            }
        });

        return view;
    }
}