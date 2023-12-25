package ru.primavistalab.webtemplatecicd.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.primavistalab.webtemplatecicd.api.ApiBook;
import ru.primavistalab.webtemplatecicd.api.ApiBookRequest;
import ru.primavistalab.webtemplatecicd.data.Book;
import ru.primavistalab.webtemplatecicd.repository.BookRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookService implements IBookService {
    private final BookRepository repository;
    private final BookMapper mapper;

    @Override
    public List<ApiBook> findAll() {
        return mapper.mapAsList(repository.findAll());
    }

    @Override
    public ApiBook get(final UUID id) {
        return mapper.map(repository.getReferenceById(id));
    }

    @Override
    public ApiBook create(final ApiBookRequest request) {
        final var book = Book.builder()
                .title(request.getTitle())
                .author(request.getAuthor())
                .publicationDate(request.getPublicationDate())
                .build();
        return mapper.map(repository.save(book));
    }
}
