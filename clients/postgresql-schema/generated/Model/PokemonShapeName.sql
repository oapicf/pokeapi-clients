--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonShapeName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_shape_name'
--
SELECT "name", "language" FROM pokemon_shape_name WHERE 1=1;

--
-- INSERT template for table 'pokemon_shape_name'
--
INSERT INTO pokemon_shape_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_shape_name'
--
UPDATE pokemon_shape_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_shape_name'
--
DELETE FROM pokemon_shape_name WHERE 1=2;

