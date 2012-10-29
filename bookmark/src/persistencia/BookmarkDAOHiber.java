package persistencia;

import java.util.List;

import modelo.Bookmark;

import org.hibernate.Session;

public class BookmarkDAOHiber {

	private Session session;
	
	public BookmarkDAOHiber() {
		session = HibernateUtil.getSession();
	}
	
	
	public Bookmark getById(Integer id){
		return (Bookmark) session.get(Bookmark.class, id);
	}
	
	public List<Bookmark> listaTodos(){ 
		return session.createCriteria(Bookmark.class).list();
	}
	
	
	public void update(Bookmark bookmark){
		 session.beginTransaction();
        session.update(bookmark);
        session.getTransaction().commit();		
	}
	

	public void remove(Bookmark bookmark){
	   session.beginTransaction();
       session.delete(bookmark);
       session.getTransaction().commit();		
	}

	
	
	public void salvar(Bookmark bookmark){
		 session.beginTransaction();
         session.save(bookmark);
         session.getTransaction().commit();		
	}
	
}
