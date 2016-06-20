package com.jackrocks.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewActivity extends AppCompatActivity {
    private Intent mNewActivitySubmission;
    private EditText mActivityDesc;
    private EditText mActiName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

         mActiName = (EditText) findViewById(R.id.txt_activity_name);
        mActivityDesc = (EditText) findViewById(R.id.txt_activity_description);

        Button btn_new_act_sub = (Button) findViewById(R.id.btn_new_act_sub);
        mNewActivitySubmission = new Intent(NewActivity.this, MainActivity.class);
        View.OnClickListener mNewActivitySubView = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String information = mActiName.getText().toString();
                mNewActivitySubmission.putExtra("name", information);
                String data = mActivityDesc.getText().toString();
                mNewActivitySubmission.putExtra("description", data); // Intent = getIntent()  ...   .getExtra("description")
                startActivity(mNewActivitySubmission);
            }
        };
        btn_new_act_sub.setOnClickListener(mNewActivitySubView);



    }
}
