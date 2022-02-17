package senac.quarto.periodo;

public class Principal {
	public static void main(String[] args) {
		Cliente cliente_01 = new Cliente();
		cliente_01.cpf=("02850435902");
		cliente_01.anoNascimento=(1980);
		cliente_01.nome=("Marcos da Rocha Souza");
		cliente_01.email=("mr_souza@gmail.com");
		
		
		Conta conta_01;
		conta_01 = new Conta();
		conta_01.numero = 1521;
		conta_01.saldo = 750.63f;

	} 
	
}
