package persistencia;

import junit.framework.Assert;
import modelo.Bookmark;

import org.junit.Test;

public class BookmarkDAOTest {

	BookmarkDAO dao = new BookmarkDAO();
	
	@Test
	public void testSalvar() {
		Bookmark bookmark = new Bookmark();
		bookmark.setDescricao("meu blog");
		bookmark.setUrl("edveloso.wordpress.com");
		bookmark.setUsuario("edveloso");
		
		Assert.assertTrue(dao.salvar(bookmark));
	}

}
