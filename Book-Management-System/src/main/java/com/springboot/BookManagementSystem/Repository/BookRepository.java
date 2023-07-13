package com.springboot.BookManagementSystem.Repository;

import com.springboot.BookManagementSystem.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
