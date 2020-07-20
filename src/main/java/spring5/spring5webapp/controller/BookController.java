package spring5.spring5webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spring5.spring5webapp.repository.BookRepository;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
}
