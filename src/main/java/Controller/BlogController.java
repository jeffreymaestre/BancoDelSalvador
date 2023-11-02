package Controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import EJB.BlogEJBLocal;
import Entity.Blog;

@Named
@RequestScoped
public class BlogController {
	
	@EJB
	private BlogEJBLocal blogEJBLocal;
	private List<Blog> listaBlog;
	private Blog blog;
	
	public List<Blog> getListaBlog() {
		return listaBlog;
	}
	public void setListaBlog(List<Blog> listaBlog) {
		this.listaBlog = listaBlog;
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	
	@PostConstruct
	public void init() {
		this.blog = new Blog();
	}
	
	

}
