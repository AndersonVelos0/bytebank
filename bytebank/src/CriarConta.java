
public class CriarConta {
	
	public static void main(String[] args) {
		// cria um objeto da classe Conta.java
		Conta primeiraConta = new Conta();
		//atribuiu valor ao atributo
		primeiraConta.saldo = 200;
		// acessando o atributo do objeto primeiraConta
		System.out.println(primeiraConta.saldo);
		
		// criando um segundo objeto com o mesmo atributo da classe Conta
		// não há relação entre a primeira e a segunda conta, porque estão instanciados de forma diferente
		// 
		Conta segundaConta =  new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
	}

}
