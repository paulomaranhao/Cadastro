package com.example.cadastro;

import com.example.cadastro.model.Aluno;

import android.widget.EditText;
import android.widget.RatingBar;

public class formularioHelper {

	private EditText editNome;
	private EditText editSite;
	private EditText editEndereco;
	private EditText editTelefone;
	private RatingBar ratingNota;

	public formularioHelper(Formulario formulario) {
		
		editNome = (EditText) formulario.findViewById(R.id.nome);
		editSite = (EditText) formulario.findViewById(R.id.site);
		editEndereco = (EditText) formulario.findViewById(R.id.endereco);
		editTelefone = (EditText) formulario.findViewById(R.id.telefone);
		ratingNota = (RatingBar) formulario.findViewById(R.id.nota);
	}

	public Aluno pegaAlunoDoFormulario() {
		Aluno aluno = new Aluno();
		
		aluno.setNome(editNome.getText().toString());
		aluno.setSite(editSite.getText().toString());
		aluno.setEndereco(editEndereco.getText().toString());
		aluno.setTelefone(editTelefone.getText().toString());
		aluno.setNota(Double.valueOf(ratingNota.getRating()));
		
		return aluno;
		
	}

	
	
}
