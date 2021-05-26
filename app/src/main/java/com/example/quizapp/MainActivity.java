package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"Java is a person?",
            "Was Java instroduced in 1233?", "Java was created using Python?",
            "Java has abstract classes?", "Java supports Interface?"};
    private boolean[] answers = {false, false, false, true, true};
    private int score = 0;
    Button yes;
    Button no;
    TextView textView2;

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        textView2 = findViewById(R.id.textView2);
        textView2.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if the array is not going out of bounds
            if(index <= questions.length-1){
                //if you have given correct answer
                if (answers[index] == true) {
                    score++;
                }
                //Go to the next question
                index++;
                if(index <= questions.length-1) {
                    textView2.setText(questions[index]);
                }
                else{
                    Toast.makeText(MainActivity.this, "Your Score is " + score + "/" +questions.length, Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
            }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if the array is not going out of bounds
                if(index <= questions.length-1){
                    //if you have given correct answer
                    if (answers[index] == false) {
                        score++;
                    }
                    //Go to the next question
                    index++;
                    if(index <= questions.length-1) {
                        textView2.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is " + score + "/" +questions.length, Toast.LENGTH_SHORT).show();
                }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}