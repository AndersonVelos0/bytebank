
public class TestaMetodos {

	public static void main(String[] args) {
		// criei um novo objeto
		Conta conta = new Conta();
		// atribui um valor ao objeto
		conta.saldo = 100;
		// para invocar o método usamos o parenteses e a sintaxe abaixo
		conta.deposita(50);
		System.out.println(conta.saldo);

		// nesse trecho você tem um retorno do método criado
		// irá retirar 20 reais do saldo que estava presente
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		contaDaMarcela.transfere(300, conta);
		System.out.println(contaDaMarcela.saldo);
		System.out.println(conta.saldo);

	}

}
