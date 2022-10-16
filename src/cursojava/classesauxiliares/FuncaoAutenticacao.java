package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Classe que recebe, só quem realmente tem o contrato da interface de PermitirAcesso*/
/*Faz a chamada a autenticação*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
