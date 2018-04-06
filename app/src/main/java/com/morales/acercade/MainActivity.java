package com.morales.acercade;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button share;
    String ACTION_SENDTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        share = (Button)findViewById(R.id.boton_share);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, ((TextView)findViewById(R.id.cajita1)).getText().toString());
                sendIntent.putExtra(Intent.EXTRA_TEXT, ((TextView)findViewById(R.id.cajita2)).getText().toString());
                sendIntent.putExtra(Intent.EXTRA_TEXT, ((TextView)findViewById(R.id.cajita3)).getText().toString());
                sendIntent.putExtra(Intent.EXTRA_TEXT, ((TextView)findViewById(R.id.cajita4)).getText().toString());
                sendIntent.putExtra(Intent.EXTRA_TEXT, ((TextView)findViewById(R.id.cajita5)).getText().toString());
                sendIntent.putExtra(Intent.EXTRA_TEXT, ((TextView)findViewById(R.id.cajita6)).getText().toString());
                sendIntent.setType("text/*");
                startActivity(sendIntent);


                if(sendIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(sendIntent);
                }
            }
        });
    }
}
