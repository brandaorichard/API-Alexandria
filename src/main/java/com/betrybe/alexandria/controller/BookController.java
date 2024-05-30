package com.betrybe.alexandria.controller;

import com.betrybe.alexandria.controller.dto.BookCreationDto;
import com.betrybe.alexandria.controller.dto.BookDto;
import com.betrybe.alexandria.entity.Book;
import com.betrybe.alexandria.service.BookService;
import com.betrybe.alexandria.service.exception.BookNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/books")
public class BookController {

  private final BookService bookService;

  @Autowired
  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping("/{id}")
  public BookDto getBookId(@PathVariable Long id) throws BookNotFoundException {
    return BookDto.from(
        bookService.findById(id)
    );
  }

  @GetMapping
  public List<BookDto> getAllBooks() {
    List<Book> books = bookService.findAll();
    return books.stream()
        .map(BookDto::from)
        .toList();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public BookDto createBook(@RequestBody BookCreationDto bookCreationDto) {
    return BookDto.from(
        bookService.create(bookCreationDto.toEntity())
    );
  }

  @PutMapping("/{id}")
  public BookDto updateBook(
      @PathVariable Long id,
      @RequestBody BookCreationDto bookCreationDtoDto) throws BookNotFoundException {
    return BookDto.from(
        bookService.update(id, bookCreationDtoDto.toEntity())
    );
  }

  @DeleteMapping("/{id}")
  public BookDto deleteBook(@PathVariable Long id) throws BookNotFoundException {
    return BookDto.from(
        bookService.deleteById(id)
    );
  }
}
