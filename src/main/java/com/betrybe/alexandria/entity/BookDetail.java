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

  /**
   * Gets summary.
   *
   * @return the summary
   */
  public String getSummary() {
    return summary;
  }

  /**
   * Sets summary.
   *
   * @param summary the summary
   */
  public void setSummary(String summary) {
    this.summary = summary;
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
   * Gets page count.
   *
   * @return the page count
   */
  public Integer getPageCount() {
    return pageCount;
  }

  /**
   * Sets page count.
   *
   * @param pageCount the page count
   */
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  /**
   * Gets year.
   *
   * @return the year
   */
  public String getYear() {
    return year;
  }

  /**
   * Sets year.
   *
   * @param year the year
   */
  public void setYear(String year) {
    this.year = year;
  }

  /**
   * Gets isbn.
   *
   * @return the isbn
   */
  public String getIsbn() {
    return isbn;
  }

  /**
   * Sets isbn.
   *
   * @param isbn the isbn
   */
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }
}