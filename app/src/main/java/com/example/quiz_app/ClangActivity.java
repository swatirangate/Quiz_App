package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClangActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text_question,total_question;
    Button btn_choose1,btn_choose2,btn_choose3,btn_choose4,btn_next;
    int score=0;
    int totalQuestion = CQuestionAnswers.question.length;
    int currentQuestionIndex =0;
    String selectedAnswer ="";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clang);
        text_question = findViewById(R.id.text_question);
        btn_choose1 = findViewById(R.id.btn_choose1);
        btn_choose2 = findViewById(R.id.btn_choose2);
        btn_choose3 = findViewById(R.id.btn_choose3);
        btn_choose4 = findViewById(R.id.btn_choose4);
        total_question = findViewById(R.id.total_question);
        btn_next = findViewById(R.id.btn_next);


        findViewById(R.id.image_back).setOnClickListener(
                a -> finish()
        );
        btn_choose1.setOnClickListener(this);
        btn_choose2.setOnClickListener(this);
        btn_choose3.setOnClickListener(this);
        btn_choose4.setOnClickListener(this);
        btn_next.setOnClickListener(this);


        loadNewQuestion();
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view) {
        btn_choose1.setBackgroundColor(android.R.color.white);
        btn_choose2.setBackgroundColor(android.R.color.white);
        btn_choose3.setBackgroundColor(android.R.color.white);
        btn_choose4.setBackgroundColor(android.R.color.white);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.btn_next){

            if(selectedAnswer.equals(CQuestionAnswers.correctAnswer[currentQuestionIndex])){
                score++;
            }

            currentQuestionIndex++;
            loadNewQuestion();

        }else{
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(android.R.color.holo_blue_bright);
        }
    }

    @SuppressLint("SetTextI18n")
    void loadNewQuestion() {

        if (currentQuestionIndex == totalQuestion) {
            finishQuiz();
            return;
        }
        total_question.setText((currentQuestionIndex + 1)+ "/" + totalQuestion);
        text_question.setText(CQuestionAnswers.question[currentQuestionIndex]);
        btn_choose1.setText(CQuestionAnswers.choices[currentQuestionIndex][0]);
        btn_choose2.setText(CQuestionAnswers.choices[currentQuestionIndex][1]);
        btn_choose3.setText(CQuestionAnswers.choices[currentQuestionIndex][2]);
        btn_choose4.setText(CQuestionAnswers.choices[currentQuestionIndex][3]);



    }

    void finishQuiz(){
        String passStatus;
        if(score > totalQuestion*0.60){
            passStatus = "Passed";
        }else{
            passStatus = "Failed";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+ score+" out of "+ totalQuestion)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();
    }

    void restartQuiz(){
        score = 0;
        currentQuestionIndex =0;
        loadNewQuestion();
    }
}