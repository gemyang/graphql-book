package com.graphqljava.tutorial.bookDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Author {

  private String id;
  private String firstName;
  private String lastName;

  public Author(String id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  private static List<Author> authors = new ArrayList<>(List.of(
      new Author("author-1", "J.K.", "Rowling"),
      new Author("author-2", "Herman", "Melville"),
      new Author("author-3", "Anne", "Rice")
  ));

  public static Author getById(String id) {
    return authors
        .stream()
        .filter(author -> author
            .getId()
            .equals(id))
        .findFirst()
        .orElse(null);
  }

  public static void addAuthor(Author author) {
    authors.add(author);
  }

  public String getId() {
    return id;
  }
}