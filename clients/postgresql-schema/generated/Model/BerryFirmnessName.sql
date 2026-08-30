--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryFirmnessName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_firmness_name'
--
SELECT "name", "language" FROM berry_firmness_name WHERE 1=1;

--
-- INSERT template for table 'berry_firmness_name'
--
INSERT INTO berry_firmness_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'berry_firmness_name'
--
UPDATE berry_firmness_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'berry_firmness_name'
--
DELETE FROM berry_firmness_name WHERE 1=2;

