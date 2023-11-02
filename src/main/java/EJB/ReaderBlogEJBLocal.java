	package EJB;

import Entity.ReaderBlog;

public interface ReaderBlogEJBLocal {
	
	 	void createReaderBlog(ReaderBlog readerBlog);
	    void deleteReaderBlog(int readerBlogId);

}
