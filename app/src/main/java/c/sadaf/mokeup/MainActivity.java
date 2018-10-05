package c.sadaf.mokeup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void na(View view) {
        startActivity(new Intent(this, signinscreen.class));

//                .putExtra("name", etName.getText().toString())
//                .putExtra("score", score));
    }
}
