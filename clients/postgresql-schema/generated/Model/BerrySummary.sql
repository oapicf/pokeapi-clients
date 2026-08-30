--
-- "PokéAPI"
-- Prepared SQL queries for 'BerrySummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'berry_summary'
--
SELECT "name", url FROM berry_summary WHERE 1=1;

--
-- INSERT template for table 'berry_summary'
--
INSERT INTO berry_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'berry_summary'
--
UPDATE berry_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'berry_summary'
--
DELETE FROM berry_summary WHERE 1=2;

