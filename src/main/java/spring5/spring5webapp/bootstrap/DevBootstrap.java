package spring5.spring5webapp.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import spring5.spring5webapp.model.Author;
import spring5.spring5webapp.model.Book;
import spring5.spring5webapp.repository.AuthorRepository;
import spring5.spring5webapp.repository.BookRepository;

@Slf4j
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        try {
            // Sam Walton
            log.info(">>> Inserting default values for dev environment");

            Author sam = new Author("Sam", "Walton");
            Book mia = new Book("Sam Walton, made in America", "9780553562835", "Bantam Books");
            mia.getAuthors().add(sam);

            authorRepository.save(sam);
            bookRepository.save(mia);

            // Alan
            Author alan = new Author("Alan", "Greenberg");
            Book mftc = new Book("Memos from the chairman", "1523501324", "Workman Publishing");
            mftc.getAuthors().add(alan);

            authorRepository.save(alan);
            bookRepository.save(mftc);

            // Walter Isaacson
            Author walter = new Author("Walter", "Isaacson");
            Book bf = new Book("Benjamin Franklin – uma vida americana", "B0171XOHHK", "Companhia das Letras");
            bf.getAuthors().add(walter);

            authorRepository.save(walter);
            bookRepository.save(bf);

            log.info(">>> Finished inserting default values for dev environment");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }
}
