package com.betrybe.alexandria.service.exception;

public class AuthorNotFoundException extends NotFoundException {

  public AuthorNotFoundException() {
    super("Pessoa autora não encontrada!");
  }
}