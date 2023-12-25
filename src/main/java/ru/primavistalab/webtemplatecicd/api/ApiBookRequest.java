package ru.primavistalab.webtemplatecicd.api;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ApiBookRequest {
    private String title;
    private String author;
    private LocalDate publicationDate;
}
