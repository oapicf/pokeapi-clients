--
-- "PokéAPI"
-- Prepared SQL queries for 'EncounterMethodDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'encounter_method_detail'
--
SELECT "id", "name", "order", "names" FROM encounter_method_detail WHERE 1=1;

--
-- INSERT template for table 'encounter_method_detail'
--
INSERT INTO encounter_method_detail ("id", "name", "order", "names") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'encounter_method_detail'
--
UPDATE encounter_method_detail SET "id" = ?, "name" = ?, "order" = ?, "names" = ? WHERE 1=2;

--
-- DELETE template for table 'encounter_method_detail'
--
DELETE FROM encounter_method_detail WHERE 1=2;

