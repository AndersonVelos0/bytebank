
public class testeDeReferencias {
	
	public static void main(String[] args) {
		// primeira conta não é uma conta, é uma referencia pra um objeto do tipo conta
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println(primeiraConta.saldo);
		
		// Só temos um objeto do tipo conta devido a não termos criado um segundo
		
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta.saldo);
		
		// mesmo alterando a segunda conta, a primeira também será alterada devido a referencia ao mesmo a valor atribuido
		if (primeiraConta ==  segundaConta) {
			System.out.println("São a mesma conta");
		}
		
	}
	
}
