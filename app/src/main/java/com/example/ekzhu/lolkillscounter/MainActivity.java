package com.example.ekzhu.lolkillscounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;


public class MainActivity extends AppCompatActivity {

    private int killTeamA = 0;
    private int towerTeamA = 0;
    private int dragonTeamA = 0;
    private int baronTeamA = 0;
    private int killTeamB = 0;
    private int dragonTeamB = 0;
    private int towerTeamB = 0;
    private int baronTeamB = 0;

    private static final String STATE_KILLSTEAMBLUE = "stateofKillsBlue";
    private static final String STATE_KILLSTEAMRED = "stateofKillsRed";
    private static final String STATE_TOWERTEAMBLUE = "stateofTowerBlue";
    private static final String STATE_TOWERTEAMRED = "stateofTowerRed";
    private static final String STATE_DRAGONTEAMBLUE = "stateofDragonBlue";
    private static final String STATE_DRAGONTEAMRED = "stateofDragonRed";
    private static final String STATE_BARONTEAMBLUE = "stateofBaronBlue";
    private static final String STATE_BARONTEAMRED = "stateofBaronRed";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_KILLSTEAMBLUE, killTeamA);
        savedInstanceState.putInt(STATE_KILLSTEAMRED, killTeamB);
        savedInstanceState.putInt(STATE_TOWERTEAMBLUE, towerTeamA);
        savedInstanceState.putInt(STATE_TOWERTEAMRED, towerTeamB);
        savedInstanceState.putInt(STATE_DRAGONTEAMBLUE, dragonTeamA);
        savedInstanceState.putInt(STATE_DRAGONTEAMRED, dragonTeamB);
        savedInstanceState.putInt(STATE_BARONTEAMBLUE, baronTeamA);
        savedInstanceState.putInt(STATE_BARONTEAMRED, baronTeamB);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        /* Restores Kills */
        killTeamA = savedInstanceState.getInt(STATE_KILLSTEAMBLUE);
        killTeamB = savedInstanceState.getInt(STATE_KILLSTEAMRED);

        /* Restores Tower Kills */
        towerTeamA = savedInstanceState.getInt(STATE_TOWERTEAMBLUE);
        towerTeamB = savedInstanceState.getInt(STATE_TOWERTEAMRED);

        /* Restores Dragon Kills */
        dragonTeamA = savedInstanceState.getInt(STATE_DRAGONTEAMBLUE);
        dragonTeamB = savedInstanceState.getInt(STATE_DRAGONTEAMRED);

        /* Restores Baron Kills */
        baronTeamA = savedInstanceState.getInt(STATE_BARONTEAMBLUE);
        baronTeamB = savedInstanceState.getInt(STATE_BARONTEAMRED);

        /* Display values after restoring */
        displayForTeamA(killTeamA);
        displayForTeamB(killTeamB);
        displayForTowerA(towerTeamA);
        displayForTowerB(towerTeamB);
        displayForBaronA(baronTeamA);
        displayForBaronB(baronTeamB);
        displayForDragonA(dragonTeamA);
        displayForDragonB(dragonTeamB);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        killTeamA = killTeamA + 1;
        displayForTeamA(killTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the dragon for Team A by 1 point.
     */
    public void addOneForDragonA(View v) {
        dragonTeamA = dragonTeamA + 1;
        displayForDragonA(dragonTeamA);
    }

    public void displayForDragonA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.dragonA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the tower for Team A by 1 point.
     */
    public void addOneForTowerA(View v) {
        towerTeamA = towerTeamA + 1;
        displayForTowerA(towerTeamA);
    }

    public void displayForTowerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.towerA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the baron for Team A by 1 point.
     */
    public void addOneForBaronA(View v) {
        baronTeamA = baronTeamA + 1;
        displayForBaronA(baronTeamA);
    }

    public void displayForBaronA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.baronA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        killTeamB = killTeamB + 1;
        displayForTeamB(killTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the dragon for Team B by 1 point.
     */
    public void addOneForDragonB(View v) {
        dragonTeamB = dragonTeamB + 1;
        displayForDragonB(dragonTeamB);
    }

    public void displayForDragonB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.dragonB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the tower for Team B by 1 point.
     */
    public void addOneForTowerB(View v) {
        towerTeamB = towerTeamB + 1;
        displayForTowerB(towerTeamB);
    }

    public void displayForTowerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.towerB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the baron for Team B by 1 point.
     */
    public void addOneForBaronB(View v) {
        baronTeamB = baronTeamB + 1;
        displayForBaronB(baronTeamB);
    }

    public void displayForBaronB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.baronB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset function
     */
    public void resetPoints(View v) {
        killTeamA = 0;
        dragonTeamA = 0;
        towerTeamA = 0;
        baronTeamA = 0;
        displayForTeamA(0);
        displayForDragonA(0);
        displayForTowerA(0);
        displayForBaronA(0);
        killTeamB = 0;
        dragonTeamB = 0;
        towerTeamB = 0;
        baronTeamB = 0;
        displayForTeamB(0);
        displayForDragonB(0);
        displayForTowerB(0);
        displayForBaronB(0);
    }

}
