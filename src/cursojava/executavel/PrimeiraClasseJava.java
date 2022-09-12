package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* objeto ainda n�o existe na mem�ria, se declarado dessa forma */
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
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
			
		
		
		/* Impress�o dos dados em tela com toString*/
		System.out.println(aluno1.toString());
		System.out.println("M�dia do Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
	}

}
