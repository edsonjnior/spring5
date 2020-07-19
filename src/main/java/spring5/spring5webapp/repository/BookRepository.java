package spring5.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;
import spring5.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
