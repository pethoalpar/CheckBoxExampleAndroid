package com.pethoalpar.checkboxexampleandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox1;
    private CheckBox checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox) this.findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) this.findViewById(R.id.checkBox2);

        checkBox1.setChecked(true);
        checkBox2.setChecked(false);

        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBox2.setChecked(isChecked);
                checkBox2.setEnabled(isChecked);
                Toast.makeText(getBaseContext(),"Checked:"+checkBox1.isChecked(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
