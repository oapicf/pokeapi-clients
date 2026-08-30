--
-- "PokéAPI"
-- Prepared SQL queries for 'EncounterConditionName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'encounter_condition_name'
--
SELECT "name", "language" FROM encounter_condition_name WHERE 1=1;

--
-- INSERT template for table 'encounter_condition_name'
--
INSERT INTO encounter_condition_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'encounter_condition_name'
--
UPDATE encounter_condition_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'encounter_condition_name'
--
DELETE FROM encounter_condition_name WHERE 1=2;

