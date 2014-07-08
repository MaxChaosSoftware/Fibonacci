package edu.oit.cst407.assignment1.fibonaccifunctionapp;

import edu.oit.cst407.assignment1.fibonaccifunctionapp.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayFibonacci extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_fibonacci);
		// Get the message from the intent
		Intent intent = getIntent();
		String message = intent.getStringExtra(FibonacciActivity.EXTRA_MESSAGE);

		int numIterations;
		String result = "";
		try {
			numIterations = Integer.parseInt(message);

			long last = 0;
			long next = 1;
			result += next;
			for (int x = 0; x < numIterations - 1; ++x) {
				long temp = next;
				next += last;
				last = temp;
				result += ", " + next;
			}
		} catch (NumberFormatException e) {
			result = "Input is not a number!";
		}

		// Create the text view
		TextView textView = (TextView) findViewById(R.id.receive_message);
		textView.setTextSize(40);
		textView.setText(result);

	}

}