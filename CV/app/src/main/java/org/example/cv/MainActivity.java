package org.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_MENU = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        email.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
        });

        EditText git = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        git.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/luck2901"));
                startActivity(intent);
            }
        });

        EditText tel = (EditText) findViewById(R.id.editTextPhone);
        tel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-2819-2901"));
                startActivity(intent);
            }
        });


        EditText edu = (EditText) findViewById(R.id.editTextTextPersonName4);
        edu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Education.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });

        EditText cer = (EditText) findViewById(R.id.editTextTextPersonName5);
        cer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Certification.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });
        TextView ras = (TextView) findViewById(R.id.textView39);
        ras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=9p6819d9-5g"));
                startActivity(intent);
            }
        });
        ImageView ras2 = (ImageView) findViewById(R.id.imageView2);
        ras2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ras.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });
    }
}