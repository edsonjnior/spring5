package spring5.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;
import spring5.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
