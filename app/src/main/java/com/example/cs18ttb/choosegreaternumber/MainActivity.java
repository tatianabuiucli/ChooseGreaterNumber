package com.example.cs18ttb.choosegreaternumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    private int score = 0;

    private int gameOver = 6;





    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        randomNumbers();

    }





    public void randomNumbers() {

        Button leftButton = findViewById(R.id.left_button);

        Button rightButton = findViewById(R.id.right_button);



        if(gameOver==0){

            score = 0;

            gameOver = 6;

            Toast.makeText(this, "Game over, see result below", Toast.LENGTH_SHORT).show();

        }

        Random rand = new Random();

        int num1 = rand.nextInt(100);

        int num2 = rand.nextInt(100);

        leftButton.setText(Integer.toString(num1));

        rightButton.setText(Integer.toString(num2));

    }



    public void leftButtonClick(View view) {

        Button leftButton = findViewById(R.id.left_button);

        Button rightButton = findViewById(R.id.right_button);

        TextView points = findViewById(R.id.points);

        TextView lives = findViewById(R.id.lives);

        int leftNum = Integer.parseInt(leftButton.getText().toString());

        int rightNum = Integer.parseInt(rightButton.getText().toString());

        if (leftNum >= rightNum) {

            Toast.makeText(this, "Congratulations", Toast.LENGTH_SHORT).show();

            score++;

            points.setText("Points: " + Integer.toString(score));

            lives.setText("Lives: " + Integer.toString(gameOver));

        }

        else {

            Toast.makeText(this, "Go study numbers", Toast.LENGTH_SHORT).show();

            score--;

            gameOver--;

            lives.setText("Lives: " + Integer.toString(gameOver));

        }

        randomNumbers();

    }





    public void rightButtonClick(View view) {

        Button leftButton = findViewById(R.id.left_button);

        Button rightButton = findViewById(R.id.right_button);

        TextView points = findViewById(R.id.points);

        TextView lives = findViewById(R.id.lives);

        int leftNum = Integer.parseInt(leftButton.getText().toString());

        int rightNum = Integer.parseInt(rightButton.getText().toString());

        if (rightNum >= leftNum) {

            Toast.makeText(this, "Congratulations", Toast.LENGTH_SHORT).show();

            score++;

            points.setText("Points: " + Integer.toString(score));

            lives.setText("Lives: " + Integer.toString(gameOver));

        }

        else {

            Toast.makeText(this, "Go study numbers", Toast.LENGTH_SHORT).show();

            score--;

            gameOver--;

            lives.setText("Lives: " + Integer.toString(gameOver));

        }

        randomNumbers();





    }
}
