--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonShapeDetail_awesome_names_inner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_shape_detail_awesome_names_inner'
--
SELECT awesome_name, "language" FROM pokemon_shape_detail_awesome_names_inner WHERE 1=1;

--
-- INSERT template for table 'pokemon_shape_detail_awesome_names_inner'
--
INSERT INTO pokemon_shape_detail_awesome_names_inner (awesome_name, "language") VALUES (?, ?);

--
-- UPDATE template for table 'pokemon_shape_detail_awesome_names_inner'
--
UPDATE pokemon_shape_detail_awesome_names_inner SET awesome_name = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_shape_detail_awesome_names_inner'
--
DELETE FROM pokemon_shape_detail_awesome_names_inner WHERE 1=2;

