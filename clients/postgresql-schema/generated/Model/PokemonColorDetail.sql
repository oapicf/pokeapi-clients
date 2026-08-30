--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonColorDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_color_detail'
--
SELECT "id", "name", "names", pokemon_species FROM pokemon_color_detail WHERE 1=1;

--
-- INSERT template for table 'pokemon_color_detail'
--
INSERT INTO pokemon_color_detail ("id", "name", "names", pokemon_species) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_color_detail'
--
UPDATE pokemon_color_detail SET "id" = ?, "name" = ?, "names" = ?, pokemon_species = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_color_detail'
--
DELETE FROM pokemon_color_detail WHERE 1=2;

