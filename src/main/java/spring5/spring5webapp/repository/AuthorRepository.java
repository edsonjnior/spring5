package spring5.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;
import spring5.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
