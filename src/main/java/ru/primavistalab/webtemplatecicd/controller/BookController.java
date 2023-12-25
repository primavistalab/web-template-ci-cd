package ru.primavistalab.webtemplatecicd.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import ru.primavistalab.webtemplatecicd.api.ApiBook;
import ru.primavistalab.webtemplatecicd.api.ApiBookRequest;
import ru.primavistalab.webtemplatecicd.service.BookService;

import java.util.List;
import java.util.UUID;

@RestController
@Service
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/api/v1/books")
    public List<ApiBook> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/api/v1/books/{id}")
    public ApiBook get(@PathVariable final UUID id){
        return bookService.get(id);
    }

    @PostMapping("/api/v1/books")
    public ApiBook create(@RequestBody final ApiBookRequest request){
        return bookService.create(request);
    }
}
