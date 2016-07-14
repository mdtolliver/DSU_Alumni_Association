package com.example.dsuappacademy.dsualumniassociation;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void donateMoney(View view) {
        //intent to open internet browser
        Uri webPage = Uri.parse("https://gofundme.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, webPage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void contactUs(View view) {
        //Intent to open email & submit new member.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"mdtolliver.hotmail.com"} );
        intent.putExtra(Intent.EXTRA_SUBJECT, "New Alumni Chapter Member");

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}