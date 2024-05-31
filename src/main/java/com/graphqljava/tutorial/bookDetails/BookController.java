package com.graphqljava.tutorial.bookDetails;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
  @QueryMapping
  public Book bookById(@Argument String id) {
    return Book.getById(id);
  }

  @MutationMapping
  public Book addBook(@Argument String id, @Argument String name, @Argument int pageCount, @Argument String authorId) {
    Book newBook = new Book(id, name, pageCount, authorId);
    Book.addBook(newBook);
    return Book.getById(id);
  }

  @MutationMapping
  public Author addAuthor(@Argument String id, @Argument String firstName, @Argument String lastName) {
    Author newAuthor = new Author(id, firstName, lastName);
    Author.addAuthor(newAuthor);
    return newAuthor;
  }

  @SchemaMapping
  public Author author(Book book) {
    return Author.getById(book.authorId());
  }
}