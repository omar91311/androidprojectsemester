package c.sadaf.mokeup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

public class user   extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
    }
    public void f1(View V){
        startActivity(new Intent(this, fpoint.class));
    }
    public void f2(View V){
        startActivity(new Intent(this, fpoint.class));
    }
    public void or(View V){
        startActivity(new Intent(this, orders.class));
    }
}