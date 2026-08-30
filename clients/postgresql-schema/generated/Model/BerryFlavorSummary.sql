--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryFlavorSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_flavor_summary'
--
SELECT "name", url FROM berry_flavor_summary WHERE 1=1;

--
-- INSERT template for table 'berry_flavor_summary'
--
INSERT INTO berry_flavor_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'berry_flavor_summary'
--
UPDATE berry_flavor_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'berry_flavor_summary'
--
DELETE FROM berry_flavor_summary WHERE 1=2;

