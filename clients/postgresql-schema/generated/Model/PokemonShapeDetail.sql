--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonShapeDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_shape_detail'
--
SELECT "id", "name", awesome_names, "names", pokemon_species FROM pokemon_shape_detail WHERE 1=1;

--
-- INSERT template for table 'pokemon_shape_detail'
--
INSERT INTO pokemon_shape_detail ("id", "name", awesome_names, "names", pokemon_species) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_shape_detail'
--
UPDATE pokemon_shape_detail SET "id" = ?, "name" = ?, awesome_names = ?, "names" = ?, pokemon_species = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_shape_detail'
--
DELETE FROM pokemon_shape_detail WHERE 1=2;

