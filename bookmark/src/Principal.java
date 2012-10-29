import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import persistencia.BookmarkDAOHiber;
import persistencia.HibernateUtil;

import modelo.Bookmark;

public class Principal {

	public static void main(String[] args) {

		Bookmark bookmark = new Bookmark();
		bookmark.setId(3);
		bookmark.setDescricao("facebook");
		bookmark.setUrl("www.facebook.com");
		bookmark.setUsuario("silvio");

		BookmarkDAOHiber daoHiber = new BookmarkDAOHiber();
		
		Bookmark bm  = daoHiber.getById(4);
			System.out.print(bm.getId()+" - ");
			System.out.print(bm.getDescricao() + " ");
			System.out.println(bm.getUsuario() + " ");

}
}
