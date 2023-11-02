package EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Entity.Reader;

@Stateless
public class ReaderEJB implements ReaderEJBLocal {

    @PersistenceContext(unitName = "myPersistenceUnit")
    private EntityManager entityManager;

    @Override
    public void createReader(Reader reader) {
        entityManager.persist(reader);
    }

    @Override
    public Reader updateReader(Reader reader) {
        return entityManager.merge(reader);
    }

    @Override
    public void deleteReader(int readerId) {
        Reader reader = entityManager.find(Reader.class, readerId);
        if (reader != null) {
            entityManager.remove(reader);
        }
    }

    @Override
    public Reader getReaderById(int readerId) {
        return entityManager.find(Reader.class, readerId);
    }
}