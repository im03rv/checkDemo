package com.curdoperation.actions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdoperation.actions.model.Book;

public interface ActionsRepository extends JpaRepository<Book, Integer> {

}
