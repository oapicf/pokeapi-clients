--
-- "PokéAPI"
-- Prepared SQL queries for 'EncounterConditionValueSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'encounter_condition_value_summary'
--
SELECT "name", url FROM encounter_condition_value_summary WHERE 1=1;

--
-- INSERT template for table 'encounter_condition_value_summary'
--
INSERT INTO encounter_condition_value_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'encounter_condition_value_summary'
--
UPDATE encounter_condition_value_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'encounter_condition_value_summary'
--
DELETE FROM encounter_condition_value_summary WHERE 1=2;

