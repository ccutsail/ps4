package com.example.androidcalcengine;

import pkg.FV_Calculator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class FVCalc extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fvcalc);
	    Button calcFV = (Button)findViewById(R.id.fvcalc);
	    final EditText pv = (EditText)findViewById(R.id.pv);
	    final EditText ir = (EditText)findViewById(R.id.ir);	    
	    final EditText pd = (EditText)findViewById(R.id.pd);
	    final EditText fv = (EditText)findViewById(R.id.editText1);
	    // Register the onClick listener with the implementation above
	    calcFV.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
	    	public void onClick(Button calcFV){l
	    		int perd = Log.v("EditText", pd.getText().toString());
	    		double presval = Log.v("EditText", pv.getText().toString());
	    		double intRate = Log.v("EditText", ir.getText().toString());
	    		double future_value = FV_Calculator.futureValue(intRate, presval, perd);
	    		String futval = String.format("%.2f", future_value);
	    		fv.setText(futval);
	    	}
	    }
	    );
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fvcalc, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}



	    
	}

