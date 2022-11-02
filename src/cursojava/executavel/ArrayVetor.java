package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		/* Instanciando o Obejto Aluno */
		Aluno aluno = new Aluno();
		aluno.setNome("Natan Dadalt");
		aluno.setNomeEscola("Java");
		
		/* Instanciando o Objeto disciplina */
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		
		double[] notas = {8.8, 7.7, 7.6, 8.8}; // Variavel com os valores do array
		
		disciplina.setNota(notas); // Array recebendo valores da variavel
		
		aluno.getDisciplinas().add(disciplina); // Relacionado disciplina com o aluno
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de programação");
		
		double[] notasLogica = {8.0, 7.1, 8.3, 4.4};
		
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
	
	
	

	}

}
