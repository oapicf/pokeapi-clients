--
-- "PokéAPI"
-- Prepared SQL queries for 'EncounterMethodName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'encounter_method_name'
--
SELECT "name", "language" FROM encounter_method_name WHERE 1=1;

--
-- INSERT template for table 'encounter_method_name'
--
INSERT INTO encounter_method_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'encounter_method_name'
--
UPDATE encounter_method_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'encounter_method_name'
--
DELETE FROM encounter_method_name WHERE 1=2;

