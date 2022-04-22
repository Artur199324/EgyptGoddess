package com.goddes.egypyte.viewmodelEG;

import android.app.Application;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.goddes.egypyte.modelEG.Game;

import java.util.ArrayList;

public class ViewModelEG extends AndroidViewModel {
    private Game game;
    public ViewModelEG(@NonNull Application application) {
        super(application);
        game = new Game();
    }

    public void imageTop(ImageView imageView,int width,int height){
        game.setCscz(imageView);
        game.setCssc(width);
        game.setCscxz(height);
        game.imageStart();
    }
    public void imageMoveTom(ImageView imageView){
        game.imageMove(imageView);
    }

    public void imageFalling(ImageView imageView, ImageView imageView1){
        game.setZcsa(imageView1);
        game.imageFallingStart(imageView);
    }

    public void imageMovFalling(ArrayList<ImageView> arrayList){
        game.imageFallingMove(arrayList);
    }

    public void speedGame(int a , int b){
        game.setsI(a);
        game.setsI2(b);
    }

}
