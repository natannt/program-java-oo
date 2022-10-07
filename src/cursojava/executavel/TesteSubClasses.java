package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TesteSubClasses {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Natan");
		aluno.setNomeEscola("Escola Java");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1546465131");
		diretor.setNome("João");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("3122231312312312");
		
		
		System.out.println(aluno);
		System.out.println("_______________________");
		System.out.println(diretor);
		System.out.println("_______________________");
		System.out.println(secretario);
		
	}

}
