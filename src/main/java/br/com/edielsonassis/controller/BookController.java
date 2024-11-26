package br.com.edielsonassis.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edielsonassis.model.Book;
import br.com.edielsonassis.repository.BookRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository booksRepository;

    @PostMapping
    public Book create(@RequestBody Book book) {
        return this.booksRepository.save(book);
    }

    @GetMapping
    public List<Book> list() {
        return this.booksRepository.findAll();
    }
}