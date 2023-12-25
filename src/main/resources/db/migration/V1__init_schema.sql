create table book
(
    id               uuid default gen_random_uuid()
        constraint book_pk primary key,
    title            varchar,
    author           varchar,
    publication_date timestamp
);