package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 1; qtd <= 2; qtd ++) {
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de Nascimento do aluno?");
		String rg = JOptionPane.showInputDialog("Qual o RG do aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da m�e do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da Matricula do aluno?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a s�rie do aluno?");
		String escola = JOptionPane.showInputDialog("Qual o nome da Escola?");*/
		
		Aluno aluno1 = new Aluno(); 
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
		aluno1.setNomeEscola(escola);*/
		
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		/* Remover Disciplina*/
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) {/* Op��o SIM � Zero*/
			
			int continuarRemover = 0;
			int posicao = 1;
			while (continuarRemover == 0){
				String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover 1, 2, 3, 4?");
				aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
				posicao ++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
			}
		}
		
		alunos.add(aluno1);
		
		}
			
		for (Aluno aluno : alunos) {
			
			if (aluno.getNome().equalsIgnoreCase("Alex")) {
				alunos.remove(aluno);
				break;
			}else {
				System.out.println(aluno);
				System.out.println("M�dia do Aluno = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("----------------------------------------------------------------------");
				
			}
		}
		
		for (Aluno aluno : alunos) {
			System.out.println("Alunos restantes na lista");
			System.out.println(aluno.getNome());
			System.out.println("Mat�rias matriculadas:");
			
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
			
		}

			
		}
				
}


