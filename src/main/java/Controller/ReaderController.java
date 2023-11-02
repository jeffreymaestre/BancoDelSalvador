package Controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import EJB.ReaderEJBLocal;
import Entity.Reader;

@Named
@RequestScoped
public class ReaderController {
	
	@EJB
	private ReaderEJBLocal readerEJBLocal;
	private List<Reader> listaReader;
	private Reader reader;
	
	public List<Reader> getListaReader() {
		return listaReader;
	}
	public void setListaReader(List<Reader> listaReader) {
		this.listaReader = listaReader;
	}
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	
	@PostConstruct
	public void init() {
		this.reader = new Reader();
	}
	

}
