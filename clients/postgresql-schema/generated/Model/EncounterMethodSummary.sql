--
-- "PokéAPI"
-- Prepared SQL queries for 'EncounterMethodSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'encounter_method_summary'
--
SELECT "name", url FROM encounter_method_summary WHERE 1=1;

--
-- INSERT template for table 'encounter_method_summary'
--
INSERT INTO encounter_method_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'encounter_method_summary'
--
UPDATE encounter_method_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'encounter_method_summary'
--
DELETE FROM encounter_method_summary WHERE 1=2;

