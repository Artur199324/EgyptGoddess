package com.goddes.egypyte.fragments;

import static com.goddes.egypyte.activity.EG.navControllerEG;
import static com.goddes.egypyte.activity.EG.casw;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.basel.DualButton.DualButton;
import com.goddes.egypyte.R;
import com.goddes.egypyte.activity.EG;


public class FragmentButtEG extends Fragment {

    DualButton startBtn,closeBtn;
    public static EG eg;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_butt_e_g, container, false);
        startBtn = view.findViewById(R.id.startBtn);
        closeBtn = view.findViewById(R.id.closeBtn);


        startBtn.setDualClickListener(new DualButton.OnDualClickListener() {
            public void onClickFirst(Button btn) {
                casw.vibrate(200);
            }
            public void onClickSecond(Button btn) {
                navControllerEG.navigate(R.id.mainActivity);
            }
        });

        closeBtn.setDualClickListener(new DualButton.OnDualClickListener() {
            public void onClickFirst(Button btn) {
                casw.vibrate(200);
            }
            public void onClickSecond(Button btn) {
                eg.finishAffinity();
            }
        });
        return view;
    }
}