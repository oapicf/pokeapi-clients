--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonColorSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_color_summary'
--
SELECT "name", url FROM pokemon_color_summary WHERE 1=1;

--
-- INSERT template for table 'pokemon_color_summary'
--
INSERT INTO pokemon_color_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_color_summary'
--
UPDATE pokemon_color_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_color_summary'
--
DELETE FROM pokemon_color_summary WHERE 1=2;

