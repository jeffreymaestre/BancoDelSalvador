package EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Entity.ReaderBlog;

@Stateless
public class ReaderBlogEJB implements ReaderBlogEJBLocal {

    @PersistenceContext(unitName = "myPersistenceUnit")
    private EntityManager entityManager;

    @Override
    public void createReaderBlog(ReaderBlog readerBlog) {
        entityManager.persist(readerBlog);
    }

    @Override
    public void deleteReaderBlog(int readerBlogId) {
        ReaderBlog readerBlog = entityManager.find(ReaderBlog.class, readerBlogId);
        if (readerBlog != null) {
            entityManager.remove(readerBlog);
        }
    }

}