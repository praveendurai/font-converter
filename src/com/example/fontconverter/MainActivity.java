package com.example.fontconverter;

import com.example.fontconverter.javfirst;
import com.example.fontconverter.MainActivity;
import com.example.fontconverter.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
	public EditText mValue; 
	public Button mButtonOk;
	private Button Button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setButton1((Button) findViewById(R.id.ok));
		mValue = (EditText) findViewById(R.id.value);

		mButtonOk.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {
					Intent intent  = new Intent(MainActivity.this,javfirst.class);
					intent.putExtra("editText", mValue.getText().toString());
					startActivity(intent);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	public Button getButton1() {
		return Button1;
	}

	public void setButton1(Button button1) {
		Button1 = button1;
	}
}
