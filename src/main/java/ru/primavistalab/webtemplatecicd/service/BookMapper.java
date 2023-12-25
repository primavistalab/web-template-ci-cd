package ru.primavistalab.webtemplatecicd.service;

import org.springframework.stereotype.Service;
import ru.primavistalab.webtemplatecicd.api.ApiBook;
import ru.primavistalab.webtemplatecicd.data.Book;

import java.util.List;

import static java.util.Objects.isNull;

@Service
public class BookMapper {
    ApiBook map(final Book book) {
        if (isNull(book)) return null;
        else return ApiBook.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .publicationDate(book.getPublicationDate())
                .build();
    }

    List<ApiBook> mapAsList(final List<Book> books) {
        if (isNull(books)) return null;
        else return books.stream()
                .map(this::map)
                .toList();
    }
}
