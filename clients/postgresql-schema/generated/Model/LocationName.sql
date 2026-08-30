--
-- "PokéAPI"
-- Prepared SQL queries for 'LocationName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'location_name'
--
SELECT "name", "language" FROM location_name WHERE 1=1;

--
-- INSERT template for table 'location_name'
--
INSERT INTO location_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'location_name'
--
UPDATE location_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'location_name'
--
DELETE FROM location_name WHERE 1=2;

