# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.graphql-java.tutorial.bookDetails' is invalid and this project uses 'com.graphqljava.tutorial.bookDetails' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### 5/29/2024
* tried java 15 feature record
* updated this file
### How to test 
http://localhost:8080/graphiql?path=/graphql

paste in below in the left pane and click the play button

```GraphQL
{
  bookById(id: "book-1") {
    id
    name
    pageCount   
    author {
      firstName
      lastName
    }
  }
}
```
### 5/31/2024
* added two mutations: addBook and addAuthor

```GraphQL
# mutation {
#   addAuthor(id: "author-4", firstName: "First Name", lastName: "Last Name") {
#     id
#     firstName
#     lastName
#   }
# }

mutation {
  addBook(id: "book-4", name: "New Book", pageCount: 200, authorId: "author-4") {
    id
    name
    pageCount
    author {
      id
      lastName
      firstName
    }
  }
}
```