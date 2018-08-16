package com.mars.aihuishou.flutter;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class EggActivity extends FlutterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GeneratedPluginRegistrant.registerWith(this);

    }
}
