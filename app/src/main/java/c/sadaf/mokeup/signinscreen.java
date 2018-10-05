package c.sadaf.mokeup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

public class signinscreen extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signinscreen);
    }

    public void na1(View viwe) {
        startActivity(new Intent(this, user.class));
    }

    public void na2(View viwe) {
        startActivity(new Intent(this, signup.class));
    }

    public void so(View vwe) {
        startActivity(new Intent(this, owner.class));
    }
}