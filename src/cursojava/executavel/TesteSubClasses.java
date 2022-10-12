package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TesteSubClasses {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Natan");
		aluno.setNomeEscola("Escola Java");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("1546465131");
		diretor.setNome("João");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Vilmar");
		secretario.setExperiencia("Administração");
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
		
		System.out.println("Salario é: " + aluno.salario());
		System.out.println("Salario é: " + diretor.salario());
		System.out.println("Salario é: " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é: " + pessoa.getNome() + " e o salario é de : " + pessoa.salario());
	}

}
