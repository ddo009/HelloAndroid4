package com.choinisae.nisaechoi.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AndroidExamActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mATeamScoreTxt;
    private TextView mBTeamScoreTxt;
    private TextView mATeamResultTxt;
    private TextView mBTeamResultTxt;
    private int mATeamScore = 0;
    private int mBTeamScore = 0;
    private int mAteamResult = 0;
    private int mBteamResult = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_exam);

        mATeamScoreTxt = (TextView) findViewById(R.id.a_team_score_txt);
        mBTeamScoreTxt = (TextView) findViewById(R.id.b_team_score_txt);

        mATeamResultTxt = (TextView) findViewById(R.id.a_team_result_txt);
        mBTeamResultTxt = (TextView) findViewById(R.id.b_team_result_txt);

        findViewById(R.id.a_team_one_btn).setOnClickListener(this);
        findViewById(R.id.a_team_two_btn).setOnClickListener(this);
        findViewById(R.id.a_team_three_btn).setOnClickListener(this);

        findViewById(R.id.b_team_one_btn).setOnClickListener(this);
        findViewById(R.id.b_team_two_btn).setOnClickListener(this);
        findViewById(R.id.b_team_three_btn).setOnClickListener(this);

        findViewById(R.id.a_team_result_btn).setOnClickListener(this);
        findViewById(R.id.b_team_result_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.a_team_one_btn:
                mATeamScore += 1;
                mATeamScoreTxt.setText("A팀 : " + mATeamScore + "점");
                mAteamResult++;
                break;
            case R.id.a_team_two_btn:
                mATeamScore += 2;
                mATeamScoreTxt.setText("A팀 : " + mATeamScore + "점");
                mAteamResult++;
                break;
            case R.id.a_team_three_btn:
                mATeamScore += 3;
                mATeamScoreTxt.setText("A팀 : " + mATeamScore + "점");
                mAteamResult++;
                break;
            case R.id.b_team_one_btn:
                mBTeamScore += 1;
                mBTeamScoreTxt.setText("B팀 : " + mBTeamScore + "점");
                mBteamResult++;
                break;
            case R.id.b_team_two_btn:
                mBTeamScore += 2;
                mBTeamScoreTxt.setText("B팀 : " + mBTeamScore + "점");
                mBteamResult++;
                break;
            case R.id.b_team_three_btn:
                mBTeamScore += 3;
                mBTeamScoreTxt.setText("B팀 : " + mBTeamScore + "점");
                mBteamResult++;
                break;
            case R.id.a_team_result_btn:
                mATeamResultTxt.setText("클릭횟수 : " + mAteamResult);
                mATeamResultTxt.setVisibility(View.VISIBLE);
                break;
            case R.id.b_team_result_btn:
                mBTeamResultTxt.setText("클릭횟수 : " + mBteamResult);
                mBTeamResultTxt.setVisibility(View.VISIBLE);
                break;
        }
    }
}
