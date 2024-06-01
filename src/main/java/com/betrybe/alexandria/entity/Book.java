package com.betrybe.alexandria.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Arrays;
import java.util.List;

/**
 * The type Book.
 */
@Entity
@Table(name = "books")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;
  private String genre;

  @OneToOne(cascade = CascadeType.ALL, mappedBy = "book")
  private BookDetail details;

  @ManyToOne
  @JoinColumn(name = "publisher_id")
  private Publisher publisher;

  @ManyToMany
  @JoinTable(
      name = "authors_books",
      joinColumns = @JoinColumn(name = "book_id"),
      inverseJoinColumns = @JoinColumn(name = "author_id")
  )

  private List<Author> authors;

  /**
   * Gets details.
   *
   * @return the details
   */
  public BookDetail getDetails() {
    return details;
  }

  /**
   * Sets details.
   *
   * @param details the details
   */
  public void setDetails(BookDetail details) {
    this.details = details;
  }

  /**
   * Instantiates a new Book.
   */
  public Book() {
  }

  /**
   * Instantiates a new Book.
   *
   * @param title the title
   * @param genre the genre
   */
  public Book(String title, String genre) {
    this.title = title;
    this.genre = genre;
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Gets title.
   *
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets title.
   *
   * @param title the title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Gets genre.
   *
   * @return the genre
   */
  public String getGenre() {
    return genre;
  }

  /**
   * Sets genre.
   *
   * @param genre the genre
   */
  public void setGenre(String genre) {
    this.genre = genre;
  }

  /**
   * Sets detail.
   *
   * @param o the o
   */
  public void setDetail(Object o) {
  }

  /**
   * Gets detail.
   *
   * @return the detail
   */
  public BookDetail getDetail() {
    return details;
  }

  /**
   * Gets publisher.
   *
   * @return the publisher
   */
  public Publisher getPublisher() {
    return publisher;
  }

  /**
   * Sets publisher.
   *
   * @param publisher the publisher
   */
  public void setPublisher(Publisher publisher) {
    this.publisher = publisher;
  }

  /**
   * Gets authors.
   *
   * @return the authors
   */
  public List<Author> getAuthors() {
    return authors;
  }

  /**
   * Sets authors.
   *
   * @param authors the authors
   */
  public void setAuthors(List<Author> authors) {
    this.authors = authors;
  }
}