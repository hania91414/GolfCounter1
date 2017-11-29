package com.example.hanna.golfcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

        if (savedInstanceState != null) {
        // Restore value of members from saved state
            scoreTeamA = savedInstanceState.getInt("scoreTeamA");
            scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        } else {
            scoreTeamA = 0;
            scoreTeamB = 0;
        }

    }

    public void addThreeToTeamA(View view) {
        scoreTeamA = scoreTeamA +3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoToTeamA(View view) {
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneToTeamA(View view) {
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    public void subsOneTeamA(View view) {
        scoreTeamA = scoreTeamA -1;
        displayForTeamA(scoreTeamA);
    }

    public void subsTwoTeamA(View view) {
        scoreTeamA = scoreTeamA -2;
        displayForTeamA(scoreTeamA);
    }

    public void subsThreeTeamA(View view) {
        scoreTeamA = scoreTeamA -3;
        displayForTeamA(scoreTeamA);
    }


    public void addThreeToTeamB(View view) {
        scoreTeamB = scoreTeamB +3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoToTeamB(View view) {
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneToTeamB(View view) {
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }



    public void subsOneTeamB(View view) {
        scoreTeamB = scoreTeamB -1;
        displayForTeamB(scoreTeamB);
    }

    public void subsTwoTeamB(View view) {
        scoreTeamB = scoreTeamB -2;
        displayForTeamB(scoreTeamB);
    }

    public void subsThreeTeamB(View view) {
        scoreTeamB = scoreTeamB -3;
        displayForTeamB(scoreTeamB);
    }


    public void reset(View view) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);


    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeamA",scoreTeamA);
        outState.putInt("scoreTeamB",scoreTeamB);
    }

    @Override
    protected void onRestoreInstanceState (Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA=savedInstanceState.getInt("scoreTeamA");
        scoreTeamB=savedInstanceState.getInt("scoreTeamB");
    }

}
