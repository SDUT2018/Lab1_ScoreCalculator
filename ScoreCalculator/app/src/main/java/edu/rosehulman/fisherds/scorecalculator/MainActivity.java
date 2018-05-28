package edu.rosehulman.fisherds.scorecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView mColorPointsTextView;

  private int mColorPoints = 0;
  private int mNearBallPoints = 0;
  private int mFarBallPoints = 0;
  private int mHomeConePoints = 0;
  private int mWhiteBlackMissionPoints = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Capture all the text views that will change...
    mColorPointsTextView = findViewById(R.id.color_points_textview);

    // Just an example of how to change the color_points_textview
//    mColorPointsTextView.setText(getString(R.string.color_points_format, 42));
  }

  // TODO for you...

  // Make the 4 buttons each call a function.
  // Name them...   pressed3Fixes, pressed2Fixes, pressed1Fix, pressed0Fixes
  // Have each button update the color_points_textview

  public void pressed3Fixes(View view) {
    mColorPoints = 0;
    updateView();
  }

  public void pressed2Fixes(View view) {
    mColorPoints = 25;
    updateView();
  }

  public void pressed1Fix(View view) {
    mColorPoints = 75;
    updateView();
  }

  public void pressed0Fixes(View view) {
    mColorPoints = 150;
    updateView();
  }

  private void updateView() {
    // Update the color points text view
    mColorPointsTextView.setText(
        getString(R.string.color_points_format, mColorPoints));

    // Update the near ball points text view

    // Update the far ball points text view

    // Update the home cone points text view

    // Update the white/black mission points text view

    // Update the TOTAL points text view

  }


}
