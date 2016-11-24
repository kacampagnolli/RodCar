import Classes.Carro;
import Classes.Cliente;
import Dados.Mysql;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Cliente c1 = new Cliente("Pedro", "Av das Nações 162", "Santo Andre", "SP", 
					"114472-5967",new Carro("Corsa","ABC-1234"));
		
		System.out.println(c1.toString());
		
		Mysql sql = new Mysql();
		sql.openDB();
		sql.inserirCliente(c1.getNome(), c1.getEndereco(), c1.getCidade(), c1.getUf(),
				c1.getTelefone());
		
		sql.closeDB();
	}
	
	
}
