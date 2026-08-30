--
-- "PokéAPI"
-- Prepared SQL queries for 'PokemonHabitatDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pokemon_habitat_detail'
--
SELECT "id", "name", "names", pokemon_species FROM pokemon_habitat_detail WHERE 1=1;

--
-- INSERT template for table 'pokemon_habitat_detail'
--
INSERT INTO pokemon_habitat_detail ("id", "name", "names", pokemon_species) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'pokemon_habitat_detail'
--
UPDATE pokemon_habitat_detail SET "id" = ?, "name" = ?, "names" = ?, pokemon_species = ? WHERE 1=2;

--
-- DELETE template for table 'pokemon_habitat_detail'
--
DELETE FROM pokemon_habitat_detail WHERE 1=2;

