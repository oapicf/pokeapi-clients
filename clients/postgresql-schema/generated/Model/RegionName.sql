--
-- "PokéAPI"
-- Prepared SQL queries for 'RegionName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'region_name'
--
SELECT "name", "language" FROM region_name WHERE 1=1;

--
-- INSERT template for table 'region_name'
--
INSERT INTO region_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'region_name'
--
UPDATE region_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'region_name'
--
DELETE FROM region_name WHERE 1=2;

