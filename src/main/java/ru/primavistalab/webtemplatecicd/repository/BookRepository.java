package ru.primavistalab.webtemplatecicd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.primavistalab.webtemplatecicd.data.Book;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {

}
