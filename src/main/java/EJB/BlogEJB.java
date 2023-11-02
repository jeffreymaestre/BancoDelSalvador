package EJB;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Entity.Blog;

@Stateless
public class BlogEJB implements BlogEJBLocal {

    @PersistenceContext(unitName = "myPersistenceUnit")
    private EntityManager entityManager;

    @Override
    public void createBlog(Blog blog) {
        entityManager.persist(blog);
    }

    @Override
    public Blog updateBlog(Blog blog) {
        return entityManager.merge(blog);
    }

    @Override
    public void deleteBlog(int blogId) {
        Blog blog = entityManager.find(Blog.class, blogId);
        if (blog != null) {
            entityManager.remove(blog);
        }
    }

    @Override
    public Blog getBlogById(int blogId) {
        return entityManager.find(Blog.class, blogId);
    }
}