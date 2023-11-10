package com.krishsatasiya.Offical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class welcome extends AppCompatActivity {


    ImageView website;
    ImageView nexts;
    ImageView imageView3;
    ImageView photo;
    ImageView learn;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageview9;

    @SuppressLint({"MissingInflatedId", "SourceLockedOrientationActivity"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getWindow().setStatusBarColor(ContextCompat.getColor(welcome.this, R.color.colorAccent));

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        website = findViewById(R.id.website);
        imageView3 = findViewById(R.id.imageView3);
        photo = findViewById(R.id.photo);
        learn = findViewById(R.id.learn);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageview9 = findViewById(R.id.imageView9);

        nexts = findViewById(R.id.nexts);

        website.setOnClickListener(view -> gotoUrl("https://krishsatasiya.netlify.app"));

        imageView3.setOnClickListener(view -> gotoUrl("https://play.google.com/store/apps/dev?id=8452114975424851755&gl=US&pli=1"));

        photo.setOnClickListener(view -> gotoUrl("https://krishsatasiya.netlify.app/tools/photo%20editing%20web%20application/"));

        learn.setOnClickListener(view -> gotoUrl("https://krishsatasiya.netlify.app/tools/graph%20-%20book/"));

        imageView6.setOnClickListener(view -> gotoUrl("https://krishsatasiya.netlify.app/privacy-policy/privacy-policy.html"));

        imageView7.setOnClickListener(view -> gotoUrl("https://krishsatasiya.netlify.app/pricing/index-1"));

        imageView8.setOnClickListener(view -> gotoUrl("https://krishsatasiya.netlify.app/tools/white%20bord%20pro/"));

        imageview9.setOnClickListener(view -> gotoUrl("https://krishsatasiya.netlify.app/"));


        nexts.setOnClickListener(view -> {
            Intent intent=new Intent(welcome.this, developer.class);
            startActivity(intent);
        });

    }

    public void onBackPressed() {
       finish();
    }

    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}