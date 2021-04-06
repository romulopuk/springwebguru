package com.example.springwebguru.repository;

import com.example.springwebguru.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
