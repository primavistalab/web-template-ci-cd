package ru.primavistalab.webtemplatecicd.api;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class ApiBook {
    private UUID id;
    private String title;
    private String author;
    private LocalDate publicationDate;
}
