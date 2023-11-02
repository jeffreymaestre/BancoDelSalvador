package Controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import EJB.ReaderBlogEJBLocal;
import Entity.Reader;
import Entity.ReaderBlog;

@Named
@RequestScoped
public class ReaderBlogController {
	
	@EJB
	private ReaderBlogEJBLocal blogEJBLocal;
	private List<ReaderBlog> listaReaderBlog;
	private ReaderBlog readerBlog;
	
	
	public List<ReaderBlog> getListaReaderBlog() {
		return listaReaderBlog;
	}
	public void setListaReaderBlog(List<ReaderBlog> listaReaderBlog) {
		this.listaReaderBlog = listaReaderBlog;
	}
	public ReaderBlog getReaderBlog() {
		return readerBlog;
	}
	public void setReaderBlog(ReaderBlog readerBlog) {
		this.readerBlog = readerBlog;
	}
	
	@PostConstruct
	public void init() {
		this.readerBlog = new ReaderBlog();
	}
	
	
	
	
	
	

}