package com.example.haha;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Explosion {
    Bitmap explosion[]= new Bitmap[4];
    int explosionFrame = 0;
    int explosionX,explosionY;
    public Explosion(Context context){
        explosion[0]= BitmapFactory.decodeResource(context.getResources(),R.drawable.ex);
        explosion[1]= BitmapFactory.decodeResource(context.getResources(),R.drawable.ex1);
        explosion[1]= BitmapFactory.decodeResource(context.getResources(),R.drawable.ex1);
        explosion[0]= BitmapFactory.decodeResource(context.getResources(),R.drawable.ex);
    }
    public Bitmap getExplosion(int explosionFrame ){
        return explosion[explosionFrame];
    }



}
