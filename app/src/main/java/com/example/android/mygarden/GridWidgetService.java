package com.example.android.mygarden;

import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViewsService;

/**
 * Created by Steven on 22/04/2018.
 */

public class GridWidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        Log.d("GridWidgetService", "Inside widget service");
        return new GridRemoteViewsFactory(this.getApplicationContext());
    }
}
