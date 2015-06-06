package cc.thingslab.scorecounter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeToTeamA(View view) {
        scoreA += 3;
        updateScoreA();
    }

    public void addTwoToTeamA(View view) {
        scoreA += 2;
        updateScoreA();
    }

    public void addOneToTeamA(View view) {
        scoreA += 1;
        updateScoreA();
    }

    private void updateScoreA() {
        TextView scoreTeamA = (TextView) findViewById(R.id.team_a_score);
        scoreTeamA.setText(String.valueOf(scoreA));
    }

    public void addThreeToTeamB(View view) {
        scoreB += 3;
        updateScoreB();
    }

    public void addTwoToTeamB(View view) {
        scoreB += 2;
        updateScoreB();
    }

    public void addOneToTeamB(View view) {
        scoreB += 1;
        updateScoreB();
    }

    private void updateScoreB() {
        TextView scoreTeamB = (TextView) findViewById(R.id.team_b_score);
        scoreTeamB.setText(String.valueOf(scoreB));
    }

    public void resetScore(View view) {
        scoreA = scoreB = 0;
        updateScoreA();
        updateScoreB();
    }

}
