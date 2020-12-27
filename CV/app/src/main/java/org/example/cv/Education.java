package org.example.cv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Education extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edu);

        Intent receivedIntent = getIntent();

        Button menu01Button = (Button) findViewById(R.id.button2);
        menu01Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent resultIntent = new Intent();

                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });
        Toast toast = Toast.makeText(this, "한상현님의 학력사항입니다.", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
        toast.show();
    }
}
