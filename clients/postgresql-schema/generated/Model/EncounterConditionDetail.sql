--
-- "PokéAPI"
-- Prepared SQL queries for 'EncounterConditionDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'encounter_condition_detail'
--
SELECT "id", "name", "values", "names" FROM encounter_condition_detail WHERE 1=1;

--
-- INSERT template for table 'encounter_condition_detail'
--
INSERT INTO encounter_condition_detail ("id", "name", "values", "names") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'encounter_condition_detail'
--
UPDATE encounter_condition_detail SET "id" = ?, "name" = ?, "values" = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'encounter_condition_detail'
--
DELETE FROM encounter_condition_detail WHERE 1=2;

