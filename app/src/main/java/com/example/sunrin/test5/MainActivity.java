package com.example.sunrin.test5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputId, inputName, inputAddress;
    RadioGroup inputAge;
    CheckBox terms;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputId = findViewById(R.id.inputId);
        inputName = findViewById(R.id.inputName);
        inputAddress = findViewById(R.id.inputAddress);
        inputAge = findViewById(R.id.inputAge);
        terms = findViewById(R.id.terms);
        result = findViewById(R.id.result);
    }
    public void onSave(View v){
        if(!terms.isChecked()){
            Toast.makeText(getApplicationContext(), "약관에 동의하셔야 합니다.", Toast.LENGTH_SHORT).show();
        }
        else {
            RadioButton radioButton = findViewById(inputAge.getCheckedRadioButtonId());
            result.setText(inputId.getText().toString() + " / " + inputName.getText().toString() + " / " + inputAddress.getText().toString() + " / " + radioButton.getText().toString() + "로 저장되었습니다.");
            result.setVisibility(View.VISIBLE);
            Toast.makeText(getApplicationContext(), "저장되었습니다.", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClose(View v){
        finish();
    }
}
