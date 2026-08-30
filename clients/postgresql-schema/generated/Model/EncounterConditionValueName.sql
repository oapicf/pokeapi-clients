--
-- "PokéAPI"
-- Prepared SQL queries for 'EncounterConditionValueName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'encounter_condition_value_name'
--
SELECT "name", "language" FROM encounter_condition_value_name WHERE 1=1;

--
-- INSERT template for table 'encounter_condition_value_name'
--
INSERT INTO encounter_condition_value_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'encounter_condition_value_name'
--
UPDATE encounter_condition_value_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'encounter_condition_value_name'
--
DELETE FROM encounter_condition_value_name WHERE 1=2;

