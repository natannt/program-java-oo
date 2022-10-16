package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*Classe que recebe, s� quem realmente tem o contrato da interface de PermitirAcesso*/
/*Faz a chamada a autentica��o*/
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}

}
