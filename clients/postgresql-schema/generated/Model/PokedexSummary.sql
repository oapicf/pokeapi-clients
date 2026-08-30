--
-- "PokéAPI"
-- Prepared SQL queries for 'PokedexSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokedex_summary'
--
SELECT "name", url FROM pokedex_summary WHERE 1=1;

--
-- INSERT template for table 'pokedex_summary'
--
INSERT INTO pokedex_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'pokedex_summary'
--
UPDATE pokedex_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'pokedex_summary'
--
DELETE FROM pokedex_summary WHERE 1=2;

