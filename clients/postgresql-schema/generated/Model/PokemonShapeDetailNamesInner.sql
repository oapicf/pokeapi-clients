--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonShapeDetail_names_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_shape_detail_names_inner'
--
SELECT url, "name" FROM pokemon_shape_detail_names_inner WHERE 1=1;

--
-- INSERT template for table 'pokemon_shape_detail_names_inner'
--
INSERT INTO pokemon_shape_detail_names_inner (url, "name") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_shape_detail_names_inner'
--
UPDATE pokemon_shape_detail_names_inner SET url = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_shape_detail_names_inner'
--
DELETE FROM pokemon_shape_detail_names_inner WHERE 1=2;

