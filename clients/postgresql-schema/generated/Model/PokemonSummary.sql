--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_summary'
--
SELECT "name", url FROM pokemon_summary WHERE 1=1;

--
-- INSERT template for table 'pokemon_summary'
--
INSERT INTO pokemon_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_summary'
--
UPDATE pokemon_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_summary'
--
DELETE FROM pokemon_summary WHERE 1=2;

