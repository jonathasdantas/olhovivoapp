package br.com.olhovivo.adapters;

import java.util.List;

import android.content.Context;
import android.widget.ArrayAdapter;

public class ResultAdapter extends ArrayAdapter<String> {

	public ResultAdapter(Context context, int resource, List<String> objects) {
		super(context, resource, objects);
	}

}
