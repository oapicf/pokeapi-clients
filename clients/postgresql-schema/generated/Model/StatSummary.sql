--
-- "PokéAPI"
-- Prepared SQL queries for 'StatSummary' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'stat_summary'
--
SELECT "name", url FROM stat_summary WHERE 1=1;

--
-- INSERT template for table 'stat_summary'
--
INSERT INTO stat_summary ("name", url) VALUES (?, ?);

--
-- UPDATE template for table 'stat_summary'
--
UPDATE stat_summary SET "name" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'stat_summary'
--
DELETE FROM stat_summary WHERE 1=2;

