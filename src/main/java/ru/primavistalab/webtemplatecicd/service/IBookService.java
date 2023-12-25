package ru.primavistalab.webtemplatecicd.service;

import ru.primavistalab.webtemplatecicd.api.ApiBook;
import ru.primavistalab.webtemplatecicd.api.ApiBookRequest;

import java.util.List;
import java.util.UUID;

public interface IBookService {
    List<ApiBook> findAll();

    ApiBook get(UUID id);

    ApiBook create(ApiBookRequest request);
}
