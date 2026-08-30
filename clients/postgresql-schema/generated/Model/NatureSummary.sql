--
-- "PokéAPI"
-- Prepared SQL queries for 'NatureSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'nature_summary'
--
SELECT "name", url FROM nature_summary WHERE 1=1;

--
-- INSERT template for table 'nature_summary'
--
INSERT INTO nature_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'nature_summary'
--
UPDATE nature_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'nature_summary'
--
DELETE FROM nature_summary WHERE 1=2;

