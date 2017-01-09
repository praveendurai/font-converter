package com.example.fontconverter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
	 Button buttonHello;
	 TextView textviewHello;
	 EditText textInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonHello = (Button)findViewById(R.id.hello_button );
        textInput = (EditText)findViewById(R.id.input_text);
        buttonHello.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String data = textInput.getText().toString();
				Toast msg = Toast.makeText(getApplicationContext(), "HELLO", Toast.LENGTH_LONG);
				msg.show();
			
				Intent i = new Intent(MainActivity.this,javfirst.class);
				i.putExtra("username",data);
				startActivity(i);
			}
		});
    }
}
 