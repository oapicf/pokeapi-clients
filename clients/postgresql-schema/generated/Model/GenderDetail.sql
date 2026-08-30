--
-- "PokéAPI"
-- Prepared SQL queries for 'GenderDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'gender_detail'
--
SELECT "id", "name", pokemon_species_details, required_for_evolution FROM gender_detail WHERE 1=1;

--
-- INSERT template for table 'gender_detail'
--
INSERT INTO gender_detail ("id", "name", pokemon_species_details, required_for_evolution) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'gender_detail'
--
UPDATE gender_detail SET "id" = ?, "name" = ?, pokemon_species_details = ?, required_for_evolution = ? WHERE 1=2;

--
-- DELETE template for table 'gender_detail'
--
DELETE FROM gender_detail WHERE 1=2;

