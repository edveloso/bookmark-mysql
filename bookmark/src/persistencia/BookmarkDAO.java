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
	
	public static void main(String[] args) {
		BookmarkDAO dao = new BookmarkDAO();
		Bookmark bookmark = new Bookmark("maria", "bolo", 4);
		dao.atualizar(bookmark);
	}
	
	public boolean atualizar(Bookmark bookmark){
		String sql = "update bookmark " +
				"set usuario= ?, descricao = ?" +
				"where id = ?";
		try {
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, bookmark.getUsuario());
			pstm.setString(2, bookmark.getDescricao());
			pstm.setInt(3, bookmark.getId());
			
			return pstm.executeUpdate() > 0;
			
		} catch (SQLException e) {
			System.out.println("Erro na inserção "+ e.getMessage());   
		}
		return false;
	}
	
	
	public boolean salvar(Bookmark bookmark){
		String sql = "insert into bookmark " +
				"(usuario, url, descricao)" +
				"values (?,?,?)";
		try {
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, bookmark.getUsuario());
			pstm.setString(2, bookmark.getUrl());
			pstm.setString(3, bookmark.getDescricao());
			
			return pstm.executeUpdate() > 0;
			
		} catch (SQLException e) {
			System.out.println("Erro na inserção "+ e.getMessage());   
		}
		return false;
	}
}
