package com.betrybe.alexandria.controller.dto;

import com.betrybe.alexandria.entity.Book;

/**
 * The type Book dto.
 */
public record BookDto(Long id, String title, String genre) {

  /**
   * From book dto.
   *
   * @param book the book
   * @return the book dto
   */
  public static BookDto from(Book book) {
    return new BookDto(book.getId(), book.getTitle(), book.getGenre());
  }
}
