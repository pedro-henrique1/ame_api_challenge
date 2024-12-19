CREATE TABLE planets
(
    id               INTEGER PRIMARY KEY,
    name             VARCHAR(255) NOT NULL UNIQUE,
    climate          VARCHAR(255) NOT NULL,
    terrain          VARCHAR(255) NOT NULL,
    film_appearances INT DEFAULT 0
);

