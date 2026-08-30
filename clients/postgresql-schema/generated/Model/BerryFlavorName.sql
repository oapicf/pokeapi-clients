--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryFlavorName' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_flavor_name'
--
SELECT "name", "language" FROM berry_flavor_name WHERE 1=1;

--
-- INSERT template for table 'berry_flavor_name'
--
INSERT INTO berry_flavor_name ("name", "language") VALUES (?, ?);

--
-- UPDATE template for table 'berry_flavor_name'
--
UPDATE berry_flavor_name SET "name" = ?, "language" = ? WHERE 1=2;

--
-- DELETE template for table 'berry_flavor_name'
--
DELETE FROM berry_flavor_name WHERE 1=2;

