package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		try {
			//lerArquivo();
			
			
			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) { // S? acessado por quem tem o contrato
																					// do
																					// interface 100% legitimo

				List<Aluno> alunos = new ArrayList<Aluno>(); // new ArrayList<Aluno>();

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 2; qtd++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
					String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); 
					
					/*
					 * StringdataNascimento =
					 * JOptionPane.showInputDialog("Qual a data de Nascimento do aluno?"); String rg
					 * = JOptionPane.showInputDialog("Qual o RG do aluno?"); String cpf =
					 * JOptionPane.showInputDialog("Qual o CPF do aluno?"); String nomeMae =
					 * JOptionPane.showInputDialog("Qual o nome da m?e do aluno?"); String nomePai =
					 * JOptionPane.showInputDialog("Qual o nome do pai do aluno?"); String
					 * dataMatricula =
					 * JOptionPane.showInputDialog("Qual a data da Matricula do aluno?"); String
					 * serieMatriculado = JOptionPane.showInputDialog("Qual a s?rie do aluno?");
					 * String escola = JOptionPane.showInputDialog("Qual o nome da Escola?");
					 */

					Aluno aluno1 = new Aluno();

					aluno1.setNome(nome);
					aluno1.setIdade(Integer.valueOf(idade));
					
					/*
					 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
					 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(nomeMae);
					 * aluno1.setNomePai(nomePai); aluno1.setDataMatricula(dataMatricula);
					 * aluno1.setSerieMatriculado(serieMatriculado); aluno1.setNomeEscola(escola);
					 */

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);
					}

					/* Remover Disciplina */

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

					if (escolha == 0) {/* Op??o SIM ? Zero */

						int continuarRemover = 0;
						int posicao = 1;
						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane
									.showInputDialog("Qual disciplina deseja remover 1, 2, 3, 4?");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
						}
					}

					alunos.add(aluno1);

				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) { /* Listas de separa??o de alunos por Status */

					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno);
					}

				}

				System.out.println("----------Lista dos Aprovados----------");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + ", com m?dia de = " + aluno.getMediaNota());
				}

				System.out.println("----------Lista dos Reprovados----------");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + ", com m?dia de = " + aluno.getMediaNota());
				}

				System.out.println("----------Lista dos Recupera??o----------");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado2() + ", com m?dia de = " + aluno.getMediaNota());
				}

			} else {
				JOptionPane.showMessageDialog(null, "Acesso n?o permitido");
			}

		} catch (Exception e) {
			
			StringBuilder saida = new StringBuilder();
			
			e.printStackTrace(); /* Imprime erro no console Java */
			
			System.out.println("Mensagem: " + e.getMessage()); /* Mensagem do erro ou causa */
			
			for (int pos = 0; pos < e.getStackTrace().length; pos++) { /* imprime lista de erro */ 
				saida.append("\n Classe de erro: " + e.getStackTrace()[pos].getClassName());
				saida.append("\n M?todo de erro: " + e.getStackTrace()[pos].getMethodName());
				saida.append("\n Linha de erro: " + e.getStackTrace()[pos].getLineNumber());
				saida.append("\n class: " + e.getClass().getName());
			}
			
			JOptionPane.showMessageDialog(null, "Erro de convers?o de n?meros " + saida.toString());

		} finally {
			JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema");
		}

	}
	
	/*public static void lerArquivo() throws FileNotFoundException {
		
		File fil = new File("c://lines.txt");
		Scanner scanner = new Scanner(fil);
		
	}*/

}
