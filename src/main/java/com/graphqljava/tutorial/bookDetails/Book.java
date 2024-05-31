package com.graphqljava.tutorial.bookDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * using the new record feature in Java 16
 */
public record Book(String id, String name, int pageCount, String authorId) {
  public static Book getById(String id) {
    return books.stream().filter(book -> book.id().equals(id)).findFirst().orElse(null);
  }
  public static void addBook(Book book) {
    books.add(book);
  }
  private static List<Book> books = new ArrayList<>(Arrays.asList(
      new Book("book-1", "Harry Potter and the Philosopher's Stone", 223, "author-1"),
      new Book("book-2", "Moby Dick", 635, "author-2"),
      new Book("book-3", "Interview with the vampire", 371, "author-3")
  ));
}