package com.mose.bookApp.repository;

import com.mose.bookApp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookRepositorty extends CrudRepository<Book,Long> {
}
