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


/**
 * The type Book controller.
 */
@RestController
@RequestMapping(value = "/books")
public class BookController {

  private final BookService bookService;

  /**
   * Instantiates a new Book controller.
   *
   * @param bookService the book service
   */
  @Autowired
  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  /**
   * Gets book id.
   *
   * @param id the id
   * @return the book id
   * @throws BookNotFoundException the book not found exception
   */
  @GetMapping("/{id}")
  public BookDto getBookId(@PathVariable Long id) throws BookNotFoundException {
    return BookDto.from(
        bookService.findById(id)
    );
  }

  /**
   * Gets all books.
   *
   * @return the all books
   */
  @GetMapping
  public List<BookDto> getAllBooks() {
    List<Book> books = bookService.findAll();
    return books.stream()
        .map(BookDto::from)
        .toList();
  }

  /**
   * Create book book dto.
   *
   * @param bookCreationDto the book creation dto
   * @return the book dto
   */
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public BookDto createBook(@RequestBody BookCreationDto bookCreationDto) {
    return BookDto.from(
        bookService.create(bookCreationDto.toEntity())
    );
  }

  /**
   * Update book book dto.
   *
   * @param id                 the id
   * @param bookCreationDtoDto the book creation dto dto
   * @return the book dto
   * @throws BookNotFoundException the book not found exception
   */
  @PutMapping("/{id}")
  public BookDto updateBook(
      @PathVariable Long id,
      @RequestBody BookCreationDto bookCreationDtoDto) throws BookNotFoundException {
    return BookDto.from(
        bookService.update(id, bookCreationDtoDto.toEntity())
    );
  }

  /**
   * Delete book book dto.
   *
   * @param id the id
   * @return the book dto
   * @throws BookNotFoundException the book not found exception
   */
  @DeleteMapping("/{id}")
  public BookDto deleteBook(@PathVariable Long id) throws BookNotFoundException {
    return BookDto.from(
        bookService.deleteById(id)
    );
  }
}
