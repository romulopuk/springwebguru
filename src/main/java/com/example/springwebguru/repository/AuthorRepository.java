package com.example.springwebguru.repository;

import com.example.springwebguru.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
