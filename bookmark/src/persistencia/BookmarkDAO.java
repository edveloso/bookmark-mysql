package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Bookmark;

public class BookmarkDAO {

	
	private Connection conn;
	
	private PreparedStatement pstm;
	
	public BookmarkDAO() {
		conn = new Conexao().abrirConexao();
	}
	
	public boolean salvar(Bookmark bookmark){
		
		String sql = "insert into bookmark (usuario, url, descricao)" +
				"values (?,?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, bookmark.getUsuario());
			pstm.setString(2, bookmark.getUrl());
			pstm.setString(3, bookmark.getDescricao());
			
			return pstm.executeUpdate() > 0;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}
