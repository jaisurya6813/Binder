package com.example.binder;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import androidx.annotation.Nullable;

public class service extends Service {

    // declaring object of MediaPlayer
    private MediaPlayer player;

    @Override


    public int onStartCommand(Intent intent, int flags, int startId) {

        player = MediaPlayer.create( this, Settings.System.DEFAULT_RINGTONE_URI );

        player.setLooping( true );

        player.start();

        return START_STICKY;
    }

    @Override

    public void onDestroy() {
        super.onDestroy();

        player.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}