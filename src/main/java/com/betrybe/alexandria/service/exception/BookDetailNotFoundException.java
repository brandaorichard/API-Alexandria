package com.betrybe.alexandria.service.exception;

/**
 * The type Book detail not found exception.
 */
public class BookDetailNotFoundException extends NotFoundException {
  /**
   * Instantiates a new Book detail not found exception.
   */
  public BookDetailNotFoundException() {
    super("Detalhes de livro não encontrados!");
  }
}
