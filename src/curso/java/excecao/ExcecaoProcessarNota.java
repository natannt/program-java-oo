package curso.java.excecao;

public class ExcecaoProcessarNota extends Exception{
	
	public ExcecaoProcessarNota(String erro) {
		super("Arquivo não encontrado " + erro);
	}

}
