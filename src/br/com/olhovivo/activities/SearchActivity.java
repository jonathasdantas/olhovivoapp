package br.com.olhovivo.activities;

import br.com.olhovivo.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SearchActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		
		this.fillSpinners();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search, menu);
		return true;
	}
	
	public void fillSpinners() {
		Spinner pessoaJuridica = (Spinner) findViewById(R.id.pessoa_juridica);
		Spinner naturezaContrato = (Spinner) findViewById(R.id.natureza_contrato);
		Spinner classificacaoContrato = (Spinner) findViewById(R.id.classificacao_contrato);
		Spinner orgaoSolicitante = (Spinner) findViewById(R.id.orgao_solicitante);
		
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_array, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		pessoaJuridica.setAdapter(adapter);
		naturezaContrato.setAdapter(adapter);
		classificacaoContrato.setAdapter(adapter);
		orgaoSolicitante.setAdapter(adapter);
	}

}
