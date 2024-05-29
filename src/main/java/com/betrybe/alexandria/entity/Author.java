package com.betrybe.alexandria.entity;

/**
 * The type Author.
 */
public class Author {

  private Long id;

  private String name;
  private String nationality;

  /**
   * Instantiates a new Author.
   */
  public Author() {
  }

  /**
   * Instantiates a new Author.
   *
   * @param name        the name
   * @param nationality the nationality
   */
  public Author(String name, String nationality) {
    this.name = name;
    this.nationality = nationality;
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
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets nationality.
   *
   * @return the nationality
   */
  public String getNationality() {
    return nationality;
  }

  /**
   * Sets nationality.
   *
   * @param nationality the nationality
   */
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }
}