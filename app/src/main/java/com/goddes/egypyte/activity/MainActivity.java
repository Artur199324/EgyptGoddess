package com.goddes.egypyte.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.goddes.egypyte.R;
import com.goddes.egypyte.viewmodelEG.ViewModelEG;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout csas;
    private Display sasxz;
    private ImageView saca, vds;
    private ImageView vxza;
    private int vbsqz;
    private int bfdwq;
    private ViewModelEG vdseq;
    private Handler csfew;
    private int s = 0;
    private int sdw;
    private int aa = 0;
    private ArrayList<ImageView> cawq;
    private TextView sacaw;
    private int s1;
    private int s2;
    private final int cacegfd = 1;
    private Vibrator caw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);
        sasxz = getWindowManager().getDefaultDisplay();
        csas = findViewById(R.id.constrainLay);
        sacaw = findViewById(R.id.textView);
        caw = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vbsqz = sasxz.getWidth();
        bfdwq = sasxz.getHeight();
        csfew = new Handler();
        vdseq =new ViewModelProvider
                .AndroidViewModelFactory(getApplication())
                .create(ViewModelEG.class);
        sdw = vbsqz /4;
        cawq = new ArrayList<>();
        s1 = getSharedPreferences(getPackageName(), MODE_PRIVATE).getInt("s1",20);
        s2 = getSharedPreferences(getPackageName(), MODE_PRIVATE).getInt("s2",10);
        vdseq.speedGame(s1, s2);
        vds = findViewById(R.id.imageViewSpeed);
        vds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(cacegfd);
            }
        });

        csfew.post(new Runnable() {
            @Override
            public void run() {
                saca = new ImageView(MainActivity.this);
                ConstraintLayout.LayoutParams constrainGLay = new ConstraintLayout.LayoutParams(sdw, sdw);
                saca.setLayoutParams(constrainGLay);
                csas.addView(saca,constrainGLay);
                vdseq.imageTop(saca, vbsqz, bfdwq);
                if (s !=0){
                    csfew.postDelayed(this::run,50);
                }
            }
        });

        csfew.post(new Runnable() {
            @Override
            public void run() {
                vdseq.imageMoveTom(saca);
                csfew.postDelayed(this::run,100);
            }
        });

        csfew.post(new Runnable() {
            @Override
            public void run() {
                vxza = new ImageView(MainActivity.this);
                ConstraintLayout.LayoutParams constrainGGLay = new ConstraintLayout.LayoutParams(sdw, sdw);
                vxza.setLayoutParams(constrainGGLay);
                csas.addView(vxza,constrainGGLay);
                vdseq.imageFalling(saca, vxza);
                cawq.add(vxza);
                csfew.postDelayed(this::run,1000);
            }
        });

        csfew.post(new Runnable() {
            @Override
            public void run() {
                vdseq.imageMovFalling(cawq);
                csfew.postDelayed(this::run,100);
            }
        });

        csfew.post(new Runnable() {
            @Override
            public void run() {
              for (int i = 0; i< cawq.size(); i++){
                  ImageView imageView = cawq.get(i);
                  int finalI = i;
                  imageView.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View view) {
                          caw.vibrate(200);
                          csas.removeView(imageView);
                          cawq.remove(finalI);
                          aa++;
                          sacaw.setText(aa+"");
                      }
                  });

                  if (imageView.getY() > bfdwq -(bfdwq /3)){
                      aa--;
                      sacaw.setText(aa+"");
                      if (cawq.size()>2)
                      csas.removeView(imageView);
                      cawq.remove(finalI);
                  }
              }
                csfew.postDelayed(this::run,100);
            }
        });
    }

    protected Dialog onCreateDialog(int id) {

        if (id == cacegfd) {
            String scs = "Easily";
            String scwgr = "Medium";
            String vsdw = "Heavy";
            String[] vsehjn = {scs, scwgr, vsdw};
            AlertDialog.Builder bvds = new AlertDialog.Builder(this);
            bvds.setTitle("Speed");

            int item = 0;
            switch (s1) {
                case 20:
                    item = 0;
                    break;
                case 40:
                    item = 1;
                    break;
                case 60:
                    item = 2;
                    break;
            }

            bvds.setSingleChoiceItems(vsehjn, item,
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog,
                                            int item) {
                            switch (item) {
                                case 0:
                                    s1 = 20;
                                    s2 = 10;
                                    break;
                                case 1:
                                    s1 = 40;
                                    s2 = 20;
                                    break;
                                case 2:
                                    s1 = 60;
                                    s2 = 30;
                                    break;
                            }
                        }
                    });
            bvds.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("s1",s1).apply();
                    getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putInt("s2",s2).apply();
                    vdseq.speedGame(s1, s2);

                }
            });
            bvds.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {

                }
            });

            return bvds.create();
        }
        return super.onCreateDialog(id);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplication(),EG.class));
        finishAffinity();
    }
}