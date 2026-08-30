--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonShapeSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_shape_summary'
--
SELECT "name", url FROM pokemon_shape_summary WHERE 1=1;

--
-- INSERT template for table 'pokemon_shape_summary'
--
INSERT INTO pokemon_shape_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_shape_summary'
--
UPDATE pokemon_shape_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_shape_summary'
--
DELETE FROM pokemon_shape_summary WHERE 1=2;

