package com.example.fontconverter;

import com.example.fontconverter.R;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
 

public class javfirst extends Activity {
	public TextView mtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        mtext = (TextView) findViewById(R.id.textView1);
			if(getIntent() !=null){
				Typeface custom_font = Typeface.createFromAsset(getResources().getAssets(),"Art Brewery.ttf" );
				String value =	getIntent().getStringExtra("editText");
				mtext.setTypeface(custom_font);
				mtext.setText(value);
				//Toast.makeText(getApplicationContext(), value, Toast.LENGTH_LONG).show();
			}
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
