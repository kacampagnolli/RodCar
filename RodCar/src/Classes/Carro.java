package Classes;

public class Carro {
	
	private String modelo;
	private String placa;
	
	public Carro(){
		
	}
	public Carro(String modelo, String placa){
		this.placa = placa;
		this.modelo = modelo;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
