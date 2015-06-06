package cc.thingslab.scorecounter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int scoreA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeToTeamA(View view) {
        scoreA += 3;
        displayScoreA(scoreA);
    }

    public void addTwoToTeamA(View view) {
        scoreA += 2;
        displayScoreA(scoreA);
    }

    public void addOneToTeamA(View view) {
        scoreA += 1;
        displayScoreA(scoreA);
    }

    private void displayScoreA(int score) {
        TextView scoreTeamA = (TextView) findViewById(R.id.team_a_score);
        scoreTeamA.setText(String.valueOf(score));
    }

}
