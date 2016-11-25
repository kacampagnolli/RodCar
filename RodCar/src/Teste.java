import Classes.Carro;
import Classes.Cliente;
import Dados.Mysql;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Cliente c1 = new Cliente("teste luiz", "Av das Nações 162", "Santo Andre", "SP", 
					"114472-5967",new Carro("Corsa","ABC-1234"));
		
		System.out.println(c1.toString());
		
		Mysql sql = new Mysql();
		sql.openDB();
		sql.inserirCliente(c1.getNome(), c1.getEndereco(), c1.getCidade(), c1.getUf(),
				c1.getTelefone());
	
		sql.inserirCarro(c1.getCarro().getModelo(), c1.getCarro().getPlaca(),
				sql.buscarCliente(c1.getNome()));
		
		sql.closeDB();
	}
	
	
}
