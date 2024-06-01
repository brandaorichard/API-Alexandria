package com.betrybe.alexandria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * The type Book detail.
 */
@Entity
@Table(name = "book_details")
public class BookDetail {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String summary;
  private Integer pageCount;
  private String year;
  private String isbn;

  @OneToOne(optional = false)
  @JoinColumn(name = "book_id")
  private Book book;

  /**
   * Instantiates a new Book detail.
   */
  public BookDetail() {
  }

  /**
   * Instantiates a new Book detail.
   *
   * @param summary   the summary
   * @param pageCount the page count
   * @param year      the year
   * @param isbn      the isbn
   */
  public BookDetail(String summary, Integer pageCount, String year, String isbn) {
    this.summary = summary;
    this.pageCount = pageCount;
    this.year = year;
    this.isbn = isbn;
  }

  /**
   * Gets book.
   *
   * @return the book
   */
  public Book getBook() {
    return book;
  }

  /**
   * Sets book.
   *
   * @param book the book
   */
  public void setBook(Book book) {
    this.book = book;
  }
}