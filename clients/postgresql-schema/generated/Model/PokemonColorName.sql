--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonColorName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_color_name'
--
SELECT "name", "language" FROM pokemon_color_name WHERE 1=1;

--
-- INSERT template for table 'pokemon_color_name'
--
INSERT INTO pokemon_color_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_color_name'
--
UPDATE pokemon_color_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_color_name'
--
DELETE FROM pokemon_color_name WHERE 1=2;

