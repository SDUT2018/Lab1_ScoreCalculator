package edu.rosehulman.fisherds.scorecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView mColorPointsTextView;

  private EditText mNearBallDistanceEditText;
  private TextView mNearBallPointsTextView;

  private int mColorPoints = 0;
  private int mNearBallPoints = 0;
  private int mFarBallPoints = 0;
  private int mHomeConePoints = 0;
  private int mWhiteBlackMissionPoints = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Capture all the text views that will change and EditText to read the value...
    mColorPointsTextView = findViewById(R.id.color_points_textview);
    mNearBallDistanceEditText = findViewById(R.id.near_ball_distance_edittext);
    mNearBallPointsTextView = findViewById(R.id.near_ball_points_textview);


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

  public void pressedUpdate(View view) {
    // Get the distances from the 3 edit text boxes
    int nearBallDistance = Integer.parseInt(
        mNearBallDistanceEditText.getText().toString());

    // Use a formula to calculate the points earned
    if (nearBallDistance <= 5) {
      mNearBallPoints = 110;
    } else {
      mNearBallPoints = 33; // TODO: Implement the formula correctly!
    }

    // TODO: Do the same thing for the Far ball
    // TODO: Do the same thing for the Home cone

    // Call update view to update the near ball points
    updateView();
  }

  private void updateView() {
    // Update the color points text view
    mColorPointsTextView.setText(
        getString(R.string.color_points_format, mColorPoints));

    // Update the near ball points text view
    mNearBallPointsTextView.setText("" + mNearBallPoints);

    // Update the far ball points text view

    // Update the home cone points text view

    // Update the white/black mission points text view

    // Update the TOTAL points text view

  }

  // TODO: Figure out the rest of the lab on your own!

}
