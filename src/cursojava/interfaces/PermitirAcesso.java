package cursojava.interfaces;

/*Interface de contrato de autenticação*/
public interface PermitirAcesso {
	
	public boolean autenticar(String login,String senha);
	public boolean autenticar();
}
