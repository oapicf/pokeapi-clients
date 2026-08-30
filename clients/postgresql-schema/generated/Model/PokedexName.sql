--
-- "PokéAPI"
-- Prepared SQL queries for 'PokedexName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokedex_name'
--
SELECT "name", "language" FROM pokedex_name WHERE 1=1;

--
-- INSERT template for table 'pokedex_name'
--
INSERT INTO pokedex_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokedex_name'
--
UPDATE pokedex_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokedex_name'
--
DELETE FROM pokedex_name WHERE 1=2;

