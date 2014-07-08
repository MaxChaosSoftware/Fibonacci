package edu.oit.cst407.assignment1.fibonaccifunctionapp;

import edu.oit.cst407.assignment1.fibonaccifunctionapp.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FibonacciActivity extends Activity {
	public final static String EXTRA_MESSAGE = "edu.oit.cst407.assignment1.fibonaccifunctionapp.MESSAGE";

	private Button messageButton = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fibonacci);
		messageButton = (Button) findViewById(R.id.message_button);
	}

	/** Called when the user clicks the Send button */
	public void sendMessage(View view) {

		@SuppressWarnings("unused")
		Button mButton = messageButton;
		// Do something in response to button
		Intent intent = new Intent(this, DisplayFibonacci.class);
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);

	}

}
