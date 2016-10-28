package de.hda.examples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button resetButton;
    private Button customButton;
    private ImageButton imageButton;
    private Button flatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        resetButton  = (Button)      findViewById(R.id.resetButton);
        imageButton  = (ImageButton) findViewById(R.id.imageButton);
        flatButton   = (Button)      findViewById(R.id.flatButton);
        customButton = (Button)      findViewById(R.id.coloredButton);

        resetButton.setOnClickListener(this);
        customButton.setOnClickListener(this);
        imageButton.setOnClickListener(this);
        flatButton.setOnClickListener(this);

        findViewById(R.id.imageViewWrapper).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Klick", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.resetButton:
                // Alle Buttons wieder aktivieren
                customButton.setEnabled(true);
                imageButton.setEnabled(true);
                flatButton.setEnabled(true);
                break;
            default:
                // Den Button, der geklickt wurde, deaktivieren
                v.setEnabled(false);
        }
    }

}
