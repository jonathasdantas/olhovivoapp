package br.com.olhovivo.activities;

import br.com.olhovivo.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/**
	 * Método geral para tratamento dos eventos dos botões do menu
	 * 
	 * @param view
	 */
	public void handleMenuClick(View view) {
		Intent intent = null;
		
		switch(view.getId()) {
			case R.id.search_button:
				intent = new Intent(MainActivity.this, SearchActivity.class);
			break;
			case R.id.denounce_button:
				
			break;
			case R.id.about_button:
				
			break;
		}
		
		MainActivity.this.startActivity(intent);
	}

}
