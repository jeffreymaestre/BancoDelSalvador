package EJB;

import Entity.Blog;

public interface BlogEJBLocal {
	
	void createBlog(Blog blog);
    Blog updateBlog(Blog blog);
    void deleteBlog(int blogId);
    Blog getBlogById(int blogId);

}
