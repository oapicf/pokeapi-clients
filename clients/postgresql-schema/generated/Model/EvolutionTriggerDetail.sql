--
-- "PokéAPI"
-- Prepared SQL queries for 'EvolutionTriggerDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'evolution_trigger_detail'
--
SELECT "id", "name", "names", pokemon_species FROM evolution_trigger_detail WHERE 1=1;

--
-- INSERT template for table 'evolution_trigger_detail'
--
INSERT INTO evolution_trigger_detail ("id", "name", "names", pokemon_species) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'evolution_trigger_detail'
--
UPDATE evolution_trigger_detail SET "id" = ?, "name" = ?, "names" = ?, pokemon_species = ? WHERE 1=2;

--
-- DELETE template for table 'evolution_trigger_detail'
--
DELETE FROM evolution_trigger_detail WHERE 1=2;

