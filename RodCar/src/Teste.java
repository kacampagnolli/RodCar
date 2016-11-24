import Classes.Carro;
import Classes.Cliente;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente("Kaue", "Av das Nações", "Santo Andre", "SP", 15,
					"1199374-5967",new Carro("Corsa","ABC-1234"));
		
		System.out.println(c1.toString());
	}

}
