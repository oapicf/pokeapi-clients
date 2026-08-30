--
-- "PokéAPI"
-- Prepared SQL queries for 'EncounterConditionValueDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'encounter_condition_value_detail'
--
SELECT "id", "name", "condition", "names" FROM encounter_condition_value_detail WHERE 1=1;

--
-- INSERT template for table 'encounter_condition_value_detail'
--
INSERT INTO encounter_condition_value_detail ("id", "name", "condition", "names") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'encounter_condition_value_detail'
--
UPDATE encounter_condition_value_detail SET "id" = ?, "name" = ?, "condition" = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'encounter_condition_value_detail'
--
DELETE FROM encounter_condition_value_detail WHERE 1=2;

