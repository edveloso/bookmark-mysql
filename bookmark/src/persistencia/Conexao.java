package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe que cria uma conexão com o banco de dados
 *  
 * @author veloso
 *
 */
public class Conexao {

	//Conexão que é mantida entre a aplicação e o banco 
	//de dados. 
	//Sobre ela é mandado diversos comandos para o banco
	private Connection conn;
	
	public Connection abrirConexao(){

		try {
			String url = "jdbc:mysql://localhost/book";
			String user = "root";
			String password = "123456";
	
			//carrega o Driver do banco que se deseja utilizar
			Class.forName("com.mysql.jdbc.Driver");
			
			//Método estático que pega o Driver e se coneta ao banco
			//passando as três informações necessárias
	conn = DriverManager.getConnection(url, user, password);
			
			//caso chegue nesta linha foi realizada a conexão com sucesso
			System.out.println("Conexão realizada com sucesso...");  
			
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("Driver não carregado " + e.getMessage() );
		}
		catch (SQLException e) {
			System.out.println("Não pode executar a conexão com o banco " + e.getMessage());
		}
		
		
		return null;
	}
	
	
	
	
}
