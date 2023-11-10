package com.krishsatasiya.Offical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class developer extends AppCompatActivity {

    ImageView face;
    ImageView twite;
    ImageView instagram;
    ImageView youtube;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        getWindow().setStatusBarColor(ContextCompat.getColor(developer.this, R.color.profile));




        face = findViewById(R.id.face);
        twite = findViewById(R.id.twite);
        youtube = findViewById(R.id.youtube);
        instagram = findViewById(R.id.instagram);

        face.setOnClickListener(view -> gotoUrl("https://www.facebook.com/krish.satasiya.5811"));
        instagram.setOnClickListener(view -> gotoUrl("https://www.instagram.com/satasoya.krish"));
        twite.setOnClickListener(view -> gotoUrl("https://twitter.com/Krish_Satasiya"));
        youtube.setOnClickListener(view -> gotoUrl("https://www.youtube.com/@krishsatasiya"));

    }

    public void onBackPressed() {
        Intent intent=new Intent(developer.this, welcome.class);
        startActivity(intent);
        finish();
    }

    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
