package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Clayton Santos");
		alunos.add("Rita Torres");
		alunos.add("Matheus Torres");
		alunos.add("Renan Saggio");
		alunos.add("Nico Steppat");
		alunos.add("Paulo Silveira");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Paulo Silveira");
		System.out.println(pauloEstaMatriculado);
				
		
		for (String aluno : alunos) {
			System.out.println(aluno);
			
		}
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
	}

}
