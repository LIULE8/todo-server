package com.leo.dao;

import com.leo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author LIULE9
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo,String> {
}
