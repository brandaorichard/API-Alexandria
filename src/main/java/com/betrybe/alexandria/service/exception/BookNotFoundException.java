package com.betrybe.alexandria.service.exception;

public class BookNotFoundException extends NotFoundException {

  public BookNotFoundException() {
    super("Livro não encontrado!");
  }
}