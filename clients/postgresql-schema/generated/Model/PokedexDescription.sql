--
-- "PokéAPI"
-- Prepared SQL queries for 'PokedexDescription' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokedex_description'
--
SELECT description, "language" FROM pokedex_description WHERE 1=1;

--
-- INSERT template for table 'pokedex_description'
--
INSERT INTO pokedex_description (description, "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokedex_description'
--
UPDATE pokedex_description SET description = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokedex_description'
--
DELETE FROM pokedex_description WHERE 1=2;

