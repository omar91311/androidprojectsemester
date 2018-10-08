package c.sadaf.mokeup;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

public class testing  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize the AdMob app
        MobileAds.initialize(this, getString(R.string.admob_app_id));
    }
}