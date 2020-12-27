package org.example.cv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ras extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    int imageIndex=0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ras);

        Intent receivedIntent = getIntent();

        Button menu02Button = (Button) findViewById(R.id.button5);
        menu02Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent resultIntent = new Intent();

                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });
        Toast toast = Toast.makeText(this, "라즈베리파이 설계도", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER|Gravity.BOTTOM,0,0);
        toast.show();

        imageView1 = findViewById(R.id.imageView5);
        imageView2 = findViewById(R.id.imageView6);
        imageView3 = findViewById(R.id.imageView7);
        imageView4 = findViewById(R.id.imageView8);

    }
    public void onButton1Clicked(View v)
    {
        changebeforeImage();
    }
    public void onButton2Clicked(View v)
    {
        changeafterImage();
    }
    private void changebeforeImage(){
        if(imageIndex==0){
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);

            imageIndex=3;
        }
        else if(imageIndex==1){
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);

            imageIndex=0;
        }
        else if(imageIndex==2){
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.VISIBLE);
            imageView4.setVisibility(View.INVISIBLE);

            imageIndex=1;
        }
        else if(imageIndex==3){
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.VISIBLE);

            imageIndex=2;
        }
    }
    private void changeafterImage(){
        if(imageIndex==0){
            imageView1.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);

            imageIndex=1;
        }
        else if(imageIndex==1){
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);

            imageIndex=2;
        }
        else if(imageIndex==2){
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.VISIBLE);
            imageView4.setVisibility(View.INVISIBLE);

            imageIndex=3;
        }
        else if(imageIndex==3){
            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.VISIBLE);

            imageIndex=0;
        }
    }
}
