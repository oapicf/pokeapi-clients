--
-- "PokéAPI"
-- Prepared SQL queries for 'EncounterConditionSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'encounter_condition_summary'
--
SELECT "name", url FROM encounter_condition_summary WHERE 1=1;

--
-- INSERT template for table 'encounter_condition_summary'
--
INSERT INTO encounter_condition_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'encounter_condition_summary'
--
UPDATE encounter_condition_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'encounter_condition_summary'
--
DELETE FROM encounter_condition_summary WHERE 1=2;

