package Dados;
import java.sql.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Mysql {
	
	private final static String url ="jdbc:mysql://localhost:3306/RodCar";
	
	private final static String username = "root";
	private final static String password = "root";
	
	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	
	public void openDB(){
		try {
			con = (Connection) DriverManager.getConnection(url, username, password);
			stmt = (Statement) con.createStatement();
			System.out.println("\nConexão estabelecida com sucesso");
		} catch (SQLException e) {
			System.out.println("\nNão foi possivel estabelecer conexão" + e + "\n");
			System.exit(1);
		}
		
	}
	public void closeDB(){
		try {
			con.close();
			System.out.println("\nConexão fechada com sucesso");
		} catch (SQLException e) {
			System.out.println("\nNão foi possivel fechar conexão" + e + "\n");
			System.exit(1);
		}
	
	}
	
	public void inserirCliente(String nome, String endereco, String cidade, String uf, 
			String telefone){
		try {
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO clientes VALUES (?, ?,"
					+ " ?, ?, ? ,?)");
			
			int x = 0;
			ps.setInt(1, x);
			ps.setString(2, nome);
			ps.setString(3, endereco);
			ps.setString(4, cidade);
			ps.setString(5, uf);
			ps.setString(6, telefone);
			ps.executeUpdate();
			
			ps.close();
			System.out.println("Comando Executado");
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		
		
	}
	
	public void inserirCarro(String modelo, String placa, int idCliente){
		try {
			PreparedStatement ps = con.prepareStatement("INSERT INTO carros VALUES (?, ?,"
					+ " ?, ?)");
			
			int x = 0;
			ps.setInt(1, x);
			ps.setString(2, modelo);
			ps.setString(3, placa);
			ps.setInt(4, idCliente);
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
