package sg.edu.rp.c346.id19045083.demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        TextView tvAnswer = findViewById(R.id.textView);
//        tvAnswer.setText("In Second Activity");
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");


        if (questionsSelected.contentEquals("Q1")){
            tvAnswer.setText(String.format("%s answer is: Queue", questionsSelected));
        } else {
            tvAnswer.setText(String.format("%s answer is: Gone", questionsSelected));
        }


    }
}