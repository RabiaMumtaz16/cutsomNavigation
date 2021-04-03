package com.example.alphabetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
        MediaPlayer alpha_A,alpha_B,alpha_C,alpha_D,alpha_E,alpha_F,alpha_G,alpha_H;
        MediaPlayer alpha_I,alpha_J,alpha_K,alpha_L,alpha_M,alpha_N,alpha_O,alpha_P;
        MediaPlayer alpha_Q,alpha_R,alpha_S,alpha_T,alpha_U,alpha_V,alpha_W,alpha_X;
        MediaPlayer alpha_Y,alpha_Z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alpha_A = MediaPlayer.create(MainActivity.this,R.raw.a);
        alpha_B = MediaPlayer.create(MainActivity.this,R.raw.b);
        alpha_C = MediaPlayer.create(MainActivity.this,R.raw.c);
        alpha_D = MediaPlayer.create(MainActivity.this,R.raw.d);
        alpha_E = MediaPlayer.create(MainActivity.this,R.raw.e);
        alpha_F = MediaPlayer.create(MainActivity.this,R.raw.f);
        alpha_G = MediaPlayer.create(MainActivity.this,R.raw.g);
        alpha_H = MediaPlayer.create(MainActivity.this,R.raw.h);
        alpha_I = MediaPlayer.create(MainActivity.this,R.raw.i);
        alpha_J = MediaPlayer.create(MainActivity.this,R.raw.j);
        alpha_K = MediaPlayer.create(MainActivity.this,R.raw.k);
        alpha_L = MediaPlayer.create(MainActivity.this,R.raw.l);
        alpha_M = MediaPlayer.create(MainActivity.this,R.raw.m);
        alpha_N = MediaPlayer.create(MainActivity.this,R.raw.n);
        alpha_O = MediaPlayer.create(MainActivity.this,R.raw.o);
        alpha_P = MediaPlayer.create(MainActivity.this,R.raw.p);
        alpha_Q = MediaPlayer.create(MainActivity.this,R.raw.q);
        alpha_R = MediaPlayer.create(MainActivity.this,R.raw.r);
        alpha_S = MediaPlayer.create(MainActivity.this,R.raw.s);
        alpha_T = MediaPlayer.create(MainActivity.this,R.raw.t);
        alpha_U = MediaPlayer.create(MainActivity.this,R.raw.u);
        alpha_V = MediaPlayer.create(MainActivity.this,R.raw.v);
        alpha_W = MediaPlayer.create(MainActivity.this,R.raw.w);
        alpha_X = MediaPlayer.create(MainActivity.this,R.raw.x);
        alpha_Y = MediaPlayer.create(MainActivity.this,R.raw.y);
        alpha_Z = MediaPlayer.create(MainActivity.this,R.raw.z);


    }

    public void PlayA(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        alpha_A.start();
    }

    public void PlayB(View view) {
        Intent intent = new Intent(this, MainActivityC.class);
        startActivity(intent);
        alpha_B.start();
    }

    public void PlayC(View view) {
        Intent intent = new Intent(this, MainActivityCC.class);
        startActivity(intent);
        alpha_C.start();
    }
    public void PlayD(View view) {
        Intent intent = new Intent(this, MainActivityD.class);
        startActivity(intent);
        alpha_D.start();
    }
    public void PlayE(View view) {
        Intent intent = new Intent(this, MainActivityE.class);
        startActivity(intent);
        alpha_E.start();
    }
    public void PlayF(View view) {
        Intent intent = new Intent(this, MainActivityF.class);
        startActivity(intent);
        alpha_F.start();
    }
    public void PlayG(View view) {
        Intent intent = new Intent(this, MainActivityG.class);
        startActivity(intent);
        alpha_G.start();
    }
    public void PlayH(View view) {
        Intent intent = new Intent(this, MainActivityH.class);
        startActivity(intent);
        alpha_H.start();
    }
    public void PlayI(View view) {
        Intent intent = new Intent(this, MainActivityI.class);
        startActivity(intent);
        alpha_I.start();
    }
    public void PlayJ(View view) {
        Intent intent = new Intent(this, MainActivityJ.class);
        startActivity(intent);
        alpha_J.start();
    }
    public void PlayK(View view) {
        Intent intent = new Intent(this, MainActivityK.class);
        startActivity(intent);
        alpha_K.start();
    }
    public void PlayL(View view) {
        Intent intent = new Intent(this, MainActivityL.class);
        startActivity(intent);
        alpha_L.start();
    }
    public void PlayM(View view) {
        Intent intent = new Intent(this, MainActivityM.class);
        startActivity(intent);
        alpha_M.start();
    }

    public void PlayN(View view) {
        Intent intent = new Intent(this, MainActivityN.class);
        startActivity(intent);
        alpha_N.start();
    }
    public void PlayO(View view) {
        Intent intent = new Intent(this, MainActivityO.class);
        startActivity(intent);
        alpha_O.start();
    }
    public void PlayP(View view) {
        Intent intent = new Intent(this, MainActivityP.class);
        startActivity(intent);
        alpha_P.start();
    }
    public void PlayQ(View view) {
        Intent intent = new Intent(this, MainActivityQ.class);
        startActivity(intent);
        alpha_Q.start();
    }
    public void PlayR(View view) {
        Intent intent = new Intent(this, MainActivityR.class);
        startActivity(intent);
        alpha_R.start();
    }
    public void PlayS(View view) {
        Intent intent = new Intent(this, MainActivityS.class);
        startActivity(intent);
        alpha_S.start();
    }
    public void PlayT(View view) {
        Intent intent = new Intent(this, MainActivityT.class);
        startActivity(intent);
        alpha_T.start();
    }
    public void PlayU(View view) {
        Intent intent = new Intent(this, MainActivityU.class);
        startActivity(intent);
        alpha_U.start();
    }
    public void PlayV(View view) {
        Intent intent = new Intent(this, MainActivityV.class);
        startActivity(intent);
        alpha_V.start();
    }
    public void PlayW(View view) {
        Intent intent = new Intent(this, MainActivityW.class);
        startActivity(intent);
        alpha_W.start();
    }
    public void PlayX(View view) {
        Intent intent = new Intent(this, MainActivityX.class);
        startActivity(intent);
        alpha_X.start();
    }
    public void PlayY(View view) {
        Intent intent = new Intent(this, MainActivityY.class);
        startActivity(intent);
        alpha_Y.start();
    }
    public void PlayZ(View view) {
        Intent intent = new Intent(this, MainActivityZ.class);
        startActivity(intent);
        alpha_Z.start();
    }
}