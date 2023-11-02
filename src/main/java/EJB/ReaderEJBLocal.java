package EJB;

import Entity.Reader;

public interface ReaderEJBLocal {
	
	void createReader(Reader reader);
    Reader updateReader(Reader reader);
    void deleteReader(int readerId);
    Reader getReaderById(int readerId);

}
