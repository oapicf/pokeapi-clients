--
-- "PokéAPI"
-- Prepared SQL queries for 'BerryFirmnessSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_firmness_summary'
--
SELECT "name", url FROM berry_firmness_summary WHERE 1=1;

--
-- INSERT template for table 'berry_firmness_summary'
--
INSERT INTO berry_firmness_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'berry_firmness_summary'
--
UPDATE berry_firmness_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'berry_firmness_summary'
--
DELETE FROM berry_firmness_summary WHERE 1=2;

