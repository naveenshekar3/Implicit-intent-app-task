package com.example.root.implicitintentapptask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText name1_etv;
    private EditText phone1_etv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name1_etv=(EditText)findViewById(R.id.name1_etv);
        phone1_etv=(EditText)findViewById(R.id.phone1_etv);

        Intent intent=getIntent();
        String nam=intent.getStringExtra("name2");
        String phn=intent.getStringExtra("phone2");

        name1_etv.setText(nam);
        phone1_etv.setText(phn);

    }

    public void share1(View view)
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT,name1_etv.getText().toString());
        intent.putExtra("phone",phone1_etv.getText().toString());
        intent.setType("text/plain");
        startActivity(intent);
    }


}
