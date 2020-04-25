package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mTopButton;
    Button mDownButton;
    TextView mTextView;
    int mIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTopButton = findViewById(R.id.buttonTop);
        mDownButton = findViewById(R.id.buttonBottom);
        mTextView = findViewById(R.id.storyTextView);
        mTextView.setText(R.string.T1_Story);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIndex == 1 || mIndex ==2)
                {
                    mTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mDownButton.setText(R.string.T3_Ans2);
                    mIndex = 3;
                }
                else if (mIndex == 3)
                {
                    mTextView.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.GONE);
                    mDownButton.setVisibility(View.GONE);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mIndex == 1) {
                    mTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mDownButton.setText(R.string.T2_Ans2);
                    mIndex = 2;
                }
                else if (mIndex == 2)
                {
                    mTextView.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.GONE);
                    mDownButton.setVisibility(View.GONE);
                }
                else if(mIndex == 3)
                {
                    mTextView.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.GONE);
                    mDownButton.setVisibility(View.GONE);
                }
            }
        });

    }
}
