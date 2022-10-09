package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TesteSubClasses {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Natan");
		aluno.setNomeEscola("Escola Java");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1546465131");
		diretor.setNome("Jo�o");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administra��o");
		secretario.setNumeroCpf("3122231312312312");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println("_______________________");
		System.out.println(diretor);
		System.out.println("_______________________");
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
	}

}
